package com.wgu.scriptingandprogrammingapplications;

import java.util.ArrayList;
import java.util.Arrays;

public class Roster {
	private static String[] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
	 									"2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
	 									"3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
	 									"4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
	 									"5,David,Bidle,dbidle@wgu.edu,40,85,92,82"};
	
	private static ArrayList<Student> roster = new ArrayList<Student>();;
	
	public static void main(String[] args) {
		for (String student : students){
			String[] temp = student.split(",");
			add(temp[0], temp[1], temp[2], temp[3], Integer.valueOf(temp[4]), Integer.valueOf(temp[5]), Integer.valueOf(temp[6]), Integer.valueOf(temp[7]));
		}
		
		System.out.println("Print_All Method Output: ");
		print_all();
		System.out.println("\n");
		
		System.out.println("Print_Invalid_Emails Method Output: ");
		print_invalid_emails();
		System.out.println("\n");
		
		//loop through the ArrayList and for each element:
		//print_average_grade(current_loop_student);
		System.out.println("Print_Average_Grades Method Output: ");
		for(Student student : roster){
			print_average_grade(student.getStudentID());
		}
		System.out.println("\n");
		
		System.out.println("Remove Method Output: ");
		remove("3");
		remove("3");
		System.out.println("\n");
		
		System.out.println("Using mutator to change an object's instance variable:");
		roster.get(3).setFirstName("James");
		roster.get(3).print();
		
	}

	public static void add(String studentID, 
						   String firstName, 
						   String lastName, 
						   String emailAddress, 
						   int age, 
						   int grade1, 
						   int grade2, 
						   int grade3){
		//sets the instance variables from part B1 and updates the roster.
		int[] grades = {grade1, grade2, grade3};
		
		
		roster.add(new Student(studentID, firstName, lastName, emailAddress, age, grades));

	}

	public static void remove(String studentID){
		//removes students from the roster by student ID.
		//If the student ID doesn’t exist, the method should print an error message indicating that it is not found.
		boolean hasId = false;
		for (Student student : roster){
			if (student.getStudentID().contains(studentID)){
				hasId = true;
			}
		}
		
		if(hasId){
			for (Student student : roster){
				if (student.getStudentID().contains(studentID)){
					int index = roster.indexOf(student);
					System.out.println("Student with id of " + student.getStudentID() + " was removed.");
					roster.remove(index);
					break;
				}
			} 
		} else {
		System.out.println("There was no student found with id of " + studentID);
		}
	}	
	
	public static void print_all() {
		//prints a complete tab separated list of student data using accessor methods. 
		
		for(Student student : roster){
			student.print();
		}
		
	} 
	
	public static void print_average_grade(String studentID){
		//prints student average grade by student id.
		double total = 0;
		double averageGrade = 0;
		for(Student student : roster){
			if(student.getStudentID().equals(studentID)){
				int[] grades = student.getGrades();
				for(int grade : grades){
					total += grade;
				}
			System.out.print(student.getFirstName() + " " + student.getLastName() + "'s " + "Average Grade is ");	
			averageGrade = Math.round((total/3) * 100d) / 100d;	
			}
			
		}
		System.out.println(averageGrade);
	
	}
	
	public static void print_invalid_emails(){
		String email;
		for(Student student : roster){
			email = student.getEmailAddress();
			
			if(!email.contains("@") || email.contains(" ") || !email.contains(".")){
				System.out.println("Invalid Email: " + email);
			}
		}
	}
	
}
