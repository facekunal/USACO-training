/*
ID: heytell1
LANG: JAVA
TASK: skidesign
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

class skidesign {

	public static void main(String... lovatics) throws IOException {
		BufferedReader f=new BufferedReader(new FileReader("skidesign.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("skidesign.out")));
		
		int n;
		int[] result =new int[84];
		StringTokenizer st=new StringTokenizer(f.readLine());
		n=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
			st=new StringTokenizer(f.readLine());
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<=83;i++){
			int sum=0;
			for(int j=0;j<n;j++){
				if(arr[j]<i)	sum+=(i-arr[j])*(i-arr[j]);
				else if(arr[j]>i+17)	sum+=(arr[j]-(i+17))*(arr[j]-(i+17));
			}
			result[i]=sum;
		}
		
		
		//find min ele
		int min=result[0];
		for(int i=1;i<=83;i++){
			if(result[i]<min)	min=result[i];
		}
		//System.out.println(min);
		out.println(min);
		f.close();out.close();
	}

}
