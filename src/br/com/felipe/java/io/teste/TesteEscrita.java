package br.com.felipe.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
        OutputStream fos = new FileOutputStream("felipe2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Esse arquivo é de escrita");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("E aqui vamos nós!");
        bw.newLine();
        bw.write("Fim");
        bw.close();
    }
}
