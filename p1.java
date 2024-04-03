import java.util.Scanner;
class p1
{
    public static void main(String a[])
    {
        student [] s = new student[3];
        myutil u = new myutil();

        for(int i=0;i<3;i++)
        {
                s[i]= new student();
                s[i].addstud();
        }

        u.sortobj(s);

        for(int i=0;i<3;i++)
        {
               s[i].showstud();
        }

    }



    
}

class student
{
    Scanner s = new Scanner(System.in);
    int roll;
    float tm;
    int [] marks= new int[3];
    String name;

    void addstud()
    {
        System.out.println("Enter roll");
        roll=Integer.parseInt(s.nextLine());
        System.out.println("Enter name");
        name=s.nextLine();
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter marks of subject "+(i+1));
            marks[i]=Integer.parseInt(s.nextLine());
            tm+=marks[i];

        }

    }


    void showstud()
    {
        System.out.println("Roll : "+ roll);
        System.out.println("Name : "+ name);
        for(int i=0;i<3;i++)
        {
            System.out.println("Marks of subject "+(i+1)+" : "+marks[i]);
        }
        System.out.println("Total percentage = "+ tm/3);

    }



}

class myutil
{
    void sortobj(student[] s)
    {
        student temp = new student();
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                if(s[i].tm>s[j].tm)
                {
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
    }

}