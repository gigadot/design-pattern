package io.muic.ooc.design.builder;

/**
 * Created by gigadot on 26-Jan-17.
 */
public class StringBuilderMain {
    public static void main(String[] args) {
        String name = "Weerapong";
        String lastname = "Phadunguskanan";
        String fullname = name + " " + lastname;

        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ").append(lastname);
        System.out.println(fullname);
        System.out.println(sb.toString());
    }
}
