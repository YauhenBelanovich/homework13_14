package com.gmail.yauhen2012.impl;

import java.io.File;
import java.util.List;

import com.gmail.yauhen2012.FileReaderRepository;
import com.gmail.yauhen2012.StringService;
import com.gmail.yauhen2012.SumService;
import org.springframework.stereotype.Service;

@Service
public class SumServiceImpl implements SumService {

    private final FileReaderRepository fileReaderRepository;
    private final StringService stringService;

    public SumServiceImpl(FileReaderRepository fileReaderRepository, StringService stringService) {
        this.fileReaderRepository = fileReaderRepository;
        this.stringService = stringService;
    }

    @Override
    public int sumAllNumbers(File file) {
        List<String> lines = fileReaderRepository.readLinesOfFile(file);

        return lines.stream()
                .map(stringService::add)
                .reduce(Integer::sum)
                .orElse(0);
    }

}
