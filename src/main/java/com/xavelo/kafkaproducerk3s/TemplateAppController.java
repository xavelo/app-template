package com.xavelo.kafkaproducerk3s;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateAppController {

    private static final Logger logger = LoggerFactory.getLogger(TemplateAppController.class);

    @GetMapping("/ping")
    public String ping() {
        logger.info("ping received");
        logger.info("pong returned");
        return "poooooong";
    }

}

