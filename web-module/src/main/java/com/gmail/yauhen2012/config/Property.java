package com.gmail.yauhen2012.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Property {

    @Value("${file.location}")
    private String fileLocation;

    public String getFileLocation() {
        return fileLocation;
    }

}
