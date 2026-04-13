package com.example.auto_wiring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.auto_wiring.Compressor;
import com.example.auto_wiring.Refrigerator;



@Configuration
public class MyConfiguration {

    @Bean(name = "rf1")
    public Refrigerator getRefrigerator() {
        Refrigerator rf = new Refrigerator();
        rf.setId(1);
        rf.setBrand("LG");
        rf.setPrice(50000);
        return rf;
    }

    @Bean(name = "com1")
    public Compressor getCompressor() {
        Compressor com = new Compressor();
        com.setId(1);
        com.setStar(5);
        return com;
    }
}
