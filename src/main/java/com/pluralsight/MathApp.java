package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary=70000;
        int garySalary=65000;
        int highestSalary=0;
        highestSalary=Math.max(bobSalary,garySalary);
        System.out.println(highestSalary);
        int carPrice=45000;
        int truckPrice=57000;
        int minimumSalary=0;
        minimumSalary=Math.min(carPrice,truckPrice);
        System.out.println(minimumSalary);
        float area=0;
        double radius=7.25;
        double pi=3.14;
        float result=(float)Math.pow(radius,2);
        area= (float) ((float)result*pi);
        System.out.println("The Area of the circle is "+area);
        double number=5;
        float answer=(float)Math.sqrt(number);
        System.out.println("The square root of the answer is "+answer);
        double absoluteValue=-3.8;
        System.out.println(Math.abs(absoluteValue)+" is the absolute value of the variable I set earlier");
        float distance= (float) Math.sqrt((Math.pow(85-5,2))+Math.pow(50-10,2));
        System.out.println(distance);
        float displayNumber= (float) Math.random();
        System.out.println(displayNumber);
        int days=24;
        float min=days*24*60;
        System.out.println(min);
        float miliSeconds=min*60*100;
        System.out.printf("%.2f",miliSeconds);
    }
}
