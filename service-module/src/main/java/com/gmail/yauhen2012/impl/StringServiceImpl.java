package com.gmail.yauhen2012.impl;

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

        int lineSum = 0;
        for (String s : strArray) {
            if (!s.equals("")) {
                lineSum += Integer.parseInt(s);
            }
        }
        return lineSum;
    }

}
