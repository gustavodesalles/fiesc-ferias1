public class GerenteDep extends Funcionario implements Gerente {
    public GerenteDep(String nome, int numero) {
        super(nome, numero);
    }

    @Override
    public void gerenciar() {
        System.out.println("Vamos! Trabalhem mais (dentro de meu departamento)!");
    }
}
