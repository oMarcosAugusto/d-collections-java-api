package main.java.list.Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacacaoPessoa ordenacacaoPessoa = new OrdenacacaoPessoa();

        ordenacacaoPessoa.adicionarPessoa("Nome 1", 4, 1.40);
        ordenacacaoPessoa.adicionarPessoa("Nome 2", 2, 1.20);
        ordenacacaoPessoa.adicionarPessoa("Nome 5", 1, 1.10);

        ordenacacaoPessoa.adicionarPessoa("Nome 3", 1, 1.10);
        ordenacacaoPessoa.adicionarPessoa("Nome 4", 3, 1.30);

        System.out.println(ordenacacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacacaoPessoa.ordenarPorAltura());
    }
}
