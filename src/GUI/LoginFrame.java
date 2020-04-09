package GUI;

import model.Client;
import Service.LoginService;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    /*private JLabel l1 = new JLabel("Username: ");
    private JTextField t1 = new JTextField(20);

    private JLabel l2 = new JLabel("Password: ");
    private JPasswordField t2 = new JPasswordField(20);

    private JButton b = new JButton("LOGIN");

    public LoginFrame() {
        setLayout(new FlowLayout());

        add(l1); add(t1);
        add(l2); add(t2);
        add(b);

        b.addActionListener(ev -> {
            String username = t1.getText();
            String password = t2.getText();

            LoginService service = new LoginService();
            Client client = new Client();
            client.setUsername(username);
            client.setPassword(password);
            boolean res = service.login(client);

            if(res) {
                JOptionPane.showMessageDialog(null, "Login reusit");
            }

            else {
                JOptionPane.showMessageDialog(null, "Login esuat");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
    }*/
}
