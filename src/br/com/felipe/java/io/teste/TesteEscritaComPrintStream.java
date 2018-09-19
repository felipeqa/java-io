package br.com.felipe.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaComPrintStream {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
//        OutputStream fos = new FileOutputStream("felipe2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
//        FileWriter fw = new FileWriter("loren.txt");

        PrintStream ps = new PrintStream("loren2.txt");

        ps.println("Esse arquivo é de escrita");
        ps.println();
        ps.println("E aqui vamos nós!");
        ps.println();
        ps.println(789798);
        ps.println();
        ps.println("Fim");
        ps.close();
    }
}
