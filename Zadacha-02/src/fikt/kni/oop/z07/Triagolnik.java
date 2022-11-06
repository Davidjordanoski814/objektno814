package fikt.kni.oop.z07;

public class Triagolnik {
    public float a,b,c;
    //Ovde koristime statichki konstruktor
    public Triagolnik(){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /*Vo ovoj slucaj zemame da bide pravoagolen triagolnik;
    Koristime metodi za presmetuvanje na perimetar i ploshtina na pravoagolen triagolnik */
    public float perimetar( float a,float b, float c)
    {
        return a+b+c;
    }
    public float plostina(float a,float b){

        return (float)(0.5 * a * b);
    }

}
