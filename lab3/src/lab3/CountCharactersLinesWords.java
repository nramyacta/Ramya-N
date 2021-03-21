/**
*Name: Ramya N
*Description: Count and display number of characters lines and words in a string.
*Date: 3/19/2021
*/
package lab3;

public class CountCharactersLinesWords {

	public static void main(String[] args) {
		String str="I am a Cognizant employee \n Joined recently";
		int countchar=0, countwords=0, countlines=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='\n') {
				countlines++;
			}
			else if(str.charAt(i)==' ') {
					countwords++;
			}
			else if(str.charAt(i)!=' ') {
						countchar++;
			}
		}
			System.out.println("\nNumber of lines: "+countlines);
			System.out.println("\nNumber of words: "+countwords);
			System.out.println("\nNumber of characters: "+countchar);
		
	}

}
