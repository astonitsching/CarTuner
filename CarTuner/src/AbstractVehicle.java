
import java.awt.image.BufferedImage;

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
    
   public abstract BufferedImage getImage();
   
    // ADD PART METHOD FOR EACH VEHICLE CLASS TO INHERIT ?
}
