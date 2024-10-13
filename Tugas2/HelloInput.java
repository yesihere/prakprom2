package Tugas2;
import java.awt.event.*;
import javax.swing.*;

public class HelloInput extends JFrame{

    public HelloInput(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInput = new JLabel("Nama:");
        labelInput.setBounds(130,40,100,10);

        JTextField textField = new JTextField();
        textField.setBounds(130,60,100,30);

        JButton button = new JButton("klik");
        button.setBounds(130,100,100,40);

        JLabel labelOuput = new JLabel("");
        labelOuput.setBounds(130,150,100,10);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){
                String nama = textField.getText();
                labelOuput.setText("Hello" +nama);
            }
        });

        this.add(button);
        this.add(textField);
        this.add(labelInput);
        this.add(labelOuput);


        this.setSize(400,500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                HelloInput h = new HelloInput();
                h.setVisible(true);
            }
        });
        
    }

    
}
