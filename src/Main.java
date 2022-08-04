import br.com.dio.desafio.dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.getCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.getCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Desc. mentoria de java");
        mentoria.setDate(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
