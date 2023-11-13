/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad_usosaxavanzado;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author xChas
 */
public class AccesoXMLSax {
    
    SAXParser parser;
    
    public int parserXMLconBooksSAXHandler (File file) {
        
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            BooksSaxHandler sh = new BooksSaxHandler();
            parser.parse(file, sh);
            return 0;
            
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e);
            return -1;
        }
   }
    
}
