package com.etoullali.TP1.web;

import com.etoullali.TP1.entities.PageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

//=> La visite de la page

@RestController
public class PageEventRestController {
    @Autowired
    private StreamBridge streamBridge;
    @GetMapping("/publish/{topic}/{name}") //publier un évènement dans un topic Kafka
    public PageEvent publish(@PathVariable String topic, @PathVariable String name){
        PageEvent pageEvent=new PageEvent(name,Math.random()>0.5?"U1":"U2",new Date(),new Random().nextInt(9000));
        streamBridge.send(topic,pageEvent);
        return pageEvent;
    }
}

/*
=> [N.B]
    - Supplier: permet de créer un poller qui return un message qui va etre dans le topic Kafka (timer) [ex: capteur]
    - Poller: un produit qui va produire un message chaque seconde par exemple
    - Functions: consommer + triter + publier le résultat dans un autre tipic
    - Kafka streams: pour le data analysis (visualiser en temps réel)
    - StreamBridge: s'avantage peut fonctionner avec JMS, RabbitMQ, Kafka (pour KafkaTemplate ça marche juste pour Kafka)
 */