package Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionarios {
    private List<Funcionario> funcionarios;

    public GerenciadorFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            return 0;
        }

        double totalSalarios = 0;
        for (Funcionario f : funcionarios) {
            totalSalarios += f.getSalario();
        }

        return totalSalarios / funcionarios.size();
    }

    public void exibirInformacoesFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
