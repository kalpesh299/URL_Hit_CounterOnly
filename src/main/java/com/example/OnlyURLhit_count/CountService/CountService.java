package com.example.OnlyURLhit_count.CountService;


import org.springframework.stereotype.Service;

@Service
public class CountService {

    private static int count=0;

    public int getCount(String username){
       return count++;
    }

}
