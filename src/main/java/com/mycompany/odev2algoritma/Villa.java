package com.mycompany.odev2algoritma;

public class Villa extends Ev {
    
    public Villa(){
        
    }
    
    public Villa(String sahip){
        super(sahip);
    }
    
    public Villa(String sahip,int alan){
        super(sahip,alan);
    }
    
    public Villa(String sahip,int alan,String renk){
        super(sahip,alan,renk);
    }
           
    public void fiyatGoster(){       
        System.out.println("Villanın fiyatı "+super.alan*600);
    }
    
}
