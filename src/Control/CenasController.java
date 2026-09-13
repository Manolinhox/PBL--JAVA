package Control;

import Model.*;
import View.CenasView;

public class CenasController {
    private final RepositorioCenas repositorio;
    private final CenasView view;
    private final IntegracaoJogo jogo;

    private CenasIds atual = CenasIds.INICIOBAR;

    public CenasController(RepositorioCenas repositorio, CenasView view, IntegracaoJogo jogo) {
        this.repositorio = repositorio;
        this.view = view;
        this.jogo = jogo;
    }
    public void jogar() {
        while (true) {
            Cena cena = repositorio.buscar(atual);
            view.exibirCena(cena);

            if (cena.eFim()) {
                break;
            }

            if (cena.getEscolhas().isEmpty()) {
                atual = cena.destinoPadrao;
                continue;
            }

            int opcao = view.pedirEscolha(cena.getEscolhas().size());
            Escolha escolhida = cena.getEscolhas().get(opcao - 1);

            escolhida.aplicarEfeito(jogo);
            atual = escolhida.getDestino();
        }
    }
}
