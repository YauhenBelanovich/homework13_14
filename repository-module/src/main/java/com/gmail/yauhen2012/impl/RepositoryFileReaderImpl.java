package com.gmail.yauhen2012.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

import com.gmail.yauhen2012.RepositoryFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryFileReaderImpl implements RepositoryFileReader {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public List<String> returnStringCollection(File file) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = br.readLine()) != null) {
                stringList.add(temp);
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return stringList;
    }

}
