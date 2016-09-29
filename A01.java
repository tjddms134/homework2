import java.util.*;

class A01{
            int year;
            int age;

	    public void init(){
	           input();
		   print();
	    }

	    public void input(){
	    Scanner s=new Scanner(System.in);

	    System.out.println("input your bithyear");
	    this.year=s.nextInt();

	    this.age=(2014-year)+1;
	    }

	    public void print() {
	    if(age <= 20) 
	     			System.out.println("Not adult."); 
	     		else 
	     			System.out.println("adult!!."); 
	     	} 
	     
	     
	      	public static void main(String args[]) { 
	      		new A01().init(); 
	      	} 
	      } 

