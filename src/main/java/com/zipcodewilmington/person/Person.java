package com.zipcodewilmington.person;

public class Person {
    private String name;
    private Integer age;
      private String lastName;
    private String birthMonth;
    private String favColor;

    // Default constructor

    public Person()
    {   this.name = "";
        this.age = Integer.MAX_VALUE;
        this.lastName = "";
        this.birthMonth = "";
        this.favColor = "";}

    public Person(String name, Integer age, String lastName,String birthMonth,String favColor  ) {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.lastName = "";
        this.birthMonth = "";
        this.favColor = "";


    }

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        this.age = 0; // Assuming default age is 0
        this.lastName = "";
        this.birthMonth = "";
        this.favColor = "";


    }

    // Constructor with age parameter
    public Person(Integer age) {
        this.name = "";
        this.age = age;

    }

    // Constructor with name and age parameters
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    // Getter and setter methods for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Getter and setter methods for lastName
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Getter and setter methods for birthMonth

        public String getBirthMonth() {
        return this.birthMonth;
    }
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    // Getter and setter methods for favColor
    public String getFavColor() {
        return this.favColor;
    }
    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }
}