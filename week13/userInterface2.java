package week13;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;


public class UserInterfaceTask3 implements Runnable {

    private JFrame frame;

    public UserInterfaceTask3() {}

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        JLabel label = new JLabel("Are you?")
        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        container.add(yes);
        container.add(no);

        container.add(new JLabel("Why"));

        JRadioButton no_reason = new JRadioButton("No reason");
        JRadioButton fun = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroupRadio = new ButtonGroup();
        buttonGroupRadio.add(no_reason);
        buttonGroupRadio.add(fun);

        container.add(no_reason);
        container.add(fun);

        JButton button = new JButton("Done!");
        container.add(button);
    }

}