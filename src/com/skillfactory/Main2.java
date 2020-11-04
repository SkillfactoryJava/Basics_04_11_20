package com.skillfactory;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b=scanner.nextInt();
        int[] q ={1,2,3,4,5};

        while (b>13){
            System.out.println(--b);
        }
        do{
            System.out.println(--b);
        }while(b>13);

//        for (int a:q) {
//            System.out.println(a);
//        }
//        System.out.println("i b");
//        for(b=0;b==12;b--){
//            int a=12;
//            System.out.println(b);
//            if(b==10){
//                continue;
//            }
//
//        }
//        int a = scanner.nextInt();
//        String str = scanner.nextLine();
//        String string2 = new String("qqq");
//        char c = 'c';
//        int i = scanner.nextInt();//a>10?  :33;
//        if(i>20){
//            System.out.println(i);
//        System.out.println();}
//        else
//            System.out.println("else");
//
//        int b = switch (i){
//            case 1 ->12;
//            case 2 -> 13;
//            default -> 44;
//        };
//        System.out.println(b);

//
//        switch(string2){
//            case "c":
//            case "w": {
//                System.out.println("a q или ww");
//                break;
//            }
//            default:{
//                System.out.println("default");
//            }
//        }

//        if(a == 1){
//            System.out.println("a == 1");
//        } else if (a == 2) {
//            System.out.println("a == 2");
//        } else {
//            System.out.println("default");
//        }

//        if(a>b && c==d){
//            System.out.println("a>b");
//        }else if(c==d){
//            System.out.println("a<b");
//        }else if(c>d){
//            System.out.println("c>d");
//        }else{
//            System.out.println("a==b");
//        }
//        System.out.println("out");
    }
}
