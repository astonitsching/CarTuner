
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
    public class PartList implements Observer{
    private ArrayList<Part> allParts;
    private ArrayList<Part> visibleParts;

    //implement notify as setting which parts are visible
    @Override
    public void notify(double budget) {
        
        //remove all elements from visible parts
        visibleParts.clear();
        
        //determine visibleParts by iterating through allParts and adding parts less than or equal to budget
        for (Part part : allParts) {
           if(part.getPrice() <= budget) {
               visibleParts.add(part);
           }
        }
        
        //*******************STILL NEED TO IMPLEMENT UPDATING GUI****************
    }
}
