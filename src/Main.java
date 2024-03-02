import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new CalculateUI();
    }
}

class CalculateUI extends JFrame implements ActionListener {

    JTextField textField = new JTextField();
    JTextArea historyTextArea = new JTextArea();
    int num;
    String sign;

    public CalculateUI() {
        setTitle("Calculator");
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initElements();
        setVisible(true);
    }

    private void initElements() {

        JButton button0 = new JButton("0");
        button0.setBounds(200, 650, 100, 50);
        add(button0);

        JButton button1 = new JButton("1");
        button1.setBounds(100, 600, 100, 50);
        add(button1);

        JButton button2 = new JButton("2");
        button2.setBounds(200, 600, 100, 50);
        add(button2);

        JButton button3 = new JButton("3");
        button3.setBounds(300, 600, 100, 50);
        add(button3);

        JButton button4 = new JButton("4");
        button4.setBounds(100, 550, 100, 50);
        add(button4);

        JButton button5 = new JButton("5");
        button5.setBounds(200, 550, 100, 50);
        add(button5);

        JButton button6 = new JButton("6");
        button6.setBounds(300, 550, 100, 50);
        add(button6);

        JButton button7 = new JButton("7");
        button7.setBounds(100, 500, 100, 50);
        add(button7);

        JButton button8 = new JButton("8");
        button8.setBounds(200, 500, 100, 50);
        add(button8);

        JButton button9 = new JButton("9");
        button9.setBounds(300, 500, 100, 50);
        add(button9);

        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(400, 650, 100, 50);
        buttonEquals.setForeground(Color.BLUE);
        buttonEquals.setFont(new Font("Arial", Font.BOLD, 25));
        add(buttonEquals);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(400, 600, 100, 50);
        buttonPlus.setForeground(Color.BLUE);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 25));
        add(buttonPlus);

        JButton buttonMin = new JButton("-");
        buttonMin.setBounds(400, 550, 100, 50);
        buttonMin.setForeground(Color.BLUE);
        buttonMin.setFont(new Font("Arial", Font.BOLD, 25));
        add(buttonMin);

        JButton buttonMul = new JButton("*");
        buttonMul.setBounds(400, 500, 100, 50);
        buttonMul.setForeground(Color.BLUE);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 25));
        add(buttonMul);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(400, 450, 100, 50);
        buttonDivide.setForeground(Color.BLUE);
        buttonDivide.setFont(new Font("Arial", Font.BOLD, 25));
        add(buttonDivide);

        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(100,650, 100, 50);
        buttonClear.setForeground(Color.RED);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 25));
        add(buttonClear);

        textField.setBounds(100, 220, 400, 50);
        textField.setEditable(false);
        add(textField);

        historyTextArea.setBounds(520, 50, 250, 700);
        historyTextArea.setEditable(false);
        add(historyTextArea);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonMin.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonClear.addActionListener(this);
    }

    private void updateHistory(String input) {
        historyTextArea.append(input + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = 0;
        switch (e.getActionCommand()) {
            case "0":
                textField.setText(textField.getText() + "0");
                break;
            case "1":
                textField.setText(textField.getText() + "1");
                break;
            case "2":
                textField.setText(textField.getText() + "2");
                break;
            case "3":
                textField.setText(textField.getText() + "3");
                break;
            case "4":
                textField.setText(textField.getText() + "4");
                break;
            case "5":
                textField.setText(textField.getText() + "5");
                break;
            case "6":
                textField.setText(textField.getText() + "6");
                break;
            case "7":
                textField.setText(textField.getText() + "7");
                break;
            case "8":
                textField.setText(textField.getText() + "8");
                break;
            case "9":
                textField.setText(textField.getText() + "9");
                break;
            case "+":
                updateHistory(textField.getText() + " " + e.getActionCommand() + " ");
                sign = "+";
                num = Integer.parseInt(textField.getText());
                textField.setText("");
                break;
            case "-":
                updateHistory(textField.getText() + " " + e.getActionCommand() + " ");
                sign = "-";
                num = Integer.parseInt(textField.getText());
                textField.setText("");
                break;
            case "*":
                updateHistory(textField.getText() + " " + e.getActionCommand() + " ");
                sign = "*";
                num = Integer.parseInt(textField.getText());
                textField.setText("");
                break;
            case "/":
                updateHistory(textField.getText() + " " + e.getActionCommand() + " ");
                sign = "/";
                num = Integer.parseInt(textField.getText());
                textField.setText("");
                break;
            case "C":
                textField.setText("");
                break;
            case "=":
                switch (sign) {
                    case "+":
                        int num1 = Integer.parseInt(textField.getText());
                        result = num + num1;
                        break;
                    case "-":
                        int num2 = Integer.parseInt(textField.getText());
                        result = num - num2;
                        break;
                    case "*":
                        int num3 = Integer.parseInt(textField.getText());
                        result = num * num3;
                        break;
                    case "/":
                        int num4 = Integer.parseInt(textField.getText());
                        if (num4 != 0) {
                            result = num / num4;
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }
                updateHistory(textField.getText() + " = " + result);
                textField.setText(String.valueOf(result));
                break;
            default:
                System.out.println("Enter");
        }
    }
}