public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //construtores tem o mesmo nome da classe só que sem o retorno

    public Funcionario(){

    }

    public double getBonificacao() {
        return this.salario * 0.1;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
