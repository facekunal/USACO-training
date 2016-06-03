

/*
ID: heytell1
LANG: JAVA
TASK: milk3
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class milk3 {

	static boolean [][] track=new boolean[21][21];
	static boolean ans[]=new boolean[21];
	static int[] c=new int[3];
	public static void dfs(int [] q){
		if(track[q[0]][q[1]])return ;
		track[q[0]][q[1]]=true;

		if(!ans[q[2]] && q[0]==0) ans[q[2]]=true;
		
		//trying all permutations of 2 containers
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i!=j && q[i]>0 && q[j]<c[j]){
					int arr[]=new int[3];
					arr[j]=Math.min(c[j], q[j]+q[i]);
					arr[i]=Math.max(0, q[i]-(c[j]-q[j]));
					arr[3-(i+j)]=q[3-(i+j)];
					dfs(arr);
				}
			}
		}
	}
	public static StringTokenizer st;
	
	public static void main(String... lovatics) throws IOException{
		
		BufferedReader f=new BufferedReader(new FileReader("milk3.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("milk3.out")));
		
		st=new StringTokenizer(f.readLine());
		
		int [] q=new int[3];
		c[0]=Integer.parseInt(st.nextToken());c[1]=Integer.parseInt(st.nextToken());c[2]=Integer.parseInt(st.nextToken());
		
		q[0]=0;q[1]=0;q[2]=c[2];
		
		dfs(q);
		
		for(int i=0;i<c[2];i++){
			if(ans[i])
			out.print(i+" ");
		}
		out.print(c[2]);
		out.println();
		f.close();out.close();
	}
}

