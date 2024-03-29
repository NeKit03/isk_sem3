package org.example;

public class ErrorData extends IllegalArgumentException{
    public ErrorData() {
        super("Ошибка во входных данных");
    }

    public ErrorData(String s) {
        super("Ошибка входных данных: "+s);
    }
}
