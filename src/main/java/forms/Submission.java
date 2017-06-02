package forms;

import java.time.LocalDateTime;

/**
 * Created by elias on 02/06/17.
 */
public class Submission {

    private String content;

    private LocalDateTime submissionTime;

    public Submission(LocalDateTime submissionTime, String content){

    }

    public String generateInitials(String input){
        input = input.trim();
        char initial = input.charAt(0);
        if(Character.isLowerCase(initial)){
            initial = Character.toUpperCase(initial);
        }
        return new String(new char[]{initial});
    }

}
