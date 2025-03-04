package ru.itgirl.first_spring_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String today(@RequestParam(value = "name") String name) {
        return String.format("Сегодня %s!", DayOfWeek.valueOf(name));
    }

}
