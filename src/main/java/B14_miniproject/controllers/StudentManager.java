
package B14_miniproject.controllers;

import B14_miniproject.moder.Student;
import B14_miniproject.controllers.StudentDataService;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class StudentManager {
    
    private List<Student> list;

    private final String pathFileToInput;

    private StudentDataService service;
    
    public StudentManager(String pathFileToInput) throws IOException{

        this.pathFileToInput = pathFileToInput;
        this.service = new StudentDataService();
        this.list = service.read(pathFileToInput);
    }
    
    

    public void sortByName(List<Student> list){
        
        Collections.sort(list,(s1, s2) -> s1.getName().compareTo(s2.getName()));
        
    }
    
    public void sortByAddress(List<Student> list){
        
        Collections.sort(list,(s1, s2) -> s1.getAddress().compareTo(s2.getAddress()));
        
    }
     public void sortById(List<Student> list){
        
        Collections.sort(list,(s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
        
    }
     //
    public Student findByName(List<Student> list, String name ){
         
        for(Student s:list){
             
            if (s.getName().equals(name)){
            
            return s;
            }
        }
        return null;
        
        
    }
    
    public Student findById(List<Student> list, int id){
        
        for(Student s:list){
            
            if(s.getId()==id){
                return s;
                
            }
        }
        return null;
    }
    
    public void showAll(){
        
        for (Student s: list ){
            
            System.out.println(s.toString());
        }
    }
    
    public void delete(List<Student> list, int id){
        
        Student findById = findById(list, id);
        
        list.remove(findById);
    }
    public void editName( int id){
        
        Student student = findById(list, id);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Name: ");
        String newName = scanner.nextLine();
        student.setName(newName);
        
    }  
          
    public void addStudent(List<Student> list,Scanner sc){
         
        list.add(new Student().input(sc));
        
    }

    public void sortByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void sortById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addStudent(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
