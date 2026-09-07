package hospital;

public class HospitalManagementSystemTest {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("   MINI HOSPITAL SYSTEM - TEST PROGRAM");
        System.out.println("==============================================");

        testPatientBST();

        testEmergencyQueue();

        testTreatmentStack();

        testVisitLinkedList();

        System.out.println("\n==============================================");
        System.out.println("       ALL TESTS COMPLETED");
        System.out.println("==============================================");
    }

    // =====================================================
    // TEST 1 - PATIENT BST
    // =====================================================

    private static void testPatientBST() {

        System.out.println("\n\n==============================================");
        System.out.println("TEST 1: PATIENT BINARY SEARCH TREE");
        System.out.println("==============================================");

        PatientBST bst = new PatientBST();

        Patient p1 = new Patient(
                105,
                "Ahmed",
                35,
                "0771234567",
                "Fever"
        );

        Patient p2 = new Patient(
                101,
                "Kamal",
                42,
                "0772345678",
                "Headache"
        );

        Patient p3 = new Patient(
                110,
                "Nimal",
                28,
                "0773456789",
                "Fracture"
        );

        Patient p4 = new Patient(
                98,
                "Saman",
                50,
                "0774567890",
                "Diabetes"
        );

        Patient p5 = new Patient(
                115,
                "Fathima",
                31,
                "0775678901",
                "Asthma"
        );

        // INSERT TEST
        System.out.println("\n1. Testing patient insertion...");

        bst.insert(p1);
        bst.insert(p2);
        bst.insert(p3);
        bst.insert(p4);
        bst.insert(p5);

        System.out.println("Patients inserted successfully.");

        // DISPLAY TEST
        System.out.println("\n2. Testing in-order traversal:");

        bst.displayInOrder();

        // SEARCH TEST
        System.out.println("\n3. Testing patient search:");

        Patient found = bst.search(110);

        if (found != null) {
            System.out.println("Patient found:");
            System.out.println(found);
        } else {
            System.out.println("Patient not found.");
        }

        // SEARCH NON-EXISTING
        System.out.println("\n4. Testing search for non-existing patient:");

        Patient notFound = bst.search(999);

        if (notFound == null) {
            System.out.println("Correct: Patient 999 was not found.");
        }

        // DELETE TEST
        System.out.println("\n5. Testing patient deletion:");

        bst.delete(101);

        System.out.println("Patient 101 deleted.");

        System.out.println("\nBST after deletion:");

        bst.displayInOrder();
    }

    // =====================================================
    // TEST 2 - EMERGENCY QUEUE
    // =====================================================

    private static void testEmergencyQueue() {

        System.out.println("\n\n==============================================");
        System.out.println("TEST 2: EMERGENCY QUEUE");
        System.out.println("==============================================");

        EmergencyQueue queue = new EmergencyQueue();

        Patient p1 = new Patient(
                201,
                "John",
                45,
                "0711111111",
                "Chest Pain"
        );

        Patient p2 = new Patient(
                202,
                "Sara",
                30,
                "0722222222",
                "High Fever"
        );

        Patient p3 = new Patient(
                203,
                "David",
                25,
                "0733333333",
                "Injury"
        );

        // ENQUEUE TEST
        System.out.println("\n1. Adding patients to emergency queue:");

        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);

        System.out.println("Three patients added.");

        // DISPLAY TEST
        System.out.println("\n2. Current emergency queue:");

        queue.display();

        // DEQUEUE TEST
        System.out.println("\n3. Testing FIFO dequeue:");

        Patient nextPatient = queue.dequeue();

        if (nextPatient != null) {
            System.out.println("Next patient for treatment:");
            System.out.println(nextPatient);
        }

        // DISPLAY AFTER DEQUEUE
        System.out.println("\n4. Queue after dequeue:");

        queue.display();

        // EMPTY TEST
        System.out.println("\n5. Testing empty queue handling:");

        EmergencyQueue emptyQueue = new EmergencyQueue();

        Patient result = emptyQueue.dequeue();

        if (result == null) {
            System.out.println("Correct: Empty queue handled successfully.");
        }
    }

    // =====================================================
    // TEST 3 - TREATMENT STACK
    // =====================================================

    private static void testTreatmentStack() {

        System.out.println("\n\n==============================================");
        System.out.println("TEST 3: TREATMENT HISTORY STACK");
        System.out.println("==============================================");

        TreatmentStack stack = new TreatmentStack();

        TreatmentRecord r1 = new TreatmentRecord(
                301,
                "Kamal",
                "Dr. Silva",
                "Medication",
                "2026-09-01"
        );

        TreatmentRecord r2 = new TreatmentRecord(
                302,
                "Nimal",
                "Dr. Perera",
                "X-Ray",
                "2026-09-02"
        );

        TreatmentRecord r3 = new TreatmentRecord(
                303,
                "Fathima",
                "Dr. Fernando",
                "Surgery",
                "2026-09-03"
        );

        // PUSH TEST
        System.out.println("\n1. Adding treatment records:");

        stack.push(r1);
        stack.push(r2);
        stack.push(r3);

        System.out.println("Three treatment records added.");

        // DISPLAY TEST
        System.out.println("\n2. Current treatment history:");

        stack.display();

        // POP TEST
        System.out.println("\n3. Testing LIFO pop:");

        TreatmentRecord latest = stack.pop();

        if (latest != null) {
            System.out.println("Most recently completed treatment:");
            System.out.println(latest);
        }

        // DISPLAY AFTER POP
        System.out.println("\n4. Stack after pop:");

        stack.display();

        // EMPTY TEST
        System.out.println("\n5. Testing empty stack handling:");

        TreatmentStack emptyStack = new TreatmentStack();

        TreatmentRecord result = emptyStack.pop();

        if (result == null) {
            System.out.println("Correct: Empty stack handled successfully.");
        }
    }

    // =====================================================
    // TEST 4 - SINGLY LINKED LIST
    // =====================================================

    private static void testVisitLinkedList() {

        System.out.println("\n\n==============================================");
        System.out.println("TEST 4: PATIENT VISIT LINKED LIST");
        System.out.println("==============================================");

        VisitLinkedList visits = new VisitLinkedList();

        Visit v1 = new Visit(
                401,
                "2026-08-01",
                "Dr. Silva",
                "Fever",
                "Medication"
        );

        Visit v2 = new Visit(
                402,
                "2026-08-15",
                "Dr. Perera",
                "Headache",
                "Painkillers"
        );

        Visit v3 = new Visit(
                403,
                "2026-09-01",
                "Dr. Fernando",
                "Infection",
                "Antibiotics"
        );

        // ADD TEST
        System.out.println("\n1. Adding patient visits:");

        visits.addVisit(v1);
        visits.addVisit(v2);
        visits.addVisit(v3);

        System.out.println("Three visits added.");

        // DISPLAY TEST
        System.out.println("\n2. Patient visit history:");

        visits.displayVisits();

        // SEARCH TEST
        System.out.println("\n3. Testing visit search:");

        Visit found = visits.searchVisit(402);

        if (found != null) {
            System.out.println("Visit found:");
            System.out.println(found);
        } else {
            System.out.println("Visit not found.");
        }

        // SEARCH NON-EXISTING
        System.out.println("\n4. Testing search for non-existing visit:");

        Visit notFound = visits.searchVisit(999);

        if (notFound == null) {
            System.out.println("Correct: Visit 999 was not found.");
        }

        // REMOVE TEST
        System.out.println("\n5. Testing visit removal:");

        boolean removed = visits.removeVisit(402);

        if (removed) {
            System.out.println("Visit 402 removed successfully.");
        } else {
            System.out.println("Visit 402 could not be removed.");
        }

        // DISPLAY AFTER REMOVE
        System.out.println("\n6. Visit history after removal:");

        visits.displayVisits();

        System.out.println("\nLinked list testing completed.");
    }
}