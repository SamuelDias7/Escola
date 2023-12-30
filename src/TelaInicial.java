import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial {
    JButton b1,b2;
    JFrame frame;


    public void iniciar(){
        frame = new JFrame("Tela inicial");
        //frame.setBackground(Color.black);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
    }

    public void build(){
        b1 = new JButton("Sou aluno");
        b2 = new JButton("Sou professor");
    }

    public void add(){
        frame.add(b1);
        frame.add(b2);
    }

    public void action(){
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Autenticacao("aluno");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Autenticacao("prof");
            }
        });


    }

    TelaInicial(){
        this.iniciar();
        this.build();
        this.add();
        this.action();
    }

    public static void main(String args[]){
        new TelaInicial();
    }
}
