
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
    public static AbstractVehicle addVehicle(String type)
    {
        AbstractVehicle vehicle = null;
        
        try {
            Class c = Class.forName(type);
            vehicle = (AbstractVehicle) c.newInstance();
        } catch (Exception ex) {}
        return vehicle;
    }
    
    
    
}
