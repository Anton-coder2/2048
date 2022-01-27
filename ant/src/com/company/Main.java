package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /*Все коммиты*/
        //Side-branch 1

        int[][] l = new int[10][10];

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                l[i][j] = (int) (Math.random() * 2);
            }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + l[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("yes");
        for (int j = 0; j <10; j++) {
            for (int i = 9; i > -1; i--) {
                int k=i;
                if(l[k][j]!=0){
                    while(k<9  ){
                        if(l[k+1][j]!=0)
                        {break;}
                        if(l[k+1][j]==0)
                        {l[k+1][j]=l[k][j];
                        l[k][j]=0;
                        }
                        k++;
                    }
                }


        }
    }
        for (int j = 0; j <10; j++) {
            for (int i = 9; i > 0; i--) {
                if(l[i][j]==l[i-1][j]){
                    l[i][j]= l[i][j]*2;
                    l[i-1][j]=0;
                }


            }
        }
        for (int j = 0; j <10; j++) {
            for (int i = 9; i > -1; i--) {
                int k=i;
                if(l[k][j]!=0){
                    while(k<9  ){
                        if(l[k+1][j]!=0)
                        {break;}
                        if(l[k+1][j]==0)
                        {l[k+1][j]=l[k][j];
                            l[k][j]=0;
                        }
                        k++;
                    }
                }


            }
        }
        
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + l[i][j] + " ");
            }
            System.out.println("");
        }
}}
