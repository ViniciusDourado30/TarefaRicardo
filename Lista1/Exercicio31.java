public class Numero {

    int valor;

    public void imprimirValor() {
        System.out.println("-> O valor do atributo é: " + this.valor);
    }

    public static void main(String[] args) {

        Numero meuNumero = new Numero();
        
        System.out.println("Objeto 'meuNumero' criado.");
        System.out.println("Identificador do objeto (hash code): " + System.identityHashCode(meuNumero));

        System.out.println("\nAtribuindo o valor 150 ao atributo...");
        meuNumero.valor = 150;

        System.out.println("Chamando o método do objeto...");
        meuNumero.imprimirValor();
        
        System.out.println("\nFinalizado.");
    }
}