public class LiderTecnico extends Funcionario {
    public LiderTecnico(String nome, int numero) {
        super(nome, numero);
    }

    public void trabalhar() {
        System.out.println("Estou trabalhando.");
    }
}
