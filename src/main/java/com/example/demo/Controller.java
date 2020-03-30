package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class Controller{

    @RequestMapping(value = "/current-date/", method = RequestMethod.GET)
    public String getCurrentDate() {
        LocalDate localDate = LocalDate.now();
        return DateTimeFormatter.ofPattern("dd/MM/yyy").format(localDate);
    }

    @RequestMapping(value = "/welcome/{name}", method = RequestMethod.POST)
    public String getName(@PathVariable String name) {
        return name;
    }

}