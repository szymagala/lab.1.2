package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class Main {
    public static String leftPad(String aText, char aChar, int aWidth)
    {
        String res = aText;
        for (int i=0; i<aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }

    public static void main(String[] args) {
        // write your code here


        Scanner input = new Scanner(System.in);
        int liczba1, liczba2,liczba3;
        System.out.print("Podaj liczbę do konwersji na BIN i HEX: ");
        liczba1 = input.nextInt();


        System.out.printf("DEC\t\t BIN\t\t\t\t HEX\t\t\t\n");
        System.out.printf("%d\t",liczba1,"\t\t"); //System.out.printf("\t\t");
        System.out.printf(String.format("%16s", Integer.toBinaryString(liczba1)).replace(' ', '0'));  //zrobilem to inaczej uzywajac pomocy na stacku
        System.out.printf("\t\t");
        System.out.printf("0x"); System.out.printf(Integer.toHexString(liczba1).toUpperCase());


        System.out.println("\n__________________________________________________________\n");

        System.out.printf("Tablica losowyh 30 liczb\n");
        Random rnd = new Random();
        int[] liczby = new int[30];

        for (int i = 0; i < liczby.length; i++)
        {
            liczby[i] = rnd.nextInt();
            System.out.println(liczby[i]);
        }

        System.out.printf("\nMIN I MAX SPOSOBEM SORTOWANIA\n");
        Arrays.sort(liczby);
        System.out.println("Minimum = " + liczby[0]);
        System.out.println("Maximum = " + liczby[liczby.length-1]);
        // używałem fukncji sorotowania

        System.out.printf("\nMIN I MAX SPOSOBEM PĘTLI\n");
        int minV = liczby[0];
        for(int i=1; i<liczby.length; i++)
        {
            if(liczby[i] < minV)
            {
                 minV = liczby[i];
            }
        }
        System.out.println(minV);

        int maxV = liczby[0];
        for(int i=1;i < liczby.length;i++)
        {
            if(liczby[i] > maxV)
            {
                maxV = liczby[i];
            }
        }
        System.out.println(maxV);


        System.out.println("\n__________________________________________________________\n");
        System.out.printf("Nowe klasa Account\n");

        Account acc = new Account();
        acc.setName("piotr gołabek");
        System.out.println(acc.getName());


    }


}


        /*
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        long avg = 0;

        for (int l : liczby) // powinno być for (int 1 : liczby)  jak w intrukcji ale wtedy się nie kompiluje
        {
            System.out.println(1);
            if (1 < min) min =1;
            if (1 > max) max =1;
            avg +=1;

        }

         */


