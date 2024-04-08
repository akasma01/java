import java.util.Scanner;
class ops
{
    Scanner sc = new Scanner(System.in);
    String s;
    public ops(String a)
    {
        s=a;
    }

    public void occur()
    {
        int count=0;
        int l=s.length();
        System.out.println("Enter the character");
        char c=sc.nextLine().charAt(0);
        for(int i=0;i<l;i++)
        {
               if (s.charAt(i)==c)
               {
                   count++;
               }
        }

        System.out.println("Character "+c+" repeated "+ count+" times.");

    }

        public void lastoccur()
    {
        int pos=0;
        int l=s.length();
        System.out.println("Enter the character");
        char c=sc.nextLine().charAt(0);
        for(int i=0;i<l;i++)
        {
               if (s.charAt(i)==c)
               {
                   pos=i;
                   
               }
        }

        System.out.println("Last occurence was at index "+pos);

    }


    
}

class stringman{
    // Public static void main(String args[])

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String x;
        System.out.println("Enter a string");
        x=s.nextLine();
        ops o = new ops(x);
        o.occur();
        o.lastoccur();
       // occur(x);
        //System.out.println(x);
    }
}
