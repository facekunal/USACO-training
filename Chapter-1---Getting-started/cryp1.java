import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
/*
ID: heytell1
LANG: JAVA
TASK: crypt1
*/
public class cryp1 {

	//tracking valid digits
	public static boolean[] valid=new boolean[10];
	public static boolean isvalid(int x){
		int t=x,r;
		while(t!=0){
			r=t%10;
			t=t/10;
			if(valid[r]==false) return false;
		}
		return true;
	}
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader(new FileReader("crypt1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"crypt1.out")));
		int c=0;
		int n;
		n=Integer.parseInt(f.readLine());
		
	
		StringTokenizer st=new StringTokenizer(f.readLine());
		for(int i=0;i<n;i++){
			int x=Integer.parseInt(st.nextToken());
			valid[x]=true;
		}
		
		for(int i=100;i<1000;i++){
			for(int j=10;j<100;j++){
				//System.out.println("start");
				if(!isvalid(i) || !isvalid(j))	continue;
				//System.out.println("check1");
				int a=i*(j%10);
				int b=i*(j/10);
				if(a<100 || a>999 || b<100 || b>999)	continue;
				//System.out.println("check2");
				if(!isvalid(a) || !isvalid(b))	continue;
				//System.out.println("check3");
				int s=a+b*10;
				if(s<1000 || s>9999)	continue;
				//System.out.println("check4");
				if(!isvalid(s)) continue;
				c++;
				//System.out.println("fsl");
				
			}
		}
		
		

System.out.println(c);
out.println(c);
f.close();
out.close();

	}

}
