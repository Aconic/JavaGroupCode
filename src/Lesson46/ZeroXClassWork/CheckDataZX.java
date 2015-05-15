package Lesson46.ZeroXClassWork;


import javax.swing.*;

public class CheckDataZX
{     String res=null;

    public String checkWinner(JButton[] btn, String btnSign)
    {

        for (int i = 0; i < btn.length; i++)
        {
            if (btn[0].getText().equals(btnSign) && btn[1].getText().equals(btnSign) && btn[2].getText().equals(btnSign))
            {
                res = btnSign;
            }


            else if (btn[3].getText().equals(btnSign) && btn[4].getText().equals(btnSign) && btn[5].getText().equals(btnSign))
            {
                res = btnSign;
            }

            else if (btn[6].getText().equals(btnSign) && btn[7].getText().equals(btnSign) && btn[8].getText().equals(btnSign))
            {
                res = btnSign;
            }

            else if (btn[0].getText().equals(btnSign) && btn[3].getText().equals(btnSign) && btn[6].getText().equals(btnSign))
            {
                res = btnSign;
            }

            else if (btn[1].getText().equals(btnSign) && btn[4].getText().equals(btnSign) && btn[7].getText().equals(btnSign))
            {
                res = btnSign;
            }

            else if (btn[2].getText().equals(btnSign) && btn[5].getText().equals(btnSign) && btn[8].getText().equals(btnSign))
            {
                res = btnSign;
            }

            else if (btn[0].getText().equals(btnSign) && btn[4].getText().equals(btnSign) && btn[8].getText().equals(btnSign))
            {
                res = btnSign;
            }

            else if (btn[2].getText().equals(btnSign) && btn[4].getText().equals(btnSign) && btn[6].getText().equals(btnSign))
            {
                res = btnSign;
            }
        }
         return res;
    }

}
