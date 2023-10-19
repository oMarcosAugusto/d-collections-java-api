package main.java.list.Ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacacaoPessoa ordenacacaoPessoa = new OrdenacacaoPessoa();

        ordenacacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacacaoPessoa.ordenarPorAltura());
    }
}
