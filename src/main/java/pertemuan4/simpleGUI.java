package pertemuan4;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;
// import java.awt.FlowLayout;

// public class simpleGUI {
//     //membuat construktor
//     public simpleGUI(){
//         //membuat frame atau jika ingin membuat rumah maka harus ada tanahnya, nah tanahnya yaiut frame
//         JFrame frame = new JFrame("Simple GUI");
//         JLabel lbl = new JLabel();
//         JTextField text1 = new JTextField(50);
//         JButton button1 = new JButton("Input");

//         //mengatur layout
//         frame.setLayout(new FlowLayout());
        
//         //mengatur ukuran
//         frame.setSize(720,400);

//         //mengatur
//         lbl.setText("Nama");
//         lbl.setFont(new java.awt.Font("Tahoma",0, 20));

//         //menampilkan
//         frame.add(lbl);
//         frame.add(text1);     
//         frame.add(button1);

        
//         //mengatur agar frame exit saat frame di close
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//         //menampilkan frame
//         frame.setVisible(true);
//     }
//     public static void main(String[] args) {
//         simpleGUI simple = new simpleGUI();
//     }
// }
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Konversi Suhu");
        JPanel panel = new JPanel();
        JLabel celsiusLabel = new JLabel("Inputkan Suhu Celcius: ");
        JTextField celsiusField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel(" Fahrenheit");
        
        //close frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ukuran frame
        frame.setSize(400, 300);


        panel.add(celsiusLabel);
        panel.add(celsiusField);
        panel.add(convertButton);
        panel.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String celsiusText = celsiusField.getText();
                double celsius = Double.parseDouble(celsiusText);
                double fahrenheit = (1.8 * celsius) + 32;
                resultLabel.setText(fahrenheit + " Fahrenheit");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}