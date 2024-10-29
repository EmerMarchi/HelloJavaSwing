import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextField txtNome;
    private JButton btnValidar;
    private JLabel txtResultado;
    private JPanel mainPanel;
    private JLabel informeOSeuNomeLabel;
    public MainForm(){

        btnValidar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String nomeDigitado = txtNome.getText();

                        txtResultado.setText(nomeDigitado);
                    }
                }
        );
    }

    public static void main(String[] args) {
        //Cria a minha tela (TV)
        JFrame frame = new JFrame("Minhas primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha TV no tamanho do meu painel
        frame.pack();
        frame.setSize(500, 500);
        //Ligar a TV
        frame.setVisible(true);
    }

    }