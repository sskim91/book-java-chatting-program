package com.sskim.chatting;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ChattingApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ChattingApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
