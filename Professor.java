public class Professor extends Pessoa {
    private String escolaFormante;
    private String cursoProfessor;
    private int tempoDeContrato;
    
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

    public void lerEscolaFormante(){
        System.out.println(cursoProfessor);
    }
}
