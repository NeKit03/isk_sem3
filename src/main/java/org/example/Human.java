package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;

public class Human {
    private String path ="Users.txt" ;
    String firstName;
    String secondName;
    String lastName;
    String pol;
    String data;

    @Override
    public String toString() {
        return firstName + ' ' + secondName + ' ' +lastName + ' ' + pol + ' ' +data + ' ' + numberTelefon + ' ' ;

    }

    String numberTelefon;

    public Human(String data)throws IOException {
        String[] S = dataValidator(data);
        this.firstName = S[0];
        this.secondName = S[1];
        this.lastName = S[2];
        this.pol = S[3];
        this.data = S[4];
        this.numberTelefon = S[5];
        try(
                BufferedWriter out = Files.newBufferedWriter(Path.of(path));
        ){
            out.write(super.toString());

        }
    }

    public String[] dataValidator(String data){
        String[] S=data.split(" ");

        if (S.length!=6){
            if(S.length>6)
                throw new ErrorData("Введено больше аргументов");
            else
                throw new ErrorData("Введено меньше аргументов");
        }


        if(!S[3].matches("\\d{2}.\\d{2}.\\d{4}")) throw  new ErrorData("Не верный формат даты!");
        if(!S[4].matches("\\d{11}"))throw new ErrorData("Введен не корректный номер");
        if(!S[5].matches("[fm]"))throw new ErrorData("Введен не корректный пол пользователя");

        return S;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumberTelefon() {
        return numberTelefon;
    }

    public void setNumberTelefon(String numberTelefon) {
        this.numberTelefon = numberTelefon;
    }
}
