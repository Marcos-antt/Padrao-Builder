package org.example;

public class Pessoa {
    private String nome;
    private String ultimoNome;
    private String nomeDoMeio;
    private String apelido;
    private String nomeDoPai;

    private Pessoa(String nome, String ultimoNome, String nomeDoMeio, String apelido, String nomeDoPai) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.nomeDoMeio = nomeDoMeio;
        this.apelido = apelido;
        this.nomeDoPai = nomeDoPai;
    }

    public String toString() {
        return "Pessoa{nome='" + this.nome + '\'' + ", ultimoNome='" + this.ultimoNome + '\'' + ", nomeDoMeio='" + this.nomeDoMeio + '\'' + ", apelido='" + this.apelido + '\'' + ", nomeDoPai='" + this.nomeDoPai + '\'' + '}';
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        return this.ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomeDoMeio() {
        return this.nomeDoMeio;
    }

    public void setNomeDoMeio(String nomeDoMeio) {
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomeDoPai() {
        return this.nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public static class PessoaBuilder {
        private String nome;
        private String ultimoNome;
        private String nomeDoMeio;
        private String apelido;
        private String nomeDoPai;

        public PessoaBuilder(String nome) {
            this.nome = nome;
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder ultimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;
            return this;
        }

        public PessoaBuilder nomeDoMeio(String nomeDoMeio) {
            this.nomeDoMeio = nomeDoMeio;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder nomeDoPai(String nomeDoPai) {
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this.nome, this.ultimoNome, this.nomeDoMeio, this.apelido, this.nomeDoPai);
        }
    }
}
