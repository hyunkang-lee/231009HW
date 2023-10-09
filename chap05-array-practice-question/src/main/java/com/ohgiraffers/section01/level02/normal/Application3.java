package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */
        // 3을 입력 받으면 1 2 1        -> 2
        // 5을 입력 받으면 1 2 3 2 1     -> 3
        // 7을 입력 받으면 1 2 3 4 3 2 1   -> 4
        // 9을 입력 받으면 1 2 3 4 5 4 3 2 1  -> 5
        Scanner sc = new Scanner(System.in);

        System.out.print("홀수인 정수를 입력해주세요 : ");
        int a = sc.nextInt();
        int[] num = new int[a];
        int count = (int) (a / 2 + 1);
        int result = 0;

        if (a % 2 == 1) {

            for (int i = 0; i < count; i++) {
                num[i] = ++result;
            }

            for (int i = count; i < num.length; i++) {
                num[i] = --result;
            }
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
        }

        else{
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }
    }
}



