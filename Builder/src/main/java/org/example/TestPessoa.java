package org.example;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class TestPessoa {
    public TestPessoa() {
    }

    public static void main(String[] args) {
        Pessoa p = (new Pessoa.PessoaBuilder("")).nomeDoMeio("Soares").ultimoNome("Queiroz").nomeDoPai("William").apelido("Carlinhos").build();
        System.out.println(p);
    }
}
