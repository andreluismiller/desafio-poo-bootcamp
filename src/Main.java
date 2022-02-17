import base.sportheca.dominio.Curso;
import base.sportheca.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Iniciar classe curso
        Curso curso = new Curso();
        //Definir atributos do objeto curso
        curso.setTitulo("curso de java");
        curso.setDescricao("poo com java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso de python");
        curso1.setDescricao("poo com python");
        curso1.setCargaHoraria(6);

        System.out.println(curso);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDecricao("poo com java: classes");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);


    }
}
