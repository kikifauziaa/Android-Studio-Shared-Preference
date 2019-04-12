package com.fauziahrizky.shared_preference.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {

    String title, content;
    Date date;

    public Note(String title, Date tanggal, String content) {
        this.title = title;
        this.date = tanggal;
        this.content = content;
    }

    public String getFormatedDate(){
        DateFormat format = new SimpleDateFormat("dd MM yyyy");
        return format.format(date);
    }
}
