//Name : Hiya Sharma
//period : 3B
import java.util.*;
public class pigLatin {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		
		
		  //1 
		   System.out.println("Put a word!");
		   String str = scan.nextLine();
		   
		  System.out.println(str.toUpperCase().substring(0,1)+str.substring(1));
		  
		  //2 System.out.println("Put a word!");
		  str = scan.nextLine();
		  String another = str.toUpperCase().substring(str.length()-2);
		  System.out.println(str.substring(0,str.length()-2) + another );
		  
		  //3 
		  System.out.println("Put a word!");
		  str = scan.nextLine(); 
		  String i = "e";
		  int count = 0;
		  for(int j = 0; j<str.length(); j++) { 
		  String anoth = str.substring(j,j+1); 
		  if(i.equals(anoth)) {
			  count++; } }
		  System.out.println(count);
		  
		  //4 
		  str = scan.nextLine();
		  String hi ="hi"; 
		  count = 0;
		  for(int h = 0; h<str.length(); h++) { 
			  String anoth;
			  if(h+2>str.length()) { anoth = "null"; }
		  else 
		  { anoth = str.substring(h,h+2);} 
			  if(hi.equals(anoth)) { count++; } }
		  System.out.println(count);
		  
		  //5 
		  str = scan.nextLine(); 
		  String target = scan.nextLine();
		  if(str.indexOf(target) != -1) { 
			  System.out.println("Found it!"); } 
		  else {
		  System.out.println("Nope :("); }
		  
		  //6 
		  System.out.println("enter a string :"); 
		  str = scan.nextLine();
		  System.out.println("enter an integer :");
		  int n = scan.nextInt(); int n1 = n;
		  while (n1>=0)
		  {System.out.println(str.substring(n-1));
		
		n1--;}
		 
		//7
		System.out.println("enter an email :");
		str = scan.nextLine();
		int val = str.indexOf("@");
		if(val!= -1) {
		System.out.println(str.substring(val));}
		
		//8
		System.out.println("enter your full name :");
		str = scan.nextLine();
		val = str.indexOf(" ");
		System.out.println(str.substring(0, val) + (str.toUpperCase().substring(val)));
		
		//9
		
		//10
		System.out.println("enter a string :");
		str = scan.nextLine();
		for(int l =0; l<str.length(); l++) {
			String another12 = str.substring(l, l+1);
			String apo = "*";
			if(another12.equals(apo)) {
		
			}
			else
			{
				System.out.print(another12);
			}
		}
		//Pig Latin App
		String choice = scan.nextLine();
			while(choice.toUpperCase().equals("continue")) {
		}
		String word = scan.nextLine();
		String first = word.substring(0,1);
		if(first.equals("a")||first.equals("e")|| first.equals("i")|| first.equals("o")||first.equals("u")) {
			word = word + "hay";
			
		}
		else 
		{
			String another1 = "";
			int g = 1;
			while(g<word.length()) {
				String another13 = word.substring(g,g+1);
				if(first.equals("a")||first.equals("e")|| first.equals("i")|| first.equals("o")||first.equals("u")) {
				break;
				
				}
				else
					{another1 = another1 + another13;}
				g++;
			}
			System.out.println(g);
			System.out.println(word.substring(g) + word.substring(0,g)+"ay");
		}
				}
				}
				
			
		
		
		
		
	


