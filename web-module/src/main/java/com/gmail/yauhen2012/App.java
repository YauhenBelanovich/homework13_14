package com.gmail.yauhen2012;

import java.io.File;
import java.lang.invoke.MethodHandles;

import com.gmail.yauhen2012.config.AppConfig;
import com.gmail.yauhen2012.util.PropertyUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SumService sumService = ctx.getBean(SumService.class);
        PropertyUtil propertyUtil = ctx.getBean(PropertyUtil.class);
        File file = new File(propertyUtil.getFileLocation());

        logger.info(sumService.sumAllStrings(file));

    }

}
