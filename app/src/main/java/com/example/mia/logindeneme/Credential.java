package com.example.mia.logindeneme;

public class Credential {
    private String UserName;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private String Password;
    private String Name;
    private String Surname;
    private String Email;
    private static Credential instance;

    public String getName() { return Name; }

    public void setName(String name) { Name = name; }

    public String getSurname() { return Surname; }

    public void setSurname(String surname) { Surname = surname; }

    public String getEmail() { return Email; }

    public void setEmail(String email) { Email = email; }

    public static Credential getInstance() { return instance; }

    public static void setInstance(Credential instance) { Credential.instance = instance; }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

}
