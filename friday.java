/*
ID: heytell1
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;

class Doom{
	int d,m;
}


public class friday {

	
	static boolean isLeap(int year){
		if(year%4==0 &&((year%100!=0)||(year%400)==0)) return true;
		else return false;
	}
	
	

	public static void main(String... lovatics) throws IOException {

		//precal
		int counters[]={0,0,0,0,0,0,0};
		int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
		
		int n;
		// i/o
		BufferedReader f = new BufferedReader(new FileReader("friday.in"));

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		// i/o end

		n =Integer.parseInt(f.readLine());

	
int day=1;	//dec 1899


for (int k =1900 ; k !=1900+n; k++) {
	

	
	for (int j = 0; j < 12; j++) {
		int temp=(day+13)%7;
		day=(day+months[j])%7;
		
		if(isLeap(k) && j==1){
			day=(day+29)%7;
		}
		counters[temp]++;
		
		
	}
}

for(int i=0;i<6;i++)
	out.print(counters[i]+" ");
out.print(counters[6]+"\n");
f.close();
out.close();
		
	}

}
