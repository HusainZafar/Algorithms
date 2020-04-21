package com.husain.javaPractice;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Enum {
    private static final String MY_STATE_VALUES[] = {"PENDING", "PROCESSING", "PROCESSED"};
    public enum LoggingLevel {
        PENDING, PROCESSING, PROCESSED;
    }

    public enum LoggingLevel2 {
        PENDING(1), PROCESSING(2), PROCESSED(3);
        private int i;

        private LoggingLevel2(int i) {
            this.i = i;
        }
    }

    @Test
    public void shouldDemonstrateEnum() {
        final Person[] person = {new Person(), null, null};
        // can't assign to final variable
        // person = null;


        MY_STATE_VALUES[0] = "STATE CAN BE MODIFIED";

        //enum values cannot be modified once created, case sensitive
        LoggingLevel currentLoggingLevel = LoggingLevel.PROCESSING;
        assertEquals(LoggingLevel.PROCESSING, currentLoggingLevel);

        LoggingLevel2 log = LoggingLevel2.PENDING;
        assertEquals(LoggingLevel2.PENDING, log);
        assertEquals(1, log.i);
    }

    @Test
    public void shouldDemonstrateSwitch() {
        LoggingLevel state = LoggingLevel.PENDING;
        int temp;
        switch (state) {
            case PENDING:
                temp = 1;
                break;
            case PROCESSING:
                temp = 2;
                break;
            case PROCESSED:
                temp = 3;
                break;
            default:
                temp = 4;
        }
        assertEquals(1, temp);
    }

}
