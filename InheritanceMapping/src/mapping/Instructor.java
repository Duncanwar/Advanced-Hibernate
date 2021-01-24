/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author duncan
 */
@Entity
@DiscriminatorValue(value = "INSTRUCTOR")
public class Instructor extends User{
    
    private Double Salary;
    
    public Instructor(){}
    
    public Instructor( String firstName, String lastName, String email,Double Salary) {
        super(email, firstName, lastName);
        this.Salary = Salary;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }
    
    
}
