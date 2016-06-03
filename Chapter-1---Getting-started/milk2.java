/*
 ID: heytell1
 LANG: JAVA
 TASK: milk2
 */
import java.util.*;
import java.io.*;
class milk2 {

	public static void main(String... lovatics) throws IOException{
		long startTime = System.currentTimeMillis();

	
		BufferedReader f=new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		
		int n = Integer.parseInt(f.readLine());
		int[] start=new int[n];		int[] finish=new int[n];	
		
		int startmin=200000, finishmax=0; //range of values
		//take input
		for(int i=0;i<n;i++){
			 StringTokenizer st = new StringTokenizer(f.readLine());
			 start[i]=Integer.parseInt(st.nextToken());
			 finish[i]=Integer.parseInt(st.nextToken());
			 if(start[i]<startmin)	startmin=start[i];
			 if(finish[i]>finishmax)	finishmax=finish[i];
		}
		
		int doin=0, doinmax=0, ideal=0, idealmax=0;
		int f1=0;
		
		
		for(int i=startmin;i<finishmax;i++){
			for(int j=0;j<n;j++){
				if(i>=start[j] && i<finish[j]){
					
					f1=1;
					break;
				}
			}
			if(f1==1){
				doin++;	ideal=0;	if(doin>doinmax) doinmax=doin;
			}
			else{
			
				
				ideal++; doin=0;	if(ideal>idealmax)	idealmax=ideal;
			}
			f1=0;
		}
		
	
		
		out.println(doinmax+" "+idealmax);
		
		
		 //closing resources
		 f.close(); out.close();
		 long endTime   = System.currentTimeMillis();
		 long totalTime = endTime - startTime;
		 System.out.println(totalTime);
	}
}
