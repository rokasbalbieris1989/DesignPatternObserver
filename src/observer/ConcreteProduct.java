/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author me
 */
public class ConcreteProduct extends Product {

    private boolean productState;
    private List<Observer> observers = new ArrayList();

    public boolean getState() {
        return productState;

    }

    public void setState(boolean productState) {
        this.productState = productState;
        notifyObservers();
    }

    @Override
    public void setName(String name) {
        if (!this.name.equals(name)) {
            this.name = name;
            setState(true);
        }
    }

    @Override
    public void setQuantity(int quantity) {
        if (this.quantity != quantity) {
            this.quantity = quantity;
            setState(true);
        }
    }

    @Override
    public void setColor(String color) {
        if (!this.color.equals(color)) {
            this.color = color;
            setState(true);
        }

    }

    @Override
    public void setSize(String size) {
        if (!this.size.equals(size)) {
            this.size = size;
            setState(true);
        }

    }

    //-------------------------------------------------------OBSERVERS---------
    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        if (this.productState) {
            for (Observer o : observers) {
                o.update(this);
            }
        }
        this.setState(false);
    }
}
