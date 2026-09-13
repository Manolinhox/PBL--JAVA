package Model;

public class PersonagemSecundario {

    private String nome;
    private String tipoRelacionamento;
    private int nivelRelacionamento = 40;

    public PersonagemSecundario (String nome, String tipoRelacionamento) {
        this.nome = nome;
        this.tipoRelacionamento = tipoRelacionamento;
    }

    public String getNome () {
        return this.nome;
    }

    public String getTipoRelacionamento () {
        return this.tipoRelacionamento;
    }

    public int getNivelRelacionamento () {
        return this.nivelRelacionamento;
    }

    public void atualizarRelacionamento (int valor) {
        this.nivelRelacionamento = this.nivelRelacionamento + valor;

        if (this.nivelRelacionamento > 100) {
            this.nivelRelacionamento = 100;
        }
        else if (this.nivelRelacionamento < 0) {
            this.nivelRelacionamento = 0;
        }
    }
}
