package kata4;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MoneyPannel extends JPanel{

    public MoneyPannel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(createTextField());
        this.add(new CurrencyPanel());
    }
    private JTextField createTextField() {
        JTextField field = new JTextField(10);
        return field;
    }
}