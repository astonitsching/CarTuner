
import java.util.HashMap;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CMS6227
 */
public class Manager {
    
    
    String make;
    String style;
    int year;
    AbstractVehicle currentVehicle;
    public PartList rimsList;
    public Budget budget = new Budget();
    public PartsPanel partsPanel;
    
    private static final Manager INSTANCE = new Manager();
    
    private Manager(){
        //initializing rims
        rimsList = new PartList();
        Part daytona_rim = new Part(100, "rsc/daytona_rim.png");
        rimsList.allParts.add(daytona_rim);
        rimsList.visibleParts.add(daytona_rim);
        Part smootie_rim = new Part(150, "rsc/smootie_rim.png");
        rimsList.allParts.add(smootie_rim);
        rimsList.visibleParts.add(smootie_rim);
    }
    
    public static Manager getInstance()
    {
        return INSTANCE;
    }
    public void setCarAttributes(String make, String style, int year)
    {
        this.make = make;
        this.style = style;
        this.year = year;
    }
    public void createVehicle()
    {
        currentVehicle = VehicleFactory.addVehicle(make);

    }
}
