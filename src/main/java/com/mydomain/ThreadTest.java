package com.mydomain;

/**
 * Created by gc on 2019/7/17.
 */
public class ThreadTest implements Runnable{

    public void run() {
        System.out.println("执行run方法");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
    }
    public void test2(){
        System.out.println("test21");
    }
    public void test3(){
        System.out.println("test3");
    }
}
