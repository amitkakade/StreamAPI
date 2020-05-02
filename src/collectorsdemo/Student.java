/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectorsdemo;

/**
 *
 * @author admin
 */
public class Student {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }
    
    public Student getCurrentObj(){
        return this;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }

    private String name;

    private int id;

    private String subject;

    private double percentage;

}
