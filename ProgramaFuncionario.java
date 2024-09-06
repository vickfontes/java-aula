import java.util.Scanner;

class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;

    // Construtor
    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    // Método para calcular o salário líquido
    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    // Método para aumentar o salário com base em uma porcentagem
    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    // Método para mostrar os dados do funcionário
    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o funcionário João Silva
        System.out.println("Nome: João Silva");
        System.out.println("Salário Bruto: 6000.00");
        System.out.println("Imposto: 1000.00");
        
        Funcionario funcionario = new Funcionario("João Silva", 6000.00, 1000.00);

        // Mostrando os dados do funcionário
        System.out.println("Employee: " + funcionario);

        // Perguntando a porcentagem de aumento
        System.out.print("Which percentage to increase salary? ");
        double porcentagem = sc.nextDouble();
        
        // Aumentando o salário do funcionário
        funcionario.aumentarSalario(porcentagem);

        // Mostrando os dados atualizados do funcionário
        System.out.println("Update data: " + funcionario);

        sc.close();
    }
}