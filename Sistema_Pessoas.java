public class Sistema_Pessoas {
    public Sistema_Pessoas(){

    }

    public static void main(String[] args) {
        System.out.println("== Dados pessoais ==");
        System.out.println();
        // Dados primeira pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Heloísa");
        pessoa.setNacionalidade("Brasileira");
        pessoa.setIdade(19);
        pessoa.setAltura(1.60);
        pessoa.setPeso(56.20);

        pessoa.Cadastro();
        pessoa.Confirmando();
        pessoa.lerIdade();
        pessoa.lerAltura();
        pessoa.lerPeso();

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

        

    }
}
