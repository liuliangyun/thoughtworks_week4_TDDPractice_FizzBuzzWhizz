package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        FizzBuzzGame gamer = new FizzBuzzGame();
        gamer.start(100);
    }

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            String result = getResult(i);
            results.add(result);
        }
    }

    public List<String> getResults() {
        return results;
    }

    public boolean is_have_3(int i) {
        String str = Integer.toString(i);
        if (str.contains("3")) {
            return true;
        }
        return false;
    }

    public boolean is_multiple_of_3(int i) {
        if (i % 3 == 0) {
            return true;
        }
        return false;
    }

    public boolean is_multiple_of_5(int i) {
        if (i % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean is_multiple_of_7(int i) {
        if (i % 7 == 0) {
            return true;
        }
        return false;
    }

    public boolean only_is_multiple_of_3(int i) {
        boolean flag = false;
        if (is_multiple_of_3(i) && !is_multiple_of_5(i) && !is_multiple_of_7(i)) {
            flag = true;
        }
        return flag;
    }

    public boolean only_is_multiple_of_5(int i) {
        boolean flag = false;
        if (!is_multiple_of_3(i) && is_multiple_of_5(i) && !is_multiple_of_7(i)) {
            flag = true;
        }
        return flag;
    }

    public boolean only_is_multiple_of_7(int i) {
        boolean flag = false;
        if (!is_multiple_of_3(i) && !is_multiple_of_5(i) && is_multiple_of_7(i)) {
            flag = true;
        }
        return flag;
    }

    public boolean is_multiple_of_3_and_5(int i) {
        boolean flag = false;
        if (is_multiple_of_3(i) && is_multiple_of_5(i) && !is_multiple_of_7(i)) {
            flag = true;
        }
        return flag;
    }


    public boolean is_multiple_of_3_and_7(int i) {
        boolean flag = false;
        if (is_multiple_of_3(i) && !is_multiple_of_5(i) && is_multiple_of_7(i)) {
            flag = true;
        }
        return flag;
    }

    public boolean is_multiple_of_5_and_7(int i) {
        boolean flag = false;
        if (!is_multiple_of_3(i) && is_multiple_of_5(i) && is_multiple_of_7(i)) {
            flag = true;
        }
        return flag;
    }

    public boolean is_multiple_of_3_and_5_and_7(int i) {
        boolean flag = false;
        if (is_multiple_of_3(i) && is_multiple_of_5(i) && is_multiple_of_7(i)) {
            flag = true;
        }
        return flag;
    }

    public String getResult(int i) {
        String result = Integer.toString(i);
        if (is_have_3(i) || only_is_multiple_of_3(i)) {
            result = "Fizz";
        } else if (only_is_multiple_of_5(i)) {
            result = "Buzz";
        } else if (only_is_multiple_of_7(i)) {
            result = "Whizz";
        } else if (is_multiple_of_3_and_5(i)) {
            result = "FizzBuzz";
        } else if (is_multiple_of_3_and_7(i)) {
            result = "FizzWhizz";
        } else if (is_multiple_of_5_and_7(i)) {
            result = "BuzzWhizz";
        } else if (is_multiple_of_3_and_5_and_7(i)) {
            result = "FizzBuzzWhizz";
        }
        return result;
    }
}


