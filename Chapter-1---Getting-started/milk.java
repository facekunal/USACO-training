/*
 ID: heytell1
 LANG: JAVA
 TASK: milk
 */
import java.util.*;
import java.io.*;

class Price implements Comparable<Price>{
	int p;	 int a;
	
	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int compareTo(Price o){
		return this.p-(((Price)o).getP());
	}
}
class milk {
	
	
	
	public static void main(String... lovatics) throws IOException{
	
		BufferedReader f=new BufferedReader(new FileReader("milk.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
		
			
		int n,m;
		StringTokenizer st=new StringTokenizer(f.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		Price[] price=new Price[m];
	
		
		
		//store price per unit and amount
		for(int i=0;i<m;i++){
			StringTokenizer stk=new StringTokenizer(f.readLine());
			price[i]=new Price();
			price[i].p=Integer.parseInt(stk.nextToken());	price[i].a=Integer.parseInt(stk.nextToken());
		}
		for(int i=0;i<m;i++)
			System.out.print(price[i].p+" ");
		System.out.println("");
		for(int i=0;i<m;i++)
			System.out.print(price[i].a+" ");
		System.out.println("\n after sort");
		
		Arrays.sort(price);
	
		for(int i=0;i<m;i++)
			System.out.print(price[i].p+" ");
		System.out.println("");
		for(int i=0;i<m;i++)
			System.out.print(price[i].a+" ");
	
		int x=n;
		int ans=0;
		int i=0;
		while(i<m){
			if(price[i].a<=x){
				x=x-price[i].a;	ans+=price[i].p*price[i].a;
			}
			else{
				ans+=price[i].p*x;
				x=0;
				
			}
			if(x==0)	break;
			i++;
		}
		System.out.println(ans);
		out.println(ans);
		//closing resources
		 f.close(); out.close();
	}
}
