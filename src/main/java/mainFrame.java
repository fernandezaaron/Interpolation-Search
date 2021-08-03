import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.Flow;

public class mainFrame extends JFrame
{
    JPanel upper, upper2, enteredValue;
    JLabel enterNumber, valueEnter;
    JTextField numberEntered, enterValues;
    JButton enter, enter2;

    public mainFrame()
    {
        super("Interpolation Algorithm");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //First Panel
        enterNumber = new JLabel("Enter number of values: ");
        enterNumber.setBounds(300,10,300,40);
        enterNumber.setVisible(true);

        numberEntered = new JTextField();
        numberEntered.setBounds(440,20,50,20);
        numberEntered.setVisible(true);

        enter = new JButton(new AbstractAction("Enter")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                enter.setEnabled(false);
                valueEnter.setVisible(true);
                enterValues.setVisible(true);
                enter2.setVisible(true);
                upper2.setVisible(false);
                enteredValue.add(enterValues);
                enteredValue.add(valueEnter);
                enteredValue.add(enter2);
                enteredValue.setVisible(true);

            }
        });

        enter.setBounds(360,50,80,20);
        enter.setBackground(Color.LIGHT_GRAY);
        enter.setFocusable(false);
        enter.setOpaque(true);
        enter.setVisible(true);

        //Second Panel
        valueEnter = new JLabel("Enter Values: ");
        valueEnter.setForeground(Color.WHITE);
        valueEnter.setBounds(330,20,300,40);
        valueEnter.setVisible(false);

        enterValues = new JTextField();
        enterValues.setBounds(410,30,50,20);
        enterValues.setVisible(false);

        enter2 = new JButton(new AbstractAction("Enter")
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });

        enter2.setBounds(360,60,80,20);
        enter2.setBackground(Color.LIGHT_GRAY);
        enter2.setFocusable(false);
        enter2.setOpaque(true);
        enter2.setVisible(false);

        //Panel Settings
        //1
        upper = new JPanel();
        upper.setLayout(null);
        upper.setVisible(true);

        //2
        upper2 = new JPanel();
        upper2.setLayout(null);
        upper2.setBackground(Color.orange);
        upper2.setBounds(0,0,800,80);
        upper2.setVisible(true);

        //3
        enteredValue = new JPanel();
        enteredValue.setLayout(null);
        enteredValue.setBackground(Color.BLACK);
        enteredValue.setBounds(0,0,800,100);
        enteredValue.setVisible(false);

        upper2.add(enterNumber);
        upper2.add(numberEntered);
        upper2.add(enter);

        upper.add(upper2);

        add(enteredValue);
        add(upper);
        setResizable(false);
        setSize(800,600);
        setVisible(true);
    }
}
