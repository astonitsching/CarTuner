
import java.util.ArrayList;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CMS6227
 */
public class Budget implements OObservable{
   public static double budget = 500;
   public static double remainingBudget;
    
    private ArrayList<OObserver> observers = new ArrayList();

    public static void setBudget(double budget)
    {
        Budget.budget = budget;
    }
    
    public void calculateRemainingBudget(AbstractVehicle vehicle) {
        remainingBudget = budget - vehicle.priceSum;
        notifyObservers();
    }
    

    public static double getRemainingBudget() {
        return remainingBudget;
    }

    @Override
    public void addObserver(OObserver o) {
        observers.add(o);
        notifyObservers();
    }

    @Override
    public void removeObserver(OObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(OObserver o : observers) {
            o.notifyObserver(remainingBudget);
        }
        Manager.getInstance().partsPanel.updateLists();
        
    }


 
   
    

    
    
}