package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class User extends Human {

    public User(String data) throws IOException {
        super(data);

    }

    @Override
    public String toString() {
        return "User{" +
                firstName + ' ' + secondName + ' ' + lastName + '\n' +
                ", data='" + data + '\'' +
                ", numberTelefon='" + numberTelefon + '\'' +
                ", pol='" + pol + '\'' +
                '}';
    }
}
