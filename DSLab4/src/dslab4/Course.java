/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab4;

/**
 *
 * @author Forge-15 i7
 */
public class Course implements Comparable<Course>{
    String code;
    String name;
    int cd,gradeVal;
    char grade;

    public Course(String code, String name, int cd, char grade) {
        this.code = code;
        this.name = name;
        this.cd = cd;
        this.grade = grade;
    }
    public int getgradeVal(){
        gradeVal = -1;
        switch(getGrade()){
            case 'A' : gradeVal = 4;
                       break;
            case 'B' : gradeVal = 3;
                       break;
            case 'C' : gradeVal = 2;
                       break;
            case 'D' : gradeVal = 1;
                       break;
            case 'F' : gradeVal = 0;
                       break;
            default : break;
        }
        return gradeVal;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCd() {
        return cd;
    }

    public char getGrade() {
        return grade;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Course arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\nCourse : " + code + "(" + name + ") - " + cd + " credit hours. Grade : " + grade;
    }
    

    
    
}
