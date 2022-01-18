/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author fiona
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] s1 = new Student[3]; //declare student obj array
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<s1.length; i++){
            s1[i] = new Student(); //assign obj into array
            System.out.println("Enter Student Name: ");
            s1[i].setName(input.nextLine());
        }
        
        for (int j=0; j<s1.length; j++){
            System.out.println("Student name: " +s1[j].getName());
            
        }
        
    }
    
}
