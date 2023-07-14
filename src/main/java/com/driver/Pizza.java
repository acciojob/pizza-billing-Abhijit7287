package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
//    private Integer Tbill=0;
    private boolean b = false;
    private boolean b1 = false;

    public Pizza(Boolean isVeg){
       
        this.isVeg = isVeg;
        
        if(this.isVeg==true){
            price = 300;
        }else{
            price = 400;
        } 
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(b==false){
        price+=80;
        b=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(b1==false){
        if(this.isVeg==true){
        price+=70;
        b1=true;
        }else{
            price+=120;
            b1 = true;
        }
    }
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
    }

    public String getBill(){
        // your code goes here
        
        this.bill = String.valueOf(price);
        return this.bill;
    }
}
