package ch15.regex;

import static java.lang.System.out;

public class SplitDemo {
    public static void main(String[] args) {
        for(String token : "Justin,Monica,Irene".split(",")) {
            out.println(token);
        }

        for(String token : "JustinOrzMonicaOrzIrene".split("Orz")) {
            out.println(token);
        }

        for(String token : "Justin\tMonica\tIrene".split("\\t")) {
            out.println(token);
        }
    }
} 
