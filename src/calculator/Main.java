package calculator;

import javax.swing.*;

public class Main {

    private static Double sum(Double a, Double b){
        return a+b;
    }

    private static Double substract(Double a, Double b) throws ArithmeticException{
        if (a-b<0){
            throw new ArithmeticException();
        }else {
            return a-b;
        }
    }

    private static Double divide(Double a, Double b) throws ArithmeticException{
        Double div = a/b;
        if (div.isNaN() || b == 0.0){
            throw new ArithmeticException();
        }else{
            return div;
        }
    }

    public static void main(String[] args) {
        Integer op = 1;
        Double a;
        Double b;
        Double ans;
        while (op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog("1.Suma\n 2.Resta\n3.División"));
            switch (op){
                case 1:
                    try {
                        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número a sumar"));
                        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número a sumar"));
                        ans = sum(a, b);
                        JOptionPane.showMessageDialog(null, a+" + "+b+" = "+ans);
                    }catch (NumberFormatException e){
                        System.out.println("Valor ingresado inválido "+ e);
                    }
                    break;
                case 2:
                    try {
                    a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número a restar"));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número a restar"));
                    ans = substract(a, b);
                    JOptionPane.showMessageDialog(null, a+" - "+b+" = "+ans);
                    }catch (NumberFormatException e){
                        System.out.println("Valor ingresado inválido "+ e);
                    }catch (ArithmeticException e){
                        System.out.println("Resultado negativo "+e);
                    }
                    break;
                case 3:
                    try {
                        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el divisor"));
                        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dividendo"));
                        ans = divide(a, b);
                        JOptionPane.showMessageDialog(null, a+" ÷ "+b+" = "+ans);
                    }catch (NumberFormatException e){
                        System.out.println("Valor ingresado inválido "+ e);
                    }catch (ArithmeticException e){
                        System.out.println("No se puede dividir entre cero"+e);
                    }
                    break;
            }
        }
    }
}