package br.com.felipe.java.io.teste;

import java.io.*;

public class TesteEscritaELeitura {

    public static void main (String[] args) throws IOException {

        // fluxo de entrada com arquivo
        OutputStream fos = new FileOutputStream("felipe3.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Esse arquivo é de escrita");
        bw.newLine();
        bw.write("testetststethbvnmfckuuj");
        bw.newLine();
        bw.newLine();
        bw.write("E aqui vamos nós!");
        bw.newLine();
        bw.write("Fim");
        bw.close();

        InputStream fis = new FileInputStream("felipe3.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();

        }
        bw.close();
        br.close();
    }
}
