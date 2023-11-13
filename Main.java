package Funcionarios;

public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();

        //Adicionando alguns funcionarios
        gerenciador.adicionarFuncionario(new Funcionario("Joao", 30, 5000));
        gerenciador.adicionarFuncionario(new Funcionario("Maria", 25, 6000));
        gerenciador.adicionarFuncionario(new Funcionario("Carlos", 35, 7000));

        //Exibindo informações sobre os funcionários
        gerenciador.exibirInformacoesFuncionarios();

        //calculando e exibindo a média salarial
        double mediaSalarial = gerenciador.calcularMediaSalarial();
        System.out.println("Media Salarial: " + mediaSalarial);
    }
}
