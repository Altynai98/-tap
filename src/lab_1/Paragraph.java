package lab_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; // for the using sort method

public class Paragraph {

    String[] paragraphList = new String[100];
    
    public Paragraph(String[] paragraphList) {
        this.paragraphList = paragraphList;
    }
    
    // Sorting words in alphabetical order
    public ArrayList<String> sortParagraph() {
        ArrayList<String> newParagraphList = new ArrayList<>();
        for (int i = 0; i < this.paragraphList.length; i++) { 
            newParagraphList.add(this.paragraphList[i]);
        }
        Collections.sort(newParagraphList); 

        return newParagraphList;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine();
        
        String[] paragraphList = paragraph.split("\\s+");
        Paragraph p = new Paragraph(paragraphList);
        ArrayList<String> currentParagraph = p.sortParagraph();
        
        System.out.println("Sorted paragraph:");
        for (String word : currentParagraph) {
            System.out.print(word + " ");
        }
        scanner.close(); 
    }
}