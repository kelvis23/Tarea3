package org.is.company.componentes;

import org.is.company.modelos.Employee;

import java.util.Scanner;

public class EmployeeReader {
    private final Scanner scanner;

    public EmployeeReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Employee read (){
        System.out.println("introduce el  nif  del empleado");
        String nif = scanner.nextLine();
        System.out.println("introduce el  nombre  del empleado");
        String name =scanner.nextLine();
        System.out.println("introduce el  apllidos  del empleado");
        String lastname = scanner.nextLine();
        System.out.println("introduce el  Puesto  del empleado");
        String position = scanner.nextLine();
        return new  Employee (
                nif,
                name,
                lastname,
                position
        );

    }
}
