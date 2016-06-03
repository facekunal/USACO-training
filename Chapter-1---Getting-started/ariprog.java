import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



/*
ID: heytell1
LANG: JAVA
TASK: ariprog
*/
public class ariprog {

	
	public static void main(String... lovatic) throws IOException{
		
		BufferedReader f=new BufferedReader(new FileReader("ariprog.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("ariprog.out")));
		
		int n,m;
		n=Integer.parseInt(f.readLine());
		m=Integer.parseInt(f.readLine());
		 final long con=2*m*m;
		//precomputation
		boolean[] data=new boolean[125001];
		
		for(int i=0;i<=m;i++){
			for(int j=i;j<=m;j++){
				data[i*i+j*j]=true;
				
			}
		}
		
		
		boolean b=false;
		
		int a=0;
		for(int d=1;;d++){
			for( a=0;(a+(n-1)*d)<=con;a++){
				boolean flag=true;
				for(int i=0;i<n;i++){
					if(data[a+i*d]==false){
						flag=false; break;
					}
				}
				if(flag){
					out.println(a+" "+d);
					b=true;
				}
			}
			if(a==0)break;
		}
		
		if(b==false)
			out.println("NONE");
		f.close(); out.close();

	}

}
