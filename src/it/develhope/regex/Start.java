package it.develhope.regex;

public class Start {
    public static void main(String[] args) {

    System.out.println("-----------Starting---------------");

    String s1="x3z ? xYz ! R1 && __";

    System.out.println(s1.replaceAll(("[a-z|0-9]"), "*"));

    System.out.println("----------------------------------");

    }
}
