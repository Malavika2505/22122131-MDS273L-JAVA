import java.util.*;

public class lab4 {
    
    static int Account_no;
    static String Name;
    static float Balance;
    
   
   
   static float[] deposit(float Balance){
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the amount you need to deposit:");
    float amount1=scan.nextInt();
    Balance=Balance+amount1;
    float[] arr=new float[2];
    arr[0]=amount1;
    arr[1]=Balance;
    return arr;

   } 
   static float[] withdraw(float Balance){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the amount you need to withdraw:");
    float amount2=scan.nextInt();
    if(amount2>Balance){
        System.out.println("No sufficient balance");
        amount2=0;
        
    }
   

        Balance=Balance-amount2;
        float[] arr=new float[2];
        arr[0]=amount2;
        arr[1]=Balance;
        
    
    
    return arr;
    
    
    
   }

   static String[] transaction(int ch,float Balance){
    int count=0;
    String[] Arr=new String[1024];
    // float amount1=withdraw(Balance);
    // float amount2 = deposit(Balance);
    //if(ch==1){
    //Balance=Balance+amount1;
    Arr[count]="Rupees"+arr[0]+"is credited";
    
    
    }
    else if(ch==2) {
        if(amount2>Balance){
            System.out.println("No sufficient balance");
        }
        else{
            Balance=Balance-amount2;
        }
        Arr[count]="Rupees"+Balance+"is debited"; 
    }
    count+=1;
    return Arr;
   }
//    static float summary( float Balance){
//     System.out.println("Account no:"+Account_no);
//     System.out.println("Account holder name:"+Name);
//     System.out.println("Balance amount:"+Balance)

//    }

   public static void main(String[] args){
    
   

    System.out.println("Welcome to ABC bank");
    int y;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the account number:");
        
        Account_no=scan.nextInt();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        Name=sc.nextLine();
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the balance:");
        Balance=a.nextInt();
        do{
        Scanner s=new Scanner(System.in);
        System.out.print("Choose 1:deposit\n 2:withdraw\n 3:transaction details\n 4:Summary\n 5:Exit");
        int ch=s.nextInt();
        
        switch(ch){

            case 1:
            float d=deposit(Balance);
            float dp=d;
            break;

           case 2:
            float w = withdraw( Balance);
            float wd=w;
            break;

            case 3:
             String[] t=transaction(ch,Balance);
            break;

            case 4:
            System.out.println("Account no:"+Account_no);
            System.out.println("Account holder name:"+Name);
            System.out.println("Balance amount:"+Balance);
            break;

            case 5:
            System.out.println("Exit");

            default:
            System.out.println("Invalid");
        }
        System.out.println("Enter 1 to continue");
        Scanner c= new Scanner(System.in);
         y=c.nextInt();
    }
     
         while(y==1) ;
            System.out.println("Thank you for using our services");
         

      
}
}
