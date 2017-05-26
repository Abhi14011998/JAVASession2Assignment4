/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasession2assignment4;

import java.util.Scanner;

/**
 *
 * @author Abhinav
 */
public class JavaSession2Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
		System.out.println("Enter month in number: ");
		try {
			int month = Integer.parseInt(in.nextLine());
			switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("The selected month has 30 days");
				break;
			case 2:
				System.out.println("The selected month has 28/29 days");
				break;
			default:
				System.out.println("The selected month has 31 days");
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input.");
		}
    }
    
}
