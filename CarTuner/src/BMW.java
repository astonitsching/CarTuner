
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author You
 */
public class BMW extends AbstractVehicle {

    private BufferedImage image;
     public BMW()
    {
         try {
              image = ImageIO.read(new File("." + File.separator + "images" + File.separator + "BMW.png"));
         } catch (IOException ex) {System.out.println(ex);}
    }   


    @Override
    public BufferedImage getImage() {
        return image;
    }
    
     
     
    
}
