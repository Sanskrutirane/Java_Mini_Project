import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class PersonalInfo {
    public static void showForm() {
        JFrame personalInfoFrame = new JFrame("Personal Information");
        personalInfoFrame.setSize(400, 400);
        personalInfoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        personalInfoFrame.setLayout(null);
        personalInfoFrame.setLocationRelativeTo(null);

        Font labelFont = new Font("Arial", Font.BOLD | Font.ITALIC, 14);

        JLabel lbl_name = new JLabel("Name:");
        lbl_name.setBounds(50, 50, 100, 30);
        lbl_name.setFont(labelFont);
        personalInfoFrame.add(lbl_name);

        JTextField txt_name = new JTextField();
        txt_name.setBounds(150, 50, 150, 30);
        personalInfoFrame.add(txt_name);

        JLabel lbl_address = new JLabel("Address:");
        lbl_address.setBounds(50, 100, 100, 30);
        lbl_address.setFont(labelFont);
        personalInfoFrame.add(lbl_address);

        JTextField txt_address = new JTextField();
        txt_address.setBounds(150, 100, 150, 30);
        personalInfoFrame.add(txt_address);

        JLabel lbl_class = new JLabel("Class:");
        lbl_class.setBounds(50, 150, 100, 30);
        lbl_class.setFont(labelFont);
        personalInfoFrame.add(lbl_class);

        String[] classes = {"FE", "SE", "TE"};
        JComboBox<String> comboBox_class = new JComboBox<>(classes);
        comboBox_class.setBounds(150, 150, 150, 30);
        personalInfoFrame.add(comboBox_class);

        JLabel lbl_gender = new JLabel("Gender:");
        lbl_gender.setBounds(50, 200, 100, 30);
        lbl_gender.setFont(labelFont);
        personalInfoFrame.add(lbl_gender);

        JRadioButton rbtn_male = new JRadioButton("Male");
        rbtn_male.setBounds(150, 200, 80, 30);
        personalInfoFrame.add(rbtn_male);

        JRadioButton rbtn_female = new JRadioButton("Female");
        rbtn_female.setBounds(240, 200, 80, 30);
        personalInfoFrame.add(rbtn_female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbtn_male);
        genderGroup.add(rbtn_female);

        JLabel lbl_nationality = new JLabel("Nationality:");
        lbl_nationality.setBounds(50, 250, 100, 30);
        lbl_nationality.setFont(labelFont);
        personalInfoFrame.add(lbl_nationality);

        JRadioButton rbtn_indian = new JRadioButton("Indian");
        rbtn_indian.setBounds(150, 250, 80, 30);
        personalInfoFrame.add(rbtn_indian);

        JRadioButton rbtn_foreign = new JRadioButton("Foreigner");
        rbtn_foreign.setBounds(240, 250, 100, 30);
        personalInfoFrame.add(rbtn_foreign);

        ButtonGroup nationalityGroup = new ButtonGroup();
        nationalityGroup.add(rbtn_indian);
        nationalityGroup.add(rbtn_foreign);

        JButton btn_submit = new JButton("Submit");
        btn_submit.setBounds(150, 300, 100, 30);
        personalInfoFrame.add(btn_submit);

        btn_submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = txt_name.getText();
                String address = txt_address.getText();
                String selectedClass = (String) comboBox_class.getSelectedItem();
                String gender = rbtn_male.isSelected() ? "Male" : "Female";
                String nationality = rbtn_indian.isSelected() ? "Indian" : "Foreigner";

                // Example: Print submitted information
                System.out.println("Name: " + name);
                System.out.println("Address: " + address);
                System.out.println("Class: " + selectedClass);
                System.out.println("Gender: " + gender);
                System.out.println("Nationality: " + nationality);
            }
        });

        personalInfoFrame.setVisible(true);
    }
}

