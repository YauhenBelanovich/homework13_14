package com.gmail.yauhen2012.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.gmail.yauhen2012.FileReaderRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class FileReaderRepositoryImpl implements FileReaderRepository {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public List<String> readLinesOfFile(File file) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            lines.addAll(br.lines().collect(Collectors.toList()));
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return lines;
    }

}
