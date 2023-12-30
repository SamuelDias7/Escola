import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PortalAluno {
    JMenuBar bar;
    JMenu menu;
    JMenuItem i1;
    JFrame frame;
    JButton b1,b2,b3,b4;

    public void iniciar(){
        frame = new JFrame("Portal do aluno");
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,2));
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }

    public void buid(){
        bar = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Logout");
        b1 = new JButton("Dados do estudante");
        b2 = new JButton("Consultar Notas");
        b3 = new JButton("Advertências");
        b4 = new JButton("Observações");
    }

    public void add(){
        frame.setJMenuBar(bar);
        bar.add(menu);
        menu.add(i1);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

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

    PortalAluno(){
        this.iniciar();
        this.buid();
        this.add();
        this.actions();
    }
}
