/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author me
 */
public class ConcreteCustomer extends Customer implements Observer{

    @Override
    public void update(Product p) {
        System.out.println("Properties of the product"+p+"have changed");
    }
    
}
