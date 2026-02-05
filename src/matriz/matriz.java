package matriz;

import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas:");
        int n = sc.nextInt();

        System.out.println("Digite a quantidade de colunas:");
        int m = sc.nextInt();

        int [][] matriz = new int [n][m];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.println("Digite o valor : [ " + i + " ] " + "[ " + j + " ]" );
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int[] linha : matriz){
            for (int coluna: linha){
                System.out.print("[ " + coluna + " ]");
            }
        System.out.println();
        }
    }
}
