/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CMS6227
 */
public class Part {

    private double price;
    private String image;
     
    public Part(double price, String image) {
        this.price = price;
        this.image = image;
    }
    
    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
    
    
}
