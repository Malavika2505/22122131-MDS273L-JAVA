package lab1;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class lab1 {
   public static void main(String[] args) {

      String Name;
      int age;
      String Class;
      int roll_no;
      long ph_no;
      float cgpa;
      char gender;
      String state;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your name:");
      Name = scan.nextLine();
      System.out.println("Enter your age:");
      age = Integer.parseInt(scan.nextLine());
      System.out.println("Enter your Class:");
      Class = scan.nextLine();
      System.out.println("Enter your roll.no:");
      roll_no = Integer.parseInt(scan.nextLine());
      System.out.println("Enter your ph_no:");

      ph_no = Integer.parseInt(scan.nextLine());
      System.out.println("Enter cgpa obtained :");
      cgpa = Float.parseFloat(scan.nextLine());
      System.out.println("Enter your gender,'f'-female,'m'-male:");
      gender = scan.nextLine();

      if (gender == 'f') {
         System.out.println("female");
      } else if (gender == 'm') {
         System.out.println("Male");
      } else {
         System.out.println("invalid input");
      }
      System.out.println("Enter your state :");
      state = scan.nextLine();
       if ((state=="up")||(state=="Delhi")||(state=="jammu"))
       {
         System.out.println("Northern state");
       }
       else if((state=="Assam")||(state=="Arunachal")||(state=="Bihar")||(state=="uttar pradesh")||(state=="haryana")||(state=="punjab"))
       {
         System.out.println("Eastern states");
       }

       else if((state=="Kerala")||(state=="Tamil Nadu")||(state=="karnataka"))
       {
         System.out.println("Southern states");
       }  
       else if (state=="Gujarat")
       {
         System.out.println("Western states");
       } 
       else{
         System.out.println("not known");
       }
       System.out.println("Name"+Name);
       System.out.println("age"+age);
       //System.out.println("class"+class);
       System.out.println("state"+state);
       

   }
}