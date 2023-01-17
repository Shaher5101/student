/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author shahe
 */
public class StudentList {
    public static void main(String[]args){
        
        //Student s1 = new Student("S1","Name");
        Student[] studentList = new Student[3];
        studentList[0]= new Student("S1","Name1");
        studentList[1]= new Student("S2","Name2");
        studentList[2]= new Student("S3","Name3");
        
        for(int i=0; i<studentList.length; i++)
            System.out.println(studentList[i].getStudentName());
    }//end of main
}//end of class
