package com.example.july27;

public class prac81 {
    prac81()
    {
        System.out.println("constructor");
    }
    public void add(int a)
    {
        System.out.println(a);
    }
    public static void main(String[] args) {

        prac81 p=new prac81();
        p.add(10);

    }

}
