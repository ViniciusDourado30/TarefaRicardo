public class Funcionario {
    String nome;
    int id;
    double salario;
    String departamento;

    public Funcionario(String nome, int id, double salario, String departamento) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Depto: " + departamento + " | Salário: R$" + String.format("%.2f", salario);
    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class GerenciadorFuncionarios {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        int proximoId = 1;
        
        while (true) {
            System.out.println("\n--- Menu de Gerenciamento ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Calcular Salário por Departamento");
            System.out.println("3. Listar Todos os Funcionários");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do funcionário: ");
                    String nome = leitor.nextLine();
                    System.out.print("Departamento: ");
                    String depto = leitor.nextLine();
                    System.out.print("Salário: ");
                    double salario = leitor.nextDouble();
                    
                    Funcionario novoFuncionario = new Funcionario(nome, proximoId++, salario, depto);
                    listaFuncionarios.add(novoFuncionario);
                    
                    System.out.println("Funcionário cadastrado com sucesso! ID: " + novoFuncionario.id);
                    break;

                case 2:
                    System.out.print("Digite o nome do departamento para somar os salários: ");
                    String deptoBusca = leitor.nextLine();
                    double totalSalarios = 0;
                    
                    for (Funcionario func : listaFuncionarios) {
                        if (func.departamento.equalsIgnoreCase(deptoBusca)) {
                            totalSalarios += func.salario;
                        }
                    }
                    
                    System.out.printf("O total de salários para o departamento '%s' é: R$%.2f\n", deptoBusca, totalSalarios);
                    break;

                case 3:
                    System.out.println("\n--- Lista de Todos os Funcionários ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado ainda.");
                    } else {
                        for (Funcionario func : listaFuncionarios) {
                            System.out.println(func);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    leitor.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}