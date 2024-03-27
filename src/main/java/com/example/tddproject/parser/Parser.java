package com.example.tddproject.parser;


import org.slf4j.LoggerFactory;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.logging.Logger;

public class Parser {


    public static void main(String[] args) {



        try {

            System.setProperty("javax.xml.parsers.SAXParserFactory", "com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD,"");
        }catch(Exception exception){
           System.out.println(exception.getMessage());
        }


    }
}
