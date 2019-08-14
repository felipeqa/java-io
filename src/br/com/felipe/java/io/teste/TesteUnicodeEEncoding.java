package br.com.felipe.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bites = s.getBytes("windows-1252");
        System.out.println(bites.length + " windows-1252 ");
        String s2 = new String(bites, "windows-1252");
        System.out.println("String " + s2 );

        bites = s.getBytes("UTF-16");
        System.out.println(bites.length + " UTF-16 ");
        s2 = new String(bites, "UTF-16");
        System.out.println("String " + s2 );

        bites = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bites.length + " US_ASCII ");
        s2 = new String(bites, StandardCharsets.US_ASCII);
        System.out.println("String " + s2 );
    }
}
