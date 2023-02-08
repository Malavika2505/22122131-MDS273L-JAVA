import java.util.Scanner;
class lab2{
    public static void main(String[] args) { 
        Scanner obj=new Scanner(System.in);
        String arr[]=new String[1024];
        arr[0]="ARUN";
        arr[1]="ANU";
        arr[2]="Arathy";


        String c;
        do{
        System.out.println("Enter 1:to enter a name,2:search for a name,3:remove aname,4:show all names");
        Scanner ch=new Scanner(System.in);
        int n=ch.nextInt();
        switch(n){
            case 1:
            System.out.println("Enter the name:");
            Scanner nm=new Scanner(System.in);
            String name=nm.nextLine();
            arr[3]=name;
            break;
            case 2:
            

            System.out.println("Enter the name : ");
            Scanner rm=new Scanner(System.in);
            String new_name=rm.nextLine();
            for (String s : arr) {
                if (new_name.equals(s)) {
                    System.out.println("name is in the array");}
            else {
                    System.out.println("name is not in the array");
                 }  

            }
               break;
            case 3:
            for(int k=0;k<1024;k++){
                System.out.println("The names are:");
                System.out.println(arr[k]);
            }


        }
        System.out.println("Press 'y' to repeat");
        Scanner ca=new Scanner(System.in);
         c=ca.nextLine();
        }
        while(c!="y");
        System.out.println("program end");


}


    
}
