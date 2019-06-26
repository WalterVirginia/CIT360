package myACPexamples;

import java.util.HashMap;

public class eightBallAppController {

    /**
     * Create HashMap
     */
    public static HashMap<String, eightBallHandler> eightBallMap = new HashMap<String, eightBallHandler>();

    /**
     * Here the user will choose a number between 1 and 5.
     * The number that they choose will return to the user
     * an answer to their question
     */
    public void eightBallHandlerRequest(String userChoice){
        eightBallMap.put("one", new eightBallOne());
        eightBallMap.put("two", new eightBallTwo());
        eightBallMap.put("three", new eightBallThree());
        eightBallMap.put("four", new eightBallFour());
        eightBallMap.put("five", new eightBallFive());
    }

    eightBallHandler eightHandle = eightBallMap.get(userChoice);
    eightHandle.result(userChoice);


}
