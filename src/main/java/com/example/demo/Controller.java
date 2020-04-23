package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class Controller{

    @RequestMapping(value = "/current-date", method = RequestMethod.GET)
    public String getCurrentDate() {
        LocalDate localDate = LocalDate.now();
        return "De huidige datum is:" + DateTimeFormatter.ofPattern("dd/MM/yyy").format(localDate);
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String getName(@RequestParam("name") String value) {
        return "welcome" + value;
    }

}