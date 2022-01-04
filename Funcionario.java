enum Estado {
    CONTRATADO,
    DEMITIDO
}

public abstract class Funcionario {
    private String nome;
    private int numero;
    private Estado estado = Estado.CONTRATADO;

    public Funcionario(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void demitir() {
        this.estado = Estado.DEMITIDO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", estado=" + estado +
                '}';
    }
}
