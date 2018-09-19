package br.com.felipe.java.io.teste;

import java.io.*;

public class TesteEscrita2 {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
//        OutputStream fos = new FileOutputStream("felipe2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("loren.txt");

        fw.write("Esse arquivo é de escrita");
        fw.write("\n"); // Não recomendado
        fw.write("\n"); // Não recomendado
        fw.write("E aqui vamos nós!");
        fw.write(System.lineSeparator());//RECOMENDADO
        fw.write(System.lineSeparator());//RECOMENDADO
        fw.write(System.lineSeparator());//RECOMENDADO
        fw.write("Fim");
        fw.close();
    }
}
