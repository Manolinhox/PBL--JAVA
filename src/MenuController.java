public  class MenuController {
    private PersonagemController controller;

    public MenuController(PersonagemController controller){
        this.controller=controller;
    }

    //Processa escolha
    public void processamentoOpcao(int opcao){
        switch(opcao){
            case 1->{
                CenasView.exibirPrologo();
                controller.criarPersonagem();
            }
            case 2->MenuView.exibeInstrucoes();
            case 3->MenuView.exibeCredito();
            case 4->MenuView.saida();
            default->System.out.println("Opção invalida!, escolha uma opção válida");
        }
    }
}
