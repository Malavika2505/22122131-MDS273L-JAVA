import java.util.Scanner;
 class lab3{

    static float Mean(int[] arr) {
        float sum=0;
        int count=arr.length;
        for(int i=0;i<count;i++){
            sum=sum+arr[i];
        }
       float mean=(sum/count);
       return mean;
    }

    static double Median(int[] arr){
        int count=arr.length;
       int n=arr.length;
       
       int temp=0;
        for(int i=0;i<count;i++){
             for(int j=i+1;j<count;j++){
                 
                 if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
             }
            

         }
         for(int i=0;i<count;i++){
            System.out.println(arr[i]);
         }
        // System.out.println(arr);
       if(arr.length%2==0){
        int a=(n/2);
        int b=a+1;
       double median=(arr[a-1]+arr[b-1])/(2.0);
       return median;
       }
       else{
        double median=((arr[(n)/2]));
        return median;
       }
    

        }

    static float Mode(int []arr){
      
      int max=0;
      int max_val=0;
       int n=arr.length;
       //int m_arr[]=new int[n];
       for(int i=0;i<n;i++){
        int count=0;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count+=1;
            }
        }
       if(count>max){
        max=count;
        max_val=arr[i];
       }

       
      
       }

    
     
     return max_val;  
    }

    

     public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of elemnts to enter in array");
        n=Integer.parseInt(scan.nextLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter"+i+"th element");
            arr[i]=Integer.parseInt(scan.nextLine());

        }
        System.out.println("Enter 1:mean,2:median,3:mode");
       int fun=Integer.parseInt(scan.nextLine());
       if(fun==1){
       float val1=Mean( arr);
       System.out.println("Mean="+val1);

       
       }
       else if(fun==2){
        
        double val2=Median( arr);
        System.out.println("Median="+val2);

       }
       else if(fun==3){
        Mode( arr);
        float val3=Mode( arr);
       System.out.println("Mode="+val3);
       }
       else{
        System.out.println("Invalid");
       }


 }
 }