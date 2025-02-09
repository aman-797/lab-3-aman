import java.util.Scanner;
class Main{  

public static void main(String[]args){
       int start=10;
       int end=30;
       int num=10;
       Boolean isPrime=true;
       for (int i=2; i<num; i++) {
            if   (num%i==0){
                  isPrime=false;
                  break;
                          }
 
                  }
                  if    (isPrime){
                         System.out.println("Yes it's a prime");
                   
                  }
                  else {System.out.println("No it's not");}


            }


}