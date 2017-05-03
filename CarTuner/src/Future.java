
import java.awt.Color;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TPS5215
 */
public class Future {
    
    static String receipt = "";
    static ArrayList <Object> parts = new ArrayList();
    private final Manager manager = Manager.getInstance();
    
    public Future(String name, String make, String style, int year)
    {
        receipt += (name + "\n" + make + "\n" + style + "\n" + year); 
       
    }
    
    public static void addPart(Object part)
    {
        parts.add(part);
    }
    
    public static void viewParts()
    {
        //manager.currentVehicle
           // JOptionPane.showMessageDialog(this, "Thank You " + username + ".\nYour " + carYear + " " + carMake + " has "
          //          + "been added to our system!");
        
    }
    public static void printReceipt() throws PrinterException
    {
        JTextPane jtp = new JTextPane();
        jtp.setBackground(Color.white);
        jtp.setText(receipt);
        jtp.print();

  //catch any exceptions here
}
        
        
        
        
        
    }

