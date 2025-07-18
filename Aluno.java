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
}
