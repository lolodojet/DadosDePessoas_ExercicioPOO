public class Pessoa {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;


    /*  Metódo construtor Caso precise 
    Pessoa(){} */

    // Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    // Nacionalidade
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    // Idade
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    // Telefone
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    // Peso
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    // Leitura dos dados informados acima (Pai)

    public void Cadastro(){
        System.out.println("Fazendo cadastro..");
    }

    public void Confirmando(){
        System.out.println("Confirmando seu cadastro!");
    }

    public void lerIdade(){
        System.out.println("Anotando sua idade... ");
    }

    public void lerAltura(){
        System.out.println("Anotando sua altura... ");
    }

    public void lerPeso(){
        System.out.println("Anotando seu peso... ");
    }

}