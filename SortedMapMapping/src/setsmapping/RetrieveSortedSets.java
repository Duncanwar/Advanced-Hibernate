/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsmapping;

import org.hibernate.Session;

/**
 *
 * @author duncan
 */
public class RetrieveSortedSets {
    
    public static void main(String[] args) {
         int theId = 1;
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Student student = (Student) ss.get(Student.class, theId);
        System.out.println("Student details :" + student);
        // print associated Images
        System.out.println("The associated Images :"+ student.getImages());
        ss.close();
    }
}
