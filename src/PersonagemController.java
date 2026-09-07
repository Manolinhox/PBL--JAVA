public class PersonagemController {
    private PersonagemPrincipal personagem;
    private CenasView view;

    public PersonagemController(PersonagemPrincipal personagem, CenasView view) {
        this.personagem = personagem;
        this.view = view;
    }

    public void criarPersonagem() {
        view.exibirCabecalhoEdicao();

        int carisma = view.pedirAtributo("Carisma de botequim");
        personagem.setCarisma(carisma);

        int samba = view.pedirAtributo("Samba no pé");
        personagem.setSamba(samba);

        int ouvido = view.pedirAtributo("Ouvido Absoluto");
        personagem.setOuvido(ouvido);
    }
}
