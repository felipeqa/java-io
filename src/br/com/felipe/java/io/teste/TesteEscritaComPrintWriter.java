package br.com.felipe.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaComPrintWriter {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
//        OutputStream fos = new FileOutputStream("felipe2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
//        FileWriter fw = new FileWriter("loren.txt");

        PrintWriter pw = new PrintWriter("loren3.txt");

        pw.println("Esse arquivo é de escrita");
        pw.println();
        pw.println("E aqui vamos nós!");
        pw.println();
        pw.println(true);
        pw.println();
        pw.println("Fim");
        pw.close();
    }
}
