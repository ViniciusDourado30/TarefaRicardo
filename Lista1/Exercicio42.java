public class Contato {
    String nome;
    String telefone;
    String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Telefone: " + this.telefone + " | Email: " + this.email;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaDeContatos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Contato> listaContatos = new ArrayList<>();
        final int MAX_CONTATOS = 10;

        while (true) {
            System.out.println("\n--- Agenda de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Procurar Contato por Nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    if (listaContatos.size() >= MAX_CONTATOS) {
                        System.out.println("A agenda está cheia! Não é possível adicionar mais contatos.");
                        break;
                    }
                    System.out.print("Digite o nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = leitor.nextLine();
                    System.out.print("Digite o email: ");
                    String email = leitor.nextLine();

                    Contato novoContato = new Contato(nome, telefone, email);
                    listaContatos.add(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Contatos Salvos ---");
                    if (listaContatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        for (Contato c : listaContatos) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato que deseja procurar: ");
                    String nomeBusca = leitor.nextLine();
                    boolean contatoEncontrado = false;
                    for (Contato c : listaContatos) {
                        if (c.nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.println("\n--- Contato Encontrado ---");
                            System.out.println("Nome: " + c.nome);
                            System.out.println("Telefone: " + c.telefone);
                            System.out.println("Email: " + c.email);
                            contatoEncontrado = true;
                            break;
                        }
                    }
                    if (!contatoEncontrado) {
                        System.out.println("Contato com o nome '" + nomeBusca + "' não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo da agenda...");
                    leitor.close();
                    return;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }
    }
}