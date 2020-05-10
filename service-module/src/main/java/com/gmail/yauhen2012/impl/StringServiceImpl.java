package com.gmail.yauhen2012.impl;

import java.util.stream.Stream;

import com.gmail.yauhen2012.StringService;
import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements StringService {

    @Override
    public int add(String numbers) {
        String str = numbers.trim()
                .replaceAll("[._()$&#@%^*+=<>{}\\]\\['\",!?;:|/-]+", " ")
                .replaceAll("[ ]{2,}", " ");
        String[] strArray = str.split(" ");

        return Stream.of(strArray)
                .filter(line -> !line.isEmpty())
                .map(Integer::parseInt)
                .reduce(Integer::sum)
                .orElse(0);

    }

}
