package entities;

import com.github.javafaker.Faker;

public class Person implements SuperHuman{
    Faker faker;
    public Person(){}
    public Person(Integer id){
        this.faker = new Faker();
        this.id = id;
        this.name = faker.name().name();
        this.lastName = faker.name().lastName();
    }
    private Integer id;
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean canRun() {
        return false;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
