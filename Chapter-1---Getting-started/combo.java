import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

/*
 ID: heytell1
 LANG: JAVA
 TASK: combo
 */
public class combo {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("combo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"combo.out")));
		int n;
		Vector<Integer> a = new Vector<Integer>(1, 1);
		Vector<Integer> b = new Vector<Integer>(1, 1);
		Vector<Integer> c = new Vector<Integer>(1, 1);
		Vector<Integer> a2 = new Vector<Integer>(1, 1);
		Vector<Integer> b2 = new Vector<Integer>(1, 1);
		Vector<Integer> c2 = new Vector<Integer>(1, 1);

		int p, q, r, s, t, u;
		n = Integer.parseInt(f.readLine());
		StringTokenizer st = new StringTokenizer(f.readLine());
		p = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(f.readLine());
		s = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		u = Integer.parseInt(st.nextToken());

		System.out.println(p+" "+q+" "+r+" "+s+" "+t+" "+u);
		
		if(n<5){
			for(int i=1;i<=n;i++){
				a.addElement(i);
				b.addElement(i);
				c.addElement(i);
				a2.addElement(i);
				b2.addElement(i);
				c2.addElement(i);
			}
		}
		else{
		// push into a
		for (int i = p - 2; i <= p + 2; i++) {
			int x = -1;
			if (i < 1)
				x = n + i;
			else if (i > n)
				x = i % n;
			else
				x = i;
			a.addElement(x);
		}
		 

		// push into b
		for (int i = q - 2; i <= q + 2; i++) {
			int x = -1;
			if (i < 1)
				x = n + i;
			else if (i > n)
				x = i % n;
			else
				x = i;
			b.addElement(x);
		}
		

		// push into c
		for (int i = r - 2; i <= r + 2; i++) {
			int x = -1;
			if (i < 1)
				x = n + i;
			else if (i > n)
				x = i % n;
			else
				x = i;
			c.addElement(x);
		}
		 

		// push into a2
		for (int i = s - 2; i <= s + 2; i++) {
			int x = -1;
			if (i < 1)
				x = n + i;
			else if (i > n)
				x = i % n;
			else
				x = i;
			a2.addElement(x);
		}
		

		// push into b2
		for (int i = t - 2; i <= t + 2; i++) {
			int x = -1;
			if (i < 1)
				x = n + i;
			else if (i > n)
				x = i % n;
			else
				x = i;
			b2.addElement(x);
		}
		

		// push into c2
		for (int i = u - 2; i <= u + 2; i++) {
			int x = -1;
			if (i < 1)
				x = n + i;
			else if (i > n)
				x = i % n;
			else
				x = i;
			c2.addElement(x);
		}
		
		}
		
		 System.out.println(a.toString());
		 System.out.println(b.toString());
		 System.out.println(c.toString());
		 System.out.println(a2.toString());
		 System.out.println(b2.toString());
		 System.out.println(c2.toString());
		 
		 
		 
		 //critical code
		 Collections.sort(a);Collections.sort(b);Collections.sort(c);Collections.sort(a2);Collections.sort(b2);Collections.sort(c2);
		
		 
		Set<Integer> s1=new HashSet<Integer>(a);
		s1.addAll(a2);

		Set<Integer> s2=new HashSet<Integer>(b);
		s2.addAll(b2);
		
		Set<Integer> s3=new HashSet<Integer>(c);
		s3.addAll(c2);
		
		System.out.println(s1.size()+" ,"+s2.size()+" ,"+s3.size());
		
		
		int ans=0;
		
		if(n>=5){
		int co1=10-s1.size();	int co2=10-s2.size();	int co3=10-s3.size();
		ans=250-co1*co2*co3;
		}
		else{
			int co1=2*n-s1.size();	int co2=2*n-s2.size();	int co3=2*n-s3.size();
			ans=2*n*n*n-co1*co2*co3;
		}
		System.out.println(ans);
		out.println(ans);
		f.close(); out.close();
	}
}
