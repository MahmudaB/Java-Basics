package org.example;

public class Dev {

    private  Computer com;
    public Dev(){
        System.out.println("Dev constructor");
    }



    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("This is a Dev Project");
        com.compile();
    }
}
