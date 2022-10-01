package Main;

import Readers.Reader;
import javax.swing.*;
import java.io.File;

public class Main  extends Reader {

    private static String nomebusca;

    /*

    PCFOULDER1  "E:\\dev\\SearchName\\SearchName\\src\\dataset_p\\arq_"+i+".txt"
    PCFOULDER2  "E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a"+j+".txt"
    NTFOULDER1  "E:\\dev\\SearchName\\SearchName\\src\\dataset_p\\arq_"+i+".txt"
    NTFOULDER2  "E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a"+j+".txt"

     */

    public static void main(String[] args) {

        //Abrindo caixa de dialog para o usuário informar o nome que deseja buscar
        nomebusca = JOptionPane.showInputDialog("Qual nome você deseja buscar? ");

        //Verificando se foi inserido algum dado ou clicou em cancelar, se sim não consultar nos arquivos.
        if (nomebusca == null || nomebusca.equals("") ){
            System.out.println("\nPrograma Encerrado");
            System.exit(0);
        }
        else {
            //pega o tempo de quando iniciou a busca
            long start = System.currentTimeMillis();

            //Fica no loop lendo todos os 5 arquivos da pasta dataset_p um de cada vez
            for (int i=1; i<=5;i++){
                File path = new File("E:\\dev\\SearchName\\SearchName\\src\\dataset_p\\arq_"+i+".txt");
                ReaderFile(nomebusca,path);
            }
            //Fica no loop lendo todos os 7 arquivos da pasta dataset_g um de cada vez
            for (int j=1; j<=7;j++ ){
                File path = new File ("E:\\dev\\SearchName\\SearchName\\src\\dataset_g\\a"+j+".txt");
                ReaderFile(nomebusca,path);
            }

            //pega o tempo de quando finalizou a busca
            long finish = System.currentTimeMillis();
            long total = (finish-start);

            //printa o tempo...
            System.out.println("\n======================================================================");
            System.out.println("FIM DA PESQUISA!");
            System.out.println("Duração da pesquisa nos arquivos: "+total+"ms");
            System.out.println("======================================================================\n");
        }
    }
}
