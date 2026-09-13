package Model;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class RepositorioCenas {
    private Map<CenasIds, Cena> cenas = new EnumMap<>(CenasIds.class);

    private void registrar(Cena cena) {
        cenas.put(cena.getId(), cena);
    }

    public RepositorioCenas() {
        registrar(new Cena(CenasIds.INICIOBAR,
                  "Chove lá fora e o letreiro neon pisca falho\n" +
                        "A exaustiva viagem de ônibus de Feira de Santana até o Rio de Janeiro cobra seu preço, mas Toin desembarca \n" +
                        "abraçado ao cavaquinho e à esperança do Grande Concurso Musical. No Bar da Dona Gertrudes, enquanto dedilha para afastar a ansiedade, \n" +
                        "ele atrai o olhar de Betinho, um produtor falido e mediano no pandeiro. Betinho propõe formarem um grupo.\n",
                CenasIds.FIMBAR));

        registrar(new Cena(CenasIds.FIMBAR,
                "Betinho: Baiano, tu tem o dom! Eu conheço os becos desse Rio de Janeiro. Se a gente montar um grupo pro Concurso,\n" +
                        " eu arrumo os contatos e tu entra com o talento. \n",
                CenasIds.ESCOLHABAR));

        Escolha pagodeRaiz = new Escolha("O Pagode Raiz, aquele que toca na alma da comunidade.", CenasIds.INICICIOCAP2, j -> {
            j.getBanda().alterarEssencia(20);
            j.getJorge().atualizarRelacionamento(10);
        });

        Escolha dinheiro = new Escolha("O que der dinheiro. Quero sair do aluguel.", CenasIds.INICICIOCAP2, j -> {
            j.getBanda().alterarEssencia(-20);
            j.getManuela().atualizarRelacionamento(10);
        });

        List<Escolha> escolhasBar = List.of(pagodeRaiz, dinheiro);
        registrar(new Cena(CenasIds.ESCOLHABAR, "Qual vai ser o nosso foco?", escolhasBar));
    }

    public Cena buscar(CenasIds id) {
        Cena c = cenas.get(id);
        if (c == null) throw new IllegalStateException("Cena não encontrada: " + id);
        return c;
    }
}