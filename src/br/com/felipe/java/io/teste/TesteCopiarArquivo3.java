package br.com.felipe.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo3 {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();

        }


        bw.close();
        br.close();
    }
}
