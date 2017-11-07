import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame {
    private JLabel lab=new JLabel("資工系鄭權豪");

    public MainFrame(){
        initcomp();

    }
    private void initcomp(){
        this.setBounds(100,120,400,300);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        lab.setOpaque(true);
        lab.setBounds(150,130,100,100 );
        lab.setBackground(new Color(150, 255, 47));
        this.add(lab);

    }
}
