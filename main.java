import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("The current working directory is " + currentDirectory);

        String userName = System.getProperty("user.name");
        System.out.println("Programmer :userName (Mohammad Badruzzaman)");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy @ HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Your name: ");
//        String username = input.nextLine();
//	    
        Employee empl1 = new Employee();
	    empl1.setName("Susan Meyers");
	    empl1.setIdNumber(47899);
	    empl1.setDepartment("Accounting");
	    empl1.setPosition("Vice President");
	    

	    Employee empl2 = new Employee("Mark Jones", 39119,
	    		"IT", "Programmer");

	    Employee empl3 = new Employee("Joy Rogers", 81774);
	    empl3.setDepartment("Manufacturing");
	    empl3.setPosition("Engineer");
	    

	    System.out.println("Employee #1");
	    System.out.println("Name: " + empl1.getName());
	    System.out.println("ID Number: " + empl1.getIdNumber());
	    System.out.println("Department: " + empl1.getDepartment());
	    System.out.println("Position: " + empl1.getPosition() + "\n");
	    

	    System.out.println("Employee #2");
	    System.out.println("Name: " + empl2.getName());
	    System.out.println("ID Number: " + empl2.getIdNumber());
	    System.out.println("Department: " + empl2.getDepartment());
	    System.out.println("Position: " + empl2.getPosition() + "\n");
	    

	    System.out.println("Employee #3");
	    System.out.println("Name: " + empl3.getName());
	    System.out.println("ID Number: " + empl3.getIdNumber());
	    System.out.println("Department: " + empl3.getDepartment());
	    System.out.println("Position: " + empl3.getPosition() + "\n");
	    
	  
	    
	    
    }
}