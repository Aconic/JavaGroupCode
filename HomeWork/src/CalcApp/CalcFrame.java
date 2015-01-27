package CalcApp;


import javax.swing.*;

public class CalcFrame extends JFrame
{
    public CalcFrame()
    {
        setTitle("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(320, 300, 300, 300);

        add(new CalcPanel());
        setVisible(true);
    }
}
