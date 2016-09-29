import java.util.*; 
 
 
  class A02 { 
  	double inputDegree; 
  	String kind; 
  
  
  	public void init() { 
   		input(); 
   		print(); 
   	} 
   
   
    	public void input() { 
    		Scanner s = new Scanner(System.in); 
    
    
     		System.out.println("input temperature: "); 
     		this.inputDegree = s.nextDouble(); 
     
     
      		System.out.println("input temperature is celsius C and inputtemperature is fahrenheit F: "); 
      		this.kind = s.next(); 
      	} 
      
      
       	public void print() { 
       		double result; 
       		if(this.kind.equals("F")) 
       			result = (inputDegree - 32)/1.8; 
       		else 
       			result = (inputDegree * 1.8) + 32; 
       
       
        		System.out.println(" change temperature is" + result + ); 
        	} 
        
        
	 	public static void main(String args[]) { 
	 		new A02().init(); 
	 	} 
	 } 

