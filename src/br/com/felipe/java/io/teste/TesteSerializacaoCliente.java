package br.com.felipe.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setCpf("32313131");
        cliente.setNome("Nome qualquer");
        cliente.setProfissao("dev");

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente1 = (Cliente) ois.readObject();
        System.out.println(cliente1.getNome());
    }
}
