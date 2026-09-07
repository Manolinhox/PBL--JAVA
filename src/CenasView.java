import java.util.Scanner;

public class CenasView {
    private Scanner entrada = new Scanner(System.in);

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
}
