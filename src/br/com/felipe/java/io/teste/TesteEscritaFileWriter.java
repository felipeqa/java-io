package br.com.felipe.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        long ini = System.currentTimeMillis();

        BufferedWriter bw = new BufferedWriter(new FileWriter("teste.txt"));

        bw.write("541641564165 Alterando");
        bw.newLine();
        bw.write("Esse é o fim do arquivo");

        bw.close();

        long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");

    }
}
