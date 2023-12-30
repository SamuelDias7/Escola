import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PortalProf {
    JMenuBar bar;
    JMenu menu;
    JMenuItem i1;
    JFrame frame;

    public void iniciar(){
        frame = new JFrame("Portal do professor");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public void buid(){
        bar = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Logout");
    }

    public void add(){
        frame.setJMenuBar(bar);
        bar.add(menu);
        menu.add(i1);

    }

    public void actions(){
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new TelaInicial();
            }
        });
    }

    PortalProf(){
        this.iniciar();
        this.buid();
        this.add();
        this.actions();
    }
}
