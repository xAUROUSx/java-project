import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {

            System.out.println("Enter 1- for Module 1");
            System.out.println("Enter 2- for Module 2");
            System.out.println("Enter 3- for Module 3");
            System.out.println("Enter 4- to Exit");

            choice = obj.nextInt();

            if (choice == 1) {
                Module1 obj1 = new Module1();
                System.out.println("Enter student's name");
                obj1.name = obj.nextLine(); 
                obj1.name = obj.nextLine(); 
                System.out.println("Enter the father's name");
                obj1.fname = obj.nextLine();
                System.out.println("Enter university id");
                obj1.uni_id = obj.nextLine();
                System.out.println("Enter the User id");
                obj1.uid = obj.nextLine();
                System.out.println("In which semester do you study:");
                obj1.sem = obj.nextInt();

                obj1.getdata(obj1.name, obj1.fname, obj1.uid, obj1.uni_id, obj1.sem);
                obj1.setdata();
            } else if (choice == 2) {
                Module2 obj2 = new Module2();
                obj2.datascience();
                obj2.computerscience();
                obj2.IT();
            } else if (choice == 3) {
                Module3 obj3 = new Module3();
                obj3.chooseBook();  // Calling the method to choose a book
            } else if (choice == 4) {
                System.out.println("Exiting program.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}