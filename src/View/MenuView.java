package View;

import Control.MenuController;

import java.util.Scanner;
public class MenuView {
    public void iniciar(MenuController menuController) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        //exibe opçoes do menu
        do {
            System.out.println("O SHOW TEM DE CONTINUAR");
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
        System.out.println("Thiago Marques Reis");
    }
    public static void exibeInstrucoes(){
        System.out.println("Seja bem-vindo a O Próximo Acorde! Neste RPG narrativo, cada decisão sua moldará o destino de Toin e a trajetória da sua banda rumo ao grande festival de pagode.\n " +
                "O jogo é guiado por três pilares centrais: a Harmonia, que representa a saúde e a união do grupo (se ela chegar a zero, é Game Over);\n " +
                "a Essência, que mede o quanto o seu som se mantém fiel às raízes do pagode tradicional ou se rende ao mercado pop comercial;\n " +
                "e os seus Relacionamentos com os integrantes, que podem liberar caminhos únicos ou provocar deserções se forem negligenciados.\n " +
                "Além disso, as habilidades que você escolheu no início do jogo — como sua lábia, sua presença de palco e sua técnica no cavaquinho — \n" +
                "serão testadas automaticamente durante as apresentações e conflitos da história. Administre bem a sua Grana para não cair nas garras de agiotas \n" +
                " e pense com cuidado antes de cada escolha: a fama e o respeito da comunidade dependem da sua capacidade de equilibrar a razão, o coração e o samba no pé!\n");
    }
    public static void saida(){
        System.out.println("Jogo encerrado!");
    }

}
