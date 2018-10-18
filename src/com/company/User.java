package com.company;

import java.util.ArrayList;

public class User {

    private long id;
    private String userName;
    private String password;
    private ArrayList<Role> roles;
    private static int count=1000;
    public User() {
        id = count++;
        roles = new ArrayList<Role>();
    }

    public User(String userName, String password, ArrayList<Role> roles) {
        id = count++;
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role){
        roles.add(role);
    }
}
