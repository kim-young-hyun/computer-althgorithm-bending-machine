import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InputMoney extends JFrame implements MouseListener{
    JPanel a = new JPanel(new FlowLayout());
    JPanel b = new JPanel(new GridLayout(2,4));
    JPanel c = new JPanel(new FlowLayout());

    JLabel jl1 = new JLabel("금액투입");
    JLabel jl2 = new JLabel("현재금액");
    JTextField jt = new JTextField("0", 10);

    JButton jb1 = new JButton("50000원");
    JButton jb2 = new JButton("10000원");
    JButton jb3 = new JButton("5000원");
    JButton jb4 = new JButton("1000원");
    JButton jb5 = new JButton("500원");
    JButton jb6 = new JButton("100원");
    JButton jb7 = new JButton("50원");
    JButton jb8 = new JButton("10원");
    JButton jb9 = new JButton(("투입"));

    public InputMoney(){
        setTitle("자판기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500,500);
        setVisible(true);

        Container contentPane= getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add("North", a);
        contentPane.add("Center", b);
        contentPane.add("South", c);
        a.add(jl1);

        b.add(jb1);
        b.add(jb2);
        b.add(jb3);
        b.add(jb4);
        b.add(jb5);
        b.add(jb6);
        b.add(jb7);
        b.add(jb8);

        jb1.addMouseListener(this);
        jb2.addMouseListener(this);
        jb3.addMouseListener(this);
        jb4.addMouseListener(this);
        jb5.addMouseListener(this);
        jb6.addMouseListener(this);
        jb7.addMouseListener(this);
        jb8.addMouseListener(this);

        c.add(jl2);
        c.add(jt);
        c.add(jb9);
    }

    public static void main(String [] args) {

        new InputMoney();

    }
    public void mouseClicked(MouseEvent e) {
        int val = Integer.parseInt(jt.getText());
        if(e.getSource() == jb1)
            val += 50000;
        else if (e.getSource() == jb2)
            val += 10000;
        else if (e.getSource() == jb3)
            val += 5000;
        else if (e.getSource() == jb4)
            val += 1000;
        else if (e.getSource() == jb5)
            val += 500;
        else if (e.getSource() == jb6)
            val += 100;
        else if (e.getSource() == jb7)
            val += 50;
        else if (e.getSource() == jb8)
            val += 10;
        else if(e.getSource() == jb9) {
            //잔돈반환
        }
        jt.setText(String.valueOf(val));
    }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
}