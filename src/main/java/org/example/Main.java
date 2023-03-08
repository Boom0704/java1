package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("당신의 나이 : " + a);
//        if(a > 20){
//            System.out.println("성인");
//        }
        String b = (a>20) ? "성인" : "학생";
        System.out.println(b);
    }

}