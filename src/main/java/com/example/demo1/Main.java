package com.example.demo1;

public class Main {

    public static void main(String[] args) {
        if(args.length == 0 || args[0].equals("--gui")){
            App.main(args);
        }
        else if(args[0].equals("--cli")) {
            CLI.main(args);
        }
        else if(args[0].equals("--help")) {
            System.out.println("Help man page>>>");
        }
        else {
            System.out.println("WHATT???");
        }
    }

    public static String greetings(String name) {
        return "hello " + name;
    }
}
