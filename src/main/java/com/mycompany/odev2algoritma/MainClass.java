package com.mycompany.odev2algoritma;

public class MainClass {
    
/*
Ben algoritma2 sorusu sorsam;

Bir dizi içerisinde 10 adet isim yazıp,
Dosya yazma işlemleri ile bir txt oluşturmalarını ve içine bu 10 isimden rastgele 100 adet isim yazdırmalarını,
ve dosya okuma işlemleri ile bu txt dosyasını okumalarını,
okunan txt dosyasında örneğin kaç adet "Mert" ismi var onun adetini ekrana yazdırmalarını isterdim..
*/
    
    public static void main(String[] args){
    
    Ev ev1 = new Ev("Yakup",25,"Kırmızı");
    Ev ev2 = new Ev("Mert",50,"Mavi");
    Ev ev3 = new Ev("Can",100,"Yeşil");
    
    ev1.fiyatGoster();
    ev2.fiyatGoster();
    ev3.fiyatGoster();
    
    Villa villa1 = new Villa ("Mertcan",400);
    Villa villa2 = new Villa ("Dursun",600);
    villa1.fiyatGoster();
    villa2.fiyatGoster();
    
    System.out.println(ev1.toString());
    System.out.println(ev2.toString());
    System.out.println(ev3.toString());
    
    } 
}
