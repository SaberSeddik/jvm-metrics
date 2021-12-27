package com.saber.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemoryLeak {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemoryLeak.class);
    private static List<String> container = new ArrayList<>();

    @PostMapping("/addString")
    public void addString(@RequestParam(name = "value") String value) {
        try {
            container.add(value);
        } catch (Throwable t) {
            LOGGER.error("Failed with out of memory.", t);
        }
    }
}
