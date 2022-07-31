package com.fag;
import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame {

    private JButton numero1;
    private JButton numero2;
    private JButton numero3;
    private JButton numero4;
    private JButton numero5;
    private JButton numero6;
    private JButton numero7;
    private JButton numero8;
    private JButton numero9;
    private JButton numero0;
    private JButton dividir;
    private JButton multiplicar;
    private JButton subtrair;
    private JButton somar;
    private JButton igual;

    private JButton limpar;
    private JTextField inserir;

    private int segundo;
    private int primeiro;
    private int terceiro;
    private int quarto;
    private int quinto;
    private int sexto;
    private char operacao;

    private int resultado;

    public Calculadora() {
        this.setTitle("Calculadora");
        this.setBounds(500, 100, 690, 775);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);


        inserir = new JTextField();
        inserir.setBounds(0, 0, 690, 100);
        this.add(inserir);

        numero7 = new JButton();
        numero7.setText("7");
        numero7.setBounds(0, 120, 150, 150);
        this.add(numero7);

        numero4 = new JButton();
        numero4.setText("4");
        numero4.setBounds(0, 280, 150, 150);
        this.add(numero4);

        numero1 = new JButton();
        numero1.setText("1");
        numero1.setBounds(0, 440, 150, 150);
        this.add(numero1);

        numero0 = new JButton();
        numero0.setText("0");
        numero0.setBounds(0, 600, 150, 150);
        this.add(numero0);

        numero8 = new JButton();
        numero8.setText("8");
        numero8.setBounds(175, 120, 150, 150);
        this.add(numero8);

        numero5 = new JButton();
        numero5.setText("5");
        numero5.setBounds(175, 280, 150, 150);
        this.add(numero5);

        numero2 = new JButton();
        numero2.setText("2");
        numero2.setBounds(175, 440, 150, 150);
        this.add(numero2);

        numero9 = new JButton();
        numero9.setText("9");
        numero9.setBounds(350, 120, 150, 150);
        this.add(numero9);

        numero6 = new JButton();
        numero6.setText("6");
        numero6.setBounds(350, 280, 150, 150);
        this.add(numero6);

        numero3 = new JButton();
        numero3.setText("3");
        numero3.setBounds(350, 440, 150, 150);
        this.add(numero3);

        somar = new JButton();
        somar.setText("+");
        somar.setBounds(525, 120, 150, 150);
        this.add(somar);

        dividir = new JButton();
        dividir.setText("/");
        dividir.setBounds(525, 280, 150, 150);
        this.add(dividir);

        multiplicar = new JButton();
        multiplicar.setText("X");
        multiplicar.setBounds(525, 600, 150, 150);
        this.add(multiplicar);

        subtrair = new JButton();
        subtrair.setText("-");
        subtrair.setBounds(525, 440, 150, 150);
        this.add(subtrair);

        limpar = new JButton();
        limpar.setText("AC");
        limpar.setBounds(175, 600, 150, 150);
        this.add(limpar);

        igual = new JButton();
        igual.setText("ENTER");
        igual.setBounds(350, 600, 150, 150);
        this.add(igual);

        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                primeiro = 0;
                segundo = 0;
                resultado = 0;
                inserir.setText("");
            }
        });

        numero1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 1;
                inserir.setText(inserir.getText() + "1");
            }
        });

        numero2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 2;
                inserir.setText(inserir.getText() + "2");
            }
        });

        numero3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 3;
                inserir.setText(inserir.getText() + "3");
            }
        });

        numero4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 4;
                inserir.setText(inserir.getText() + "4");
            }
        });

        numero5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 5;
                inserir.setText(inserir.getText() + "5");
            }
        });

        numero6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 6;
                inserir.setText(inserir.getText() + "6");
            }
        });

        numero7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 7;
                inserir.setText(inserir.getText() + "7");
            }
        });

        numero8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 8;
                inserir.setText(inserir.getText() + "8");
            }
        });

        numero9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 3;
                inserir.setText(inserir.getText() + "9");
            }
        });

        numero0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                segundo *= 10;
                segundo += 0;
                inserir.setText(inserir.getText() + "0");
            }
        });

        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '+';
                primeiro += segundo + terceiro + quarto +  quinto + sexto;
                segundo = 0;
                inserir.setText(primeiro + " + ");
            }
        });
        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '-';
                primeiro += segundo - terceiro - quarto - quinto - sexto;
                segundo = 0;
                inserir.setText(primeiro + " - ");
            }
        });

        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = 'X';
                primeiro += segundo;
                segundo = 0;
                inserir.setText(primeiro + " X ");
            }
        });

        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '/';
                primeiro += segundo;
                segundo = 0;
                inserir.setText(inserir + " / ");
            }
        });

        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case '+': {
                        resultado = primeiro + segundo;
                      //  inserir.setText(primeiro + " + " + segundo +  " = " + resultado);
                        break;
                    }

                    case '-': {
                        resultado = primeiro - segundo;
                        break;
                    }

                    case 'X': {
                        resultado = primeiro * segundo;
                        break;
                    }

                    case '/': {
                        resultado = primeiro / segundo;
                        break;
                    }

                }
                inserir.setText("  " + resultado);
            }
        });
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
    }
}