package base.sportheca.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    //Declaração atributos da classe
    private LocalDate data;

   //Implementação método Calcular XP (herdado da classe-mãe)
    @Override
    public double calcularXP() {
        //Quando uma mentoria for criada e o método for chamado, o XP é acrescido de 20
        return XP_PADRAO + 20d;
    }

    //Getter e setter data
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
                "titulo='" + getTitulo() + '\'' +
                ", decricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
