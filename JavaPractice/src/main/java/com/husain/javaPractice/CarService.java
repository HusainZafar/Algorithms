package com.husain.javaPractice;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private static final Logger log = LoggerFactory.getLogger(CarService.class);

    public enum CarState {
        DRIVING, WAITING, PARKING;
        public static CarState from(String state) {
            switch (state) {
                case "DRIVING":
                    return DRIVING;
                case "WAITING":
                    return WAITING;
                case "PARKING":
                    return PARKING;
                default:
                    throw new RuntimeException("unknown state: " + state);
            }
        }
    }

    public void process(String input) {
        /* if (log.isDebugEnabled()) {
            log.debug("processing car:" + input);
        }*/
        log.debug("processing car: {}", input);
        CarState carState = CarState.from(input);
    }

    /* public static void main(String... args) {
        // argument Hello World will print that message
        System.out.println(args[0] + " " + args[1]);
    }*/

    private static boolean isValid(String argument) {
        try {
            CarState.valueOf(argument);
        } catch (IllegalStateException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] arguments) {
        CarService carService  = new CarService();
        /*
        for (String argument: arguments) {
            if(isValid(argument)) {
                carService.process(argument);
            } else {
                System.out.println("Invalid argument: " + argument);
            }
        }
         */
        for (String argument: arguments) {
            try {
                carService.process(argument);
            } catch (RuntimeException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finally block");
            }
        }
    }
}