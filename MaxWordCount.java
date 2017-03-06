class MaxCount
{

 int a[]=new int[50];
 String s2[]=new String[100];
 int maxcount(String s1)
 {
   s2=s1.split("[*[\\.]*|[!]*|[?]]");
   int count=0,wordcount=0;
   int max;
   for(int i=0;i<s2.length;i++)
   {
     count++;
     System.out.println(s2[i]);
     for(char c:s2[i].toCharArray())
     {
        if(c==' ')
	{
	  wordcount++;
	}
     }
     wordcount++;
     a[i]=wordcount;
     wordcount=0;
    }
   max=a[0];
   for(int i=0;i<a.length;i++)
   {
      if(a[i]>max)
      {
	max=a[i];
      }
   }
   return max;
  }
}

	
public class MaxWordCount 
{
   public static void main(String[] args)
   {
	MaxCount m=new MaxCount();
 	String s1="my name is abc.i like programming in java!i am happy.r u there?";
	System.out.println("max is "+m.maxcount(s1));
   }
}
/*
Output:
Microsoft Windows [Version 6.3.9600]
(c) 2013 Microsoft Corporation. All rights reserved.

C:\Users\Amruta>cd desktop

C:\Users\Amruta\Desktop>javac MaxWordCount.java

C:\Users\Amruta\Desktop>java MaxWordCount
my name is abc
i like programming in java 
i am happy
r u there
max is 5

C:\Users\Amruta\Desktop>
*/
	



