package Model;

public class Banda {
    private int harmonia = 50;
    private int essencia = 0;
    private double grana = 0.0;

    public int getHarmonia() {
        return this.harmonia;
    }

    public int getEssencia() {
        return this.essencia;
    }

    public double getGrana() {
        return this.grana;
    }

    public void alterarHarmonia(int valor) {
        this.harmonia = this.harmonia + valor;
        if (this.harmonia > 100) {
            this.harmonia = 100;
        } else if (this.harmonia < 0) {
            this.harmonia = 0;
        }
    }

    public void alterarEssencia(int valor) {
        this.essencia = this.essencia + valor;
        if (this.essencia > 100) {
            this.essencia = 100;
        } else if (this.essencia < 0) {
            this.essencia = 0;
        }
    }

    public void adicionarGrana(double valor) {
        this.grana = this.grana + valor;
    }

    public boolean debitarGrana(double valor) {
        if (this.grana >= valor) {
            this.grana = this.grana - valor;
            return true;
        } else {
            return false;
        }
    }
}
