package org.is.company.componentes;

import org.is.company.modelos.Department;
import org.is.company.modelos.Employee;

import java.util.Scanner;

public class DepartmentReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;

    public DepartmentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }
    public Department read(){
        System.out.println("introduce el nombre del departamento");
        String name =scanner.nextLine();
        System.out.println("introduce el presupuesto del departamento");
        double budget =scanner.nextDouble();
        scanner.nextLine();
        System.out.println("introduce el numero de empleados del departamento");
        Employee[] employees = numEmplotees();
        return new Department(
                name,
                budget,
                employees
        );

    }

    private Employee[] numEmplotees() {
        int num = scanner.nextInt();
        scanner.nextLine();
        Employee[]employees=  new Employee[num];
        for (int i = 0; i < employees.length; i++) {
            employees[i]=employeeReader.read();

        }
        return employees;
    }
}
