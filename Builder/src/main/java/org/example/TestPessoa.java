package org.example;//


public class TestPessoa {
    public TestPessoa() {
    }

    public static void main(String[] args) {
        Pessoa p = (new Pessoa.PessoaBuilder("")).nomeDoMeio("Soares").ultimoNome("Queiroz").nomeDoPai("William").apelido("Carlinhos").build();
        System.out.println(p);
    }
}
