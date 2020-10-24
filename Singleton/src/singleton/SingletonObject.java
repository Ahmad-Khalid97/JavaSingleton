/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Ahmad Khalid
 */
public class SingletonObject {
    private static SingletonObject obj = new SingletonObject();
    
    private SingletonObject(){}
    
    public static SingletonObject getInstance()
    {
        return obj;
    }
            
    
}
