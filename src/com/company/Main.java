package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0 ));
        System.out.println(area(-1.0));
        System.out.println(area(5.0 , 4.0));
        System.out.println(area(-1.0 , 0.0));
    }

    public static final String INVALID_MESSAGE = "Invalid value";
    public static double area (double radius){
        if (radius < 0) {
            System.out.println(INVALID_MESSAGE);
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area (double x , double y){
        if (x < 0 || y <0) {
            System.out.println(INVALID_MESSAGE);
            return -1;
        }
        return x * y;
    }


}
