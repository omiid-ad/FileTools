/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfiles;

import java.io.Serializable;

/**
 *
 * @author mr_aki
 */
public class Student implements Serializable{

    public Student(String name, String family, int grade) {
        this.name = name;
        this.family = family;
        this.grade = grade;
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the family
     */
    public String getFamily() {
        return family;
    }

    /**
     * @param family the family to set
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getFamily()+" "+this.getGrade();
    }
    
    
    
    private String name;
    private String family;
    private int grade;
    
}
