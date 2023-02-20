package com.chief;

public class Generic <Thing>{
    Thing x;
    Thing y;
    Generic(Thing x,Thing y){
        this.x=x;
        this.y=y;
    }
    public Thing getX(){
        return x;
    }
    public Thing getY(){
        return y;
    }
}
