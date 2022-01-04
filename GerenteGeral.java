public class GerenteGeral extends Funcionario implements Gerente {
    public GerenteGeral(String nome, int numero) {
        super(nome, numero);
    }

    @Override
    public void gerenciar() {
        System.out.println("Vamos! Trabalhem mais!");
    }

    public static void main(String[] args) {
        GerenteGeral gerenteGeral = new GerenteGeral("a",2);
        System.out.println(gerenteGeral.getEstado());
    }
}
