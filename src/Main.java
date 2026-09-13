import Control.CenasController;
import Control.MenuController;
import Control.PersonagemController;
import Model.IntegracaoJogo;
import Model.RepositorioCenas;
import View.CenasView;
import View.MenuView;

public class Main{
    public static void main(String[] args){
        //Instancia de Model e da views controller necessarias
        IntegracaoJogo jogo = new IntegracaoJogo();
        CenasView c1 = new CenasView();
        PersonagemController personagemController = new PersonagemController(jogo.getProtagonista(), c1);

        //passa a instancia para repositorio e cena controller
        RepositorioCenas repositorio = new RepositorioCenas();
        CenasController cenasController = new CenasController(repositorio, c1, jogo);

        //passa a intancia de menucontroller para menu controller
        MenuController menuController = new MenuController(personagemController,cenasController);




        //incia o menu
        MenuView menuView = new MenuView();
        menuView.iniciar(menuController);



}
}