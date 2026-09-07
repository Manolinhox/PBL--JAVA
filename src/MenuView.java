import java.util.Scanner;
public class MenuView {
    public void iniciar(MenuController menuController) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        //exibe opçoes do menu
        do {
            System.out.println("----Menu-----");
            System.out.println("1-Nova partida");
            System.out.println("2-Instruções");
            System.out.println("3-Créditos");
            System.out.println("4-Saída");
            opcao = entrada.nextInt();
            menuController.processamentoOpcao(opcao);

        } while (opcao != 4);
    }

    public static void exibeCredito(){
        System.out.println("-------Creditos-------\n");
        System.out.println("Felipe Vieira Aquino\n");
        System.out.println("Thiago");
    }
    public static void exibeInstrucoes(){
        System.out.println("instruçoes....");
    }
    public static void saida(){
        System.out.println("Jogo encerrado!");
    }

}
