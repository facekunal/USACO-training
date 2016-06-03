/*
ID: heytell1
LANG: JAVA
TASK: namenum
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


public 
class namenum {

	
	
	public static boolean check(String str,String num){
		boolean k=true;
		if(str.length()==num.length()){
			System.out.println("length is equal ");
			for(int i=0;i<str.length();i++){
				if(getVal(str.charAt(i))!=num.charAt(i)){System.out.println("not equal");	k=false; break;}
				else System.out.println("equal");
			}
			if(k){System.out.println("got it");	return true;}
		}
		
		return false;
	}
	
	
	private static char getVal(char c) {
		char u='0';
		switch(c){
		case 'A':
		case 'B':
		case 'C':	u='2';	break;
		case 'D':
		case 'E':
		case 'F':	u='3';	break;
		case 'G':
		case 'H':
		case 'I':	u='4';	break;
		case 'J':
		case 'K':
		case 'L':	u='5';	break;
		case 'M':
		case 'N':
		case 'O':	u='6';	break;
		case 'P':
		case 'R':
		case 'S':	u='7';	break;
		case 'T':
		case 'U':
		case 'V':	u='8';	break;
		case 'w':
		case 'x':
		case 'y':	u='9';	break;
		}
		return u;
	}


	public static String[] table={"","","ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"};
	
	public static void main(String... lovatics) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("namenum.in"));
		BufferedReader d = new BufferedReader(new FileReader("dict.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
		
		String num=f.readLine();
		System.out.println("num is "+num);
		int first=Integer.parseInt(num.charAt(0)+"");
		System.out.println("first is "+first);
		char c1=table[first].charAt(0);
		char c2=table[first].charAt(1);
		char c3=table[first].charAt(2);
		System.out.println(c1+" "+c2+" "+c3);
		
		boolean flag=false;
		while(true){
			String str=d.readLine();
			if(str==null )	break;
			System.out.println("holla 1 "+str);
			if(str.charAt(0)==c1 ||str.charAt(0)==c2 ||str.charAt(0)==c3){
				
				if(check(str,num))
						{out.println(str);
					flag=true;}
			}
			
			else if(flag)	break;
			
		}
		if(flag==false)//nothing is matched
		{	out.println("NONE");}
		
		System.out.println("done!!");
		d.close();
		f.close();out.close();
	}

}
