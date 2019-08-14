package br.com.felipe.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura22CharsetSetado {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner scannerLinha = new Scanner(linha);
            scannerLinha.useLocale(Locale.US);
            scannerLinha.useDelimiter(",");
            String linha1 = scannerLinha.next();
            int linha2 = scannerLinha.nextInt();
            int linha3 = scannerLinha.nextInt();
            String linha4 = scannerLinha.next();
            double linha5 = scannerLinha.nextDouble();

//            String linhaFormatada = String.format(new Locale("pt","BR"),"%s - %04d-%08d, %s: %010.2f", linha1, linha2, linha3, linha4, linha5);
//            System.out.println(linhaFormatada);
            System.out.format(new Locale("pt","BR"),"%s - %04d-%08d, %s: %010.2f %n", linha1, linha2, linha3, linha4, linha5);

            scannerLinha.close();
        };


        scanner.close();
    }
}
