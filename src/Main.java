import Control.MenuController;
import Control.PersonagemController;
import Model.PersonagemPrincipal;
import View.CenasView;
import View.MenuView;

public class Main{
    public static void main(String[] args){
        //Instancia de Model e da views controller necessarias
        PersonagemPrincipal p1 = new PersonagemPrincipal();
        CenasView c1 = new CenasView();
        PersonagemController personagemController = new PersonagemController(p1, c1);

        //passa a intancia de ppcontroller para menu controller
        MenuController menuController = new MenuController(personagemController);

        //incia o menu
        MenuView menuView = new MenuView();
        menuView.iniciar(menuController);



}
}