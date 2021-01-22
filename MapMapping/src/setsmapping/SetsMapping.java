/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsmapping;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;

/**
 *
 * @author duncan
 */
public class SetsMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student temStudent = new Student("Koe","Kall","afal@lad.com");
        Map<String, String> theImages = temStudent.getImages();
        
        theImages.put("photo1.jpg","photo");
        theImages.put("photo2.jpg", "photo");
        
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        System.out.println("Saving the student and images..");
        ss.save(temStudent);
        ss.getTransaction().commit();
        ss.close();
    }
    
}
