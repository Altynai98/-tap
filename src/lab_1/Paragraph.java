package lab_1;

public class Paragraph {

	public static void main(String[] args) {
		// count words in paragraph
		String paragraph = "Cats";
		int count = 0;
		for(int i=0; i<paragraph.length(); i++) {
			count++;
		}
		System.out.println("The length of the paragraph: " + count);


	}

}
