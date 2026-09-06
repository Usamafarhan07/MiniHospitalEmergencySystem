package hospital;

public class PatientBST {

    private class Node {
        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
        }
    }

    private Node root;

    // INSERT
    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private Node insertRecursive(Node current, Patient patient) {

        if (current == null) {
            return new Node(patient);
        }

        if (patient.getPatientId() < current.patient.getPatientId()) {
            current.left = insertRecursive(current.left, patient);
        } else if (patient.getPatientId() > current.patient.getPatientId()) {
            current.right = insertRecursive(current.right, patient);
        }

        return current;
    }

    // SEARCH
    public Patient search(int patientId) {
        Node result = searchRecursive(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }

    private Node searchRecursive(Node current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId == current.patient.getPatientId()) {
            return current;
        }

        if (patientId < current.patient.getPatientId()) {
            return searchRecursive(current.left, patientId);
        }

        return searchRecursive(current.right, patientId);
    }

    // DELETE
    public void delete(int patientId) {
        root = deleteRecursive(root, patientId);
    }

    private Node deleteRecursive(Node current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId < current.patient.getPatientId()) {
            current.left = deleteRecursive(current.left, patientId);

        } else if (patientId > current.patient.getPatientId()) {
            current.right = deleteRecursive(current.right, patientId);

        } else {

            // No child
            if (current.left == null && current.right == null) {
                return null;
            }

            // Right child only
            if (current.left == null) {
                return current.right;
            }

            // Left child only
            if (current.right == null) {
                return current.left;
            }

            // Two children
            Node successor = findMinimum(current.right);
            current.patient = successor.patient;
            current.right = deleteRecursive(
                    current.right,
                    successor.patient.getPatientId()
            );
        }

        return current;
    }

    private Node findMinimum(Node current) {

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    // IN-ORDER TRAVERSAL
    public void displayInOrder() {

        if (root == null) {
            System.out.println("No patients registered.");
            return;
        }

        inOrder(root);
    }

    private void inOrder(Node current) {

        if (current != null) {

            inOrder(current.left);

            System.out.println(current.patient);

            inOrder(current.right);
        }
    }
}