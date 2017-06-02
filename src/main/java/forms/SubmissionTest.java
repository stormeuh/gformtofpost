package forms;

import org.junit.Assert.*;
import forms.Submission.*;

/**
 * Created by elias on 03/06/2017.
 */
public class SubmissionTest {

    @org.junit.Test
    public void generateInitialsTest() {
        assertEquals("E", generateInitials("   elias   "));
    }

}