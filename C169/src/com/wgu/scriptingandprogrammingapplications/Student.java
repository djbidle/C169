package com.wgu.scriptingandprogrammingapplications;

public class Student {
	
	private String studentID;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private int age;
	private int[] grades;
	
	public Student(String studentID, String firstName, String lastName, String emailAddress, int age,
			int[] grades) {
		//Student object constructor
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.grades = grades;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	public void print(){
		//prints to console each students attributes.
		String id = this.getStudentID();
		String firstName = this.getFirstName(); 
		String lastName = this.getLastName(); 
		int age = this.getAge();         
		int[] grades = this.getGrades();
		
		int gradeOne = grades[0];
		int gradeTwo = grades[1];
		int gradeThree = grades[2];
		
		System.out.println("Student Id: " + id + "\t\t" +  
						   "First Name: " + firstName + "\t" +   
						   "Last Name: " + lastName + "\t" +   
						   "Age: " + age + "\t\t" +   
						   "Grades: " + gradeOne + " " + gradeTwo + " " + gradeThree);
	}
	
}
