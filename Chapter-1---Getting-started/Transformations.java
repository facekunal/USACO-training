/*
ID: heytell1
LANG: JAVA
TASK: transform
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;



class transform {

	public static Scanner scn=new Scanner(System.in);
	public static void main(String... lovatics) throws IOException {
		
		Rotation r=new Rotation();
		BufferedReader f = new BufferedReader(new FileReader("transform.in"));

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
		boolean flag=false;
		int n;
		n=Integer.parseInt(f.readLine());
		char[][] arr=new char [n][n];
		char[][] arr2=new char [n][n];
		char[][] str=new char[n][n];
		//ip
		for(int i=0;i<n;i++){
			String s=f.readLine();
			for(int j=0;j<n;j++){
				arr[i][j]=s.charAt(j);
				arr2[i][j]=s.charAt(j);
			}
		}
		for(int i=0;i<n;i++){
			String s=f.readLine();
			for(int j=0;j<n;j++){
				str[i][j]=s.charAt(j);
				
			}
		}
for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}System.out.println("");
		//ip ends
		
		//rotate 90
		r.rotate(arr, n);
		if(r.check(arr, str, n) && flag==false){	out.println("1");	flag=true;}
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}System.out.println("");
		
		
		//rotate 180
		r.rotate(arr, n);
		if(r.check(arr, str, n) && flag==false){	out.println("2");	flag=true;}
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}System.out.println("");
		
		//rotate 270
		r.rotate(arr, n);
		if(r.check(arr, str, n) && flag==false){	out.println("3");	flag=true;}
		System.out.println("270");
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}System.out.println("");
		
		//reflect
		r.reflect(arr2, n);
		if(r.check(arr2, str, n) && flag==false){	out.println("4");	flag=true;}
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println("");
		}System.out.println("");
		
		//reflect and 90
		r.rotate(arr2, n);
		if(r.check(arr2, str, n) && flag==false){	out.println("5");	flag=true;}
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println("");
		}System.out.println("");
		
		//reflect and 180
		r.rotate(arr2, n);
		if(r.check(arr2, str, n) && flag==false){	out.println("5");	flag=true;}
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println("");
		}System.out.println("");
		
		//reflect and 270
		r.rotate(arr2, n);
		if(r.check(arr2, str, n)&& flag==false){	out.println("5");	flag=true;}
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println("");
		}System.out.println("");
		
		//no change
		if(r.check(arr, str, n) && flag==false){	out.println("6");	flag=true;}
		
		//invalid
		if(flag==false)
		out.println("7");
		
		
				
		
		f.close(); out.close();
	}

}


class Rotation {

	public static Scanner scn=new Scanner(System.in);
	
	public  void rotate(char arr[][],int n){
		int l=0,k=n-1;
		while(l<k){
			
			for(int i=l;i<k;i++){
				
				char temp=arr[l][i];
				arr[l][i]=arr[n-1-i][l];
				arr[n-1-i][l]=arr[k][n-1-i];
				arr[k][n-1-i]=arr[i][k];
				arr[i][k]=temp;
			}
			l++;	k--;
		}
		
		
		
	}
	public void reflect(char a[][],int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n/2;j++){
				char temp=a[i][j];
				a[i][j]=a[i][n-1-j];
				a[i][n-1-j]=temp;
			}
		}
	}
	public boolean check(char a[][], char b[][],int n){
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]!=b[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}

