/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author You
 */
public class VehicleFactory {
    
    
    public AbstractVehicle addVehicle(String type)
    {
        AbstractVehicle vehicle = null;
        switch(type)
        {
            case "Honda": vehicle = new Honda();
            break;
            case "BMW": vehicle = new BMW();
            break;
//            case "": return new Honda();
//            case "": return new Honda();
//            case "": return new Honda();
//            case "": return new Honda();
             
               
        }
        return vehicle;
    }
    
    
    
}
