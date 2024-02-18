package lab_1;
import java.util.Scanner;


public class Word {
	String value;
	
	public Word(String word) {
	    this.value = word;
	}

	//Replacing letters by their position in the alphabet
	public String lettersPosition() {
		String result = "";
		for(int i=0; i<this.value.length(); i++) {
			if(this.value.charAt(i) == ' ') {
				result += ' ';
			} else {
				int charOrder = this.value.charAt(i) - 'a' + 1;
				result += String.valueOf(charOrder);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word  = scanner.nextLine();
		
		Word w = new Word(word);
		String currentWord = w.lettersPosition();
		System.out.println(currentWord);
	}
}
