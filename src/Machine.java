import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Machine extends JFrame implements MouseListener{
    JPanel a = new JPanel(new GridLayout());
    JPanel b = new JPanel(new GridLayout(2,5));
    JPanel c = new JPanel(new GridLayout(2,4));

    JButton jb1= new JButton("치킨");
    JButton jb2= new JButton("햄버거");
    JButton jb3= new JButton("감자튀김");
    JButton jb4= new JButton("음료수");
    JButton jb5= new JButton("결정");

    JTextField jt1= new JTextField("0"); // 판매 금액
    JTextField jt2= new JTextField("0"); //치킨판매 개수
    JTextField jt3= new JTextField("0"); //햄버거 판매 개수
    JTextField jt4= new JTextField("0"); //감자튀김 판매 개수
    JTextField jt5= new JTextField("0"); //음료수 판매 개수

    JLabel j1= new JLabel("치킨");
    JLabel j2= new JLabel("햄버거");
    JLabel j3= new JLabel("감자튀김");
    JLabel j4= new JLabel("음료수");

    ImageIcon ji1 = new ImageIcon("image/치킨.jpg");
    JLabel imagelabel1 = new JLabel(ji1);
    ImageIcon ji2 = new ImageIcon("image/햄버거.jpg");
    JLabel imagelabel2 = new JLabel(ji2);
    ImageIcon ji3 = new ImageIcon("image/감자튀김.jpg");
    JLabel imagelabel3 = new JLabel(ji3);
    ImageIcon ji4 = new ImageIcon("image/음료수.jpg");
    JLabel imagelabel4 = new JLabel(ji4);

    int Num1=0; // 치킨 총개수
    int Num2=0; // 햄버거 총개수
    int Num3=0; // 감자튀김 총개수
    int Num4=0; // 음료수 총개수

    public Machine(){
        setTitle("자판기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(1000,650);
        setVisible(true);

        Container contentPane= getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(Color.GRAY);

        contentPane.add("Center",a);
        a.add("Center",jt1);
        contentPane.add("North",b);
        contentPane.add("South",c);

        init();
    }

    public void init() {
        b.add(jb1); //버튼 추가
        b.add(jb2);
        b.add(jb3);
        b.add(jb4);
        b.add(jb5);
        b.add(imagelabel1);
        b.add(imagelabel2);
        b.add(imagelabel3);
        b.add(imagelabel4);

        c.add(j1);
        c.add(j2);
        c.add(j3);
        c.add(j4);
        c.add(jt2);
        c.add(jt3);
        c.add(jt4);
        c.add(jt5);

        this.jb1.addMouseListener(this);
        this.jb2.addMouseListener(this);
        this.jb3.addMouseListener(this);
        this.jb4.addMouseListener(this);
        this.jb5.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        int val=0;
        if(e.getSource()==(JButton)jb1) {
            val=Integer.parseInt(jt1.getText());
            val+=15000; // 가격에 치킨 가격을 더한다.
            this.Num1=this.Num1+1; // 치킨 총개수

            jt2.setText(String.valueOf(Num1));
            jt1.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)jb2) {
            val= Integer.parseInt(jt1.getText());
            val+=5300; // 가격에 햄버거 가격을 더한다.
            this.Num2=this.Num2+1; //햄버거 총개수

            jt3.setText(String.valueOf(Num2));
            jt1.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)jb3) {
            val= Integer.parseInt(jt1.getText());
            val+=2500; // 가격에 감자튀김 가격을 더한다.
            this.Num3=this.Num3+1; //감자튀김 총개수

            jt4.setText(String.valueOf(Num3));
            jt1.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)jb4) {
            val= Integer.parseInt(jt1.getText());
            val+=2000; // 가격에 음료수가격을 더한다.
            this.Num4=this.Num4+1; //음료수 총개수

            jt5.setText(String.valueOf(Num4));
            jt1.setText(String.valueOf(val));
        }
        else if(e.getSource()==(JButton)jb5) {
            int price = Integer.parseInt(jt1.getText());
            InputMoney ip = new InputMoney(price);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
