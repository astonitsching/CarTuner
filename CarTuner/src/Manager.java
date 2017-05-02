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
    
    private static final Manager INSTANCE = new Manager();
    
    private Manager(){}
    

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
