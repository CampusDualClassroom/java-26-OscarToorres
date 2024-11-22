package com.campusdual.classroom;


import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {

        Exercise26 ex = new Exercise26();
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        boolean seguir = true;

        do {
            ex.menu();

            int opcion = scanner.nextInt();

            switch (opcion){

                case 1:
                    contact.callMyNumber();
                    break;
                case 2:
                    contact.callOtherNumber("123456789");
                    break;
                case 3:
                    contact.showContactDetails();
                    break;
                case 4:
                    seguir = false;

            }



        }while(seguir);


    }

    public void menu(){
        System.out.println("====Menu====");
        System.out.println("1 - Llamar a si mismo");
        System.out.println("2 - Llamar a un numero");
        System.out.println("3 - Mostrar lista de contactos");
        System.out.println("4 - Salir");
    }
}
