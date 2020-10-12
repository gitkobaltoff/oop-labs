package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Text text = new Text("Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so, because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself on the way. When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way. On her way she met a copy. The copy warned the Little Blind Text, that where it came from it would have been rewritten a thousand times and everything that was left from its origin would be the word \"and\" and the Little Blind Text should turn around and return to its own, safe country. But nothing the copy said could convince her and so it didn’t take long until a few insidious Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her into their agency, where they abused her for their projects again and again. And if she hasn’t been");
        text.printNrSentences();
        text.printNrWords();
        text.printLettersInfo();
        text.printWordsInfo();
    }
}

class Text {
    String text;

    public Text(String text) {
        this.text = text;
    }

    public void printNrSentences() {
        char prev = ' ';
        int nr = 1;
        for (char c : text.toCharArray()) {
            if ((prev == '.' || prev == '?' || prev == '!') && c == ' ')
                nr++;
            prev = c;
        }
        System.out.println("Nr of sentences : " + nr);
    }

    public void printNrWords() {
        int nr = 1;
        for (char c : text.toCharArray()) {
            if (c == ' ' || c == '\n')
                nr++;
        }
        System.out.println("Nr of words : " + nr);
    }

    public void printLettersInfo() {
        String vowels = "aeiouAEIOU";
        int letter = 0, vowel = 0, consonant = 0;
        for (char c : text.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letter++;
                if (vowels.indexOf(c) > -1)
                    vowel++;
                else
                    consonant++;
            }
        }
        System.out.println("Letters: " + letter + "\nVowels: " + vowel + "\nConsonants: " + consonant);
    }

    public void printWordsInfo() {
        Map<String, Integer> freq = new HashMap<>();

        String[] words = text.replaceAll("[(]|[)]|[.]|[,]|[;]|[:]|[\"]|[!]|[?]", "").split(" ");

        for (String word : words) {
            word = word.toLowerCase();
            int count = freq.containsKey(word) ? freq.get(word) : 0;
            freq.put(word, count + 1);
        }

        System.out.println("Top 5 words by frequency:");
        for (int i = 0; i < (Math.min(freq.size(), 5)); i++) {
            int max = -1;
            String maxString = "";
            for (Map.Entry<String, Integer> entry : freq.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    maxString = entry.getKey();
                }
            }
            System.out.println(maxString + " - " + max);
            freq.put(maxString, -1);
        }

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        String[] uWords = new String[uniqueWords.size()];
        uniqueWords.toArray(uWords);
        Arrays.sort(uWords, Comparator.comparingInt(String::length).reversed());

        System.out.println("Top 5 words by length:");
        for (int i = 0; i < Math.min(uWords.length, 5); i++) {
            System.out.println(uWords[i].toLowerCase() + " - " + uWords[i].length());
        }
    }
}