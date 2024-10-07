package org.comparador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader arq1;
        BufferedReader arq2;

        long startTime = System.nanoTime();

        ArrayList<String> txt1 = new ArrayList<String>();
        ArrayList<String> txt2 = new ArrayList<String>();

        int ql=0;
        String line;
        String line2;

        arq1 = new BufferedReader(new FileReader("C:\\GIT\\PROJETOS\\comparador-txt\\src\\main\\java\\input\\a.txt"));
        arq2 = new BufferedReader(new FileReader("C:\\GIT\\PROJETOS\\comparador-txt\\src\\main\\java\\input\\b.txt"));

        while ((line = arq1.readLine()) != null) {
            txt1.add(line);
            ql++;
        }

        while ((line2 = arq2.readLine()) != null) {
            txt2.add(line2);
        }

        Collections.sort(txt2);
        Collections.sort(txt1);

        //Remove todas as linhas de txt1 que estão presentes em txt2 usando txt2.removeAll(txt1).
        txt2.removeAll(txt1);
        System.out.println("Resultado:");
        //Imprime o resultado das linhas que estão em txt2 e não em txt1.
        System.out.println(txt2);

        long stopTime = System.nanoTime();
        long executionTime = stopTime - startTime;

        System.out.println("------------------");
        System.out.println("Tempo de execuçao = " + executionTime/1000000000+" segundos");
        System.out.println("Quantidade de linhas em a.txt = " + ql);
    }

}
