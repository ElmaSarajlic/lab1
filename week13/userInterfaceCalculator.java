package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;


public class UserInterfaceTask5 implements Runnable{
    private JFrame frame;
    private Calculator calculator;

    public UserInterfaceTask5(Calculator c) {
        this.calculator = c;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(400, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());

        JLabel label = new JLabel(String.valueOf(this.calculator.giveValue()));
        JButton clickButton = new JButton("Click");

        ClickListener listener = new ClickListener(this.calculator, label);
        clickButton.addActionListener(listener);

        container.add(label, BorderLayout.WEST);
        container.add(clickButton, BorderLayout.SOUTH);
    }
}