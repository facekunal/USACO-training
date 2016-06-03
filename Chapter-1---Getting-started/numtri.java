import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
 ID: heytell1
 LANG: JAVA
 TASK: numtri
 */
public class numtri {
	static int  n,temp;
	static int[][] arr;
	static StringTokenizer st;
	

	
	public static void main(String[] args)throws IOException {
		BufferedReader f=new BufferedReader(new FileReader("numtri.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("numtri.out")));
		
		n = Integer.parseInt(f.readLine());
		arr=new int[(int)n][(int)n];
		for(int i=0;i<n;i++){
			st=new StringTokenizer(f.readLine());
			for(int j=0;j<=i;j++){
				arr[i][j]=Integer.parseInt(st.nextToken());
				
			}
		}
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				arr[i-1][j]+=Math.max(arr[i][j], arr[i][j+1]);
			}
		}
		out.println(arr[0][0]);
		
		
		
		//cc
		
		
		
		f.close(); out.close();
	}

}
