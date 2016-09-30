



import java.util.*;

class A06{
          int korscore;
	            int engscore;
		              int mathscore;
			                int name;
					public void init(){
					input();
					print();
					}
					public void input(){
					Scanner s=new Scanner(System.in);

					System.out.println("input name");
					this.name=s.nextInt();
					System.out.println("input korscore");
					this.korscore=s.nextInt()

					System.out.println("input mathscore");
					this.mathscore=s.nextInt();
					System.out.println("input engscore");
					this.engscore=s.nextInt();
					}

					public void print(){
					int sum=this.korscore+this.engscore+this.mathscore;
					double avg=sum/3.0;

					System.out.println("avg is"+avg);

					if(this.avg<100&&this.avg>95)
					System.out.println("score:"+"A+");
					else if(this.avg<94&&this.avg>90)
					System.out.println("score:"+"A");
					else if(this.avg<89&&this.avg>85)
					System.out.println("score:"+"B+");
					else if(this.avg<84&&this.avg>80)
					System.out.println("score:"+"B");
					else if(this.avg<79&&this.avg>75)
					System.out.println("score:"+"C+");
					else if(this.avg<74&&this.avg>70)
					System.out.println("score:"+"C");
					else if(this.avg<69&&this.avg>65)
					System.out.println("score:"+"D+");
					else if(this.avg<64&&this.avg>60)
					System.out.println("score:"+"D");
					else
					System.out.println("score:"+"F");
					}
					}
