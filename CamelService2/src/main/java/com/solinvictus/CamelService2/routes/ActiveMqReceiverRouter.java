package com.solinvictus.CamelService2.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:my-activemq-queue")
		.to("log:received-message-from-active-mq");

        // from("timer:active-mq-timer?period=10000")
        // .transform()
        // .constant("My Constant Message from service 2")
        // .log("${body}");
        // .to("activemq:my-activemq-queue");
    }
}
