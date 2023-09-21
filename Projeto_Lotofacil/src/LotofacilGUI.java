import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class LotofacilGUI extends JFrame{
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");
    // Construtor
    public LotofacilGUI(){
        this.setTitle("Lotofácil - Interface Gráfica"); //titulo
        this.setSize(400,200); //tamanho do painel
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20)); //
        painel.setBackground(new Color(255,255,255));
        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);
        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Scanner in = new Scanner (System.in)
                String aposta1 = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100");
                Random rnd = new Random();
                int sorteio = rnd.nextInt(101);
                int numeroApostado =  Integer.parseInt(aposta1);
                if (numeroApostado == sorteio) {
                    //System.out.println
                    JOptionPane.showMessageDialog(null, "Você ganhou!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Você perdeu! O número sorteado foi " + sorteio);
                }

            }
        });
        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta2 = JOptionPane.showInputDialog(null,"Digite uma letra de A à Z: ");
                char letraSorteada = 'A';
                char letraApostada = aposta2.charAt(0);
                if(Character.isLetter(letraApostada)){
                    char letraApostadaMaiusculo = Character.toUpperCase(letraApostada);
                    if(letraApostadaMaiusculo == letraSorteada){
                        JOptionPane.showMessageDialog(null,"Você ganhou quinhentão.\n");
                    }else {
                        JOptionPane.showMessageDialog(null,"Você perdeu!, a letra sorteada foi: " + letraSorteada + "\n");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Não é uma letra válida.");
                }

            }
        });
        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta3 = JOptionPane.showInputDialog(null,"Digite um número: ");
                int numeroApostado = Integer.parseInt(aposta3);
                if(numeroApostado % 2 == 0){
                    JOptionPane.showMessageDialog(null,"Você ganhou cenzão.");
                }else{
                    JOptionPane.showMessageDialog(null,"Você perdeu!");
                }
            }
        });
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //encerra o processo ao apertar no X
        this.setVisible(true); // Exibir janela
    }
    public static void main(String[] args) {
        new LotofacilGUI();}
}
