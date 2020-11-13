import java.util.*;

public class Main {
    public static final int START = 0;
    public static final int DIGITS = 1;
    public static void main(String[] args) {
        List<Character> digits = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',':');
        Set<Integer> endStates = Collections.singleton(DIGITS);

        StateMachine  sm  =  new  StateMachine(START,  endStates);
        sm.add(START, digits, DIGITS);
        sm.add(DIGITS,  digits,  DIGITS);

        String testString = "Hello, today 01 November. Today year: 2020, Date: 03.11.200; Time: 13:45:09";
        String testString2 = "Russia: 23:33:33, Abu-Dhabi: 00:34:33, Oslo: 21:34:33";

        sm.findAll(testString);
        sm.findAll(testString2);
    }
}
//Поиск  времени  вида  “HH:MM:SS”
//hh:mm:ss	18:31:42	18 часов 31 минута 42 секунды