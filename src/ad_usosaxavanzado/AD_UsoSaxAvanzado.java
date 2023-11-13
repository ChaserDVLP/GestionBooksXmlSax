/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ad_usosaxavanzado;

import java.io.File;

/**
 *
 * @author xChas
 */
public class AD_UsoSaxAvanzado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File fichero = new File("books.xml");
        AccesoXMLSax a = new AccesoXMLSax();
        a.parserXMLconBooksSAXHandler(fichero);
    }
}
