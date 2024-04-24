package StudentManagement;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeParseException;

public class Student {

	public static void main(String []args) throws Throwable {

		ArrayList<StudRegister> Students = new ArrayList<StudRegister>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int choice = 0;

		do {

			System.out.println("--------Student Registration--------");
			System.out.println("1.Enter Student Details :");
			System.out.println("2.Update Student Details By ID :");
			System.out.println("3.Delete Student Details By ID :");
			System.out.println("4.View Student Details By ID :");
			System.out.println("5.View All Student Details :");
			System.out.println("6.--------Exit--------");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				
		
				int idCount=StudRegister.idCounter();
				System.out.println("Enter Student Name");
				String studName = sc1.next();
				System.out.println("Enter Student DOB in YYYY-MM-DD Format");
				String studDob = sc1.next();
				try {
				int age = StudRegister.ageCalculation(studDob);
				Students.add(new StudRegister(idCount, studName, studDob, age));
				System.out.println("Student Added Successfully");
				}catch(DateTimeParseException e ) {
					System.out.println(e);
				}
				break;
				
			
				
				
			
				
			case 2:

				System.out.println("Enter Student ID To Update :");
				int studId = sc.nextInt();

				try {

					for (StudRegister Student : Students) {

						if (Student.getStudId() == studId) {

							System.out.println("Enter Updated Student Name :");
							studName = sc.next();
							System.out.println("Enter Updated DOB :");
							studDob = sc.next();
							int age = StudRegister.ageCalculation(studDob);
							Student.setstudName(studName);
							Student.setstudDob(studDob);
							Student.setAge(age);
							System.out.println("Student Updated Successfully");
						} else {
							System.out.println("Record Not Found");
						}

					}

				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			case 3:

				System.out.println("Enter Student ID to Delete :");
				 studId = sc.nextInt();
				try {
					for (StudRegister Student : Students) {

						if (Student.getStudId() == studId) {

							Students.remove(Student);

							System.out.println("Student Deleted Sucessfully");
						} else {
							System.out.println("Record Not Found");
						}
					}
				} catch (Exception e) {
					System.out.println(e);
				}
				break;

			case 4:
//boolean isFound=false;
//				System.out.println("Enter Student ID :");
//				studId=sc.nextInt();
//				i=Students.iterator();
//				while (i.hasNext()) {
//					StudRegister Student = i.next();
//					
//				if(Student.getStudId()==studId) {
//					
//					System.out.println(Student);
//					
//				}
//				if(!isFound) {
//					System.out.println("Record Not Found");
//				}
//				
//				}

				System.out.println("Enter Student Id :");
				studId = sc.nextInt();

				for (StudRegister Student : Students) {

					if (Student.getStudId() == studId) {

						System.out.println("Student Details Of Id :" + Student.getStudId() + "\n" + "Student Name :"
								+ Student.getstudName() + "\n" + "Student DOB :" + Student.getstudDob());

					} else {
						System.out.println("Record Not Found");
					}

				}

				break;

			case 5:

				System.out.println("-----------------------------");
//				Iterator<StudRegister> i1 = Students.iterator();
//				while (i1.hasNext()) {
//					StudRegister Student = i1.next();
//					System.out.println(Student);
//				}

				for (StudRegister Student : Students) {
					System.out.println(Student);
				}

				System.out.println("-----------------------------");

				break;

			case 6:
				System.out.println("System Exited Sucessfully");
				System.exit(choice);

				break;

			}
		} while (choice != 0);

	}

}
