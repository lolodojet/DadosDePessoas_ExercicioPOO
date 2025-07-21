public class Sistema_Pessoas {

    public static void main(String[] args) {
        System.out.println("== Dados pessoais ==");
        // Dados primeira pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Heloísa");
        pessoa.setNacionalidade("Brasileira");
        pessoa.setIdade(25);
        pessoa.setAltura(1.60);
        pessoa.setPeso(56.20);

        pessoa.Cadastro();
        pessoa.Confirmando();
        pessoa.ExibirInformacao();
        System.out.println();

        // Dados professor
        Professor professor = new Professor();
        professor.setNome("Carlos");
        professor.setNacionalidade("Francês");
        professor.setIdade(45);
        professor.setAltura(1.78);
        professor.setPeso(87.40);
        professor.setEscolaFormante("KaratêSchool");
        professor.setCursoProfessor("Karateca");
        professor.setTempoDeContrato(8);
        professor.setSalario(1400.50);

        System.out.println("== Professor ==");
        professor.Cadastro();
        professor.Confirmando();
        professor.iniciandoTreino();
        professor.avaliandoAlunos();
        professor.lancarNotas();
        professor.ExibirInformacao();
        System.out.println();

        System.out.println("== Aluno ==");
        Aluno aluno = new Aluno();
        aluno.setNome("Luca");
        aluno.setNacionalidade("Espanhol");
        aluno.setIdade(15);
        aluno.setAltura(1.70);
        aluno.setPeso(70.40);
        aluno.setCursoDesejado("Karatê");
        aluno.setAnoDeMatricula(2025);
        aluno.setNota(8.9);

        aluno.verFaixa();
        aluno.receberFaixa();
        aluno.participarCampeonato();
        aluno.ExibirInformacao();
    }
}
