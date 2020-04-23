package com.vmware.demos.credhubsb.chsbdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChsbController {

    private final MyServiceConfiguration myServiceConfiguration;

    public ChsbController(MyServiceConfiguration myServiceConfiguration)    {
        this.myServiceConfiguration = myServiceConfiguration;
    }

    @GetMapping
    public String showMyConfiguration() {
        StringBuilder sb = new StringBuilder();
        sb.append("The configuration for MyService has username ");
        sb.append(this.myServiceConfiguration.getUsername());
        sb.append(" and password ");
        sb.append(this.myServiceConfiguration.getPassword());
        sb.append(" and is available on URL ");
        sb.append(this.myServiceConfiguration.getUrl());
        sb.append(".");
        return sb.toString();
    }

}