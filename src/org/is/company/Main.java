package org.is.company;

import org.is.company.componentes.DepartmentReader;
import org.is.company.componentes.EmployeeReader;
import org.is.company.modelos.Department;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeReader employeeReader=new EmployeeReader(scanner);
        DepartmentReader departmentReader = new DepartmentReader(scanner, employeeReader);
        Department department = departmentReader.read();
    }
}