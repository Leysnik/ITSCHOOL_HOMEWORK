package com.Fraction;

public class Vector2D {
    protected double vX;
    protected double vY;
    protected boolean checkNorm = false;
    static int count;
    public Vector2D(){
        vX=1;
        vY=1;
        count+=1;
    }
    public Vector2D(double vX,double vY){
        this.vX = vX;
        this.vY = vY;
        count+=1;
    }
    public Vector2D(Vector2D vector){
        this.vX = vector.vX;
        this.vY = vector.vY;
        count+=1;
    }
    public void print(){
        System.out.printf("(%.2f, %.2f)",vX,vY);
        System.out.println();
    }
    public double length(){
        return !checkNorm? Math.sqrt(vX*vX+vY*vY):1.0;

    }
    public void add(Vector2D v){
        vX+=v.vX;
        vY+=v.vY;
    }
    public void sub(Vector2D v){
        vX-=v.vX;
        vY-=v.vY;
    }
    public void scale(double c){
        vX*=c;
        vY*=c;
    }
    public void normalized(){
        vX = (vX*vX)/(this.length()*this.length());
        vY = (vY*vY)/(this.length()*this.length());
        checkNorm = !checkNorm;
    }
    public double dotProduct(Vector2D v){
        return vX*v.vX+vY*v.vY;
    }
}
