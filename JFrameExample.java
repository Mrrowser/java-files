import java.awt.*;
import javax.swing.*;

public class JFrameExample
{
    public static void main(String[] args)
    {
		//title of frame
        JFrame frame = new JFrame("Welcome Rowser");

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello Rowser...WElcome to UI.!");
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}