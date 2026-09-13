package Control;

import Model.*;
import View.CenasView;

public class CenasController {
    private final RepositorioCenas repositorio;
    private final CenasView view;
    private final PersonagemPrincipal personagem;

    private CenasIds atual = CenasIds.INICIOBAR;

    public CenasController(RepositorioCenas repositorio, CenasView view, PersonagemPrincipal personagem) {
        this.repositorio = repositorio;
        this.view = view;
        this.personagem = personagem;
    }
    public void jogar() {
        while (true) {
            Cena cena = repositorio.buscar(atual);
            view.exibirCena(cena);

            if (cena.eFim()) break;

            int opcao = view.pedirEscolha(cena.getEscolhas().size());
            Escolha escolhida = cena.getEscolhas().get(opcao - 1);
            escolhida.aplicarEfeito(personagem);

            atual = escolhida.getDestino();
        }
    }
}
