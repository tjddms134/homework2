import java.util.*; 

 
 class A04 { 
 	int korScore; 
	 	int engScore; 
		 	int mathScore; 
			 
			  
			   	public void init() { 
				 		input(); 
						 		print(); 
								 	} 
									 
									  
									   	public void input() { 
										 		Scanner s = new Scanner(System.in); 
												 
												  
												   		System.out.println("input korScore: "); 
														 		this.korScore = s.nextInt(); 
																 		 
																		                  System.out.println("input engScore: "); 
																				                   this.engScore = s.nextInt(); 
																						    		 
																								                  System.out.println("input mathScore: "); 
																										                   this.mathScore = s.nextInt(); 
																												    	} 
																													 
																													  
																													   	public void print() { 
																														 		int sum = this.korScore + this.engScore + this.mathScore; 
																																 		double avg = sum/3.0; 
																																		 
																																		  
																																		   		System.out.println("input score sum is " + sum ); 
																																				 		System.out.printf("평균은 %.1f 입니다. \n", avg); 
																																						 		if(this.korScore >= 90) 
																																								 			System.out.println("korea good."); 
																																											                 if(this.engScore >= 90) 
																																													                          System.out.println("english good."); 
																																																                   if(this.mathScore >= 90) 
																																																		                            System.out.println("math good."); 
																																																					     	} 
																																																						 
																																																						  
																																																						   	public static void main(String args[]) { 
																																																							 		new A04().init(); 
																																																									 	} 
																																																										 } 

