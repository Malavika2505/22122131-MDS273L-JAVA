import java.util.*;
class lab2{
    public static void main(String[] args) { 
        Scanner obj=new Scanner(System.in);
        String arr[]=new String[1024];
        arr[0]="ARUN";
        arr[1]="ANU";
        arr[2]="Arathy";
        int count=3;

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
            boolean found=false;
            for(int i=0;i<count;i++){
                if(name.equals(arr[i])){
                    System.out.println("Name already exist");
                    found=true;
                    break;
                }
            }
            if(!found){
                arr[count]=name;
                 count++;
            }
           
            break;
            case 2:
            

            System.out.println("Enter the name to search: ");
            Scanner rm=new Scanner(System.in);
            String new_name=rm.nextLine();
            found=false;
            for(int i=0;i<count;i++){
                if(new_name.equals(arr[i])){
                    System.out.println("Name is there in the array");
                    found=true;
                    break;
                }
            }
            if(!found){
             System.out.println("Name not found");
            }
               break;
            case 3:
            System.out.println("Enter thename to remove");
            Scanner r_m=new Scanner(System.in);
            String r_name=r_m.nextLine();
            int index=-1;
            for(int i=0;i<count;i++){
                if(r_name.equals(arr[i])){
                  index=i;
                  break;
                }
            }
            if(index!=-1){
                for(int i=index;i<count-1;i++){
                    arr[i]=arr[i+1];
                }
               count--;
            }else{
                System.out.println("Name not found");
            }
            break;
            case 4:
            for(int i=0;i<count;i++){
                System.out.println(arr[i]);
            }
            break;
            default:
            System.out.print("Invalid");
            break;
        }
        System.out.println("Press 'y' to continue");
        Scanner ca=new Scanner(System.in);
         c=ca.nextLine();
        }
        while(c!="y");
        System.out.println("program end");


}


    
}
