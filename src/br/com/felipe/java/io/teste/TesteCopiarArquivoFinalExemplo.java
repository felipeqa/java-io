package br.com.felipe.java.io.teste;

import java.io.*;
import java.net.Socket;
import java.util.logging.SocketHandler;

public class TesteCopiarArquivoFinalExemplo {

    public static void main (String[] args) throws IOException {

        Socket socket = new Socket();

        // fluxo de entrada com arquivo
        InputStream fis = socket.getInputStream(); //System.in;   // new FileInputStream("felipe.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = socket.getOutputStream(); //System.in;  //  new FileOutputStream("felipe.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();

        }


        bw.close();
        br.close();
    }
}
