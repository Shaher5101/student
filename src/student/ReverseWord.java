/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.Scanner;

/**test
 *changes made here
 * @author shahe
 */
public class ReverseWord {
    public static void main(String[]args){
       /* char[] myArray = new char[7];
        myArray[0]='S';
        myArray[1]='T';
        myArray[2]='U';
        myArray[3]='D';
        myArray[4]='E';
        myArray[5]='N';
        myArray[6]='T';
        
        for(int i=0; i<myArray.length; i++)
            System.out.println(myArray[i]); */
    System.out.println("Enter word");
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    
    char[] myLetter = new char[word.length()];
    for(int i=0 ; i<myLetter.length ; i++){
        myLetter[i]=word.charAt(i);
        System.out.println(myLetter[i]);
    }
    System.out.println("printing in reverse");
    for(int i=myLetter.length-1 ; i>=0 ; i--){
        myLetter[i]=word.charAt(i);
        System.out.println(myLetter[i]);
    }
    }//end of main
}//end of class
