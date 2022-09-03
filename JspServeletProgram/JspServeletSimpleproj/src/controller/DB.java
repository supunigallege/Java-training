package controller;

import model.User;

import java.util.HashMap;
import java.util.Map;


public class DB {

   private static Map<String,User> users=new HashMap<>();

    public User getUser(String email){
        boolean con=check(email);

        if(con==true){
            User user=(User) users.get(email);
            return user;
        }

       return null;
    }

    public void addUser(String email,User user){

        users.put(email,user);

    }

    public boolean check(String email){

        boolean conection=users.containsKey(email);

        if (conection==true){

            return true;
        }
        if(conection==false){
            return false;
        }
        return false;
    }



}
