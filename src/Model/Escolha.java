package Model;

import java.util.function.Consumer;

public class Escolha {
    private final String texto;
    private final CenasIds destino;
    private final Consumer<IntegracaoJogo> efeito;

    public Escolha(String texto,CenasIds destino){
        /*construtor  de segurança:para que caso a escolha nao tenha efeito ela seja inicializada
        como null sem precisar passar como parametro*/
        this(texto,destino,null);
    }
    public Escolha(String texto,CenasIds destino,Consumer<IntegracaoJogo> efeito){
        /*Construtor real:icializa todos os parametros*/
        this.texto=texto;
        this.destino=destino;
        this.efeito=efeito;
    }

    public String getTexto() {
        return texto;
    }

    public CenasIds getDestino() {

        return destino;
    }


    //aplica o efeito colocado no campo
    public void aplicarEfeito(IntegracaoJogo jogo){
        if(efeito!=null){
            efeito.accept(jogo);
        }
    }
}
