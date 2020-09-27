package exemplos;

public abstract class FuncionarioAbs {
    protected double salario;

//    public double getBonificacao() {
//        return this.salario * 1.2;
//    }

    // Método Abstrato
    public abstract double getBonificacao();

    public double getSalario() {
        return salario;
    }

    // outros atributos e métodos comuns a todos Funcionários
}
