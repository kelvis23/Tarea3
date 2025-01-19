package org.is.company.componentes;

import org.is.company.modelos.Company;
import org.is.company.modelos.Department;

import java.util.Scanner;

public class CompanyReader {
    private final Scanner scanner;
    private final DepartmentReader departmentReader;

    public CompanyReader(Scanner scanner, DepartmentReader departmentReader) {
        this.scanner = scanner;
        this.departmentReader = departmentReader;
    }
    public Company read (){
        System.out.println("introduce el nombre de  la compañia");
        String name = scanner.nextLine();
        System.out.println("introduce el codigo de identificasion fiscal de la  compañia");
        String cif = scanner.nextLine();
        System.out.println("introduce  el numero de departamentos de la  compañia");
        Department[] departments = getDepartments();
        return new Company(
                name,
                cif,
                departments
        );

    }

    private Department[] getDepartments() {
        int num = scanner.nextInt();
        scanner.nextLine();
        Department[]departments = new Department[num];
        for (int i = 0; i < departments.length; i++) {
            departments[i]=departmentReader.read();
        }
        return departments;
    }
}
