/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsmapping;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

/**
 *
 * @author duncan
 */
public class ListMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student temStudent = new Student("Paul","Wall","paul@lad.com");
        List<String> theImages = temStudent.getImages();
        
        theImages.add("phot1.jpg");
        theImages.add("photo2.jpg");
        theImages.add("photo3.jpg");
        theImages.add("photo3.jpg");
        theImages.add("photo3.jpg");
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        System.out.println("Saving the student and images..");
        ss.save(temStudent);
        System.out.println("Saving the student and images..");
        ss.getTransaction().commit();
        ss.close();
    }
    
}
