package br.com.mamede;
import java.util.Scanner;

public class FirstClass {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = s.nextInt();
        Integer newNum = num;
        System.out.println("Esse é o número " + newNum);
    }
}
