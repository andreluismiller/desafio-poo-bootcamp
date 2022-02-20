package base.sportheca.dominio;

public class Curso extends Conteudo {

    //Declaração dos atributos da classe com seus respectivos modificadores de acesso
    private int cargaHoraria;

    //Implementação método Calcular XP (herdado da classe-mãe)
    @Override
    public double calcularXP() {
        //Quando o método for chamado, o XP será multiplicad pela carga horário do curso
        return XP_PADRAO * cargaHoraria;
    }

    //Criação dos métodos get e set
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //Criação do método ToString

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
