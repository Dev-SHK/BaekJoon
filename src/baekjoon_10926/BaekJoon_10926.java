package baekjoon_10926;

// 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
// 준하는 놀람을 ??!로 표현한다.
// 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.

import java.util.Scanner;

public class BaekJoon_10926 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String id = scn.next();
        String surp = "??!";
        System.out.println(id + surp);
    }

}