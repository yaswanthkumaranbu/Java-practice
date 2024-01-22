
import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
import java.io.File;


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
	    int alphabet=0,digit=0,special=0;
	    char[] a=s.toCharArray();
	    for(int i:a){
	        
	        if((i>=65 && i<=90)|| (i>=97 && i<=122))
	        alphabet++;
	        else if(i>=48 && i<=57)
	        digit++;
	        else
	        special++;
	    }
	    System.out.println("Number of Alphabets in the string is : "+alphabet);
	    System.out.println("Number of Digits in the string is : "+digit);
	    System.out.println("Number of Special characters in the string is : "+special);
	  break;

	}
      case 8:
	{
	    String c=new String(s);
	    System.out.println("The First string is : "+s);
	    System.out.println("The Second string is : "+c);
	    System.out.println("Number of characters copied : "+c.length());
	    
	  break;

	}
      case 9:
	{
	    int vowels=0,consonants=0;
	    for (int i : s.toCharArray()){
	        if(i=='A' || i=='a' ||i=='E' || i=='e' || i=='I' ||i=='i' ||i=='O' ||i=='o' ||i=='U'||i=='u'){
	            vowels++;
	        }
	        else{
	            consonants++;
	        }
	    }
	    System.out.println("The total number of vowel in the string is : "+vowels);
	    System.out.println("The total number of consonant in the string is : "+consonants);
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
	case 11:{
	char[] c=s.toCharArray();
	Arrays.sort(c);
	s="";
	for(int j:c){
	    s+=(char)j;
	}
	System.out.println("After sorting the string appears like :\n"+s);
	break;
	    
	}
	case 12:{
	    System.out.print("Enter number of strings:");
	int x=sc.nextInt();
	String[] c=new String[x];
	for(int k=0;k<x;k++){
	    c[k]=sc.next();
	}
	String temp="";
	for(int i=0;i<c.length-1;i++){
	    for(int j=0;j<c.length-1;j++){
	        if(c[j].charAt(0)>c[j+1].charAt(0)){
	            temp=c[j];
	            c[j]=c[j+1];
	            c[j+1]=temp;
	        }
	    }
	}
	for(String v:c){
System.out.println(v);	}

	
	break;
	    
	}
	case 13:{
	  System.out.print("Position to extract from:");
	  int start=sc.nextInt();
	  System.out.print("Length:");
	  int len=sc.nextInt();
	  System.out.println(s.substring(start,len));
	break;
	    
	}
	case 14:{
	String[] str=s.split(" ");
	System.out.print("Input the substring to be search : ");
	String str1=sc.next();
	int flag=0;
	for(String j:str){
	    if(j.equals(str1)){
	    System.out.print("The substring is exists in the string.");
	    flag=1;
	    break;
	    }
	    else
	    continue;
	    
	}
	if(flag!=1)
	    System.out.print("The substring is not exists in the string.");
	break;
	    
	}
	case 15:{
	    char[] c=s.toCharArray();  
	    char[] e=new char[s.length()];  
	    for(int i=0;i<c.length;i++){
	        e[i]=Character.isLowerCase(c[i])? Character.toUpperCase(c[i]):Character.toLowerCase(c[i]);
	    }

	for(char b:e){
	    System.out.print(b);
	}
	break;
	    
	}
	case 16:{
	    int count=0;
	    String[] str=s.split(" ");
	    for(String x:str){
	        if(x.equalsIgnoreCase("the")){
	            count++;
	        }
	    }
	    System.out.print("The frequency of the word 'the' is : "+count);
	    break;
	}
	case 17:{
	    StringBuffer sb=new StringBuffer(s);
	    int len=sb.length();
	    for(int i=0;i<sb.length();){
	        if((sb.charAt(i)>='a' && sb.charAt(i)<='z')|| (sb.charAt(i)>='A' && sb.charAt(i)<='Z')){
	            i++;
	            continue;
	        }
	        else{
	            sb=sb.deleteCharAt(i);
	        }
	    }
	    System.out.print(sb);
	    break;
	}
	case 18:{
	    System.out.print("Input the character to find frequency: ");
	    char c=sc.next().charAt(0);
	    int count=0;
	    for(char x:s.toCharArray()){
	        if(x==c){
	            count++;
	        }
	    }
	    System.out.println("The frequency of "+c+" is : "+count);
	    break;
	}
	case 19:{
	    System.out.print("Enter string 2:");
	    String s2=sc.nextLine();
	    for(char x:s2.toCharArray()){
	        s+=x;
	    }
	    System.out.println("After concatenation the string is : ");
	    System.out.println(s);
	    
	    
	    break;
	}
	case 20:{
	    int lar=0;
	    int small=0;
	    String[] str=s.split(" ");
	    for(int i=0;i<str.length;i++){
	        if(str[i].length()> str[lar].length()){
	            lar=i;
	        }
	        if(str[i].length()<str[small].length()){
	            small=i;
	        }
	    }
	    System.out.println("The largest word is "+str[lar]+" and the smallest word is "+str[small]);

	    break;
	}
	case 21:{
	    System.out.println("Here is the above string in UPPERCASE ");
	    s=s.toUpperCase();
	    System.out.println(s);
	    break;
	}
	case 22:{
	    System.out.println("Here is the above string in LOWERCASE ");
	    s=s.toLowerCase();
	    System.out.println(s);
	    break;
	}
	case 23:{
	    int flag=0;
	    for(char c:s.toCharArray()){
	        if((c>=48 && c<=57)||(c>='a' &&c<='f')||(c>='A' &&c<='F')){
	            flag=1;
	        }
	        else{
	            flag=0;
	            break;
	        }
	    }
	    System.out.println(flag==1?"The entered character is a hexadecimal digit":"The entered character is not a hexadecimal digit");
	    break;
	}
	case 24:{
	    int flag=0;
	    
	        if((s.charAt(0)>='A' && s.charAt(0)<='Z')){
	            System.out.println("The entered letter is an UPPERCASE letter.");
	        }
	        else
	            System.out.println("The entered letter is not an UPPERCASE letter.");
	    break;
	    }
	
	case 25:{
	    System.out.print("enter the replacing character:");
	    char c=sc.next().charAt(0);
	    String temp="";
	    String[] str=s.split(" ");
	    for(String x:str){
	        temp+=x;
	        temp+=c;
	    }
	    System.out.println(temp);
	    break;
	}
	case 26:{

		char[] c=s.toCharArray();
		int count=0;

		for (char d : c) {
			if((d>=33 && d<=47)||(d>=58 && d<=64)){
			count++;
			}
		}
		System.out.println("The punctuation characters exists in the string is : "+count);
		break;
	}
	case 27:{
		s = s.replace("\\n", "\n");

		int index=s.indexOf("\n");
		String x=s.substring(0,index);
		System.out.println(x);		
		break;
	}
	case 28:{
		System.out.print(Character.isLowerCase(s.charAt(0))?"The entered letter is a lowercase letter.":"The entered letter is not a lowercase letter.");
		break;
	}
	case 29:{
		System.out.print("File content without spaces:");
		File f;
		Scanner scan=null;
		try{
		f=new File("filename.txt");
		scan=new Scanner(f);
		}
		catch(Exception e){
		}
		while(scan.hasNextLine()){
			System.out.print(scan.next());
		}
		break;
	}
	case 30:{
		if(s.charAt(0)>='0' && s.charAt(0)<='9'){
			System.out.println("It is a digit");
		}else{
			System.out.println("It is not a digit");
		}
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
