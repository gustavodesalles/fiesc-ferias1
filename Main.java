import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static int idTrabalhadores = 0;

    public static void addFuncionario() {
        scanner.nextLine();
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu cargo: \n1 - Gerente geral\n2 - Gerente de departamento\n3 - Líder técnico\n4 - Colaborador");
        int escolha = scanner.nextInt();
        while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {
            System.out.print("Número inválido. Tente novamente: ");
            escolha = scanner.nextInt();
        }

        idTrabalhadores++;
        int numero = idTrabalhadores;

        switch (escolha) {
            case 1:
                GerenteGeral gerenteGeral = new GerenteGeral(nome, numero);
                funcionarios.add(gerenteGeral);
                break;

            case 2:
                GerenteDep gerenteDep = new GerenteDep(nome, numero);
                funcionarios.add(gerenteDep);
                break;

            case 3:
                LiderTecnico liderTecnico = new LiderTecnico(nome, numero);
                funcionarios.add(liderTecnico);
                break;

            case 4:
                Colaborador colaborador = new Colaborador(nome, numero);
                funcionarios.add(colaborador);
                break;
        }
        System.out.println("Você é o número "+numero+".");
    }

    public static Funcionario obterFuncionario(int numero) {
        if (!funcionarios.isEmpty()) {
            for (Funcionario i : funcionarios) {
                if (numero == i.getNumero()) return i;
            }
        }
        return null;
    }
    public static void listar(String nomeEstado) {
        for (Funcionario i : funcionarios) {
            if (String.valueOf(i.getEstado()).equals(nomeEstado)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int numero;
        Funcionario funcionario;

        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Adicionar funcionário");
        System.out.println("2 - Ver detalhes do funcionário");
        System.out.println("3 - Demitir funcionário");
        System.out.println("4 - Atualizar informações do funcionário");
        System.out.println("5 - Listar funcionários");
        System.out.println("6 - Listar funcionários trabalhando");
        System.out.println("7 - Listar funcionários demitidos");
        System.out.println("8 - Sair");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                addFuncionario();
                main(null);
                break;
            case 2:
                System.out.println("Digite o número do funcionário: ");
                numero = scanner.nextInt();
                funcionario = obterFuncionario(numero);

                if (funcionario == null) {
                    System.out.println("Funcionário não encontrado.");
                    main(null);
                    break;
                }

                System.out.println(funcionario);
                main(null);
                break;
            case 3:
                System.out.println("Digite o número do funcionário: ");
                numero = scanner.nextInt();
                funcionario = obterFuncionario(numero);

                if (funcionario == null) {
                    System.out.println("Funcionário não encontrado.");
                    main(null);
                    break;
                }

                funcionario.setEstado(Estado.DEMITIDO);
                main(null);
                break;
            case 4:
                System.out.println("Digite o número do funcionário: ");
                numero = scanner.nextInt();
                funcionario = obterFuncionario(numero);

                if (funcionario == null) {
                    System.out.println("Funcionário não encontrado.");
                    main(null);
                    break;
                }

                System.out.println("Digite o novo nome do funcionário: ");
                String novoNome = scanner.next();
                funcionario.setNome(novoNome);
                main(null);
                break;
            case 5:
                for (Funcionario i : funcionarios) {
                    System.out.println(i);
                }
                main(null);
                break;
            case 6:
                listar("CONTRATADO");
                main(null);
                break;
            case 7:
                listar("DEMITIDO");
                main(null);
                break;
            default:
                System.out.println("Até mais!");
        }
    }
}
