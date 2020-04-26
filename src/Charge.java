import javax.swing.*;
import java.awt.*;

public class Charge extends JFrame{
    JPanel a = new JPanel(new FlowLayout());
    JPanel b = new JPanel(new GridLayout(2,8));
    JPanel c = new JPanel(new FlowLayout());

    JLabel jl1 = new JLabel("잔돈반환내역");
    JLabel jl2 = new JLabel("오만원 지폐");
    JLabel jl3 = new JLabel("만원 지폐");
    JLabel jl4 = new JLabel("오천원 지폐");
    JLabel jl5 = new JLabel("천원 지폐");
    JLabel jl6 = new JLabel("오백원 동전");
    JLabel jl7 = new JLabel("백원 동전");
    JLabel jl8 = new JLabel("오십원 동전");
    JLabel jl9 = new JLabel("십원 동전");
    JLabel jl10 = new JLabel("잔돈의 총 개수");

    JTextField jt1 = new JTextField("0");
    JTextField jt2 = new JTextField("0");
    JTextField jt3 = new JTextField("0");
    JTextField jt4 = new JTextField("0");
    JTextField jt5 = new JTextField("0");
    JTextField jt6 = new JTextField("0");
    JTextField jt7 = new JTextField("0");
    JTextField jt8 = new JTextField("0");
    JTextField jt9 = new JTextField("0", 5);
    JTextField jt10 = new JTextField("0");

    int num = 0;
    int temp;
    int money = 0;

    public Charge(int p){
        money = p;

        setTitle("잔돈반환");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(700,200);
        setVisible(true);

        Container contentPane= getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(Color.GRAY);

        contentPane.add("North", a);
        contentPane.add("South", c);
        contentPane.add("Center", b);

        a.add(jl1);
        a.add(jt10);
        jt10.setText(String.valueOf(money));

        b.add(jl2);
        b.add(jl3);
        b.add(jl4);
        b.add(jl5);
        b.add(jl6);
        b.add(jl7);
        b.add(jl8);
        b.add(jl9);

        b.add(jt1);
        b.add(jt2);
        b.add(jt3);
        b.add(jt4);
        b.add(jt5);
        b.add(jt6);
        b.add(jt7);
        b.add(jt8);

        c.add(jl10);
        c.add(jt9);

        temp = money / 50000;
        num += temp;
        jt1.setText(String.valueOf(temp));
        temp = money % 50000 / 10000;
        num += temp;
        jt2.setText(String.valueOf(temp));
        temp = money % 10000 / 5000;
        num += temp;
        jt3.setText(String.valueOf(temp));
        temp = money % 5000 / 1000;
        num += temp;
        jt4.setText(String.valueOf(temp));
        temp = money % 1000 / 500;
        num += temp;
        jt5.setText(String.valueOf(temp));
        temp = money % 500 / 100;
        num += temp;
        jt6.setText(String.valueOf(temp));
        temp = money % 100 / 50;
        num += temp;
        jt7.setText(String.valueOf(temp));
        temp = money % 50 / 10;
        num += temp;
        jt8.setText(String.valueOf(temp));
        jt9.setText((String.valueOf(num)));
    }
}

