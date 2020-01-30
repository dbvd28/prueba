/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corazon;

/**
 *
 * @author diego
 */
public class Corazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Este programa hace un corazon con un tamaño ya determinado
        int n = 6;
        int r=14;
        for (int i = 1; i <= ((n / 2) + 1); i++) {
            for (int k = 1; k <= n / 2 - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = (n / 2) - i + 2; j <= (n / 2) + i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= n / 2 -i+ 1; k++) {
                System.out.print("  ");
            }
            for (int j = (n / 2) - i + 2; j <= (n / 2) + i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
         for (int p = 1; p <= r / 2; p++) {
            for (int m = 1; m <= p; m++) {
                System.out.print(" ");
            }
            for (int o = p + 1; o <= r - p; o++) {
                System.out.print("*");
                }
            System.out.println("");
            }
        }
    }


