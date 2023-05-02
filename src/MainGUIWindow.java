import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener{
    @Override
    public void actionPerformed (ActionEvent e){
        Object source = e.getSource();
        if (source instanceof JButton){
            JButton button = (JButton) source;
            String text = button.getText();
            System.out.println(text + " here");
            if (text.equals("Click me 1!")){
                myText.append("Button 1 clicked");
            }
            else{
                myText.append("Button 2 clicked");
            }
        }
    }

    @Override
    public void keyTyped (KeyEvent e){};

    @Override
    public void keyPressed (KeyEvent e){};

    @Override
    public void keyReleased(KeyEvent e){};

    private JPanel mainPanel;
    private JTextArea myText;
    private JList list1;
    private JButton clickMe1Button;
    private JButton clickMe2Button;


    public MainGUIWindow(){
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("My GUI!");
        setSize(300, 400);
        setLocation (450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        clickMe1Button.addActionListener(this);
        clickMe2Button.addActionListener(this);
    }

}
