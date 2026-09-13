package Model;
import java.util.List;

public class Cena {
    public final CenasIds id;
    public final String texto;
    public final List<Escolha> escolhas;
    public final boolean fim;
    public final CenasIds destinoPadrao;

    //contrutor para cena comum
    public Cena(CenasIds id, String texto, List<Escolha> escolhas) {
        this(id, texto, escolhas, false);
    }

   //Construtor para cena de passagem automática (sem escolhas interativas)
    public Cena(CenasIds id, String texto, CenasIds destinoPadrao) {
        this(id, texto, List.of(), false, destinoPadrao);
    }

    public Cena(CenasIds id, String texto, List<Escolha> escolhas, boolean fim) {
        this.id = id;
        this.texto = texto;
        this.escolhas = escolhas;
        this.fim = fim;
    }

    public CenasIds getId() {
        return id;
    }
    public String getTexto() {
        return texto;
    }
    public List<Escolha> getEscolhas() {
        return escolhas;
    }
    public boolean eFim() {
        return fim;
    }
}
