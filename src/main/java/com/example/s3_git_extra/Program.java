package com.example.s3_git_extra;


public class Program {

    int age;
    boolean result;
    public boolean checkIsAdult(int age) {
        if(age >= 18) {
            result = true;
        }

        return result;
    }

}
