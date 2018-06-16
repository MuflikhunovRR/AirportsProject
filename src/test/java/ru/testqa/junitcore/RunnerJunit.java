package ru.testqa.junitcore;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import ru.testqa.AirportParamTest;
import ru.testqa.LaxtRqDbSpringTest;

/**
 * @author Muflikhunov Roman
 */
public class RunnerJunit {
    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        Result result = jUnitCore.run(LaxtRqDbSpringTest.class);
        Util.printResult(result);
    }
}