import java.util.Scanner;
class student{
    Scanner s = new Scanner(System.in);
    int roll;
    String name,course;

    void get_stud()
    {
        System.out.println("Enter roll no");
        roll=Integer.parseInt(s.nextLine());
        System.out.println("Enter student name");
        name=s.nextLine();
        System.out.println("enter course");
        course=s.nextLine();
    }

        void show_stud()
    {
        System.out.println("roll no : "+roll);
        System.out.println("student name : "+name);
        System.out.println("course : "+course);
    }

}