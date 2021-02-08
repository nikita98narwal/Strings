	import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int  t = sc.nextInt();
		while(t--> 0) {
			String s = sc.next();
			char[] str = s.toCharArray();
			int n = str.length;
			int a = 0;
			for(int i = 0; i < n; i++) {
				if(str[i] == 'a') {
					a++;
				}
			}
			if(a <= n/2) {
				while(a <= n/2) {
					n = n-1;
				}
			}
			System.out.println(n);
		}
    }
  }