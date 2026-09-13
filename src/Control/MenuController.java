package Control;

import View.CenasView;
import View.MenuView;

public  class MenuController {
    private final PersonagemController controller;
    private final CenasController cenasController;

    public MenuController(PersonagemController controller,CenasController cenasController){

        this.controller=controller;
        this.cenasController=cenasController;
    }

    //Processa escolha
    public void processamentoOpcao(int opcao){
        switch(opcao){
            case 1->{
                CenasView.exibirPrologo();
                controller.criarPersonagem();
                cenasController.jogar();

            }
            case 2-> MenuView.exibeInstrucoes();
            case 3-> MenuView.exibeCredito();
            case 4-> MenuView.saida();
            default->System.out.println("Opção invalida!, escolha uma opção válida");
        }
    }
}
