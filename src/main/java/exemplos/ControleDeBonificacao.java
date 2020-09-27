package exemplos;

public class ControleDeBonificacao {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f) {
        System.out.println("Adicionado bonificação de funcionário: " + f);
        this.totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}
