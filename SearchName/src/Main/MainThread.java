package Main;

import Readers.Reader;
import javax.swing.*;
import java.io.File;

public class MainThread extends Reader {

    private static String nomebusca;

    public static void main(String[] args) {

        //Abrindo caixa de dialog para o usuário informar o nome que deseja buscar
        nomebusca = JOptionPane.showInputDialog("Qual nome você deseja buscar? ");

        //Verificando se foi inserido algum dado ou clicou em cancelar, se sim não consultar nos arquivos.
        if (nomebusca == null || nomebusca.equals("") ){
            System.out.println("\nPrograma Encerrado");
            System.exit(0);
        }
        else {
            //Inicia as threads para começar a leitura dos arquivos
            new Thread(p1).start(); new Thread(g1).start();
            new Thread(p2).start(); new Thread(g2).start();
            new Thread(p3).start(); new Thread(g3).start();
            new Thread(p4).start(); new Thread(g4).start();
            new Thread(p5).start(); new Thread(g5).start();
            new Thread(g6).start(); new Thread(g7).start();
        }
    }

    //Criando as interface Runnable e chando a função para leitura de arquivo para cada interface.
    public static Runnable p1 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_p\\arq_1.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable p2 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_p\\arq_2.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable p3 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_p\\arq_3.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable p4 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_p\\arq_4.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable p5 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_p\\arq_5.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable g1 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a1.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable g2 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a2.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable g3 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a3.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable g4 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a4.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable g5 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a5.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable g6 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a6.txt");
            ReaderFile(nomebusca,path);
        }
    };

    public static Runnable g7 = new Runnable() {
        @Override
        public void run() {
            File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a7.txt");
            ReaderFile(nomebusca,path);
        }
    };



}
