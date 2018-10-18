package com.company;

import java.util.ArrayList;

public class Role {
    private long id;
    private String name;
    private ArrayList<User> users;
private static int count=100;


    public Role(String name){
        id= count++;
        this.name=name;

    }

    public Role() {
        id= count++;
        users = new ArrayList<User>();
    }

    public Role(long id, String name, ArrayList<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }
}
