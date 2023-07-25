package com.wartsila.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestFizzBuzz {

    @Test
    public void fizzbuzz_numberOne_returnsSomething() throws Exception {
        int input = 1;
        System.out.println("input: " + input);
        assertEquals(1, FizzBuzz.toFizzBuzz(input));
    }
}
