package br.com.felipe.java.io.teste;

import java.io.*;

public class TesteLeitura {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
        InputStream fis = new FileInputStream("felipe.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }



        br.close();
    }
}
