package com.example.tddproject.parser;


import org.apache.xerces.xni.XMLDTDHandler;
import org.slf4j.LoggerFactory;
import org.xml.sax.HandlerBase;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.logging.Logger;

public class Parser {


    private static final String FILE_PATH = "C:\\Users\\windows\\Desktop\\test.xml";

    public static void main(String[] args) {

        try {

            System.setProperty("javax.xml.parsers.SAXParserFactory", "com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            File file = new File(FILE_PATH);
            parser.parse(file,new HandlerBase());
        }catch(Exception exception){
           System.out.println(exception.getMessage());
        }


    }
}
