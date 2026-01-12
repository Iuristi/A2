package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = null;
        int length;

        if (text != null) {
            length = text.length();
        } else {
            length = 5;
        }

        System.out.println(length);
    }
}


//Questions:
//✓ What will be printed? - "5"
//✓ Why does the program not crash? - " იმიტომ რომ გვაქვს if პირობა (text != null) რომელიც ამოწმებს გვაქვს თუარა null და რადგან არ გვაქვს გამოიძახებს  length = text.length()"
//✓ What would cause a NullPointerException here?  - "თუ გვექნებოდა String text = null; int length = text.length() ან თუ if–else არ იქნებოდა"