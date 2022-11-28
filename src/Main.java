import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8); // 8 horas

        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4); // 8 horas

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("joao");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos joao: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("====================");

        System.out.println("conteudos concluidos joao: " + dev1.getConteudosConcluidos());
        System.out.println("conteudos inscritos que faltam joao: " + dev1.getConteudosInscritos());
        System.out.println("XPs: " + dev1.calcularTotalXp());
        System.out.println();


        Dev dev2 = new Dev();
        dev2.setNome("maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos maria: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();


        System.out.println("====================");


        System.out.println("conteudos concluidos maria: " + dev2.getConteudosConcluidos());
        System.out.println("conteudos inscritos que faltam maria: " + dev2.getConteudosInscritos());
        System.out.println("XPs: " + dev2.calcularTotalXp());

    }
}
