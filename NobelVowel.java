import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T!=0){
int flag=0;
int i;
String s=sc.next();
String str=s.toLowerCase();
char c[]=str.toCharArray();
for(i=0;i<str.length()-1;i++)
{
if(c[i]!='a'&&c[i]!='e'&&c[i]!='i'&&c[i]!='o'&&c[i]!='u'&&c[i]!='n'){
if(c[i+1]!='a'&&c[i+1]!='e'&&c[i+1]!='i'&&c[i+1]!='o'&&c[i+1]!='u'){
flag=1;
break;
}
}

    } 
    if(i==str.length()-1 && (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='n'))
      flag=0;
    else{
      flag=1;
    }  
    
    if(flag==0){
      System.out.println("YES");
    }
    else if(flag==1){
    System.out.println("NO");
    }T--;
  }
    }
  }