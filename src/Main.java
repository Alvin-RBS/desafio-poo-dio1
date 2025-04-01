import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Backend");
        curso1.setDescricao("Descrição curso 1");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Frontend");
        curso2.setDescricao("Descrição curso 2");
        curso2.setCargaHoraria(35);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria SpringBoot");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlvaro = new Dev();
        Dev devGustavo = new Dev();

        devAlvaro.setNome("Álvaro");
        devAlvaro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Álvaro: " + devAlvaro.getConteudosInscritos());
        devAlvaro.progredir();
        System.out.println("Conteúdos inscritos de Álvaro: " + devAlvaro.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Álvaro: " + devAlvaro.getConteudosConcluidos());
        devAlvaro.progredir();
        System.out.println("Conteúdos concluídos de Álvaro: " + devAlvaro.getConteudosConcluidos());
        System.out.println("XP de Álvaro: " + devAlvaro.calcularTotalXp());


        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Gustavo: " + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        System.out.println("Conteúdos inscritos de Gustavo: " + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Gustavo: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP de Gustavo: " + devGustavo.calcularTotalXp());

    }
}