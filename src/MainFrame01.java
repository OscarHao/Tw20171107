import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame01 extends Frame{
    private Button btnAdd=new Button("RIGHT");
    private Button btnSub=new Button("LEFT");
    private Button btnUp=new Button("UP");
    private Button btnDown=new Button("DOWN");
    private Label lab1=new Label(">_<");
    private int count=0,height=0,labX=50,labY=50;
    public MainFrame01(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,100,500,400);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                System.exit(0);
            }
        });
        this.setLayout(null);
        lab1.setBounds(labX,labY,30,30);
        lab1.setBackground(new Color(193,255, 101));
        this.add(lab1);
        btnAdd.setBounds(50,300,100,30);
        this.add(btnAdd);
        btnSub.setBounds(150,300,100,30);
        this.add(btnSub);
        btnUp.setBounds(250,300,100,30);
        this.add(btnUp);
        btnDown.setBounds(350,300,100,30);
        this.add(btnDown);
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame01.this.setTitle(Integer.toString(--count));
                labX-= 15;
                lab1.setLocation(labX,labY);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame01.this.setTitle(Integer.toString(++count));
                labX+= 15;
                lab1.setLocation(labX,labY);
            }
        });
        btnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame01.this.setTitle(Integer.toString(--height));
                labY-= 15;
                lab1.setLocation(labX,labY);
            }
        });
        btnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame01.this.setTitle(Integer.toString(++height));
                labY+= 15;
                lab1.setLocation(labX,labY);
            }
        });



    }

}
