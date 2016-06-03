/*
ID: heytell1
LANG: JAVA
TASK: gift1
 */
import java.util.*;
import java.io.*;

public class gift1 {

	public static void main(String... lovatics) throws IOException {

		BufferedReader f = new BufferedReader(new FileReader("gift1.in"));

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"gift1.out")));

		

		int t = Integer.parseInt(f.readLine());
		int[] initialMoney=new int[t];
		int[] finalMoney=new int[t];
		
		Vector<String> people = new Vector<String>(t);
		for (int k = 0; k < t; k++) {
			people.add(f.readLine());
		}
		/*for (int k = 0; k < t; k++) {
			System.out.println(people.elementAt(k));
		}*/
		
		for (int k = 0; k < t; k++) {
			String s = f.readLine();
			//System.out.println(s);

			StringTokenizer st = new StringTokenizer(f.readLine());
			int i=Integer.parseInt(st.nextToken());	initialMoney[people.indexOf(s)]=i;
			int j=Integer.parseInt(st.nextToken());
			int q=0 , r=0 ;
			
			if(j!=0){
				q=i/j;
				r=i%j;
			}
			else r=i;

			// insert all people who are taking away

			for (int x = 0; x < j; x++) {
				String temp=f.readLine();
				finalMoney[people.indexOf(temp)] += q;
			}

			finalMoney[people.indexOf(s)] += r;

		}

		
		
		//System.out.println("net profit or loss");
		for(int k=0;k<t;k++){
		//	System.out.println(finalMoney[k]-initialMoney[k]);
		out.println(people.elementAt(k)+" "+(finalMoney[k]-initialMoney[k]));
		}
		
		out.close();
		f.close();
	}
}
