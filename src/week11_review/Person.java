package week11_review;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name.isEmpty() || name ==null){
            System.err.println("Name can not be null or empty");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.err.println("Invalid Age: "+age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender + '\'';

    }



    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }


}

/*
 1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields
                restrictions for the fields:
                    name can not be empty
                    name can not be null
                    age can not be negative
                    age can not be zero

            Add a constructor to set all the fields
                (Make sure all the restrictions are applied)

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */