package br.com.dio.desafio.dominio;

public final class DesafioDeCodigo extends Source {

    private String sourceCode;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 30d;
    }
    
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    @Override
    public String toString() {
        return "DesafioDeCodigo{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
