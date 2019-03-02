package edu.cwu.app.makedisciples;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NoteHandler implements Serializable {

    private Date date;
    private String text;
    private Boolean isFullyDisplay;
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy 'at' hh:mm aaa");

    //default constructor
    public NoteHandler(){
        this.date = new Date();
    }

    public NoteHandler(long time,String text){
        date = new Date(time);
        this.text = text;
    }

    public String getDate(){
        return dateFormat.format(date);
    }
    public long getTime(){
        return date.getTime();
    }

    public void setTime(long time){
        date = new Date(time);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getShortText(){
        String temp = text.replaceAll("\n", " ");
        if (temp.length()>25){
            return temp.substring(0,25)+"...";
        }else
            return temp;
    }

    public void setIsFullyDisplay(boolean isFullyDisplay){
        this.isFullyDisplay = isFullyDisplay;
    }

    public Boolean getFullyDisplay() {
        return isFullyDisplay;
    }

    @Override
    public String toString() {
        return text;
    }
}
