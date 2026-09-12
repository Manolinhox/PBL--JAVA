package Model;

public class PersonagemPrincipal {
    String nome = "Toin";
    private int carismaDeBotequim = 0;
    private int sambaNoPe = 0;
    private int ouvidoAbsoluto = 0;

    //SETTERS
    //set carisma
    public void setCarisma(int carismaDeBotequim) {

        this.carismaDeBotequim = carismaDeBotequim;
    }

    //set sambaNoPE
    public void setSamba(int sambaNoPe){

        this.sambaNoPe = sambaNoPe;
    }

    public void setOuvido(int ouvidoAbsoluto){

        this.ouvidoAbsoluto = ouvidoAbsoluto;
    }

    //GETTERS
    //get carisma
    public int getCarisma(){
        return this.carismaDeBotequim;
    }

    public int getSamba(){

        return this.sambaNoPe;
    }

    public int getOuvido(){
        return this.ouvidoAbsoluto;
    }
}