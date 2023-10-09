package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int[] a = new int [6];
        int temp = 0 ;

        for (int i = 0 ; i < a.length; i++){

            a[i] =(int) (Math.random() * 45) + 1;
            for (int j = 0; j < i ; j++) {
                if (a[i] == a[j]) {
                    i--;
                    break;
                }
            }
        }
        for(int i = 1; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }


    }
}
