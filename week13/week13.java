package week13;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import clicker.ui.UserInterfaceTask5;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import noticeboard.NoticeBoard;

public class Week13 {


    public static void main(String[] args) throws Exception {
        FileManager f = new FileManager();

        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }

        FileManager f = new FileManager();
        f.save("src/testinput1.txt", "hello");

        FileManager f = new FileManager();
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("Object");
        list.add("Oriented");
        list.add("Programming");

        f.saveList("src/testinput1.txt", list);

        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);

        UserInterfaceTask3 ui3 = new UserInterfaceTask3();
        SwingUtilities.invokeLater(ui3);

        NoticeBoard board = new NoticeBoard();
        SwingUtilities.invokeLater(board);

        Calculator calc = new PersonalCalculator();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());

        Calculator calc2 = new PersonalCalculator();
        UserInterfaceTask5 ui5 = new UserInterfaceTask5(calc2);
        SwingUtilities.invokeLater(ui5);
    }


}