import java.util.*;
class Main {
  public static void main(String[] args) {
    int age;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter ur age");
   age=sc.nextInt();
   if(age>=18)
   {
     System.out.println("Ur can vote");
   }
   else
   {
     System.out.println("u can't vote");
   }
   