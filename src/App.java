import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        Stack<Object> stackLivros = new Stack<>();
        Programa1 teste = new Programa1();
        Programa2 teste2 = new Programa2();
        Pilha<String> pilhaLivros = new Pilha<>(20);

        System.out.println("------>Exercício 01<------");

            teste.empilhaPar(8);
            teste.empilhaPar(74);
            teste.empilhaPar(6);
            teste.empilhaPar(34);
            teste.empilhaPar(842);
            teste.empilhaPar(15);
            teste.empilhaPar(11);
            teste.empilhaPar(94);

            System.out.println("Empilhados: " + teste);
            System.out.println("Desempilhados: " + teste);

            teste.empilhaPar(8);
            teste.empilhaPar(74);
            teste.empilhaPar(6);
            teste.empilhaPar(34);
            teste.empilhaPar(842);
            teste.empilhaPar(15);
            teste.empilhaPar(11);
            teste.empilhaPar(94);

            System.out.println("Empilhados: " + teste);
            System.out.println("Desempilhados: " + teste);
            System.out.println("Desempilhados: " + teste);

        System.out.println("------>Exercício 02<------");

            teste2.empilhaParOuImpar(5);
            teste2.empilhaParOuImpar(4);
            teste2.empilhaParOuImpar(8);
            teste2.empilhaParOuImpar(0);
            teste2.empilhaParOuImpar(7); 
            teste2.empilhaParOuImpar(2);
            teste2.empilhaParOuImpar(3);
            teste2.empilhaParOuImpar(6);

            System.out.println(teste2);
            System.out.println("\n"+teste2);

            teste2.empilhaParOuImpar(5);
            teste2.empilhaParOuImpar(4);
            teste2.empilhaParOuImpar(8);
            teste2.empilhaParOuImpar(0);
            teste2.empilhaParOuImpar(7); 
            teste2.empilhaParOuImpar(2);
            teste2.empilhaParOuImpar(3);
            teste2.empilhaParOuImpar(6);

            System.out.println(teste2);
            System.out.println("\n"+teste2);

        System.out.println("------>Exercício 03<------");

            Livro livro1 = new Livro("Iludidos pelo acaso", 151541, "28/11/2019", " Nassim Nicholas Taleb");
            Livro livro2 = new Livro("Rápido e devagar", 511413, "24/07/2012", "Daniel Kahneman");
            Livro livro3 = new Livro("Mindset", 938371, "24/01/2017", "Carol S. Dweck");
            Livro livro4 = new Livro("A Sutil Arte de Ligar o F*da-Se", 134520, "06/11/2017", "Mark Manson");
            Livro livro5 = new Livro("Por Trás de Seus Olhos", 901123, "11/08/2017", "Sarah Pinborough");
            Livro livro6 = new Livro("A vida não me assusta", 648462, "13/06/2018", "Maya Angelou");

            System.out.println("Verificar se pilha esta vazia: "+ pilhaLivros.estaVazia()+"\n");

            pilhaLivros.empilha(livro1);
            pilhaLivros.empilha(livro2);
            pilhaLivros.empilha(livro3);
            pilhaLivros.empilha(livro4);
            pilhaLivros.empilha(livro5);
            pilhaLivros.empilha(livro6);

            System.out.println(pilhaLivros);
            System.out.println("\nTamanho da pilha: "+ pilhaLivros.tamanho()+ "\n");

            pilhaLivros.desempilha();

            System.out.println(pilhaLivros);

            System.out.println("\nTamanho da pilha: "+ pilhaLivros.tamanho());

            System.out.println("Verificar se pilha esta vazia: "+ pilhaLivros.estaVazia());

        System.out.println("------>Exercício 04<------");

            System.out.println("Verificar se pilha esta vazia: "+ stackLivros.isEmpty()+"\n");

            stackLivros.push(livro1);
            stackLivros.push(livro2);
            stackLivros.push(livro3);
            stackLivros.push(livro4);
            stackLivros.push(livro5);
            stackLivros.push(livro6);

            System.out.println(stackLivros);
            System.out.println("\nTamanho da pilha: "+ stackLivros.size()+ "\n");

            stackLivros.pop();

            System.out.println(stackLivros);

            System.out.println("\nTamanho da pilha: "+ stackLivros.size());

            System.out.println("Verificar se pilha esta vazia: "+ stackLivros.isEmpty());
    }


}