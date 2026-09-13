package Model;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class RepositorioCenas {
    //Cria o Map para armazenar cenas
    private Map<CenasIds,Cena> cenas =new EnumMap<>(CenasIds.class);

    //Cria o metodo construtor para cenas
    private void registrar(Cena cena){
        cenas.put(cena.getId(),cena);
    }

    //Cenas do jogo que serão armamzenadas
    public RepositorioCenas(){
        registrar(new Cena(CenasIds.INICIOBAR,"Chove lá fora e o letreiro neon pisca falho\n " +
                "A exaustiva viagem de ônibus de Feira de Santana até o Rio de Janeiro cobra seu preço, mas Toin desembarca \n" +
                "abraçado ao cavaquinho e à esperança do Grande Concurso Musical. No Bar da Dona Gertrudes, enquanto dedilha para afastar a ansiedade, \n" +
                "ele atrai o olhar de Betinho, um produtor falido e mediano no pandeiro. Betinho propõe formarem um grupo.\n",List.of()));

        registrar(new Cena(CenasIds.FIMBAR,"Betinho: Baiano, tu tem o dom! Eu conheço os becos desse Rio de Janeiro. Se a gente montar um grupo pro Concurso,\n" +
                " eu arrumo os contatos e tu entra com o talento. \n",List.of()));

        //Falta parte de thigas para concluirn so alterar logica para adicionar pontos no relacionamento e atributo da banda
        Escolha PagodeRaiz("O Pagode Raiz, aquele que toca na alma da comunidade",CenasIds.INICICIOCAP2,/*p->*/);
        Escolha Dinheiro("O que der dinheiro. Quero sair do aluguel",CenasIds.INICICIOCAP2,/*p->*/);

        //coloca as ecolha em uma lista
        List<Escolha>escolha=List.of(PagodeRaiz,Dinheiro);

        //passa os argumentos e a lista de escolha para cenas
        registrar(new Cena(CenasIds.ESCOLHABAR),"Qual vai ser o nosso foco?",escolha);

    }

        public Cena buscar(CenasIds id) {
            Cena c = cenas.get(id);
            if (c == null) throw new IllegalStateException("Cena não encontrada: " + id);
            return c;


}
