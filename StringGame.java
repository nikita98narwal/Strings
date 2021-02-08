import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			String s = sc.next();
			int Acount = 0, Dcount = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'A') {
					Acount++;
				}
				else if(s.charAt(i) == 'D') {
					Dcount++;
				}	
			}
			if(Acount > Dcount) {
				System.out.println("Aditya");
			}
			else if(Acount < Dcount) {
				System.out.println("Danish");
			}
			else {
				System.out.println("AdiDan");
			}
		}
    }
  }