package forms;

import java.time.LocalDateTime;

/**
 * Created by elias on 02/06/17.
 */
public class Submission {

    public Submission(LocalDateTime submissionTime, boolean reviewed, int position, String content) {
        this.position = position;
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
     * Reviewing
     ******************************************/

    private boolean reviewed = false;

    public boolean isReviewed(){
        return reviewed;
    }

    public void setReviewed(){
        this.reviewed = true;
    }

    /******************************************
     * Position
     ******************************************/

    private int position;


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isValidPosition(int position){
        return position > 0;
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

    public void censorName(String name) {
        String content = getContent();
        if(content.contains(name)){
            content.replace(name, generateCensoredName(name));
        }
        setContent(content);
    }

    /******************************************
     * Name censoring
     ******************************************/

    public String generateCensoredName(String input) throws NullPointerException, IllegalArgumentException{
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
