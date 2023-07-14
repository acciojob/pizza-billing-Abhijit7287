package com.driver;

public class Pizza {

    private int price;
     private int bagp=0;
    private Boolean isVeg;
    private String bill;
//    private Integer Tbill=0;
    private boolean cheese = false;
    private boolean vegT = false;
    private boolean NvegT = false;
     private boolean bag = false;

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
        if(cheese==false){
        price+=80;
        cheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(vegT==false && this.isVeg==true){
       
        price+=70;
        vegT=true;
        
       }
        
       else if(NvegT==false&&this.isVeg==false){
       
        price+=120;
        NvegT=true;
        
       }
        
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
        bagp+=20;
        bag = true;
    }

    public String getBill(){
        // your code goes here
       StringBuilder ab = new StringBuilder(); 
       Integer base = isVeg==true?300:400;
       
       ab.append("Base Price Of The Pizza: ").append(base.toString()).append("\n");
        
       if(cheese==true){
           ab.append("Extra Cheese Added: 80").append("\n");
       }
       if(vegT==true && isVeg==true){
           ab.append("Extra Toppings Added: 70").append("\n"); 
       }
       if(NvegT==true && isVeg==false){
           ab.append("Extra Toppings Added: 120").append("\n");
       }
       if(bag==true){
           ab.append("Paperbag Added: ").append(String.valueOf(bagp)).append("\n");
       }
       
       ab.append("Total Price: ").append(String.valueOf(price)).append("\n");
       
       this.bill = ab.toString();
       
        return this.bill;
    }
}
