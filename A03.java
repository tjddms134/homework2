import java.util.*;
import java.io.*;
class A03{
          void input(){
	                Scanner s = new Scanner(System.in);
			System.out.print("Input Count Day:");
			 int day = s.nextInt();
			 int seconds = day*24*60*60;
			 print(day+"Day is "+seconds+" Seconds");
			 int mcount = seconds / 1000000;
			print("It's has 1000000 seconds  " + mcount +"  times");

                      }
	void print(String str){
	                       System.out.println(str);
			       }
 
       public static void main(String [] args) throws IOException{
       new A03().input;
       }
       }
