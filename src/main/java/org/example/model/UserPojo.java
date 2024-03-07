package org.example.model;

public class UserPojo {

    private String username;
    private int sold;

    public UserPojo(String username, int sold) {
        this.username = username;
        this.sold = sold;
    }
    public String getUsername() {
        return this.username;
    }
    public int getSold() {
        return this.sold;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }


}