package com.mjc.stage2;

public class ThreadSafeSingleton {
    // Write your code here!
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    private static final class SingletonHolder {
        private static final ThreadSafeSingleton SINGLETON = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance(){
        return SingletonHolder.SINGLETON;
    }
}
