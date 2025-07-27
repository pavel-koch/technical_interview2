package org.example;

public class AgeValidator {
    public static void checkAge(int age) throws AgeRestException{
        if (age < 18){
            throw new AgeRestException("Доступ запрещен: возраст " + age + " меньше 18!");
        }
        System.out.println ("Доступ разрешен");
    }
}
