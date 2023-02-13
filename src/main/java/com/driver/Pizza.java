package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private final int EXTRA_CHEESE_PRICE = 80;
    private final int VEG_EXTRA_TOPPINGS_PRICE = 70;
    private final int NON_VEG_EXTRA_TOPPINGS_PRICE = 120;
    private final int VEG_PIZZA_BASE_PRICE = 300;
    private final int NON_VEG_PIZZA_BASE_PRICE = 400;
    private final int PAPER_BAG_PRICE = 20;
    public void setBill(String bill) {
        this.bill = bill;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            price = VEG_PIZZA_BASE_PRICE;
        }
        else {
            price = NON_VEG_PIZZA_BASE_PRICE;
        }
    }

    public int getPrice(){
        return price;
    }
    public void addExtraCheese(){
        // your code goes here
        price += EXTRA_CHEESE_PRICE;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            price += VEG_EXTRA_TOPPINGS_PRICE;
        }
        else {
            price += NON_VEG_EXTRA_TOPPINGS_PRICE;
        }
    }

    public void addTakeaway(){
        // your code goes here
        price += PAPER_BAG_PRICE;
    }

    public String getBill(){
        // your code goes here
        bill = "Total Price: " + price;
        return bill;
    }
}
