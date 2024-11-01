package org.example;

public class MobileObserver implements Observer{



    @Override
    public void update(Observable observable) {
        System.out.println(observable.getClass());
        System.out.println(observable.getData());
    }

}
