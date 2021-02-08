import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      final int max = 26;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n --> 0) {
		String s = sc.next();
		int [] arr = new int[max];
		for(int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
		for(int i = max-1; i >= 0; i--) {
			for(int j = 0; j <arr[i]; j++) {
				System.out.print((char)('a' + i));
			}
		}
		System.out.println();
		}
    }
  }