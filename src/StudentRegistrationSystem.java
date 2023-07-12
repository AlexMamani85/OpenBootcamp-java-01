/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alex
 */
//  9. Sorpréndenos creando un programa de tu elección que utilice InputStream, 
//  PrintStream, excepciones, un HashMap y un ArrayList,
//  LinkedList o array.


import java.io.*;
import java.util.*;

public class StudentRegistrationSystem {
    private static final String FILE_NAME = "students.txt";
    private static final String SEPARATOR = ",";
    
    public static void main(String[] args) {
        try {
            Map<String, Student> students = loadStudentsFromFile();
            
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("\n----- Student Registration System -----");
                System.out.println("1. Register new student");
                System.out.println("2. Display student information");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        registerStudent(students);
                        break;
                    case 2:
                        displayStudentInformation(students);
                        break;
                    case 3:
                        saveStudentsToFile(students);
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static Map<String, Student> loadStudentsFromFile() throws IOException {
        Map<String, Student> students = new HashMap<>();
        
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (InputStream inputStream = new FileInputStream(file);
                 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(SEPARATOR);
                    if (parts.length == 4) {
                        String id = parts[0];
                        String name = parts[1];
                        int age = Integer.parseInt(parts[2]);
                        String course = parts[3];
                        
                        Student student = new Student(id, name, age, course);
                        students.put(id, student);
                    }
                }
            }
        }
        
        return students;
    }
    
    private static void registerStudent(Map<String, Student> students) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        if (students.containsKey(id)) {
            System.out.println("Student with ID " + id + " already exists!");
            return;
        }
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();
        
        Student student = new Student(id, name, age, course);
        students.put(id, student);
        
        System.out.println("Student registered successfully!");
    }
    
    private static void displayStudentInformation(Map<String, Student> students) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        Student student = students.get(id);
        
        if (student != null) {
            System.out.println("\n----- Student Information -----");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
        } else {
            System.out.println("Student with ID " + id + " does not exist!");
        }
    }
    
    private static void saveStudentsToFile(Map<String, Student> students) throws IOException {
        try (PrintStream outputStream = new PrintStream(new FileOutputStream(FILE_NAME))) {
            for (Student student : students.values()) {
                String line = student.getId() + SEPARATOR + student.getName() + SEPARATOR +
                        student.getAge() + SEPARATOR + student.getCourse();
                outputStream.println(line);
            }
        }
    }
}

class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    
    public Student(String id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getCourse() {
        return course;
    }
}