package forms;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * Created by elias on 03/06/17.
 */
public class SubmissionTest {

    Submission standardSub;

    @Before
    public void setUp() {
        standardSub = new Submission(LocalDateTime.now(), "bla die bla");
    }

    @Test
    public void generateInitialsTest() {
        assertEquals("E", standardSub.generateInitials("       elias  "));
    }

    @Test
    public void censorNameTest(){
        assertEquals("A.M.C.", standardSub.generateCensoredName(" ava   mirzaee  cheshmeh"));
        System.out.println(standardSub.generateCensoredName(" ava   mirzaee  cheshmeh"));
    }

}