package Readers;

import javax.swing.*;
import java.io.*;

public class Reader {


    public static void ReaderFile(String nome, File path){

        String linha= "";
        int contlinha =0;
        String retorno="";
        char flag=0;

        try {

            FileInputStream arquivo = new FileInputStream(path);
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);

            while (linha != null) {
                linha = br.readLine();
                contlinha++;

                if (nome.equals(linha)) {
                    flag=1;
                    System.out.println("\n======================================================================");
                    System.out.println("NOME ENCONTRADO!");
                    System.out.println("Nome: " + nome + "\nLinha: " +contlinha + "\nArquivo: " +path);
                    System.out.println("======================================================================\n");
                }
            }

            if (flag==0){
                retorno = "Nome não encontrado no arquivo: "+path;
                System.out.println(retorno);
            }

            br.close();
        }
        catch (Exception e){
            System.out.println("ARQUIVO NÃO ENCONTRADO!! ");
        }
    }
}
