/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CMS6227
 */
public interface OObservable {
    public void addObserver(OObserver o);
    public void removeObserver(OObserver o);
    public void notifyObservers();
}
