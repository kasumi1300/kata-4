package kata4;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setTitle("Money Calculator");
        this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createComponents();
        this.setVisible(true);
    }

    private void createComponents() {
        this.add(createContent());
        this.add(createTollbar(),BorderLayout.SOUTH);
    }
    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        return button;
    }    
    private JPanel createContent() {
        JPanel panel = new JPanel();
        panel.add(new MoneyPannel());
        panel.add(new CurrencyPanel());
        return panel;
    }
    private JPanel createTollbar() {
        JPanel toolbar= new JPanel();
        toolbar.setLayout(new FlowLayout(FlowLayout.RIGHT));
        toolbar.add(createCalculateButton());
        toolbar.add(createExitButton());
        return toolbar;
    }
    private JButton createExitButton() {
        JButton button = new JButton("Exit");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });
        return button;
    }    
    private void calculate(){
        System.out.println("Calculating");
    }    
    private void exit(){
        dispose();
    }    
}
