package com.etoullali.TP1.web;

import com.etoullali.TP1.entities.PageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

//=> La page

@RestController
public class PageEventRestController {
    @Autowired
    private StreamBridge streamBridge;
    @GetMapping("/publish/{topic}/{name}") //publier un évènement dans un topic Kafka
    public PageEvent publish(@PathVariable String topic, @PathVariable String name){
        streamBridge.send(topic,new PageEvent(name,Math.random()<0.5?"U1":"U2",new Date(),new Random().nextInt(9000)));
    }
}
