import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
ID: heytell1
LANG: JAVA
TASK: frac1
*/

class frac1{
	static BufferedReader f;
	static PrintWriter out;
	static int n;
	static void fun(int a, int b, int c, int d){
		int x=a+c; int y=b+d;
		if(y<=n ){
			fun(a,b,x,y);
			out.println(x+"/"+y);
			fun(x,y,c,d);
		}
	}
	
	public static void main(String ... lovatics) throws IOException{
		f=new BufferedReader(new FileReader("frac1.in"));
		out=new PrintWriter(new BufferedWriter(new FileWriter("frac1.out")));
		
		n=Integer.parseInt(f.readLine());
		out.println(0+"/"+1);
		fun(0,1,1,1);
		out.println(1+"/"+1);
		f.close();out.close();
	}
}