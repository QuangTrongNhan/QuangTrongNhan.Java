/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author pc
 */
public class Watch {
    private String name;
    private String id;
    private int price;

    public Watch(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch{" + "name=" + name + ", id=" + id + ", price=" + price + '}';
    }
    
    
    
    public void showProfile() {
        System.out.printf("|%-8s|%-8s|%4d\n", id,name,price);   
        }
}
