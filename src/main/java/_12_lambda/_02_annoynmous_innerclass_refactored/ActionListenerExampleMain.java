package _12_lambda._02_annoynmous_innerclass_refactored;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class ActionListenerExampleMain {

    public static void main(String[] args) {
        JButton testButton1 = new JButton("Click to call Anonymous ActionListener");
        JButton testButton2 = new JButton("Click to call Lambda ActionListener");
        JButton testButton3 = new JButton("Click to call Anonymous ActionListener3");
        JButton testButton4 = new JButton("Click to call Lambda ActionListener4");

        // TODO-lambda-anonymous-01:
        // - Study the Anonymous inner class ActionListener is
        //   used below (not using Lambda)
        testButton1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Click Detected by Anonymous Listener: " + e);
                    }
                });

        // - Study how Lambda replaces the anonymous inner class
        //   with the same functionality
        testButton2.addActionListener(
                e -> System.out.println("Click Detected by Lambda Listener: " + e));

        // - Study another example of Anonymous inner class ActionListener is
        //   used below (not using Lambda)
        testButton3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(LocalTime.now());
                    }
                });

        // - Rewrite the above code using Lambda


        // Swing stuff
        JFrame frame = new JFrame("Listener Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(testButton1, BorderLayout.WEST);
        frame.add(testButton2, BorderLayout.EAST);
        frame.add(testButton3, BorderLayout.NORTH);
        frame.add(testButton4, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}
