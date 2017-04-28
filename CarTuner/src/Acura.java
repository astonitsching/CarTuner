
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TPS5215
 */
public class Acura extends AbstractVehicle {

        BufferedImage image;
     public Acura()
    {
         try {
              image = ImageIO.read(new File("." + File.separator + "images" + File.separator + "Acura.png"));
         } catch (IOException ex) {System.out.println(ex);}
    }   


    @Override
    public BufferedImage getImage() {
        return image;
    }
    
    
}
