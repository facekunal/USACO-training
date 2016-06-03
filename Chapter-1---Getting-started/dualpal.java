/*
ID: heytell1
LANG: JAVA
TASK: dualpal
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class dualpal {

	public static Scanner scn = new Scanner(System.in);
	public static boolean checkPal(StringBuffer s){
		boolean flag=true;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i))	flag=false;
		}
		
		if(flag)	return true;
		else return false;
	}
	
	public static void main(String... lovatics) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"dualpal.out")));

		int n, s;
		StringTokenizer st=new StringTokenizer(f.readLine());
		n=Integer.parseInt(st.nextToken());	s=Integer.parseInt(st.nextToken());
		//System.out.println(s+" "+n);

		for (int i = s + 1,k=1; k<=n; i++) {
			int c=0;
			for (int b = 2; b <= 10; b++) {
				int num = i, r;
				StringBuffer str = new StringBuffer("");
				
				while (num != 0) {
					r = num % b;
					num = num / b;

					str.append(r);
				}
				if(checkPal(str)){
					c++;
					//System.out.println(c);
				}
				if(c>=2){ out.println(i);
				System.out.println(i); k++;
				break;}
				
			}
			
			
		}
		f.close(); out.close();
	}
}
