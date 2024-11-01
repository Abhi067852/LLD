package org.example;

public interface Observable {
    public void add(Observer observer);
    public void setData(int num);

    public void notifyUser();

    public int getData();
}
