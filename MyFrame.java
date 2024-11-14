import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyFrame
{
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame("Secure Student Portal Login");   // Create a JFrame (window) with title "Login"
        myFrame.setSize(500, 550); // Set the size of the frame (width, height)
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close
        myFrame.getContentPane().setBackground(Color.PINK); // Set the background color of the content pane
        myFrame.setLayout(null); // Set layout to null for absolute positioning
        myFrame.setLocationRelativeTo(null); // Center the frame on screen

        Font labelFont = new Font("Arial", Font.BOLD | Font.ITALIC, 14); // Create a Font object (name, style, size)

        // Username Label and Text Field
        JLabel lbl_username = new JLabel("Username:"); // Create a label "Username:" using JLabel
        lbl_username.setBounds(50, 50, 150, 30); // Set position and size of the label (x, y, width, height)
        lbl_username.setFont(labelFont); // Set font for the label
        myFrame.add(lbl_username); // Add the label to the frame

        JTextField txt_username = new JTextField();
        txt_username.setBounds(210, 50, 150, 30); // Set position and size of the text field
        txt_username.setForeground(Color.BLUE); // Set text color to blue
        txt_username.setCaretColor(Color.BLUE); // Set caret (cursor) color to blue
        myFrame.add(txt_username); // Add the text field to the frame

        // Password Label and Password Field
        JLabel lbl_password = new JLabel("Password:"); // Create a label "Password:" using JLabel
        lbl_password.setBounds(50, 100, 150, 30); // Set position and size of the label (x, y, width, height)
        lbl_password.setFont(labelFont); // Set font for the label
        myFrame.add(lbl_password); // Add the label to the frame

        JPasswordField txt_password = new JPasswordField();
        txt_password.setBounds(210, 100, 150, 30); // Set position and size of the password field
        txt_password.setForeground(Color.BLUE); // Set text color to blue
        txt_password.setCaretColor(Color.BLUE); // Set caret (cursor) color to blue
        myFrame.add(txt_password); // Add the password field to the frame

        // Mobile Number Label and Text Field
        JLabel lbl_mobile = new JLabel("Mobile Number:"); // Create a label "Mobile Number:" using JLabel
        lbl_mobile.setBounds(50, 150, 150, 30); // Set position and size of the label (x, y, width, height)
        lbl_mobile.setFont(labelFont); // Set font for the label
        myFrame.add(lbl_mobile); // Add the label to the frame

        JTextField txt_mobile = new JTextField();
        txt_mobile.setBounds(210, 150, 150, 30); // Set position and size of the text field
        txt_mobile.setForeground(Color.BLUE); // Set text color to blue
        txt_mobile.setCaretColor(Color.BLUE); // Set caret (cursor) color to blue
        myFrame.add(txt_mobile); // Add the text field to the frame

        // Email Address Label and Text Field
        JLabel lbl_email = new JLabel("Email Address:"); // Create a label "Email Address:" using JLabel
        lbl_email.setBounds(50, 200, 150, 30); // Set position and size of the label (x, y, width, height)
        lbl_email.setFont(labelFont); // Set font for the label
        myFrame.add(lbl_email); // Add the label to the frame

        JTextField txt_email = new JTextField();
        txt_email.setBounds(210, 200, 150, 30); // Set position and size of the text field
        txt_email.setForeground(Color.BLUE); // Set text color to blue
        txt_email.setCaretColor(Color.BLUE); // Set caret (cursor) color to blue
        myFrame.add(txt_email); // Add the text field to the frame

        // Login Button
        JButton btn_login = new JButton("Login"); // Create a JButton with text "Login"
        btn_login.setBounds(160, 250, 100, 30); // Set position and size of the button
        myFrame.add(btn_login); // Add the button to the frame

        // Cancel Button
        JButton btn_cancel = new JButton("Cancel"); // Create a JButton with text "Cancel"
        btn_cancel.setBounds(270, 250, 100, 30); // Set position and size of the button
        myFrame.add(btn_cancel); // Add the button to the frame

        // Predefined credentials for validation
        String correctUsername = "user";
        String correctPassword = "pass";
        String correctMobile = "1234567890";
        String correctEmail = "user@gmail.com";

        // Common ActionListener for JTextField, JPasswordField, JButton
        ActionListener actionListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                performLogin(txt_username, txt_password, txt_mobile, txt_email, myFrame, correctUsername, correctPassword, correctMobile, correctEmail);
            }
        };

        // Attach the ActionListener to the login button
        btn_login.addActionListener(actionListener);

        // Attach the ActionListener to the cancel button
        btn_cancel.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                // Clear fields on cancel
                txt_username.setText("");
                txt_password.setText("");
                txt_mobile.setText("");
                txt_email.setText("");
                System.out.println("Cancelled login.");
            }
        });

        // Attach KeyListener to the username field
        txt_username.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    performLogin(txt_username, txt_password, txt_mobile, txt_email, myFrame, correctUsername, correctPassword, correctMobile, correctEmail);
                }
            }
        });

        // Attach KeyListener to the password field
        txt_password.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    performLogin(txt_username, txt_password, txt_mobile, txt_email, myFrame, correctUsername, correctPassword, correctMobile, correctEmail);
                }
            }
        });

        // Attach KeyListener to the mobile field
        txt_mobile.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    performLogin(txt_username, txt_password, txt_mobile, txt_email, myFrame, correctUsername, correctPassword, correctMobile, correctEmail);
                }
            }
        });

        // Attach KeyListener to the email field
        txt_email.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    performLogin(txt_username, txt_password, txt_mobile, txt_email, myFrame, correctUsername, correctPassword, correctMobile, correctEmail);
                }
            }
        });

        myFrame.setVisible(true); // Make the frame visible on screen
    }

    private static void performLogin(JTextField txt_username, JPasswordField txt_password, JTextField txt_mobile, JTextField txt_email, JFrame myFrame, String correctUsername, String correctPassword, String correctMobile, String correctEmail)
    {
        String username = txt_username.getText(); // Get text from the username field
        String password = new String(txt_password.getPassword()); // Get text from the password field
        String mobile = txt_mobile.getText(); // Get text from the mobile number field
        String email = txt_email.getText(); // Get text from the email field

        // Validate input
        if (!mobile.equals(correctMobile))
        {
            JOptionPane.showMessageDialog(myFrame, "Invalid mobile number.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!email.equals(correctEmail))
        {
            JOptionPane.showMessageDialog(myFrame, "Invalid email address.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (username.equals(correctUsername) && password.equals(correctPassword) && mobile.equals(correctMobile) && email.equals(correctEmail))
        {
            JOptionPane.showMessageDialog(myFrame, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            myFrame.dispose(); // Close login frame
            PersonalInfo.showForm(); // Show personal info form
        }
        else
        {
            JOptionPane.showMessageDialog(myFrame, "Login failed: Incorrect credentials.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
