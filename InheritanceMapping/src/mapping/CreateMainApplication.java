/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

import java.util.Set;

import org.hibernate.Session;

/**
 *
 * @author duncan
 */
public class CreateMainApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create object
        Student temStudent = new Student("Paul","Wall","paul@lad.com","Java");   
        Instructor tempInstructor = new Instructor("Derrick","SOne","derr@fma.com",10000.0);
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        System.out.println("Saving the student and images..");
        ss.save(temStudent);
        ss.save(tempInstructor);
        ss.getTransaction().commit();
        
        // retrieve the student id
        
        ss.close();
    }
    
}
