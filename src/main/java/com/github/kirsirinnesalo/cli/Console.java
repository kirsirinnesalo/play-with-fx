package com.github.kirsirinnesalo.cli;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.function.Consumer;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class Console {

    private Console() {}

    private static Consumer<Object> console = System.out::println;

    public static void printLine(Object text) {
        console.accept(String.valueOf(text));
    }

    public static void printEmptyLine() {
        printLine(EMPTY);
    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.hasNext() ? scanner.nextLine() : EMPTY;
    }

}
