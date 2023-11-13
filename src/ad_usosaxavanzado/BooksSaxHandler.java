/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad_usosaxavanzado;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 *
 * @author xChas
 */
public class BooksSaxHandler extends DefaultHandler {
    
    public void startElement(String uri, String localName, String qName, Attributes atts) 
            throws SAXException {
        
        //Cada vez que encuentre una de las siguientes etiquetas se ejecuta el código
        switch (qName) {
            case "book" -> System.out.print("El id del libro es: "+atts.getValue(atts.getQName(0)));
            case "author" -> System.out.print("\nEl autor es: ");
            case "title" -> System.out.print("El titulo es: ");
            case "genre" -> System.out.print("El genero es: ");
            case "price" -> System.out.print("El precio es: ");
            case "publish_date" -> System.out.print("La fecha de publicacion es: ");
            case "description" -> System.out.print("La descripcion es: ");
            
        }
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        
        //Si encuentra la etiqueta de cierre ejecuta esto
        if (qName.equals("book")) {
            System.out.println("-------------------------------------------------------------------");
        }
    }
    
    @Override
    public void characters (char[] ch, int start, int length) throws SAXException {
        
        //Cuando se encuentra el valor de una etiqueta se ejecuta
        String cadena = new String(ch, start, length);
        cadena = cadena.replaceAll("\t", ""); //Elimina tabulaciones
        cadena = cadena.replaceAll("\n", ""); //Elimina salto de linea
        System.out.println(cadena);
    }
}
