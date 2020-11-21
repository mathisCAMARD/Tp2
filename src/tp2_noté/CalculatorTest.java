/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_noté;

import java.util.Scanner;

/**
 *
 * @author mathis
 */
public class CalculatorTest {

    private static Object test;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean a;
        System.out.println("test");

        do {
            System.out.println("entrer une phrase");
            String str = input.nextLine();
            a = Calculator.parseAndCompute(str);
        } while (a != true);
    }
}
