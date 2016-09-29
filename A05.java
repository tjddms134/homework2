 import java.util.*; 
  
   
    class A05 { 
     	int birthYear; 
	 	int age; 
		 
		  
		   	public void init() { 
			 		input(); 
					 		print(); 
							 	} 
								 
								  
								   	public void input() { 
									 		Scanner s = new Scanner(System.in); 
											 
											  
											   		System.out.println("input birthyear: "); 
													 		this.birthYear = s.nextInt(); 
															 
															  
															   		this.age = (2012 - this.birthYear) + 1; 
																	 	} 
																		 
																		  
																		   	public void print() { 
																			 		String div = ""; 
																					 
																					  
																					   		if(age < 7) 
																							 			div = "baby"; 
																										                 else if(age < 13) 
																												                          div = "child"; 
																															                   else if(age < 20) 
																																	                            div = "youth"; 
																																				                     else if(age < 30) 
																																						                              div = "young man"; 
																																									                       else if(age < 60) 
																																											                                div = "middle man"; 
																																															                 else 
																																																	                          div = "old man"; 
																																																				   		 
																																																						  		System.out.println("is"+div ); 
																																																								 	} 
																																																									 
																																																									  
																																																									   	public static void main(String args[]) { 
																																																										 		new A05().init(); 
																																																												 	} 
																																																													 } 

