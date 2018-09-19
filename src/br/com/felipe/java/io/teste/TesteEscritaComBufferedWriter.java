package br.com.felipe.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaComBufferedWriter {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
//        OutputStream fos = new FileOutputStream("felipe2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
//        FileWriter fw = new FileWriter("loren.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter("loren.txt"));

        bw.write("Esse arquivo é de escrita");
        bw.newLine();
        bw.write("E aqui vamos nós!");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("Fim");
        bw.close();
    }
}
