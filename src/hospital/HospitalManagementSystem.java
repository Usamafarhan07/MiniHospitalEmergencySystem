package hospital;

import java.util.Scanner;

public class HospitalManagementSystem {

    private static Scanner scanner = new Scanner(System.in);

    private static PatientBST patientBST = new PatientBST();
    private static EmergencyQueue emergencyQueue = new EmergencyQueue();
    private static TreatmentStack treatmentStack = new TreatmentStack();
    private static VisitLinkedList visitHistory = new VisitLinkedList();

    public static void main(String[] args) {

        int choice;

        do {

            displayMenu();

            choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    registerPatient();
                    break;

                case 2:
                    searchPatient();
                    break;

                case 3:
                    deletePatient();
                    break;

                case 4:
                    patientBST.displayInOrder();
                    break;

                case 5:
                    addEmergencyPatient();
                    break;

                case 6:
                    treatNextPatient();
                    break;

                case 7:
                    emergencyQueue.display();
                    break;

                case 8:
                    addTreatmentRecord();
                    break;

                case 9:
                    removeLatestTreatment();
                    break;

                case 10:
                    treatmentStack.display();
                    break;

                case 11:
                    addPatientVisit();
                    break;

                case 12:
                    searchVisit();
                    break;

                case 13:
                    removeVisit();
                    break;

                case 14:
                    visitHistory.displayVisits();
                    break;

                case 0:
                    System.out.println("\nThank you for using the system.");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }

    // ==========================
    // MENU
    // ==========================

    private static void displayMenu() {

        System.out.println("\n======================================");
        System.out.println(" MINI HOSPITAL EMERGENCY MANAGEMENT");
        System.out.println("======================================");
        System.out.println("1.  Register Patient");
        System.out.println("2.  Search Patient");
        System.out.println("3.  Delete Patient");
        System.out.println("4.  Display Patients");
        System.out.println("5.  Add Emergency Patient");
        System.out.println("6.  Treat Next Patient");
        System.out.println("7.  Display Emergency Queue");
        System.out.println("8.  Add Treatment Record");
        System.out.println("9.  Remove Latest Treatment");
        System.out.println("10. Display Treatment History");
        System.out.println("11. Add Patient Visit");
        System.out.println("12. Search Visit");
        System.out.println("13. Remove Visit");
        System.out.println("14. Display Visit History");
        System.out.println("0.  Exit");
        System.out.println("======================================");
    }

    // ==========================
    // PATIENT BST
    // ==========================

    private static void registerPatient() {

        System.out.println("\n--- Register Patient ---");

        int id = readInt("Patient ID: ");

        if (patientBST.search(id) != null) {
            System.out.println("Patient ID already exists.");
            return;
        }

        String name = readString("Patient Name: ");
        int age = readInt("Age: ");
        String contact = readString("Contact Number: ");
        String condition = readString("Medical Condition: ");

        Patient patient =
                new Patient(id, name, age, contact, condition);

        patientBST.insert(patient);

        System.out.println("Patient registered successfully.");
    }

    private static void searchPatient() {

        System.out.println("\n--- Search Patient ---");

        int id = readInt("Enter Patient ID: ");

        Patient patient = patientBST.search(id);

        if (patient != null) {
            System.out.println("\nPatient found:");
            System.out.println(patient);
        } else {
            System.out.println("Patient not found.");
        }
    }

    private static void deletePatient() {

        System.out.println("\n--- Delete Patient ---");

        int id = readInt("Enter Patient ID: ");

        Patient patient = patientBST.search(id);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        patientBST.delete(id);

        System.out.println("Patient deleted successfully.");
    }

    // ==========================
    // EMERGENCY QUEUE
    // ==========================

    private static void addEmergencyPatient() {

        System.out.println("\n--- Add Emergency Patient ---");

        int id = readInt("Enter Patient ID: ");

        Patient patient = patientBST.search(id);

        if (patient == null) {
            System.out.println("Patient does not exist.");
            return;
        }

        emergencyQueue.enqueue(patient);

        System.out.println(
                "Patient added to emergency waiting queue."
        );
    }

    private static void treatNextPatient() {

        System.out.println("\n--- Treat Next Patient ---");

        Patient patient = emergencyQueue.dequeue();

        if (patient == null) {
            System.out.println("Emergency queue is empty.");
            return;
        }

        System.out.println("Now treating:");
        System.out.println(patient);

        String doctor = readString("Doctor Name: ");
        String treatment = readString("Treatment Provided: ");
        String date = readString("Treatment Date: ");

        TreatmentRecord record =
                new TreatmentRecord(
                        patient.getPatientId(),
                        patient.getPatientName(),
                        doctor,
                        treatment,
                        date
                );

        treatmentStack.push(record);

        System.out.println(
                "Treatment completed and history recorded."
        );
    }

    // ==========================
    // TREATMENT STACK
    // ==========================

    private static void addTreatmentRecord() {

        System.out.println("\n--- Add Treatment Record ---");

        int patientId = readInt("Patient ID: ");

        Patient patient = patientBST.search(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        String doctor = readString("Doctor Name: ");
        String treatment = readString("Treatment: ");
        String date = readString("Date: ");

        TreatmentRecord record =
                new TreatmentRecord(
                        patient.getPatientId(),
                        patient.getPatientName(),
                        doctor,
                        treatment,
                        date
                );

        treatmentStack.push(record);

        System.out.println("Treatment record added.");
    }

    private static void removeLatestTreatment() {

        System.out.println("\n--- Remove Latest Treatment ---");

        TreatmentRecord record = treatmentStack.pop();

        if (record == null) {
            System.out.println("Treatment history is empty.");
            return;
        }

        System.out.println("Removed treatment:");
        System.out.println(record);
    }

    // ==========================
    // VISIT LINKED LIST
    // ==========================

    private static void addPatientVisit() {

        System.out.println("\n--- Add Patient Visit ---");

        int patientId = readInt("Patient ID: ");

        Patient patient = patientBST.search(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        int visitId = readInt("Visit ID: ");
        String date = readString("Visit Date: ");
        String doctor = readString("Doctor Name: ");
        String diagnosis = readString("Diagnosis: ");
        String treatment = readString("Treatment: ");

        Visit visit =
                new Visit(
                        visitId,
                        date,
                        doctor,
                        diagnosis,
                        treatment
                );

        visitHistory.addVisit(visit);

        System.out.println("Visit added successfully.");
    }

    private static void searchVisit() {

        System.out.println("\n--- Search Visit ---");

        int visitId = readInt("Enter Visit ID: ");

        Visit visit = visitHistory.searchVisit(visitId);

        if (visit != null) {
            System.out.println("Visit found:");
            System.out.println(visit);
        } else {
            System.out.println("Visit not found.");
        }
    }

    private static void removeVisit() {

        System.out.println("\n--- Remove Visit ---");

        int visitId = readInt("Enter Visit ID: ");

        boolean removed = visitHistory.removeVisit(visitId);

        if (removed) {
            System.out.println("Visit removed successfully.");
        } else {
            System.out.println("Visit not found.");
        }
    }

    // ==========================
    // INPUT METHODS
    // ==========================

    private static int readInt(String message) {

        while (true) {

            try {

                System.out.print(message);

                int value = Integer.parseInt(
                        scanner.nextLine()
                );

                return value;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number."
                );
            }
        }
    }

    private static String readString(String message) {

        System.out.print(message);

        return scanner.nextLine();
    }
}