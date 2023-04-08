//Faça um programa que peça o tamanho de um arquivo para download (em MB) 
//e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo
// aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double downloadMB;
        double calculoMbps;
        double velocidade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual é o tamanho em downloadMB");
        downloadMB = teclado.nextDouble();
        System.out.println("qual a velocidade downloadMBPS");
        velocidade = teclado.nextDouble();
        calculoMbps = downloadMB / velocidade;
        System.out.println("velocidade estimada do download sera de " + calculoMbps + " minutos ");
        teclado.close();
    }
}
