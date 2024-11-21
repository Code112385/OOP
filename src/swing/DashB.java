package swing;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.table.*;

/**
 *
 * @author senju
 */
public class DashB extends JFrame {

    String[] courses = {"Select course", "BSIT", "BSIE", "BSCpE"};
    static String row[][] = {{"", "12524", "kiwi", "toshi", "dan", "Male", "BSIT", "1", "1CG2"}, {"", "25685", "akashi", "senju", "yin", "Female", "BSIE", "3", "2CG2"}};
    static final String Col[] = {"PICTURE", "STUDENT ID", "LAST NAME", "FIRST NAME", "MIDDLE NAME", "GENDER", "COURSE", "YEAR", "SECTION"};
    DefaultTableModel model = new DefaultTableModel(row, Col);
    String imgpath;

    //Btn
    JButton addBtn = new JButton("ADD");
    JButton uploadBtn = new JButton("Upload Photo");
    JButton deleteBtn = new JButton("DELETE");
    JButton updateBtn = new JButton("UPDATE");
    JButton clrBtn = new JButton("CLEAR");

    //ComboBox
    JComboBox cb = new JComboBox(courses);

    //RadioBtn
    JRadioButton maleRBtn = new JRadioButton("Male");
    JRadioButton femaleRBtn = new JRadioButton("Female");

    //table
    JTable jt = new JTable(model);
    JScrollPane sp = new JScrollPane(jt);

    //checkbox
    JCheckBox y1 = new JCheckBox("1");
    JCheckBox y2 = new JCheckBox("2");
    JCheckBox y3 = new JCheckBox("3");
    JCheckBox y4 = new JCheckBox("4");

    //group btn
    ButtonGroup gender = new ButtonGroup();
    ButtonGroup yearlvl = new ButtonGroup();

    //Label
    JLabel year = new JLabel("Year:");
    JLabel gndr = new JLabel("Gender:");
    JLabel title = new JLabel("STUDENT INFORMATION");
    JLabel lname = new JLabel("LastName");
    JLabel fname = new JLabel("FirstName");
    JLabel mname = new JLabel("MiddleName");
    JLabel stuID = new JLabel("Student Id");
    JLabel section = new JLabel("Section");
    JLabel course = new JLabel("Course");

    JLabel pic = new JLabel();

    //txtF
    JTextField lnametxt = new JTextField();
    JTextField fnametxt = new JTextField();
    JTextField mnametxt = new JTextField();
    JTextField stuIDtxt = new JTextField();
    JTextField sectiontxt = new JTextField();

