package com.sascha80.wordcounter;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
				System.out.println("Bitte geben Sie Ihren Text ein:");
				String text = scanner.nextLine();
				
				int wordCount = countWords(text);
				int charCount = countChars(text);
				int sentenceCount = countSentences(text);
				
				
				System.out.println("Dein Text besteht aus" + wordCount + "Wörtern.");
				System.out.println("Außerdem enthält er" + charCount + "Zeichen.");
				System.out.println("Sowie" + sentenceCount + "Sätze.");
				
	}
	
	public static int countWords(String text) {
		if (text == null || text.isEmpty()) {
			return 0;
		}
		String[] words = text.trim().split("\\s+");
		return words.length;
	}
	

}
