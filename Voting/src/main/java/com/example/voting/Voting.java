package com.example.voting;

public class Voting {
    String id, title, datestart, datefinish, status;

    public Voting(String id, String title, String datestart, String datefinish, String status) {
        this.id = id;
        this.title = title;
        this.datestart = datestart;
        this.datefinish = datefinish;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDatestart() {
        return datestart;
    }

    public void setDatestart(String datestart) {
        this.datestart = datestart;
    }

    public String getDatefinish() {
        return datefinish;
    }

    public void setDatefinish(String datefinish) {
        this.datefinish = datefinish;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
