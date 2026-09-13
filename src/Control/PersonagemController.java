package Control;

import View.CenasView;
import Model.PersonagemPrincipal;

public class PersonagemController {
    private PersonagemPrincipal personagem;
    private CenasView view;

    public PersonagemController(PersonagemPrincipal personagem, CenasView view) {
        this.personagem = personagem;
        this.view = view;
    }

    public void criarPersonagem () {
        int carisma;
        int samba;
        int ouvido;
        int soma;

        do {
            view.exibirCabecalhoEdicao();
            view.exibirAvisoRegraPontos();

            carisma = view.pedirAtributo ("Carisma de Botequim");
            samba = view.pedirAtributo ("Samba no Pé");
            ouvido = view.pedirAtributo ("Ouvido Absoluto");

            soma = carisma + samba + ouvido;

            if (soma != 120) {
                view.exibirErroSomaPontos (soma);
            }
            else if (carisma > 100 || samba > 100 || ouvido > 100 || carisma < 0 || samba < 0 || ouvido < 0) {
                view.exibirErroLimitePontos ();
                soma = 0;
            }

        } while (soma != 120);

            personagem.setCarisma (carisma);
            personagem.setSamba (samba);
            personagem.setOuvido (ouvido);

            view.exibirSucessoCriacao ();
        }
}
