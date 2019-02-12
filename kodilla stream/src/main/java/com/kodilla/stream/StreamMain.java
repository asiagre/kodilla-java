package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("SMALL", text -> text.toLowerCase());
        poemBeautifier.beautify("big", text -> text.toUpperCase());
        poemBeautifier.beautify("adding", text -> text + " something");
        poemBeautifier.beautify("subtracting", text -> text.substring(8, 11));
        poemBeautifier.beautify("first", text -> text.replaceAll("first", "second"));
        poemBeautifier.beautify("replace", text -> text.replace('e', 'a'));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}