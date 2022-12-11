package ca.georgiancollege.comp1008.com1008tuedayspmgui;

import java.nio.file.Files;
import java.nio.file.Path;

public class LoginModel {
    // do we need instance variable
    // if so, how many?
    private String username,password;
    private final String expectedUsername ="admin",expectedPassword="pass";

    public LoginModel() {}
    public void processRequest(String username, String password)
    {
        this.username = username;
        this.password= password;
        idValidCredentials();
    }
    public boolean validateData() {
        return username.equals(expectedUsername) && password.equals(expectedPassword);
    }

    //method to find if the username and password exists
    public void idValidCredentials(){
        Path rootPath = Path.of("src/main/resources/ca/georgiancollege/comp1008/comp1008tuedayspmgui");
        Path dataPath = rootPath.resolve("data");
        Path attemptTofindUser = dataPath.resolve(username+ ".txt");

        try{
             String content = Files.readString(attemptTofindUser);
             if(!content.equals(password)) {
                 throw new IllegalArgumentException("Password for" + username +" is incorrect");
             }


        }
        catch (Exception e){
            throw new IllegalArgumentException("Username" + username + "is not found");

        }

    }

 }
