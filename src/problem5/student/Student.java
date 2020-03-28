/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private String name;
    private int rollNumber;
    private char section;
    private String university;
    private int appearingCount;
    private int backLog;

    public Student(String name, int rollNumber, char section, String university) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.section = section;
        this.university = university;
    }

    public Student(String name, int rollNumber, char section, String university, int appearingCount, int backLog) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.section = section;
        this.university = university;
        if(appearingCount>2 ){  this.appearingCount = 2;
            System.out.println("appearing count should not be greater than 2 hence default value 2 is selected "); }
        else { this.appearingCount = appearingCount; }
        this.backLog = backLog;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public int getBackLog() {
        return backLog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", section=" + section +
                ", university='" + university + '\'' +
                ", appearingCount=" + appearingCount +
                ", backLog=" + backLog +
                '}';
    }
}
