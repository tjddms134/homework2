import java.util.*;
  import java.io.*;
   class A06{
            public void input(){
	                     Scanner s = new Scanner(System.in);
			                      System.out.print("NAME:"); 
					                       int name = s.nextChar();      
							                        System.out.print("Kor Grade:"); 
										                 int kor = s.nextInt();
												                  System.out.print("Eng Grade:");
														                   int eng = s.nextInt();
																                    System.out.print("Math Grade:");
																		                     int math = s.nextInt();
																				                     int total = kor+eng+math;
																						                      double avg = (double)total/3;
																								                    
																										                     System.out.println("Avg is "+avg );         
																												              
																													            if (avg >=95  ) {
																														             System.out.print("A+");
																															                 }
																																	       if (avg >= 90 && avg <= 94) {
																																	                System.out.print("A");
																																			            }
																																				          if (avg >= 85 && avg <= 89) {
																																					           System.out.print("B+");
																																						               }
																																							             if (avg > 80 && avg <= 84 ) {
																																								              System.out.print("B");
																																									                  }
																																											        if (avg > 75 && avg <= 79 ) {
																																												         System.out.print("C+");
																																													             }
																																														           if (avg > 70 && avg <= 74 ) {
																																															            System.out.print("C");
																																																                }
																																																		      if (avg > 65 && avg <= 69 ) {
																																																		               System.out.print("D+");
																																																			                   }
																																																					         if (avg > 60 && avg <= 64 ) {
																																																						          System.out.print("D");
																																																							              }
																																																								            if (avg > 0 && avg <= 59 ) {
																																																									             System.out.print("F");
																																																										                 }

																																																												            
																																																													             }
																																																														              public static void main(String [] args) throws IOException{

																																																															              
																																																																                       new A06().input();
																																																																		              
																																																																			               }

