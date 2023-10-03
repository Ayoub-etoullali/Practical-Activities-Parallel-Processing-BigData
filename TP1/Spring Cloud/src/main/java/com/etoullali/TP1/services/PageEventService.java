package com.etoullali.TP1.services;

import com.etoullali.TP1.entities.PageEvent;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.TimeWindows;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Service
public class PageEventService {

    @Bean
    public Consumer<PageEvent> pageEventConsumer() {
        return (input) -> {
            System.out.println("**********************");
            System.out.println(input.toString());
        };
    }

    @Bean
    public Supplier<PageEvent> pageEventSupplier() {
        return () -> new PageEvent(
                Math.random() > 0.5 ? "P1" : "P2",
                Math.random() > 0.5 ? "U1" : "U2",
                new Date(),
                new Random().nextInt(9000)
        );
    }

    @Bean
    public Function<PageEvent, PageEvent> pageEventFunction() {
        return (input) -> {
            input.setName("this name: " + input.getName() + " is well received");
            return input;
        };
    }

    @Bean
    public Function<KStream<String, PageEvent>, KStream<String, Long>> kStreamFunction() {
        return (input) -> {
            return input

                    .filter((k, v) -> v.getDuration() > 100)
                    .map((k, v) -> new KeyValue<>(v.getName(), v.getDuration()))
                    .groupByKey(Grouped.with(Serdes.String(), Serdes.Long()))
                    .windowedBy(TimeWindows.of(Duration.ofSeconds(1)))
                    .reduce((acc, v) -> {
                            long sum = (acc + v) / 2;
                            return sum;
                        },
                            Materialized.as("stats-store")
                    )
                    .toStream()
                    .map((k, v) -> new KeyValue<>("=>" + k.window().startTime() + k.window().endTime() + ":" + k.key(), v));

        };
    }
}
    /*
    @Bean
    public Function<KStream<String, PageEvent>, KStream<String, Long>> kStreamFunction() {
        System.out.println("test");
        return (input) -> input
                .filter(
                        (k, v) -> v.getDuration() > 100
                )
                .map(
                        (k, v) -> new KeyValue<>(v.getName(), 0L)
                )
                .groupBy(
                        (k, v) -> k, Grouped.with(Serdes.String(), Serdes.Long())
                )
//                .groupByKey(
//                        Grouped.keySerde(Serdes.String())
//                )
                .windowedBy(
                        TimeWindows.of(Duration.ofSeconds(1))
                ) //return un objet de type K-Table
                .count(
                        Materialized.as("page-count")
                )
                .toStream() //convertir to K-Stream (K-Table)
                .map(
                    (k, v) -> new KeyValue<>(""+k.window().startTime()+k.window().endTime()+k.key(), v)
                );
    }
}
*/

/*
=> [N.B]
    - winddowedBy:  donne la résultat récente sans le comulée (l'évolution)
    - Materialized: view matérialisé
 */
