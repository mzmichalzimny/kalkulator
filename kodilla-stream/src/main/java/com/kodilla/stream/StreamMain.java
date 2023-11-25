package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Przykładowy tekst", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Przykładowy tekst", String::toUpperCase);
        poemBeautifier.beautify("Przykładowy tekst", (text) -> text.replace(' ', '_'));
        poemBeautifier.beautify("Przykładowy tekst", (text) -> new StringBuilder(text).reverse().toString());
    }
}
