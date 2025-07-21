public class Aluno extends Pessoa{
    private String cursoDesejado;
    private int anoDeMatricula;
    private double nota;

    /*Método construtor Aluno(){}*/

    // Curso que o aluno deseja
    public String getCursoDesejado(){
        return cursoDesejado;
    }
    public void setCursoDesejado(String cursoDesejado){
        this.cursoDesejado = cursoDesejado;
    }

    // Ano que o aluno entrou
    public int getAnoDeMatricula(){
        return anoDeMatricula;
    }
    public void setAnoDeMatricula(int anoDeMatricula){
        this.anoDeMatricula = anoDeMatricula;
    }

    // Nota do aluno
    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }

    public void verFaixa(){
        System.out.println("Verificando sua faixa...");
    }
    public void receberFaixa(){
        System.out.println("Recebendo faixa nova...");
    }
    public void participarCampeonato(){
        System.out.println("Você foi selecionado para lutar!");
    }

    @Override
    public void ExibirInformacao(){
        System.out.println("Exbindo informaçoes do Aluno... Curso que deseja: "+cursoDesejado+", Ano de Matricula: " +anoDeMatricula+", Nota: "+nota);
    }
}
