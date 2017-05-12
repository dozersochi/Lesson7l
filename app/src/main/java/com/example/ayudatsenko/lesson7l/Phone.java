package com.example.ayudatsenko.lesson7l;

public class Phone {

    private String name;
    private String company;
    private int image;

    public Phone(String name, String company, int image){
        this.name=name;
        this.company=company;
        this.image=image;
    }

    public String getName(){
        return this.name;
    }

    public String getCompany(){
        return this.company;
    }

    public int getImage(){
        return this.image;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setImage(int image){
        this.image = image;
    }

}
