
package com.company.model;

public class User {

    private String firstname;
    private String lastname;
    private int age;
    private double height;
    private double weight;

    public User(){
    }

    public User(String firstname, String lastname, int age, double height, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMeasurement()
    {
        double result =  weight / (height * height);
        if(result < (double) 1) //endi run qilchi KomosH
        {
            return "Wight okay: " + result;
        }else{
            return "You are fat: " + result;
        } // run qil va  yoz ma'lumotlarni, ishlamadi...
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", Measurement=" + this.getMeasurement() +
                '}';
    }
}
