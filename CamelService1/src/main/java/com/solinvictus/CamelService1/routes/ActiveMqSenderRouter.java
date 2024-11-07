package com.solinvictus.CamelService1.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqSenderRouter extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("timer:active-mq-timer?period=10000")
        .transform()
        .constant("My Constant Message")
        .log("${body}")
        .to("activemq:my-activemq-queue");
    }
}
