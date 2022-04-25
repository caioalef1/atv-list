package Entites;

public class Emplyoee {
    private String name;
    private int id;
    private double salary;



    public Emplyoee(int id, String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id+", "+name+", "+salary;
    }

    public double increaseSalary(double percentage){
        return salary += (salary * percentage)/100;
    }
}
