# Mini Hospital Emergency Management System

## 📌 Project Overview

The **Mini Hospital Emergency Management System** is a Java-based console application designed to manage basic hospital operations using fundamental **Data Structures and Algorithms**.

The system demonstrates how different data structures can be applied to real-world hospital management tasks such as:

* Patient registration
* Patient searching
* Patient deletion
* Emergency patient management
* Treatment history management
* Patient visit history management

The project is developed using **Java** and can be executed using **Eclipse IDE**.

---

## 🎯 Objectives

The main objectives of this project are:

1. To develop a simple hospital management system using Java.
2. To demonstrate the practical use of data structures.
3. To implement a **Binary Search Tree (BST)** for patient management.
4. To implement a **Queue** for emergency patients.
5. To implement a **Stack** for treatment records.
6. To implement a **Linked List** for patient visit history.
7. To provide a simple menu-driven console interface.
8. To demonstrate searching, insertion, deletion, enqueue, dequeue, push and pop operations.

---

## 🛠️ Technologies Used

| Technology       | Purpose                                                |
| ---------------- | ------------------------------------------------------ |
| Java             | Main programming language                              |
| Eclipse IDE      | Development environment                                |
| Git              | Version control                                        |
| GitHub           | Source code management                                 |
| Java Collections | Not required; data structures are implemented manually |

---

## 🏥 Main Features

### 1. Patient Management

The system allows users to:

* Register new patients
* Search for patients using Patient ID
* Delete patient records
* Display registered patients

Patient information includes:

* Patient ID
* Patient Name
* Age
* Contact Number
* Medical Condition

Patient records are managed using a **Binary Search Tree**.

---

### 2. Emergency Queue

Emergency patients are managed using a **Queue** data structure.

The queue follows the:

> **FIFO – First In, First Out**

principle.

Available operations:

* Add emergency patient
* Treat next patient
* Display emergency waiting queue

Example:

```text
Patient A → Patient B → Patient C

Patient A is treated first.
```

---

### 3. Treatment Stack

Treatment records are managed using a **Stack**.

The stack follows:

> **LIFO – Last In, First Out**

principle.

Available operations:

* Add treatment record
* Remove latest treatment
* Display treatment history

Example:

```text
Treatment C
Treatment B
Treatment A

Treatment C is removed first.
```

---

### 4. Patient Visit History

Patient visit information is stored using a **Linked List**.

The system supports:

* Adding a visit
* Searching for a visit
* Removing a visit
* Displaying visit history

Each visit contains:

* Visit ID
* Visit Date
* Doctor Name
* Diagnosis
* Treatment

---

# 📂 Project Structure

```text
MiniHospitalEmergencySystem/
│
├── src/
│   ├── module-info.java
│   │
│   └── hospital/
│       ├── EmergencyQueue.java
│       ├── HospitalManagementSystem.java
│       ├── HospitalManagementSystemTest.java
│       ├── Patient.java
│       ├── PatientBST.java
│       ├── TreatmentRecord.java
│       ├── TreatmentStack.java
│       ├── Visit.java
│       └── VisitLinkedList.java
│
├── .classpath
├── .project
└── README.md
```

---

# 🧩 Data Structures Used

## 1. Binary Search Tree – Patient Management

**Class:**

```text
PatientBST.java
```

The Binary Search Tree stores patients according to their Patient ID.

### Operations

* Insert
* Search
* Delete
* In-order traversal

### Complexity

| Operation | Average Case | Worst Case |
| --------- | -----------: | ---------: |
| Insert    |     O(log n) |       O(n) |
| Search    |     O(log n) |       O(n) |
| Delete    |     O(log n) |       O(n) |
| Traversal |         O(n) |       O(n) |

---

## 2. Queue – Emergency Patients

**Class:**

```text
EmergencyQueue.java
```

The queue is implemented using linked nodes.

### Operations

* Enqueue
* Dequeue
* Display
* Check whether empty

### Principle

```text
FIFO
First In → First Out
```

---

## 3. Stack – Treatment Records

**Class:**

```text
TreatmentStack.java
```

The stack is implemented using linked nodes.

### Operations

* Push
* Pop
* Display
* Check whether empty

### Principle

```text
LIFO
Last In → First Out
```

---

## 4. Linked List – Visit History

**Class:**

```text
VisitLinkedList.java
```

A singly linked list is used to store patient visit records.

### Operations

* Add visit
* Search visit
* Remove visit
* Display visits

---

# 📄 Class Description

## `Patient.java`

Represents a hospital patient.

### Attributes

```text
patientId
patientName
age
contactNumber
medicalCondition
```

It provides getters, setters and a `toString()` method.

---

## `PatientBST.java`

Manages patient records using a Binary Search Tree.

Main operations:

```java
insert()
search()
delete()
displayInOrder()
```

---

## `EmergencyQueue.java`

Manages emergency patients using a Queue.

Main operations:

```java
enqueue()
dequeue()
display()
isEmpty()
```

---

## `TreatmentRecord.java`

Represents an individual treatment record.

### Attributes

```text
patientId
patientName
doctorName
treatment
date
```

---

## `TreatmentStack.java`

Manages treatment records using a Stack.

Main operations:

```java
push()
pop()
display()
isEmpty()
```

---

## `Visit.java`

Represents a patient's hospital visit.

### Attributes

