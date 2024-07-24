/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jpanels;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oshan Demel
 */
public class AddApplicantPopup extends JDialog {

    private JTextField txtName, txtNic, txtPnum, txtAddress;
    private JLabel validateName, validateNic, validatePhoneNum, validateAddress;
    private JButton btnSave, btnCancel;
    private DefaultTableModel tableModel;

    public AddApplicantPopup(JFrame parent, DefaultTableModel model) {
        super(parent, "Add New Applicant", true);
        this.tableModel = model;
        initComponents();
        setLocationRelativeTo(parent);
        pack();
    }

    private void initComponents() {
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Name:"));
        txtName = new JTextField();
        add(txtName);
        validateName = new JLabel(" ");
        add(validateName);

        add(new JLabel("NIC:"));
        txtNic = new JTextField();
        add(txtNic);
        validateNic = new JLabel(" ");
        add(validateNic);

        add(new JLabel("Phone Number:"));
        txtPnum = new JTextField();
        add(txtPnum);
        validatePhoneNum = new JLabel(" ");
        add(validatePhoneNum);

        add(new JLabel("Address:"));
        txtAddress = new JTextField();
        add(txtAddress);
        validateAddress = new JLabel(" ");
        add(validateAddress);

        btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isvalidate()) {
                    saveApplicant();
                    clearField();
                    dispose();
                }
            }
        });
        add(btnSave);

        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(btnCancel);
    }

    private boolean isvalidate() {
        return NameValidate() & NicValidate() & TelephoneNumberValidate() & AddressValidate();
    }

    private boolean NameValidate() {
        if (txtName.getText().equals("")) {
            validateName.setText("Cannot be empty");
            return false;
        } else if (!Pattern.matches("[A-Za-z. ]{1,50}", txtName.getText())) {
            validateName.setText("Enter Valid Name (ex: Namal Rajapaksha)");
            return false;
        } else {
            validateName.setText(" ");
            return true;
        }
    }

    private boolean NicValidate() {
        if (txtNic.getText().equals("")) {
            validateNic.setText("Cannot be empty");
            return false;
        } else if (!Pattern.matches("^(([5-9]{1})([0-9]{1})([0-9]{1})([0-9]{6})([v|V|x|X]))|(([1-2]{1})([0-9]{1})([0-9]{2})([0-9]{7}))", txtNic.getText())) {
            validateNic.setText("Enter Valid NIC (ex: 722441524V or 200125302976)");
            return false;
        } else {
            validateNic.setText(" ");
            return true;
        }
    }

    private boolean TelephoneNumberValidate() {
        if (txtPnum.getText().isEmpty()) {
            validatePhoneNum.setText("Cannot be empty");
            return false;
        } else if (!Pattern.matches("[0-9]{10}", txtPnum.getText())) {
            validatePhoneNum.setText("Only 10 numbers (ex: 0778612779)");
            return false;
        } else {
            validatePhoneNum.setText(" ");
            return true;
        }
    }

    private boolean AddressValidate() {
        if (txtAddress.getText().isEmpty()) {
            validateAddress.setText("Cannot be empty");
            return false;
        } else if (!Pattern.matches("[A-Za-z0-9'\\.\\-\\s\\,\\/\\\\]{1,50}", txtAddress.getText())) {
            validateAddress.setText("Not a valid address (ex: 127 B, Main Street, Colombo 04)");
            return false;
        } else {
            validateAddress.setText(" ");
            return true;
        }
    }

    private void saveApplicant() {
        tableModel.addRow(new Object[]{
            txtNic.getText(),
            txtName.getText(),
            txtPnum.getText(),
            txtAddress.getText()
        });
    }

    private void clearField() {
        txtAddress.setText("");
        txtName.setText("");
        txtNic.setText("");
        txtPnum.setText("");
    }

}
