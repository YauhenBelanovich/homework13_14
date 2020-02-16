package com.gmail.yauhen2012.impl;

import java.io.File;
import java.util.List;

import com.gmail.yauhen2012.RepositoryFileReader;
import com.gmail.yauhen2012.StringService;
import com.gmail.yauhen2012.SumService;
import org.springframework.stereotype.Service;

@Service
public class SumServiceImpl implements SumService {

    private final RepositoryFileReader repositoryFileReader;
    private final StringService stringService;

    public SumServiceImpl(RepositoryFileReader repositoryFileReader, StringService stringService) {
        this.repositoryFileReader = repositoryFileReader;
        this.stringService = stringService;
    }

    @Override
    public int sumAllStrings(File file) {
        List<String> stringList = repositoryFileReader.returnStringCollection(file);

        int sumAll = 0;
        for (String str : stringList) {
            sumAll += stringService.add(str);
        }

        return sumAll;
    }

}
