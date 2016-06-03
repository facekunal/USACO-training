/*
ID: heytell1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class YourRideIsHere {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
						  // Get line, break into tokens
    StringTokenizer st2 = new StringTokenizer(f.readLine());
    
   String comet = (st.nextToken());    // first integer
   String group = (st2.nextToken());    // second integer
   
   int a=1,b=1;
   for(int i=0;i<comet.length();i++){
	   a=a*(comet.charAt(i)-'A'+1);
   }
   for(int i=0;i<group.length();i++){
	   b=b*(group.charAt(i)-'A'+1);
   }
   
   if((a%47)==(b%47))
    out.println("GO\n");
   else 
	   out.println("STAY\n");
    out.close();                                  // close the output file
  }
}