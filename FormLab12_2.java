import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class FormLab12_2 extends JFrame implements MouseListener {

    Container cp ;
    JButton allBT[] ;
    JLabel L ;
    int count = 0;
    
    public FormLab12_2(){
        Initial();
        setComponent();
        Finally();
    }
    public void Initial(){
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        allBT = new JButton[400];
    }
    public void setComponent(){

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(20,20));

        for(int i=0 ; i<400 ; i++){
            allBT[i] = new JButton();
            allBT[i].setBackground(Color.white);
            allBT[i].setPreferredSize(new Dimension(20, 20));

            allBT[i].addMouseListener(this);
            p.add(allBT[i]);
        }

        L = new JLabel("0");
        L.setPreferredSize(new Dimension(200, 40));
        L.setFont(new Font("Times New Roman", Font.BOLD , 20));
        L.setHorizontalAlignment(JLabel.CENTER);
        
        cp.add(L,BorderLayout.NORTH);
        cp.add(p,BorderLayout.CENTER);

    }
    public void Finally(){
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    Color tmp ;
        public void mouseClicked(MouseEvent e) { 
            if (tmp == Color.WHITE) {
                e.getComponent().setBackground(Color.RED);
                tmp = Color.RED;
                L.setText((++count)+"");
            } else if(tmp == Color.RED) {
                e.getComponent().setBackground(Color.WHITE);
                tmp = Color.WHITE;
                L.setText((--count)+"");
            }
        }
        public void mousePressed(MouseEvent e) { 
        }
        public void mouseReleased(MouseEvent e) {
        }
        public void mouseEntered(MouseEvent e) {
            tmp = e.getComponent().getBackground();
            e.getComponent().setBackground(Color.BLACK);
        }
        public void mouseExited(MouseEvent e) {
            e.getComponent().setBackground(tmp);
        }

}
