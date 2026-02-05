package placa_carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       ArrayList<Carro> carros = new ArrayList<>();

   System.out.println("Quantos carros deseja cadastrar no sistema?");
   int qntd = sc.nextInt();
   sc.nextLine();

       for (int i = 1; i <= qntd; i++) {

           System.out.println("Modelo: ");
           String modelo = sc.nextLine();

           System.out.println("Ano: ");
           int ano = sc.nextInt();

           System.out.println("Valor: ");
           double valor = sc.nextDouble();

           Carro carro = new Carro(modelo,"", ano, valor );
           carro.gerarPlaca();

       carros.add(carro);

           sc.nextLine();
       }

   for(Carro c : carros){

       System.out.println(c);

   }
   }
}