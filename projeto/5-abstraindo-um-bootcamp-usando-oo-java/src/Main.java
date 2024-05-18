import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) throws Exception {
    Bootcamp bootcamp =
        new Bootcamp("Bootcamp Java Developer", "Descricao BootCamp Java Developer");

    Curso curso1 = new Curso("Curso Java", "Descricao curso Java", 80);
    Curso curso2 = new Curso("Curso Java POO", "Descricao curso Java POO", 70);
    Mentoria mentoria = new Mentoria("Mentoria Java", "Descricao Mentoria Java");

    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devLuan = new Dev("Luan");
    devLuan.inscreverBootcamp(bootcamp);
    System.out.println(
        "Conteudos Inscritos " + devLuan.getNome() + ": \n" + devLuan.getConteudosInscritos());
    devLuan.progedir();
    System.out.println(
        "Conteudos Concluidos " + devLuan.getNome() + ": \n" + devLuan.getConteudosConcluidos());
    System.out.println("XP:" + devLuan.calcularTotalXp());

    Dev devJoao = new Dev("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println(
        "Conteudos Inscritos " + devJoao.getNome() + ": \n" + devJoao.getConteudosInscritos());
    devJoao.progedir();
    System.out.println(
        "Conteudos Concluidos " + devJoao.getNome() + ": \n" + devJoao.getConteudosConcluidos());
    System.out.println("XP:" + devJoao.calcularTotalXp());
  }
}
