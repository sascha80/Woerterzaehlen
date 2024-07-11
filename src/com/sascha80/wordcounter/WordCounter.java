/** package com.sascha80.wordcounter zeigt auf das Paket zu welchem die Klasse (class) WordCounter gehört.
 *  Java.util.Scanner Importiert die Scanner Klasse aus dem Paket java.util, wir benötigen sie für die Benutzereingabe.
 */
package com.sascha80.wordcounter;

import java.util.Scanner;
/**
 * Hier beginnt die Hauptklasse "WordCounter"
 * Die Hauptklasse (main class) wird in der Regel in der Datei mit dem selben Namen der Klasse gespeichert !!!
 */
public class WordCounter {
/** Beginn der main Methode.
 *  Erstellen eines Scanner Objekts welches Benutzereingaben von der Konsole liest.
 *  Try finally Block stellt sicher das der Scanner geschlossen wird.
 *  System.out.println ( fordert den Benutzer zur daten eingabe auf.
 *  	scanner.nextline() liest alle zeichen der Benutzereingabe ein.
 *  Aufruf der Methoden ( countWords, countChars, countSentences) zur ermittlung der Anzahl von Woertern, Zeichen sowie Sätze.
 *  System.out.println gibt die ermittelten Werte aus.
 * @param args
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bitte geben Sie Ihren Text ein:");
            String text = scanner.nextLine();

            int wordCount = countWords(text);
            int charCount = countChars(text);
            int sentenceCount = countSentences(text);

            System.out.println("Dein Text besteht aus " + wordCount + " Wörtern.");
            System.out.println("Außerdem enthält er " + charCount + " Zeichen.");
            System.out.println("Sowie " + sentenceCount + " Sätze.");
        } finally {
            scanner.close();
        }
    }
/**
 *  Methoden zum Zählen der Zeichen im text
 * @param text (Der zu Analysierende text)
 * @return ( Anzahl der Woerter, Zeichen, Sätze )
 *  Ausgabe der ermittelten Werte bzw 0 sollten keine vorhanden sein
 */
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static int countChars(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.length();
    }

    public static int countSentences(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] sentences = text.split("[.!?]");
        return sentences.length;
    }
}