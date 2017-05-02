
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TPS5215
 */
public class MainPagePanel extends JPanel {
    
    @Override
    public void paint(Graphics g)
    {
        try {
            BufferedImage image = ImageIO.read(new File("." + File.separator + "images" + File.separator + "cartuning.gif"));
            super.paint(g);
            g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), this);
        } catch (IOException ex) { }
    }
    
    
    
    
}
