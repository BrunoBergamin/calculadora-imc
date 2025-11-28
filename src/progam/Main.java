package progam;

import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner enter = new Scanner(System.in);

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));

        if (peso == 0 || altura == 0) {
            JOptionPane.showMessageDialog(null, "Dados Invalidos.");
        } else {
            double imc = peso / (altura * altura);
            String formatado = String.format("%.2f", imc);

            if (imc < 18.5) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatado + " Abaixo do peso");
            } else if (imc >= 18.5 && imc < 24.9) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatado + " Peso Normal");
            } else if (imc >= 25.0 && imc < 29.9) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatado + " Sobre peso");
            } else if (imc >= 30.0 && imc < 34.9) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatado + " Obesidade grau I");
            } else if (imc >= 35.0 && imc < 39.9) {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatado + " Obesidade grau II");
            } else {
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + formatado + " Obesidade grau III");
            }

            enter.close();
        }
    }
}

