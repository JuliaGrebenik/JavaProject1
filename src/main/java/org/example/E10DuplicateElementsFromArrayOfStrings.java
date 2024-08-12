package org.example;

public class E10DuplicateElementsFromArrayOfStrings {
    public static void main(String[] args) {


        String[] words = {"summer", "summer", "spring", "fall"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {


                    System.out.println(words[i]);
                }
            }

        }
    }
}

