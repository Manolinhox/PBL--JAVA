package View;
import Model.Cena;
import Model.Escolha;
import java.util.List;
import java.util.Scanner;


public class CenasView {


    private Scanner entrada = new Scanner(System.in);

    public void exibirCena(Cena cena) {
        System.out.println("\n" + cena.getTexto());
        List<Escolha> escolhas = cena.getEscolhas();
        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println((i + 1) + " - " + escolhas.get(i).getTexto());
        }
    }

    public int pedirEscolha(int max) {
        int opcao;
        do {
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
        } while (opcao < 1 || opcao >    max);
        return opcao;
    }

    public static void exibirPrologo() {
        System.out.println("A vida em Feira de Santana pesava nos ombros de Toin. " +
                "Preso à rotina de um mercado local, ele recebia apenas o básico para " +
                "sobreviver. Seu refúgio era o quarto apertado, onde dedilhava o cavaquinho " +
                "até os dedos doerem, sonhando com grandes palcos. A responsabilidade das contas o acorrentava, até que o " +
                "destino cruzou seu caminho: um cartaz iluminado anunciava o Grande Concurso Musical no Rio de Janeiro - RJ, com um prêmio de R$ 10.000" +
                " e a gravação de um álbum. Com os olhos brilhando, ele sussurrou para si mesmo: \"É a minha chance!\". Juntou suas economias suadas, " +
                "enfiou algumas roupas numa mala e pegou o primeiro ônibus para a Cidade Maravilhosa. Ao pisar no asfalto quente do " +
                "Rio, a ficha caiu: ninguém faz pagode sozinho. Ele precisava de uma banda.\n");
    }

    public void exibirCabecalhoEdicao() {
        System.out.println("Distribua os pontos para os atributos de Toin:\n");
    }

    public int pedirAtributo(String nomeAtributo) {
        System.out.println(nomeAtributo + ":");
        return entrada.nextInt();
    }

    public void exibirAvisoRegraPontos() {
        System.out.println("Aviso - A soma dos 3 atributos deve ser de 120 pontos.");
        System.out.println("Aviso - Nenhum atributo pode ser menor que 0 ou maior que 100.\n");
    }

    public void exibirErroSomaPontos(int soma) {
        System.out.println("\n Aviso - Você distribuiu " + soma + " pontos. O total deve ser 120. Tente novamente!\n");
    }

    public void exibirErroLimitePontos() {
        System.out.println("\n Aviso - Os atributos vão de 0 a 100. Tente novamente!\n");
    }

    public void exibirSucessoCriacao() {
        System.out.println("\n Personagem criado com sucesso! Sua jornada vai começar...\n");
    }
}
