import base.sportheca.dominio.Bootcamp;
import base.sportheca.dominio.Curso;
import base.sportheca.dominio.Dev;
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

        //Iniciar objeto curso a partir da classe-mãe (polimorfismo)
        Curso curso1 = new Curso();
        curso1.setTitulo("curso de python");
        curso1.setDescricao("poo com python");
        curso1.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("poo com java: classes");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Curso completo de Java 8");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("André Miller");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev.getNome() + dev.getConteudosInscrito());
        dev.progressao();
        System.out.println("Conteúdos inscritos: " + dev.getNome() + dev.getConteudosInscrito());
        System.out.println("Conteúdos concluídos: " + dev.getNome() + dev.getConteudosConcluidos());
        System.out.println("Pontuação total: " + dev.calcularXPTotal());

        Dev dev1 = new Dev();
        dev.setNome("João Oliveira");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + dev1.getNome() + dev1.getConteudosInscrito());
        dev1.progressao();
        System.out.println("Conteúdos inscritos" + dev1.getNome() + dev1.getConteudosInscrito());
        System.out.println("Conteúdos concluídos: " + dev1.getNome() + dev1.getConteudosConcluidos());
        System.out.println("Pontuação total: " + dev1.calcularXPTotal());



    }
}
