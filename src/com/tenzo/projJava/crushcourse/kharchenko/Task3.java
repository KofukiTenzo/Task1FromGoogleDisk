package com.tenzo.projJava.crushcourse.kharchenko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    //quest 1
    public String sentenceOfFiveWords(String sentence) {
        ArrayList<String> words = new ArrayList<String>(List.of(sentence.split(" ")));
        Collections.sort(words, (str1, str2) -> str2.length() - str1.length());
        String largestWord = words.get(0);
        int largestWordLength = words.get(0).length();
        String secondWord = words.get(1);
        char ch;
        String secondWordReverse = "";
        for (int i = 0; i < secondWord.length(); i++) {
            ch = secondWord.charAt(i); //extracts each character
            secondWordReverse = ch + secondWordReverse; //adds each character in front of the existing string
        }
        return String.format("Most largest word is %s, it has %d letters. Second word is reversed - %s", largestWord, largestWordLength, secondWordReverse);
    }

    //quest 2
    public String removingExtraSpaces(String sentence){
        return sentence.replaceAll("\\s+", " ");
    }

    //quest 3
    public String currency(float money){
        return String.format("$%.2f", money);
    }
}
