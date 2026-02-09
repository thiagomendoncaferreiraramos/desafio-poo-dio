package br.com.dio.desafio.dominio;

public final class DesafioDeProjeto extends Source {

    private String url;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 50d;
    }
    
    private boolean isURLRegex(String url) {
    String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    return url.matches(regex);
}

    public void setUrl(String url) {
        if (isURLRegex(url)) {
            this.url = url;
        } else {
            throw new IllegalArgumentException("URL inválida");
        }
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "DesafioDeProjeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
