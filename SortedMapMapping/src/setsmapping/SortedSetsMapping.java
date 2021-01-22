/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsmapping;

import java.util.Map;
import java.util.Set;

import org.hibernate.Session;

/**
 *
 * @author duncan
 */
public class SortedSetsMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create object
        Student temStudent = new Student("Paul","Wall","paul@lad.com");
        Map<String,String> theImages = temStudent.getImages();
       
        
        theImages.put("phot1.jpg","photo");
        theImages.put("photo2.jpg","photo");
        theImages.put("photo3.jpg","photo");
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        System.out.println("Saving the student and images..");
        ss.persist(temStudent);
        ss.getTransaction().commit();
        
        // retrieve the student id
        
        ss.close();
    }
    
}
