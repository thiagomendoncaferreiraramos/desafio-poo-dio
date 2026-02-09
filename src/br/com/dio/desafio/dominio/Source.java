package br.com.dio.desafio.dominio;

public abstract sealed class Source extends Conteudo permits 
DesafioDeCodigo, DesafioDeProjeto {

    private String nomeLinguagem;

    public abstract double calcularXp();

    public String getNomeLinguagem() {
        return nomeLinguagem;
    }

    public void setNomeLinguagem(String nomeLinguagem) {
        this.nomeLinguagem = nomeLinguagem;
    }
    
}
