package B14_miniproject.moder;

import java.util.Scanner;

public class Student {
   
    private int id;
    private String name;
    private String klass;
    private String address;
    
    public Student(){
        
    }

    public Student(int id, String name, String klass, String address) {
        this.id = id;
        this.name = name;
        this.klass = klass;
        this.address = address;
    }
    
    public Student input(Scanner sc){
        
        System.err.println("Enter student id");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter fullname:");
        String name = sc.nextLine();
        
        System.out.println(" Enter klass");
        String klass = sc.nextLine();
        
        System.out.println(" Enter address");
        String address = sc.nextLine();
        
        return new Student(id, name, klass, address);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
     public void setName(String name) {
        this.name = name;
    }

    public String getKlass() {
        return klass;
    }
    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", klass=" + klass + ", address=" + address + '}';
    }

    

}