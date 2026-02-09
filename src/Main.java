import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.DesafioDeCodigo;
import br.com.dio.desafio.dominio.DesafioDeProjeto;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        DesafioDeCodigo desafioDeCodigo = new DesafioDeCodigo();
        desafioDeCodigo.setTitulo("Desafio: SAT solver");
        desafioDeCodigo.setDescricao("Desafio de código para resolver o problema do SAT solver");
        desafioDeCodigo.setSourceCode("public class SATSolver {\n" +
                "    public boolean solve(int[][] clauses) {\n" +
                "        // Implementação do algoritmo de resolução do SAT solver\n" +
                "        return true; // Retorna true se o problema for satisfatível, false caso contrário\n" +
                "    }\n" +
                "}");
        
        DesafioDeProjeto desafioDeProjeto = new DesafioDeProjeto();
        desafioDeProjeto.setTitulo("Desafio: Sistema de Gerenciamento de Tarefas");
        desafioDeProjeto.setDescricao("Desafio de projeto para criar um sistema de gerenciamento de tarefas");
        desafioDeProjeto.setUrl("https://github.com/desafio-gerenciamento-tarefas");
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Desafio de Código e Projeto");
        bootcamp2.getConteudos().add(desafioDeCodigo);
        bootcamp2.getConteudos().add(desafioDeProjeto);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos Thiago:" + devThiago.getConteudosInscritos());
        devThiago.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thiago:" + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thiago:" + devThiago.getConteudosConcluidos());
        System.out.println("XP:" + devThiago.calcularTotalXp());

    }

}
