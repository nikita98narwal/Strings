import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s1,s2;
			int count = 0;
			s1 = sc.next();
			char[] str1 = s1.toCharArray();
			for(int i = 0; i < 5; i++) {
				s2 = sc.next();
				char[] str2 = s2.toCharArray();
				if((str1[0] == str2[0]) || (str1[1] == str2[1])) {
					count++;
				}
			}
			if(count > 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
    }
  }