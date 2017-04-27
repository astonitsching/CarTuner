
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
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
public class ImagePanel extends JPanel{
    BufferedImage image;
    public ImagePanel()
    {
        image = Manager.getInstance().currentVehicle.getImage();
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);   
        g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), this);
    }
    
}
