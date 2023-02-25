*Create account no ,account holder name,account balance as global variables
*Create a function deposit
       In that create an array 
       ask the user for deposit amount
       make balance=balance+deposit
       in the array,store balance before deposit in 0 th position,deposit amount in 1st index, 0 in 2nd and balance after in 3rd
       return that array
*Create a function withdraw
       In that create an array 
       ask the user for  amount to withdraw
       if withdraw amount>balance--->invalid
       else
       make balance=balance-withdraw
       in the array,store balance before withdraw in 0 th position, 0 in 1st index, withdraw amount  in 2nd and balance after in 3rd
       return that array
*Create a function transaction
       pass 2D array
       print the array
*Create a function summary
        print account no, holder name, balance amount
*in the main class
    create a 2-D array
       for each transaction store the values in the array
       where rows are no of the transaction and columns are detailsof transaction
       ask for details
      
       In do while
             give options to deposit,withdraw etc
             In switch statement
                  call each function corresesponding to each switch condition