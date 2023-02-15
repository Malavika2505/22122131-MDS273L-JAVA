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

    static float Median(int[] arr){
        int count=arr.length;
       int n=arr.length;
        int new_arr[]=new int[n];
       
        for(int i=0;i<count;i++){
            for(int j=0;(0<j)&&(j<count);j++){
                int temp=0;
                if(arr[i]<=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
           new_arr[i]=arr[i]; 

        }
       if(new_arr.length%2==0){
        int a=(n/2);
        int b=a+1;
       float median=(new_arr[a]+new_arr[b])/2;
       return median;
       }
       else{
        float median=(new_arr[(n+1)/2]);
        return median;
       }
    

        }

    static float Mode(int []arr){
       int  count=0;
       int n=arr.length;
       int m_arr[]=new int[n];
       for(int i=0;i<n;i++){
        for(int j=0;(0<j)&&(j<n);j++){
            if(i==j){
                count+=1;
            }
        }
       
       m_arr[i]=count;
       }

       int i;
       int max=0;

       for( i=0;i<m_arr.length;i++){
        if(m_arr[i]>max){
            max=arr[i];
        }
       }
     float mode=max;
     return mode;  
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
        
        float val2=Median( arr);
        System.out.println("Median="+val2);

       }
       else if(fun==2){
        Mode( arr);
        float val3=Mode( arr);
       System.out.println("Mode="+val3);
       }
       else{
        System.out.println("Invalid");
       }


 }
 }