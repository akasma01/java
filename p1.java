public class p1 {

       public static void main(String[] args) {
       
       String s1= new String();
       s1= "MCA";
       System.out.println(s1);
       System.out.println(s1.hashCode());
       System.out.println(s1.hashCode());
       System.out.println(s1.charAt(2)); 
      // System.out.println(s1.); 
       System.out.println("hello "+ s1); 
       System.out.println(s1.concat("hello")); 
       s1="MSC";
       System.out.println(s1.hashCode());    
       System.out.println(s1.hashCode()); 
       System.out.println(s1.charAt(2)); 


       }
}