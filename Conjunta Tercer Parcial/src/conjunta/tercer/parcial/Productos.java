/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjunta.tercer.parcial;

/**
 *
 * @author User
 */
public class Productos {
    private String code;
    private String name;
    private String price;
    private String quantity;
    private String providecode;

    public Productos(String code, String name, String price, String quantity, String providecode) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.providecode = providecode;
    }

    @Override
    public String toString() {
        return "Productos{" + "code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", providecode=" + providecode + '}';
    }

    
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getProvidecode() {
        return providecode;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setProvidecode(String providecode) {
        this.providecode = providecode;
    }
    
}
