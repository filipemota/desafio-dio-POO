import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso java");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Mario");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + " " +dev1.getNome() + " " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("- Progreção -");
        System.out.println("Conteudos inscritos: " + " " +dev1.getNome() + " " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + " " +dev1.getNome() + " " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXP());

        System.out.println("----------------------");
        Dev dev2 = new Dev();
        dev2.setNome("Jose");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + " " +dev2.getNome() + " " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("- Progreção -");
        System.out.println("Conteudos inscritos: " + " " +dev2.getNome() + " " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + " " +dev2.getNome() + " " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXP());
    }
}