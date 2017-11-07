import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame02 extends JFrame {
    private Container cp;
    private JPanel jpn = new JPanel(new GridLayout(3, 3));
    private JTextField jtf = new JTextField();
    private JButton jbtns[] = new JButton[9];

    public MainFrame02() {
        initComp();
    }

    private void initComp() {
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(5, 5));
        this.setBounds(100, 100, 400, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp.add(jtf, BorderLayout.NORTH);
        cp.add(jpn, BorderLayout.CENTER);
        jtf.setEditable(false);
        for (int i = 0; i < 9; i++) {
            jbtns[i] = new JButton(Integer.toString(i));
            jpn.add(jbtns[i]);
            jbtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmpButton = (JButton) e.getSource();
                    jtf.setText(jtf.getText() + tmpButton.getText());
                }
            });
        }
    }
}