    DashB() {

        add(clrBtn);
        add(deleteBtn);
        add(updateBtn);
        add(uploadBtn);
        add(course);
        add(sectiontxt);
        add(section);
        add(stuIDtxt);
        add(stuID);
        add(mnametxt);
        add(mname);
        add(fnametxt);
        add(fname);
        add(lnametxt);
        add(pic);
        add(lname);
        add(title);
        add(gndr);
        add(year);
        add(addBtn);
        add(cb);
        add(y1);
        add(y2);
        add(y3);
        add(y4);
        add(maleRBtn);
        add(femaleRBtn);
        add(sp);
        yearlvl.add(y1);
        yearlvl.add(y2);
        yearlvl.add(y3);
        yearlvl.add(y4);
        gender.add(maleRBtn);
        gender.add(femaleRBtn);

        //Table
        sp.setBounds(105, 350, 800, 100);

        //Btn
        addBtn.setBounds(500, 300, 60, 25);
        updateBtn.setBounds(580, 300, 80, 25);
        deleteBtn.setBounds(680, 300, 80, 25);
        clrBtn.setBounds(780, 300, 80, 25);
        uploadBtn.setBounds(115, 270, 120, 25);

        //Labels
        year.setBounds(550, 220, 50, 20);
        gndr.setBounds(310, 220, 60, 20);
        title.setBounds(360, 40, 290, 37);
        title.setFont(new Font("Consolas", Font.BOLD, 28));
        lname.setBounds(310, 95, 100, 20);
        fname.setBounds(500, 95, 100, 20);
        mname.setBounds(690, 95, 100, 20);
        stuID.setBounds(310, 150, 100, 20);
        section.setBounds(500, 150, 100, 20);
        course.setBounds(690, 150, 100, 20);

        //checkB
        y1.setBounds(600, 220, 50, 20);
        y2.setBounds(650, 220, 50, 20);
        y3.setBounds(700, 220, 50, 20);
        y4.setBounds(750, 220, 50, 20);

        //Radio
        maleRBtn.setBounds(375, 221, 60, 20);
        femaleRBtn.setBounds(440, 221, 80, 20);

        //Picholder
        pic.setSize(150, 150);
        pic.setBounds(100, 100, 150, 150);
        pic.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //txtf
        lnametxt.setBounds(315, 120, 150, 20);
        fnametxt.setBounds(505, 120, 150, 20);
        mnametxt.setBounds(695, 120, 150, 20);
        stuIDtxt.setBounds(315, 175, 150, 20);
        sectiontxt.setBounds(505, 175, 150, 20);

        //combobox
        cb.setBounds(695, 175, 150, 19);

        this.setSize(1020, 720);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        // this.add();
        this.setVisible(true);
        
      

        uploadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser fl = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg", "png");
                fl.setCurrentDirectory(new File("C:\\OOP1\\Images"));
                fl.addChoosableFileFilter(filter);

                int rslt = fl.showDialog(null, "Upload");
                if (rslt == JFileChooser.APPROVE_OPTION) {
                    File selectedfile = fl.getSelectedFile();
                    imgpath = selectedfile.getAbsolutePath();
                    ImageIcon newImage = new ImageIcon(imgpath);
                    Image image = newImage.getImage();
                    Image myImage = image.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                    newImage = new ImageIcon(myImage);
                    pic.setIcon(newImage);
                    System.out.println("Image Uploaded");
                } else {
                    System.out.println("No File Selected");
                }
            }
        });

        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = jt.getSelectedRow();
                int message = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Message", JOptionPane.YES_NO_OPTION);
                if (message == 0) {
                    model.removeRow(row);
                    clear();
                }

            }
        });

        jt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jt.getSelectedRow();

                imgpath = model.getValueAt(row, 0).toString();
                ImageIcon newImage = new ImageIcon(imgpath);
                Image image = newImage.getImage();
                Image myImage = image.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
                newImage = new ImageIcon(myImage);
                pic.setIcon(newImage);

                String ID = model.getValueAt(row, 1).toString();
                String Lname = model.getValueAt(row, 2).toString();
                String Fname = model.getValueAt(row, 3).toString();
                String Mname = model.getValueAt(row, 4).toString();
                String Gender = model.getValueAt(row, 5).toString();
                String Course = model.getValueAt(row, 6).toString();
                String Year = model.getValueAt(row, 7).toString();
                String Section = model.getValueAt(row, 8).toString();

                stuIDtxt.setText(ID);
                lnametxt.setText(Lname);
                fnametxt.setText(Fname);
                mnametxt.setText(Mname);
                sectiontxt.setText(Section);

                if (Gender.equals(maleRBtn.getText())) {
                    maleRBtn.setSelected(true);
                } else if (Gender.equals(femaleRBtn.getText())) {
                    femaleRBtn.setSelected(true);
                }

                for (String courselist : courses) {

                    if (Course.equals(courselist)) {
                        cb.setSelectedItem(courselist);
                    }
                }

                if (Year.equals(y1.getText())) {
                    y1.setSelected(true);
                } else if (Year.equals(y2.getText())) {
                    y2.setSelected(true);
                } else if (Year.equals(y3.getText())) {
                    y3.setSelected(true);
                } else if (Year.equals(y4.getText())) {
                    y4.setSelected(true);
                }

            }

        });

        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Shehe", "mess", JOptionPane.OK_OPTION);

                int row = jt.getSelectedRow();
                
                String ID = stuIDtxt.getText();
                String Lname = lnametxt.getText();
                String Fname = fnametxt.getText();
                String Mname = mnametxt.getText();
                String Gender = maleRBtn.isSelected()? "Male" : "Female";
                String Course = cb.getSelectedItem().toString();
                //String Year = 
                
                //Kulang pa to
                  
                


                model.setValueAt(imgpath, row, 0);
                model.setValueAt(ID, row, 1);
                model.setValueAt(Lname, row, 2);
                model.setValueAt(Fname, row, 3);
                model.setValueAt(Mname, row, 4);
                model.setValueAt(Gender, row, 5);
                model.setValueAt(Course, row, 6);
             //   model.setValueAt(Year, row, 7);
                

            }

        });

    }

    private void clear() {
        lnametxt.setText("");
        fnametxt.setText("");
        mnametxt.setText("");
        stuIDtxt.setText("");
        sectiontxt.setText("");
    }

}
