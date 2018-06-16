package ru.testqa.junitcore;

import org.junit.runner.Result;

/**
 * @author Muflikhunov Roman
 */
public class Util {
    public static void printResult(Result result) {
        System.out.printf("Test ran: %s, Failed: %s%n",
                result.getRunCount(), result.getFailureCount());
    }
}