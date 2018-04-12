package com.thoughtworks;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FizzBuzzGameTest {
    @Test
    public void should_return_true_when_have_3() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.is_have_3(35),true);
        assertEquals(gamer.is_have_3(22),false);
    }

    @Test
    public void should_return_true_when_is_multiple_of_3() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.is_multiple_of_3(6),true);
        assertEquals(gamer.is_multiple_of_3(4),false);
    }

    @Test
    public void should_return_true_when_is_multiple_of_5() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.is_multiple_of_5(5),true);
        assertEquals(gamer.is_multiple_of_5(9),false);
    }

    @Test
    public void should_return_true_when_is_multiple_of_7() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.is_multiple_of_7(14),true);
        assertEquals(gamer.is_multiple_of_7(13),false);
    }

    @Test
    public void should_return_true_when_only_is_multiple_of_3() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.only_is_multiple_of_3(9),true);
        assertEquals(gamer.only_is_multiple_of_3(15),false);
    }

    @Test
    public void should_return_true_when_only_is_multiple_of_5() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.only_is_multiple_of_5(10),true);
        assertEquals(gamer.only_is_multiple_of_5(15),false);
    }

    @Test
    public void should_return_true_when_only_is_multiple_of_7() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.only_is_multiple_of_7(14),true);
        assertEquals(gamer.only_is_multiple_of_7(21),false);
    }

    @Test
    public void should_return_true_when_is_multiple_of_3_and_5() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.is_multiple_of_3_and_5(15),true);
        assertEquals(gamer.is_multiple_of_3_and_5(9),false);
        assertEquals(gamer.is_multiple_of_3_and_5(10),false);
        assertEquals(gamer.is_multiple_of_3_and_5(16),false);
        assertEquals(gamer.is_multiple_of_3_and_5(105),false);
    }

    @Test
    public void should_return_true_when_is_multiple_of_3_and_7() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.is_multiple_of_3_and_7(21),true);
        assertEquals(gamer.is_multiple_of_3_and_7(9),false);
        assertEquals(gamer.is_multiple_of_3_and_7(14),false);
        assertEquals(gamer.is_multiple_of_3_and_7(20),false);
        assertEquals(gamer.is_multiple_of_3_and_7(105),false);
    }

    @Test
    public void should_return_true_when_is_multiple_of_5_and_7() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.is_multiple_of_5_and_7(35),true);
        assertEquals(gamer.is_multiple_of_5_and_7(10),false);
        assertEquals(gamer.is_multiple_of_5_and_7(14),false);
        assertEquals(gamer.is_multiple_of_5_and_7(20),false);
        assertEquals(gamer.is_multiple_of_5_and_7(105),false);
    }

    @Test
    public void should_return_true_when_is_multiple_of_3_and_5_and_7() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.is_multiple_of_3_and_5_and_7(105),true);
        assertEquals(gamer.is_multiple_of_3_and_5_and_7(9),false);
        assertEquals(gamer.is_multiple_of_3_and_5_and_7(15),false);
        assertEquals(gamer.is_multiple_of_3_and_5_and_7(21),false);
        assertEquals(gamer.is_multiple_of_3_and_5_and_7(35),false);
    }

    @Test
    public void should_return_result_when_input_a_number() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        assertEquals(gamer.getResult(57),"Fizz");
        assertEquals(gamer.getResult(20),"Buzz");
        assertEquals(gamer.getResult(19),"19");
        assertEquals(gamer.getResult(36),"Fizz");
        assertEquals(gamer.getResult(1),"1");
    }

    @Test
    public void test_start() {
        FizzBuzzGame gamer = new FizzBuzzGame();
        String[] array = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "Whizz", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "Whizz", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        List<String> results = Arrays.asList(array);
        gamer.start(20);
        assertEquals(gamer.getResults(),results);
    }
}
