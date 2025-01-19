package org.is.company.componentes;

import java.util.Scanner;

public class CompanyApp {
    private  final Scanner scanner;
    private  final CompanyReader companyReader;

    public CompanyApp(Scanner scanner, CompanyReader companyReader) {
        this.scanner = scanner;
        this.companyReader = companyReader;
    }
    public  void  run(){
        int option;
        do {
            System.out.println("1.Dado un nombre de departamento, mostrar todos sus datos.");
            System.out.println("2.Mostrar los empleados de un departamento dado el nombre del departamento");
            System.out.println("3.Introduciendo un nombre de departamento y un nif, mostrar los datos del empleado del departamento");
            System.out.println("4.Salir");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option ==1){
                System.out.println("323");
            } else if (option ==2) {
                System.out.println("hola");
            } else if (option ==3) {

            } else if (option ==4) {
                System.out.println("saliendo ...");

            }else {
                System.out.println("otcion inbalidad");
            }
        }while (option !=4);
    }
}
