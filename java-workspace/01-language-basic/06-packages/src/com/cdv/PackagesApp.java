package com.cdv;

import java.util.Date;

public class PackagesApp {

    public static void main(String[] args) {
        // fully qualified name
        java.sql.Date date = new java.sql.Date(10);
        System.out.println(date.getClass());

        Date util = new Date();
        System.out.println(util.getClass());
    }

}