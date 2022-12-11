package ca.georgiancollege.comp1008.com1008tuedayspmgui;

import java.nio.file.Files;
import java.nio.file.Path;

public class RegisterModel {
    private String username,password,confirmPassword;
    public RegisterModel() {}

    static final String tooShort = "is too short. 5 character min ";
    static final int minLength = 5;
    public void setUsername(String username) {
        if(username.length() < minLength)
            throw new IllegalArgumentException("Username" + tooShort);

        this.username = username;
    }

    public void setPassword(String password) {
        if(password.length() < minLength)
            throw new IllegalArgumentException("Password "+ tooShort);

        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        if(confirmPassword.length()< minLength)
            throw  new IllegalArgumentException("Confirm password"+tooShort);
        if(!password.equals(confirmPassword))
            throw new IllegalArgumentException("Password do not match");
        this.confirmPassword = confirmPassword;
    }

    public void processRequest(String username, String password, String confirmPassword) throws Exception {
       /*
        this.username=username;
        this.password=password;
        this.confirmPassword=confirmPassword;
        if (validateData())
            createUser();
        */
        setUsername(username);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        createUser();

    }

    /*
       - validate all instance valiable and ensure that they are at least 5 characters longs
       -
     */
    public boolean validateData()
    {
        return username.length() >= 5 && password.length() >= 5 & confirmPassword.length() >= 5 && password.equals(confirmPassword);

    }
    //if data is good, CREATE a new file : filename=username.txt. file content = password
    public boolean createUser() throws Exception
    {
        // file manipulation
        Path rootPath = Path.of("src/main/resources/ca/georgiancollege/comp1008/com1008tuedayspmgui/");
        Path dataPath = rootPath.resolve("data");
        if(!dataPath.toFile().exists()) {
            Files.createDirectory(dataPath);
        }
        Path userPath = dataPath.resolve(username + ".txt");
        Files.writeString(userPath, password);

        return true;
    }


}
