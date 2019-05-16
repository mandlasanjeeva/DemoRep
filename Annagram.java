import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public static void main(String[] args) {
		// T

		//ODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter fist word");
		String s1=s.nextLine(); 
		System.out.println("secound word");
		String s2=s.nextLine();
		s1=s1.replaceAll("\\s","");
		s2=s2.replaceAll("\\s","");
		if(s1.length()!=s2.length()) {
			System.out.println("not annagrams");
		}
		else {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char a1[]=s1.toCharArray();
			char a2[]=s2.toCharArray();

			boolean value=Arrays.equals(a1,a2);
			if(value==false) {
				System.out.println("anagrams");
			}
			else {
				System.out.println("not");
			}
		}

	}


}
