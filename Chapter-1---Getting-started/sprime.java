import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.xml.crypto.Data;


/*
 ID: heytell1
 LANG: JAVA
 TASK: sprime
 */
public class sprime {
	
	static BufferedReader f;
	static PrintWriter out;
	
	
	
		
	static void fun(int n, int x){
		
			if(x<=0){out.println(n); return;}
			//calls
			n=n*10;
			if(isPrime(n+1))
			fun(n+1,x-1);
			if(isPrime(n+3))
			fun(n+3,x-1);
			if(isPrime(n+7))
			fun(n+7,x-1);
			if(isPrime(n+9))
			fun(n+9,x-1);
			
		
	}
	
	static boolean isPrime(int n) {
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	static int powFun(int x, int n){
		if(n>=0)return (int) Math.pow(x, n);
		return 0;
	}
	
	public static void main(String ... args) throws IOException{
		 f=new BufferedReader(new FileReader("sprime.in"));
		out=new PrintWriter(new BufferedWriter(new FileWriter("sprime.out")));
		
		int len=Integer.parseInt(f.readLine());
	
		fun(2,len-1);
		fun(3,len-1);
		fun(5,len-1);
		fun(7,len-1);
		
		
	f.close();out.close();
	}
}
