import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Autenticacao {
    JFrame frame;
    JLabel l1,l2,l3;
    JTextField c1;
    JPasswordField c2;
    JButton b1,b2;
    String usuario;
    JMenuBar bar;
    JMenu menu;
    JMenuItem i1;

    public void iniciar(){
        frame = new JFrame("Login");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);

    }

    public void build(){
        l1 = new JLabel("Usuario");
        l2 = new JLabel("Senha");
        c1 = new JTextField("");
        c2 = new JPasswordField("");
        b1 = new JButton("Login");
        b2 = new JButton("cadastrar");
        bar = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Voltar");
        l3 = new JLabel("Não tem uma conta?");

    }
    public void add(){
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(c1);
        frame.add(c2);
        frame.add(b1);
        frame.add(b2);
        frame.setJMenuBar(bar);
        bar.add(menu);
        menu.add(i1);

    }

    public void bounds(){
        l1.setBounds(40,110,100,30);
        l2.setBounds(40,170,100,30);
        l3.setBounds(40,300,150,20);
        c1.setBounds(100,110,150,30);
        c2.setBounds(100,170,150,30);
        b1.setBounds(110,220,130,25);
        b2.setBounds(160,300,100,20);


    }

    public void actions(String user){
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usuario = c1.getText();
                String senha = c2.getText();


                if(usuario.equals("")| senha.equals("")){
                    JOptionPane.showMessageDialog(null, "preencha os dados");

                }
                else{
                    //JOptionPane.showMessageDialog(null, "cachorro");
                    if(user == "aluno"){
                        frame.setVisible(false);
                        new PortalAluno();

                    }else if(user == "prof"){
                        frame.setVisible(false);
                        new PortalProf();
                    }

                }




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

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Cadastro(user);

            }
        });
    }


    public Autenticacao(String user){
        usuario = user;

        this.iniciar();
        this.build();
        this.add();
        this.bounds();
        this.actions(user);
    }


    public Autenticacao(){

    }


}
