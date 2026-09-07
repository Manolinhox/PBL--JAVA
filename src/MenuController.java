public  class MenuController {
    //Processa escolha do menu
    public static void processamentoOpcao(int opcao){
        switch(opcao){
            case 1->CenasView.exibirPrologo();
            case 2->MenuView.exibeInstrucoes();
            case 3->MenuView.exibeCredito();
            case 4->MenuView.saida();
            default->System.out.println("Opção invalida!, escolha uma opção válida");
        }
    }
}
