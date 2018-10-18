package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<User> allUser = new ArrayList<>();
        ArrayList<Role> allRole = new ArrayList<>();


        //creating role
        long id;
        String name;
        Role roles;

        roles = new Role("Admin");
        allRole.add(roles);

        roles = new Role("Editor");
        allRole.add(roles);

        String userName, password, roleName;
        String search = "";

        int menu = 0;
        String moreRole;

        do {

            System.out.println("1.Sign up \n2.Sign In\n3.Add Role" +
                    "\n4.List of roles\n5.List of users\n6.Quit");

            menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1:

                    User user = new User();
                    System.out.println("      Sign up");

                    System.out.println("Enter user name:");

                    userName = input.nextLine();
                    user.setUserName(userName);
                    System.out.println("Enter Password");
                    password = input.nextLine();
                    user.setPassword(password);


                    do {

                        System.out.println("Search Role by Name");
                        search = input.nextLine();
                        roles = findRole(search, allRole);

                        // check if the role is already in the user or not

                      if(!user.getRoles().contains(roles)){
                          user.getRoles().add(roles);
                      }
                      else
                          System.out.println("the role already exist in the user" );
                      /*  if (roles != null) {
                            user.addRole(roles);

                        } else*/
                          //  System.out.println("Role not found");

                        System.out.println("Do you want to add more Role? yes or no");
                        moreRole = input.nextLine();

                    } while (moreRole.equalsIgnoreCase("yes"));
                    allUser.add(user);
                    break;
                case 2:
                    //sign in
                    // add role to the user
                    System.out.println("    Sign In");
                    System.out.println("Enter your UserName");
                    String userNameSignIn = input.nextLine();



                    break;
                case 3:
                    //adding role
                    do {
                        Role role =new Role();
                        System.out.println("       Add new role");
                        System.out.println("Enter Role name");
                        roleName = input.nextLine();
                        role.setName(roleName);
                      /*  System.out.println("Add User to role");

                        search =input.nextLine();
                        user =findUser(search,allUser);*/
                        System.out.println("Do you want to add more role? yes or no");
                        moreRole = input.nextLine();
                        allRole.add(role);
                    } while (moreRole.equalsIgnoreCase("yes"));

                    break;
                case 4:
                    System.out.println("    List of roles");
                    System.out.println("the size of the role "+allRole.size());
                    for (Role role : allRole) {
                        System.out.println("ID: " + role.getId() + "\nName: " + role.getName() + "\n");
                    }

                    break;
                case 5:
                    System.out.println("      List of Users");
                    for (User searchUser : allUser) {
                        System.out.println("ID: " + searchUser.getId() + "\nUser Name: " + searchUser.getUserName()
                                + "\nRole:");
                        for (Role listOfRole : searchUser.getRoles()) {
                            System.out.println("  Role name: " + listOfRole.getName() + "\n  Role ID:" + listOfRole.getId() + "\n");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thank you bye!!");
                    break;

            }

        } while (menu != 6);


    }


    public static Role findRole(String name, ArrayList<Role> roleSearch) {

        Role foundRole = null;
        for (Role eachRole : roleSearch) {
            if (name.equalsIgnoreCase(eachRole.getName())) {
                foundRole = eachRole;
            }
        }
        return foundRole;
    }
    public static User findUser(String name, ArrayList<User> userSearch){
        User foundUser = null;
        for(User eachUser: userSearch){
            if(name.equalsIgnoreCase(eachUser.getUserName())){
                foundUser=eachUser;
            }
        }
        return foundUser;
    }
}
