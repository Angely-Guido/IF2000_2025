/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author angel
 */
public class Client {
    
    //Private attributes
    private String name;
    private String id;
    private String phone;
    private String address;
    private int age;
    private String bank;

    public Client(String name, String id, String phone, String address, int age, String bank) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bankname) {
        this.bank = bankname;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
     @Override
    public String toString() {
     
        return "---------------------------"
                + "\nPerson: " 
                + "\nname=" + getName() 
                + "\nid=" + getId()
                + "\nphone=" + getPhone()
                +"\naddress= "+ getAddress()
                + "\nage=" + getAge();
    }

   
    
    
}
