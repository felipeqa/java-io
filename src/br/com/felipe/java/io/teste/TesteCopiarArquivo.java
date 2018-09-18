package br.com.felipe.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
        OutputStream fos = new FileOutputStream("felipe4.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        InputStream fis = new FileInputStream("felipe.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();

        }


        bw.close();
        br.close();
    }
}
