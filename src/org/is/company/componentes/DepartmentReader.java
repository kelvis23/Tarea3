package org.is.company.componentes;

import org.is.company.modelos.Employee;

import java.util.Scanner;

public class DepartmentReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;

    public DepartmentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }
    public Employee read(){
        System.out.println("introduce el nombre del departamento");
        System.out.println("introduce el presupuesto del departamento");
        System.out.println("introduce el numero de empleados del departamento");
        int size = scanner.nextInt();
        scanner.nextLine();
    }
}
