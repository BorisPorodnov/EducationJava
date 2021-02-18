package com.company.model;

public class SwitchClass {

    public static void main(String[] args) {

        String name = " Artur ";

        switch (name){
            case " Antonio ":
                System.out.println(" name is Antonio ");
                break;
            case " Artur ":
                System.out.println(" name is Artur ");
                break;
            case " James ":
                System.out.println(" name is James ");
                break;
            default:
                System.out.println(" this name was not found ");
                break;
            }
        }
    }
