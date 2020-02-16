package com.gmail.yauhen2012;

import java.io.File;
import java.util.List;

public interface FileReaderRepository {

    List<String> readLinesOfFile(File file);

}
