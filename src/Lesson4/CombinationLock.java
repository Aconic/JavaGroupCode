package Lesson4;

import java.lang.String.*;
import java.lang.Exception.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class CombinationLock extends JFrame implements ActionListener{
    // instance variables
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;

    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;

    private JButton zeroButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;

    private JTextField outputLine;
    private JLabel label;
    boolean combo1 = false;
    boolean combo2 = false;
    boolean combo3 = false;

    public static void main(String[] args){
        CombinationLock frame = new CombinationLock();
        frame.setVisible(true);
    }

    /**
     * Constructor for objects of class
     */
    public CombinationLock(){
        Container contentPane;

        //Set the frame properties
        setSize         (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable    (false);
        setTitle        ("Combination Lock");
        setLocation     (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground( Color.white );

        //Create and Place the Buttons on the frame
        zeroButton = new JButton("0");
        zeroButton.setBounds(10, 10, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(zeroButton);

        oneButton = new JButton("1");
        oneButton.setBounds(100, 10, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(190, 10, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(280, 10, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(threeButton);

        fourButton = new JButton("4");
        fourButton.setBounds(370, 10, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(10, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(100, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(sixButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(190, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(280, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(370, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(nineButton);



        //Register this frame as an Action listener of the buttons
        zeroButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);


        //Create and Place the TextFields on the frame
        outputLine = new JTextField();
        outputLine.setBounds(80, 100, 200, 25);
        outputLine.setEditable( false );
        contentPane.add(outputLine);


        //Create and Place Labels on the frame
        JLabel label = new JLabel("Result : ");
        label.setBounds(10, 60, 100, 100);
        contentPane.add(label);




        //Exit program when the viewer is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Event handler

    //Combination = 3,4,5
    public void actionPerformed(ActionEvent event){

        if(event.getSource() instanceof JButton){
            JButton clickedButton = (JButton) event.getSource();

            String buttonText = clickedButton.getText();
            if(buttonText.equals("3")){
                combo1 = true;
                        }

        }
        if(event.getSource() instanceof JButton){
            JButton clickedButton = (JButton) event.getSource();

            String buttonText = clickedButton.getText();
            if(buttonText.equals("4")){
                combo2 = true;

            }

        }

        if(event.getSource() instanceof JButton){
            JButton clickedButton = (JButton) event.getSource();

            String buttonText = clickedButton.getText();
            if(buttonText.equals("5")){
                combo3 = true;

            }

        }
        if(combo1 && combo2 && combo3){
            outputLine.setText("Correct Combination");
        }
        else {
            outputLine.setText("Wrong Combination");
        }
    }
}
