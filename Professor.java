public class Professor extends Pessoa {
    private String escolaFormante;
    private String cursoProfessor;
    private int tempoDeContrato;
    private double salario;
    
    /* Método construtor Professor(){}*/

    // Escola que se formou 
    public String getEscolaFormante(){
        return escolaFormante;
    }
    public void setEscolaFormante(String escolaFormante){
        this.escolaFormante = escolaFormante;
    }

    // Curso que o professor exerce
    public String getCursoProfessor(){
        return cursoProfessor;
    }
    public void setCursoProfessor(String cursoProfessor){
        this.cursoProfessor = cursoProfessor;
    }

    // Tempo de contrato do professor
    public int getTempoDeContrato(){
        return tempoDeContrato;
    }
    public void setTempoDeContrato(int tempoDeContrato){
        this.tempoDeContrato = tempoDeContrato;
    }

    // Salario professor
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }


    public void iniciandoTreino(){
        System.out.println("Começando treino...");
    }
    public void avaliandoAlunos(){
        System.out.println("Avaliando alunos...");
    }
    public void lancarNotas(){
        System.out.println("Lançando notas...");
    }
    @Override
    public void ExibirInformacao(){
        System.out.println("Exbindo informaçoes do Professor... Escola formante: "+escolaFormante+", Especialidade: " +cursoProfessor+", Tempo de contrato: "+tempoDeContrato+ "anos, Salário: "+salario);
    }
}
