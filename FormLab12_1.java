import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormLab12_1 extends JFrame implements ActionListener{

    Container cp ;
    JLabel name , id ;
    JTextField t1 ,t2 ;
    JButton b1,b2 ;
    public FormLab12_1(){
        Initial();
        setComponent();
        Finally();
    }
    public void Initial(){
        cp = this.getContentPane();
        cp.setLayout(null);
    }
    public void setComponent(){
        id = new JLabel("ID : ");
        name = new JLabel("Name : ");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Add");
        b2 = new JButton("Clear");  
        
        id.setBounds(32, 10, 60, 25);
        name.setBounds(10, 40, 60, 25);
        t1.setBounds(60, 10, 120, 25);
        t2.setBounds(60, 40, 180, 25);
        b1.setBounds(30, 80, 70, 25);
        b2.setBounds(120, 80, 70, 25);
        
        cp.add(id); cp.add(t1);
        cp.add(name); cp.add(t2);
        cp.add(b1) ; cp.add(b2);

        t1.addKeyListener(new tmp(){
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if(!Character.isDigit(ch) && ch != ' '){
                    e.consume();
                }
            }
        });

        t2.addKeyListener(new tmp(){
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                    if(!Character.isAlphabetic(ch) && ch != ' '){
                    e.consume();
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });
        
    }
    public void Finally(){
        this.setSize(270, 160);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class tmp implements KeyListener{
        public void keyPressed(KeyEvent e) {
        }
        public void keyReleased(KeyEvent e) {  
        }
        public void keyTyped(KeyEvent e) {
        }
    }
	public void actionPerformed(ActionEvent e) {
	}
    
}