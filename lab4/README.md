Question<br>
Write a JAVA Menu driven program that does the following:<br>
You can ONLY have the below variables as global variables<br>
Account Number<br>
Account Holder Name<br>
Account Balance<br>
You MUST have the below as functions<br>
To initialize the customer<br>
To deposit money<br>
To withdraw money<br>
To print the transactions<br>
To print account summary<br>
Your menu will have the following operations once the customer is created<br>
To deposit money<br>
To withdraw money<br>
To print the transaction<br>
To print account summary<br>

Flow chart<br>

![lab4](https://github.com/Malavika2505/22122131-MDS273L-JAVA/assets/118505120/e03366ca-2554-44cf-aa90-bea84f479bfe)




Create account no ,account holder name,account balance as global variables<br>
Create a function deposit<br>
       In that create an array <br>
       ask the user for deposit amount<br>
       make balance=balance+deposit<br>
       in the array,store balance before deposit in 0 th position,deposit amount in 1st index, 0 in 2nd and balance after in 3rd
       return that array<br>
Create a function withdraw<br>
       In that create an array<br> 
       ask the user for  amount to withdraw<br>
       if withdraw amount>balance--->invalid<br>
       else<br>
       make balance=balance-withdraw<br>
       in the array,store balance before withdraw in 0 th position, 0 in 1st index, withdraw amount  in 2nd and balance after in 3rd
       return that array<br>
Create a function transaction<br>
       pass 2D array<br>
       print the array<br>
Create a function summary<br>
        print account no, holder name, balance amount<br>
in the main class<br>
    create a 2-D array<br>
       for each transaction store the values in the array<br>
       where rows are no of the transaction and columns are detailsof transaction
       ask for details<br>
      
       In do while<br>
             give options to deposit,withdraw etc<br>
             In switch statement<br>
            
                  call each function corresesponding to each switch condition<br>
