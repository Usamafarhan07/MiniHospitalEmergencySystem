package hospital;

import java.util.Scanner;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" MINI HOSPITAL EMERGENCY MANAGEMENT ");
        System.out.println("====================================");

        System.out.println("1. Register Patient");
        System.out.println("2. Search Patient");
        System.out.println("3. Delete Patient");
        System.out.println("4. Display Patients");
        System.out.println("5. Add Emergency Patient");
        System.out.println("6. Treat Next Patient");
        System.out.println("7. Display Emergency Queue");
        System.out.println("8. Add Treatment Record");
        System.out.println("9. Remove Latest Treatment");
        System.out.println("10. Display Treatment History");
        System.out.println("11. Add Patient Visit");
        System.out.println("12. Search Visit");
        System.out.println("13. Remove Visit");
        System.out.println("14. Display Visit History");
        System.out.println("0. Exit");

        scanner.close();
    }
}