package com.example.tddproject.parser;



import org.xml.sax.HandlerBase;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.lang.module.Configuration;


public class Parser {




    public static void main(String[] args) {

        try {


            System.setProperty("javax.xml.parsers.SAXParserFactory", "com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            File file = new File(Constants.FILE_PATH);
            parser.parse(file,new HandlerBase());
        }catch(Exception exception){
           System.out.println(exception.getMessage());
        }


    }
}
