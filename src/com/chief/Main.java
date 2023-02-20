package com.chief;

import java.util.ArrayList;

public class Main {


    public static  void main(String[] args) {
	Generic <Integer> myInt=new Generic<>(1,23);
        System.out.println("x= "+myInt.getX()+" "+"Y="+myInt.getY());
    }
}
