package org.example;

public class Main {
    public static void main (String[] args){
        try{
            AgeValidator.checkAge(16);
        } catch (AgeRestException e){
            System.out.println ("Ошибка: " + e.getMessage());
        }
    }
}