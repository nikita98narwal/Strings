import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n --> 0) {
		String s = sc.next();
		int countV = 0, countC = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U') {
				countV++;
			}
			else {
				countC++;
			}
		}
		System.out.println(countV +" "+ countC);
		}
    }
  }