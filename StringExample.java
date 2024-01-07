import java.util.Scanner;
import java.lang.*;


public class StringExample
{

  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);

      System.out.print ("Enter the question number:");


    int n = sc.nextInt ();

      sc.nextLine ();

    System.out.print ("Enter a string:");

    String s = sc.nextLine ();


    switch (n)
      {

      case 1:
	{

	    System.out.println ("The string you entered is: " + s);

	    break;

	}

	case 2:
	{
	    int count=0;
	    for(char c:s.toCharArray()){
	        count++;
	    }
	    System.out.println("Length of the string is : "+count);



	    break;

	}

      case 3:
	{
	    System.out.println("The characters of the string are : ");
	    for(char x:s.toCharArray()){
	        System.out.print(x+" ");
	    }
	    break;

	}

      case 4:
	{
	    System.out.println("The characters of the string in reverse are :");
	  for(int i=s.length()-1;i>=0;i--){
	      System.out.print(s.charAt(i)+" ");
	  }
	  break;

	}

      case 5:
	{
	   String x[]=s.split(" ");
	   System.out.println("Total number of words in the string is : "+x.length);
	  break;

	}
      case 6:
	{
	    String a="abcdef";
	    String b="abcde";
	   char[] c=a.toCharArray();
	   char[] d=b.toCharArray();
	   if(a==b)
	   System.out.println("Strings are equal.");
	   else{
	   System.out.println("Strings are not equal.");
	   }
	  break;

	}
      case 7:
	{
	   String x[]=s.split(" ");
	   System.out.println("Total number of words in the string is : "+x.length);
	  break;

	}
      case 8:
	{
	   String x[]=s.split(" ");
	   System.out.println("Total number of words in the string is : "+x.length);
	  break;

	}
      case 9:
	{
	   String x[]=s.split(" ");
	   System.out.println("Total number of words in the string is : "+x.length);
	  break;

	}
      case 10:
	{
	   int[] c=new int[256];
	   for(int i=0;i<s.length();i++){
	       c[s.charAt(i)]++;
	       
	   }
	   int temp=0;
	   int count=0;
	   for(int i=0;i<c.length;i++){
	       if(c[i]>c[temp]){
	       temp=i;
	       count=c[i];
	       }
	   }
	   System.out.print("The Highest frequency of character "+(char)(temp)+" appears number of times : "+count);
	  break;

	}
	

      default:
	{

	  System.out.println ("Invalid question number");

	  break;

	}

      }

  }

}
