
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CMS6227
 */
public abstract class AbstractVehicle {
    private int year;
    private String make;
    private String style;
    public Rim rim;
    private PartWrapper soundSystem;
    private BufferedImage image;
    ArrayList <Part> partlist = new ArrayList();
    public double priceSum;

    public void accumulatePrice()
    {
        double totalPrice = 0;
        for(Part part : partlist)
        {
            totalPrice += part.getPrice();
        }
       
        this.priceSum = totalPrice;
        return;
    }
    // combine part prices
    
    public void addPart(Part part)
    {
        partlist.add(part);
        accumulatePrice();
    }
   
    // ADD PART METHOD FOR EACH VEHICLE CLASS TO INHERIT ?
    
    public abstract BufferedImage getImage();
}
