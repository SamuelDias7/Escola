import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro {
    JFrame frame;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JLabel l8,l9,l10;
    JLabel l11;
    JTextField c1,c2,c3,c4,c5,c6,c7;
    JTextField c8,c9,c10;
    JPasswordField s2;
    JButton b1,b2;
    String usuario;
    JMenuBar bar;
    JMenu menu;
    JMenuItem i1;
    JCheckBox m1,m2;

    public void iniciar(){
        frame = new JFrame("Tela de Cadastro");
        frame.setVisible(true);
        frame.setSize(400,700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);

    }

    public void build(){
        l1 = new JLabel("Nome");
        l2 = new JLabel("idade");
        //s2 = new JPasswordField("");
        c1 = new JTextField("");
        c2 = new JTextField("");
        c3 = new JTextField("");
        c4 = new JTextField("");
        c5 = new JTextField("");
        c6 = new JTextField("");

        c8 = new JTextField("");
        c9 = new JPasswordField("");
        c10 = new JPasswordField("");

        //s2 = new JPasswordField("");
        b1 = new JButton("Cadastrar");
        b2 = new JButton("Login");
        bar = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Voltar");
        l3 = new JLabel("genero?");
        l4 = new JLabel("telefone");
        l5 = new JLabel("e-mail");
        l6 = new JLabel("nome da mãe");
        l7 = new JLabel("nome do pai");

        l8 = new JLabel("Usuario");
        l9 = new JLabel("senha");
        l10 = new JLabel("Confirmar senha");

        m1 = new JCheckBox("masculino");
        m2 = new JCheckBox("feminino");

        l11 = new JLabel("Ja possui uma conta?");



    }
    public void add(){
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);

        frame.add(l8);
        frame.add(l9);
        frame.add(l10);

        frame.add(l11);

        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);
        frame.add(c5);
        frame.add(c6);

        frame.add(c8);
        frame.add(c9);
        frame.add(c10);
        //frame.add(c7);

        frame.add(c2);
        frame.add(b1);
        frame.add(b2);
        frame.setJMenuBar(bar);
        bar.add(menu);
        menu.add(i1);

        frame.add(m1);
        frame.add(m2);



    }

    public void bounds(){
        l1.setBounds(40,20,150,30);
        l2.setBounds(40,70,150,30);
        l3.setBounds(40,120,150,30);//
        l4.setBounds(40,170,150,30);
        l5.setBounds(40,220,150,30);
        l6.setBounds(40,270,150,30);
        l7.setBounds(40,320,150,30);

        l8.setBounds(40,370,150,30);
        l9.setBounds(40,420,150,30);
        l10.setBounds(40,470,150,30);

        l11.setBounds(40,600,130,20);


        c1.setBounds(80,20,150,30);
        c2.setBounds(80,70,150,30);
        m1.setBounds(90,120,100,30);
        m2.setBounds(210,120,100,30);
        c3.setBounds(100,170,100,30);
        c4.setBounds(80,220,150,30);
        c5.setBounds(120,270,150,30);
        c6.setBounds(120,320,150,30);

        c8.setBounds(90,370,150,30);
        c9.setBounds(80,420,150,30);
        c10.setBounds(140,470,150,30);



        b1.setBounds(40,530,130,25);
        b2.setBounds(165,600,130,20);

    }

    public void actions(String user){
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = c1.getText();
                String senha = c2.getText();

                JOptionPane.showMessageDialog(null, "dados cadastrados");
                frame.setVisible(false);
                new Autenticacao(user);




                /*

                if(user == "aluno"){
                    frame.setVisible(false);
                    new PortalAluno();

                }else if(user == "prof"){
                    frame.setVisible(false);
                    new PortalProf();

                }

                */


                //JOptionPane.showMessageDialog(null, usuario + "\n" + senha);
                // JOptionPane.showMessageDialog(null, user);

            }

        });
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new TelaInicial();
            }
        });
    }


    public Cadastro(String user){
        usuario = user;

        this.iniciar();
        this.build();
        this.add();
        this.bounds();
        this.actions(user);
    }

    public Cadastro(){

    }


}
