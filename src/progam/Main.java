package program;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try {
            double peso = lerDouble("Digite seu peso em kg:");
            double altura = lerDouble("Digite sua altura em metros:");

            if (peso <= 0 || altura <= 0) {
                mostrarErro("Os valores de peso e altura devem ser maiores que zero.");
                return;
            }

            double imc = calcularImc(peso, altura);
            String classificacao = classificarImc(imc);

            String mensagem = String.format(
                    "Seu IMC é: %.2f%nClassificação: %s",
                    imc,
                    classificacao
            );

            JOptionPane.showMessageDialog(
                    null,
                    mensagem,
                    "Resultado do IMC",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            mostrarErro("Entrada inválida. Digite apenas números (use ponto para casas decimais).");
        }
    }

    private static double lerDouble(String mensagem) {
        String entrada = JOptionPane.showInputDialog(null, mensagem);
        if (entrada == null) { // Cancelou
            throw new NumberFormatException("Entrada cancelada pelo usuário.");
        }
        return Double.parseDouble(entrada.trim());
    }

    private static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    private static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 35.0) {
            return "Obesidade grau I";
        } else if (imc < 40.0) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }

    private static void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(
                null,
                mensagem,
                "Erro",
                JOptionPane.ERROR_MESSAGE
        );
    }
}


