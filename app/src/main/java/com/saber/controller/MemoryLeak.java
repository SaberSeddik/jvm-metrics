package com.saber.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemoryLeak {

    private static List<String> container = new ArrayList<>();

    @PostMapping("/addString")
    public void addString(@RequestParam(name = "value") String value) {
        container.add(value);
    }
}
