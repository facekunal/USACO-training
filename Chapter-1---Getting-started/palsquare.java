/*
ID: heytell1
LANG: JAVA
TASK: palsquare
 */
import java.io.*;
import java.util.*;
public class palsquare {

	
	public static Scanner scn=new Scanner(System.in);
	
	public static char conv(int r){
		switch(r){
		case 10: return 'A';
		case 11: return 'B';
		case 12: return 'C';
		case 13: return 'D';
		case 14: return 'E';
		case 15: return 'F';
		case 16: return 'G';
		case 17: return 'H';
		case 18: return 'I';
		case 19: return 'J';
		case 20: return 'K';
		default: return 'Z';
		}
	}
	
	public static boolean checkPal(StringBuffer s){
		boolean flag=true;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i))	flag=false;
		}
		
		if(flag)	return true;
		else return false;
	}
	
	public static void main(String ... lovatics) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("palsquare.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
		int b;
		
		
		b=Integer.parseInt(f.readLine());
		
		for(int n=1;n<=300;n++){
			StringBuffer s=new StringBuffer("");
			StringBuffer h=new StringBuffer("");
			int num=n*n;
			
			int q,r;
			while(num!=0){
				r=num%b;
				num=num/b;
				if(r>9)
					s.append(conv(r));
				else
					s.append(r);
			}
			
			num=n;
			while(num!=0){
				r=num%b;
				num=num/b;
				if(r>9)
					h.append(conv(r));
				else
					h.append(r);
			}
			//System.out.println("number in base b "+s.reverse());
			if(checkPal(s)){
				out.println(h.reverse()+" "+s.reverse());
			}
			
		}
		f.close();out.close();
		
	
		
	}
}
