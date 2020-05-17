package com.mycompany.odev2algoritma;

public class Ev {
    
    private String sahip = "Bilinmiyor";
    public int alan = 0;
    public String renk;
    
    public Ev(){
        System.out.println("1.Constructor Çağrıldı.");
    }
    
    //Overloading
    public Ev(String sahip){
        System.out.println("2.Constructor Çağrıldı ve Sahip Atandı.");
    }
    
    public Ev(String sahip,int alan){
        this.sahip = sahip;
        this.alan = alan;
    }
    
    public Ev(String sahip,int alan,String renk){
        this.sahip = sahip;
        this.alan = alan;
        this.renk = renk;
    }
    
    //Override  
    public String toString(){
        return "Evin sahibi "+sahip+" evin alanı "+alan+"m2 evin rengi "+renk;
    }
    
    
    public void fiyatGoster(){
        System.out.println("Evin Fiyatı: "+alan*2000);
    }
       
}
