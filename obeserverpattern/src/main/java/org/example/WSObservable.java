package org.example;

import java.util.ArrayList;
import java.util.List;

public class WSObservable implements Observable{


    List<Observer> users = new ArrayList<>();
    int num=0;
    @Override
    public void add(Observer observer) {
        users.add(observer);
    }

    @Override
    public void setData(int num) {
        this.num = num;
        notifyUser();
    }

    @Override
    public void notifyUser() {
        users.stream().forEach(x->x.update(WSObservable.this));

    }

    @Override
    public int getData() {
        return num;
    }
}
