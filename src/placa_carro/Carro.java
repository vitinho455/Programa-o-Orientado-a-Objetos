package placa_carro;

import java.util.Random;

public class Carro {

public String modelo;
public String placa;
public int ano;
public double valor;

public Carro(String modelo, String placa, int ano, double valor){

    this.modelo = modelo;
    this.placa = gerarPlaca();
    this.ano = ano;
    this.valor = valor;
}

public Carro(){

}

public String gerarPlaca(){

    Random random = new Random();
    StringBuilder placa = new StringBuilder();

    for (int i = 1; i <= 3; i++) {

       placa.append((char) ('A' + random.nextInt(26)));

    }

    placa.append(random.nextInt(9));

    placa.append((char) ('A' + random.nextInt(26)));

    for (int i = 1; i <= 2; i++) {

        placa.append(random.nextInt(9));

    }

    return placa.toString();
}

   @Override
   public String toString() {
       return modelo + " | " + placa + " | " + ano + " | " + valor;
   }
}

