package forms;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by elias on 02/06/17.
 */
public class Submission {

    public Submission(LocalDateTime submissionTime, String content) {
        this.content = content;
        this.submissionTime = submissionTime;
    }

    /******************************************
     * Submission time
     ******************************************/

    private final LocalDateTime submissionTime;

    public LocalDateTime getSubmissionTime(){
        return this.submissionTime;
    }

    /******************************************
     * Content
     ******************************************/

    private String content;

    /**
     * @return this submissions content.
     */

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /******************************************
     * Name censoring
     ******************************************/

    public String censorName(String input) {
        if (input == null) throw new NullPointerException("String is null!");
        else if (input.length() == 0) throw new IllegalArgumentException("String is empty!");

        String names[] = input.split(" ");
        String initials = "";

        for (String name : names) {
            if(name.isEmpty()) continue;
            initials += generateInitials(name);
            initials += ".";
        }

        return initials;
    }

    public String generateInitials(String input) {
        input = input.trim();
        char initial = input.charAt(0);
        if (Character.isLowerCase(initial)) {
            initial = Character.toUpperCase(initial);
        }
        return new String(new char[]{initial});
    }


}
