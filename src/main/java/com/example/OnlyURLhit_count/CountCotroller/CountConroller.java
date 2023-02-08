package com.example.OnlyURLhit_count.CountCotroller;

import com.example.OnlyURLhit_count.CountService.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class CountConroller {
    @Autowired
    CountService countservice;

    @GetMapping("/api/{count}")
    public int printcount(@PathVariable String count){
        return countservice.getCount(count);
    }
}
