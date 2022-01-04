public class Colaborador extends Funcionario {
    public Colaborador(String nome, int numero) {
        super(nome, numero);
    }

    public void colaborar() {
        System.out.println("Eu sou o colaborador!");
    }
}
