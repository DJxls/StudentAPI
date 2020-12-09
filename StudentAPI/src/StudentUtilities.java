/*
 * 
 * Friday timed assignments 
 * StudentUtils -> It should contain an array of Student

Should provide following functionalities -
1. get Student by Registration Id
2. get all Students by Name          done
3. Update Student by Registration Id
4. Remove student by Registration Id
5. get all Students by City          done
6. get all Elder Students by age     done
7. get all younger students by age   done
 * @author Darren
 */

// This class will be an API

public class StudentUtilities {
	
	private static Student[] students; 
	
	public static void main(String[] args) {
		
		students = new Student[4];
		
		students[0] = new Student(100, "James", 20, "New York");
		students[1] = new Student(101, "Sean", 40, "Chicago");
		students[2] = new Student(102, "Dontae", 30, "Pheonix");
		students[3] = new Student(103, "Travis", 10, "Binghamton");
		
		
		
		for (int i = 0; i < students.length; i++) {
			
		    int id = students[i].getId(); 
		    String name = students[i].getName();
		    int age = students[i].getAge(); 
			String city = students[i].getCity(); 
	       
			System.out.println(name);
			System.out.println(city); 
			System.out.println(id); /* Line 51 is in place until i 
			can find a good way to get, update, and delete students
			by id without requesting input from the user, which is
			best practice for an API. */
			
			if(students[i].getAge() < 18) {
				System.out.println(age + "This student is a minor");
			}
			else if (students[i].getAge() > 17) {
				System.out.println(age + "This student is an adult");
			}
	
		}
	}
}
			

	