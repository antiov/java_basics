package entities;

public class Person implements SuperHuman{
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

    @Override
    public boolean canRun() {
        return false;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
