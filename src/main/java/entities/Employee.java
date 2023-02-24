package entities;

public class Employee extends Person{
    public Employee(Integer id){
        super(id);
        this.salary = this.faker.number().randomDouble(0,5000,50000);
    }
    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", salary=" + salary +
                '}';
    }
}
