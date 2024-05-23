import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Form Pendaftaran Ulang");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2, 5, 5));

        
        
        JLabel nameLabel = new JLabel("Nama Lengkap", SwingConstants.LEFT);
        nameLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(100, 20));

        JLabel dobLabel = new JLabel("Tanggal Lahir", SwingConstants.LEFT);
        dobLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        JTextField dobField = new JTextField();
        dobField.setPreferredSize(new Dimension(100, 20));

        JLabel regLabel = new JLabel("Nomor Pendaftaran", SwingConstants.LEFT);
        regLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        JTextField regField = new JTextField();
        regField.setPreferredSize(new Dimension(100, 20));

        JLabel phoneLabel = new JLabel("No. Telp", SwingConstants.LEFT);
        phoneLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        JTextField phoneField = new JTextField();
        phoneField.setPreferredSize(new Dimension(100, 20));

        JLabel addressLabel = new JLabel("Alamat", SwingConstants.LEFT);
        addressLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        JTextField addressField = new JTextField();
        addressField.setPreferredSize(new Dimension(100, 20));

        JLabel emailLabel = new JLabel("E-mail", SwingConstants.LEFT);
        emailLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        JTextField emailField = new JTextField();
        emailField.setPreferredSize(new Dimension(100, 20));

        JButton submitButton = new JButton("Submit");
        submitButton.setPreferredSize(new Dimension(60, 30));

        
        
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(dobLabel);
        frame.add(dobField);
        frame.add(regLabel);
        frame.add(regField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(new JLabel()); 
        frame.add(submitButton);

       
       
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nameField.getText().isEmpty() || dobField.getText().isEmpty() || regField.getText().isEmpty() ||
                        phoneField.getText().isEmpty() || addressField.getText().isEmpty() || emailField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                } else {
                    int response = JOptionPane.showConfirmDialog(frame, "Apakah Anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                    if (response == JOptionPane.OK_OPTION) {
                        JFrame dataFrame = new JFrame("Data Mahasiswa");
                        dataFrame.setSize(300, 200);
                        JTextArea dataArea = new JTextArea();
                        dataArea.setText("Nama: " + nameField.getText() + "\n" +
                                         "Tanggal Lahir: " + dobField.getText() + "\n" +
                                         "No. Pendaftaran: " + regField.getText() + "\n" +
                                         "No. Telp: " + phoneField.getText() + "\n" +
                                         "Alamat: " + addressField.getText() + "\n" +
                                         "E-mail: " + emailField.getText());
                        dataArea.setEditable(false);
                        dataFrame.add(dataArea);
                        dataFrame.setVisible(true);
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}
