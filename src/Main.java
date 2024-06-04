import java.awt.geom.CubicCurve2D;
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		 Cursos curso1 = new Cursos();
	     curso1.setTitulo("curso Java");
	     curso1.setDescricao("descrição curso JAVA");
	     curso1.setCargaHoraria(8);

	     Cursos curso2 = new Cursos();
	     curso2.setTitulo("curso JavaScript");
	     curso2.setDescricao("descrição curso JavaScript");
	     curso2.setCargaHoraria(4);

	     Mentoria mentoria1 = new Mentoria();
	     mentoria1.setTitulo("mentoria de Java");
	     mentoria1.setDescricao("descrição mentoria JAVA");
         mentoria1.setData(LocalDate.now());
         
         Mentoria mentoria2 = new Mentoria();
	     mentoria2.setTitulo("mentoria de JavaScript");
	     mentoria2.setDescricao("descrição mentoria JavaScript");
         mentoria2.setData(LocalDate.now());
         
         
         Bootcamp bootcamp = new Bootcamp();
         bootcamp.setNome("Bootcamp Java Developer");
         bootcamp.setDescricao("Descrição Bootcamp Java Developer");
         bootcamp.getConteudos().add(curso1);
         bootcamp.getConteudos().add(curso2);
         bootcamp.getConteudos().add(mentoria1);
         bootcamp.getConteudos().add(mentoria2);

         Dev devAluno1  = new Dev();
         devAluno1 .setNome("Joaquim");
         devAluno1 .inscreverBootcamp(bootcamp);
         System.err.println("Aluno: " + devAluno1.getNome());
         System.out.println("Conteúdos Inscritos:" + devAluno1 .getConteudosInscritos());
         devAluno1 .progredir();
         devAluno1 .progredir();
         System.out.println("-");
         System.out.println("Conteúdos Inscritos:" + devAluno1 .getConteudosInscritos());
         System.out.println("Conteúdos Concluídos:" + devAluno1 .getConteudosConcluidos());
         System.out.println("XP:" + devAluno1 .calcularTotalXP());    
	
         System.out.println("===========================");
         
         Dev devAluno2 = new Dev();
         devAluno2.setNome("Helena");
         devAluno2.inscreverBootcamp(bootcamp);
         System.err.println("Aluno: " + devAluno2.getNome());
         System.out.println("Conteúdos Inscritos:" + devAluno2.getConteudosInscritos());
         devAluno2.progredir();
         devAluno2.progredir();
         devAluno2.progredir();
         devAluno2.progredir();
         System.out.println("-");
         System.out.println("Conteúdos Inscritos:" + devAluno2.getConteudosInscritos());
         System.out.println("Conteúdos Concluidos:" + devAluno2.getConteudosConcluidos());
         System.out.println("XP:" + devAluno2.calcularTotalXP());
	}
	
	
}