```text
visitId
visitDate
doctorName
diagnosis
treatment
```

---

## `VisitLinkedList.java`

Stores patient visit records using a Linked List.

Main operations:

```java
addVisit()
searchVisit()
removeVisit()
displayVisits()
```

---

## `HospitalManagementSystem.java`

This is the **main class** of the application.

It provides a menu-driven interface for accessing all system functions.

---

## `HospitalManagementSystemTest.java`

This class is intended for testing the functionality of the hospital management system and its data structures.

---

# 🖥️ System Menu

When the application starts, the following menu is displayed:

```text
======================================
 MINI HOSPITAL EMERGENCY MANAGEMENT
======================================

1.  Register Patient
2.  Search Patient
3.  Delete Patient
4.  Display Patients
5.  Add Emergency Patient
6.  Treat Next Patient
7.  Display Emergency Queue
8.  Add Treatment Record
9.  Remove Latest Treatment
10. Display Treatment History
11. Add Patient Visit
12. Search Visit
13. Remove Visit
14. Display Visit History
0.  Exit
```

---

# ▶️ How to Run the Project

## Step 1 – Open Eclipse

Open **Eclipse IDE**.

## Step 2 – Import the Project

Select:

```text
File → Import
```

Then choose:

```text
Existing Projects into Workspace
```

Select the project folder:

```text
MiniHospitalEmergencySystem
```

Click **Finish**.

---

## Step 3 – Check the Source Files

Make sure the following package exists:

```text
src/hospital
```

and contains all Java classes.

---

## Step 4 – Run the Application

Open:

```text
HospitalManagementSystem.java
```

Right-click inside the file and select:

```text
Run As → Java Application
```

---

# 🧪 Example Usage

## Register Patient

```text
Enter your choice: 1

Enter Patient ID: 101
Enter Patient Name: John
Enter Age: 35
Enter Contact Number: 0771234567
Enter Medical Condition: Fever

Patient registered successfully.
```

---

## Search Patient

```text
Enter your choice: 2

Enter Patient ID: 101

Patient Found:
ID: 101 | Name: John | Age: 35 |
Contact: 0771234567 | Condition: Fever
```

---

## Add Emergency Patient

```text
Enter your choice: 5

Enter Patient ID: 102

Emergency patient added to queue.
```

---

## Treat Next Patient

```text
Enter your choice: 6

Treating emergency patient:

ID: 102 | Name: Sarah | Age: 28 |
Contact: 0712345678 | Condition: Accident
```

---

# 🔄 Data Structure Workflow

The overall system can be represented as:

```text
                 MINI HOSPITAL
                      │
        ┌─────────────┼─────────────┐
        │             │             │
        ▼             ▼             ▼
   Patient        Emergency     Treatment
   Management       Queue          Stack
        │             │             │
        ▼             ▼             ▼
       BST           FIFO          LIFO
        │
        ▼
   Patient Search
   Patient Delete
   Patient Display

                      │
                      ▼
                Visit History
                      │
                      ▼
                 Linked List
```

---

# 🔐 Data Structure Summary

| Hospital Function  | Data Structure     | Main Principle     |
| ------------------ | ------------------ | ------------------ |
| Patient Management | Binary Search Tree | Ordered searching  |
| Emergency Patients | Queue              | FIFO               |
| Treatment History  | Stack              | LIFO               |
| Visit History      | Linked List        | Sequential storage |

---

# 📈 Advantages

* Simple and easy-to-use console interface
* Demonstrates multiple data structures in one application
* Efficient patient searching using BST
* FIFO emergency patient processing
* LIFO treatment record management
* Dynamic visit history using linked nodes
* No external database required
* Suitable for demonstrating fundamental Java and DSA concepts

---

# ⚠️ Limitations

This is an educational mini-project and does not represent a complete real-world hospital management system.

Current limitations include:

* No database integration
* No user authentication
* No graphical user interface
* Data is lost when the application closes
* No advanced patient billing functionality
* No online appointment system
* No multi-user support

---

# 🚀 Future Improvements

The system could be improved by adding:

* MySQL database integration
* Java Swing or JavaFX GUI
* Doctor management
* Appointment scheduling
* Patient billing
* User login and authentication
* Medical report management
* Patient priority levels
* File-based data persistence
* Advanced emergency prioritization
* Search and filtering features
* Automated testing with JUnit

---

# 🧪 Testing

The project includes:

```text
HospitalManagementSystemTest.java
```

Testing should cover:

* Patient insertion
* Patient searching
* Patient deletion
* Queue enqueue
* Queue dequeue
* Stack push
* Stack pop
* Visit insertion
* Visit searching
* Visit removal
* Empty data structure conditions

---

# 📚 Learning Outcomes

After completing this project, the following concepts can be demonstrated:

* Java classes and objects
* Encapsulation
* Constructors
* Getters and setters
* Methods
* Inner classes
* Recursion
* Binary Search Trees
* Queues
* Stacks
* Linked Lists
* Searching algorithms
* Tree traversal
* Node-based data structures
* Menu-driven Java applications
* Git version control

---

# 👨‍💻 Project Information

**Project Name:** Mini Hospital Emergency Management System

**Programming Language:** Java

**Development Environment:** Eclipse IDE

**Project Type:** Console-Based Application

**Main Concept:** Data Structures and Algorithms

---

# 📜 License

This project is created for **educational and academic purposes**.
