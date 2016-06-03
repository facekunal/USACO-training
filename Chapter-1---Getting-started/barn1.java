

/*
ID: heytell1
LANG: JAVA
TASK: barn1
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

class barn1 {

	public static int minOf(int a,int b){
		if(a<=b)return a;
		else return b;
	}
	public static void main(String... lovatics) throws IOException{
		
		BufferedReader f=new BufferedReader(new FileReader("barn1.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
		
		int m,s,c;
		StringTokenizer stn=new StringTokenizer(f.readLine());
		m=Integer.parseInt(stn.nextToken());	s=Integer.parseInt(stn.nextToken());	c=Integer.parseInt(stn.nextToken());
		
		int[] arr=new int[c];
		
		for(int i=0;i<c;i++){
			arr[i]=Integer.parseInt(f.readLine());
		}
		Arrays.sort(arr);
		
		Vector<Integer> v=new Vector<Integer> (1,1);
		for(int i=0;i<c-1;i++){
			if(arr[i+1]-arr[i]-1>0){
				v.add(arr[i+1]-arr[i]-1);
			}
		}
		//sort vector
		Collections.sort(v,Collections.reverseOrder());
		
		int ans=0;
		for(int i=0;i<minOf(m-1,c-1);i++){
			ans+=v.elementAt(i);
		}
		ans=arr[c-1]-arr[0]+1-ans;
		System.out.println(ans);
		out.println(ans);
		f.close();out.close();
	}
}

