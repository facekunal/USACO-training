/*
 ID: heytell1
 LANG: JAVA
 TASK: beads
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

class beads {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String... lovatics) throws IOException {

		// string size
		int n = 0;
		// string
		String str = null;
		// file
		
		  BufferedReader f = new BufferedReader(new FileReader("beads.in"));
		  PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
		  "beads.out"))); n = Integer.parseInt(f.readLine()); str =
		  f.readLine();
		 

		// console
		/*
		n = scn.nextInt();
		scn.nextLine();
		str = scn.nextLine();
		*/
		// variables
		char start = '$', end = '$';

		// find end
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != 'w') {
				end = str.charAt(i);
				break;
			}
		}

		// find start
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'w') {
				start = str.charAt(i);
				break;
			}
		}
		
		if (start == '$')
			System.out.println("error start");
		if (end == '$')
			System.out.println("error end");
		char s1=start,e1=end;
		//System.out.println("start & end "+s1+" "+e1);

		// critical code
		int first[] = new int[n];
		int k = 1;
		first[0] = 0;
		int last[] = new int[n];
		int l = 0;
		int w = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != start && str.charAt(i) != 'w') {
				last[l++] = i - 1;
				first[k++] = i - w;
				w = 0;
				start = str.charAt(i);
			}
			if (str.charAt(i) == 'w') {
				w++;
			}
			if (str.charAt(i) == start) {
				w = 0;
			}
		}
		last[l] = str.length() - 1;
		// critical code end

		// size of first and last array
		int size = l + 1;

		// cal arr i.e max pairs ....size-1
		int[] arr = new int[size - 1];
		for (int i = 0; i < size - 1; i++)
			arr[i] = last[i + 1] - first[i]+1;
	

		// cal diff ....size
		int[] diff = new int[size];
		
		if (s1==e1) {
			
			for (int i = 0; i < size; i++)
				diff[i] = last[i] - first[i]+1;
			if(size>1){ //monochromatic?
			arr[0]+=diff[size-1];
			arr[size-2]+=diff[0];
			}
		}
		
		//find max element in arr
		
		int max=0;
		
		if(size>1){
			
		for(int i=0;i<size-1;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		}
		else {max=diff[0];
		}
		//print result
		System.out.println(max);
		out.println(max);
		
		//closing resources
		f.close(); out.close();

	}
}