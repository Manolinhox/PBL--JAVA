package Model;

public class IntegracaoJogo {

        private PersonagemPrincipal protagonista = new PersonagemPrincipal();
        private Banda banda = new Banda();
        private Inventario inventario = new Inventario();

        private PersonagemSecundario jorge = new PersonagemSecundario("Jorge", "Confiança");
        private PersonagemSecundario manuela = new PersonagemSecundario("Manuela", "Afinidade");
        private PersonagemSecundario betinho = new PersonagemSecundario("Betinho", "Amizade");

        public PersonagemPrincipal getProtagonista () {
            return protagonista;
        }

        public Banda getBanda () {
            return banda;
        }

        public Inventario getInventario () {
            return inventario;
        }

        public PersonagemSecundario getJorge () {
            return jorge;
        }

        public PersonagemSecundario getManuela () {
            return manuela;
        }

        public PersonagemSecundario getBetinho () {
            return betinho;
        }
}
