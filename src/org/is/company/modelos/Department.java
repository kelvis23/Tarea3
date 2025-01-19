package org.is.company.modelos;

import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String name;
    private double budget;
    private  Employee [] employee;

    public Department(String name, double budget, Employee[] employee) {
        this.name = name;
        this.budget = budget;
        this.employee = employee;
    }
    public void showInfo(){
        System.out.println( "Departamento: "+name+", presuspuesto: "+budget);
        for ( var employee : employee){
            employee.showInfo();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Double.compare(budget, that.budget) == 0 && Objects.equals(name, that.name) && Objects.deepEquals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, Arrays.hashCode(employee));
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", employee=" + Arrays.toString(employee) +
                '}';
    }
}
