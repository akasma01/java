public class p2 {
       public static void main(String[] args) {
              String s1="test";
              String s2="test";
              String s3=new String("test");
              final String s4 = s3.intern();
              System.out.println(s1==s2);
              System.out.println(s2==s3);
              System.out.println(s3==s4);
              System.out.println(s1==s3);
              System.out.println(s1==s4);

              System.out.println(s1.equals(s2));
              System.out.println(s2.equals(s3));
              System.out.println(s3.equals(s4));
              System.out.println(s1.equals(s4));
              System.out.println(s1.equals(s3));


       }
       
}
