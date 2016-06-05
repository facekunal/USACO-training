

/*
ID: heytell1
LANG: JAVA
TASK: sort3
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.*;

class sort3 {

	
	public static void main(String... lovatics) throws IOException{
		
		BufferedReader f=new BufferedReader(new FileReader("sort3.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("sort3.out")));
		
		int n=Integer.parseInt(f.readLine());
		int a=0,b=0,c=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(f.readLine());
			if(arr[i]==1)a++;
			else if(arr[i]==2)b++;
			else c++;
		}
		//System.out.println(a+" "+b+" "+c);
		int i,miss=0;int c12=0,c21=0,c13=0,c31=0,c23=0,c32=0;
		for(i=0;i<a;i++){
			if(arr[i]!=1)miss++;
			if(arr[i]==2)c12++;
			else if(arr[i]==3)c13++;
		}
		for(;i<a+b;i++){
			if(arr[i]!=2)miss++;
			if(arr[i]==1)c21++;
			else if(arr[i]==3)c23++;
		}
		for(;i<a+c+b;i++){
			if(arr[i]!=3)miss++;
			if(arr[i]==1)c31++;
			else if(arr[i]==2)c32++;
		}
		//System.out.println(miss);
		out.println(Math.min(c12, c21)+Math.min(c13, c31)+Math.min(c23, c32)+(2*((Math.max(c12, c21))-Math.min(c12, c21))));
		f.close();out.close();
	}
}

