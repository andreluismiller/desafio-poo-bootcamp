package base.sportheca.dominio;

import java.time.LocalDate;

public class Mentoria {

    //Declaração atributos da classe
    private String titulo;
    private String decricao;
    private LocalDate data;

    //Criação dos métodos get e set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Criação do método ToString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", decricao='" + decricao + '\'' +
                ", data=" + data +
                '}';
    }
}
