package org.is.company.modelos;

import java.util.Objects;

public class Employee {
    private String nif;
    private String name;
    private String lastname;
    private String position;

    public Employee(String name, String nif, String position, String lastname) {
        this.name = name;
        this.nif = nif;
        this.position = position;
        this.lastname = lastname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(nif, employee.nif) && Objects.equals(name, employee.name) && Objects.equals(lastname, employee.lastname) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, lastname, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", lasname='" + lastname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
