package br.com.felipe.java.io.teste;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String nome = "Felipe Rodrigues";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teste.bin"));
        oos.writeObject(nome);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teste.bin"));
        String meuNome = (String) ois.readObject();
        System.out.println(meuNome);
    }
}
