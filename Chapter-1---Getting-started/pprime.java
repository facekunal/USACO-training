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
 TASK: pprime
 */
class pprime {

	static boolean isPrime(int n) {
		double t = Math.sqrt(n) + 1;
		for (int i = 2; i <= t; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String... args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("pprime.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"pprime.out")));

		int a, b;
		StringTokenizer st = new StringTokenizer(f.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());

		int min, max;
		min=(a+"").length();
		max=(b+"").length();
		//1
		if(a<=5)out.println(5);
		if(a<=7)out.println(7);
		
		
		//2 no pal prime exists except 11
		if(a<= 11 && 11<=b)out.println(11);

		// 3

		for (int i = 1; i <= 9; i += 2) l3:{
			for (int j = 0; j <= 9; j++) {
				int num = i * 100 + j * 10 + i;
				if (num > b)
					break l3;
				if (num>=a && isPrime(num))
					out.println(num);
			}
		}

		// 4-no pal prime exists

		// 5

		for (int i = 1; i <= 9; i += 2)l5: {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					int num = i * 10000 + j * 1000 + k * 100 + j * 10 + i;
					if (num > b)
						break l5;
					if (num>=a && isPrime(num))
						out.println(num);
				}
			}
		}

		// 6- no pla prime

		// 7

		for (int i = 1; i <= 9; i += 2)
			l7: {
				for (int j = 0; j <= 9; j++) {
					for (int k = 0; k <= 9; k++) {
						for (int l = 0; l <= 9; l++) {
							int num = i * 1000000 + j * 100000 + k * 10000 + l
									* 1000 + k * 100 + j * 10 + i;
							if(num>b) break l7;
							if (num>=a && isPrime(num))
								out.println(num);
						}
					}
				}
			}

		// 8- no pal primes

		f.close();
		out.close();
	}
}
