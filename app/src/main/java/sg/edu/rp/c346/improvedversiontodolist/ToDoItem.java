package sg.edu.rp.c346.improvedversiontodolist;

import java.util.Calendar;

/**
 * Created by 16022667 on 17/7/2017.
 */

public class ToDoItem {
    private String title;
    private Calendar date;



    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }
    public String getTitle(){
        return  title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public Calendar getDate(){
        return date;
    }

    public void setDate(Calendar date){
        this.date = date;
    }





    //POINT A Missing Setter and Getter codes




    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + getTitle() + '\'' +
                ", date=" + getDateString() +
                '}';
    }
}