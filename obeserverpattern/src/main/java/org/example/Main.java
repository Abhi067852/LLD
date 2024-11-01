package org.example;

public class Main {
    public static void main(String[] args) {

        WSObservable wsObservable = new WSObservable();
        CricketScoreObservable cricketScoreObservable  =new CricketScoreObservable();
        MobileObserver mobileObserver = new MobileObserver();

        cricketScoreObservable.add(mobileObserver);
        wsObservable.add(mobileObserver);
        wsObservable.setData(10);
        cricketScoreObservable.setData(20);

    }
}