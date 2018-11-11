/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehotelfinder;

import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.UIManager;

/**
 *
 * @author Rohith
 */
public class LoginRegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public LoginRegisterFrame() {
        UIManager.put("TabbedPane.contentOpaque", false);
        initComponents();
        registerPane.setBackground(new Color(240,240,240,75));
        loginPane.setBackground(new Color(240,240,240,75));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        mainPagePane = new javax.swing.JPanel();
        logoLabel2 = new javax.swing.JLabel();
        searchImageLabel = new javax.swing.JLabel();
        logoLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        loginPane = new javax.swing.JPanel();
        LoginUsernameLabel = new javax.swing.JLabel();
        loginUsernameField = new javax.swing.JTextField();
        loginPasswordLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        loginPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        registerPane = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        streetTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel1 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        dateChooserCombo = new datechooser.beans.DateChooserCombo();
        cityTextField = new javax.swing.JTextField();
        stateTextField = new javax.swing.JTextField();
        bgImgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Hotel Finder");
        setBounds(new java.awt.Rectangle(710, 100, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 800));

        mainPagePane.setBackground(new java.awt.Color(204, 255, 255));
        mainPagePane.setPreferredSize(new java.awt.Dimension(500, 700));
        mainPagePane.setLayout(null);

        logoLabel2.setFont(new java.awt.Font("Lithos Pro Regular", 1, 36)); // NOI18N
        logoLabel2.setForeground(new java.awt.Color(242, 240, 234));
        logoLabel2.setText("Finder");
        mainPagePane.add(logoLabel2);
        logoLabel2.setBounds(260, 80, 230, 70);

        searchImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rohith\\Downloads\\search.png")); // NOI18N
        mainPagePane.add(searchImageLabel);
        searchImageLabel.setBounds(310, 10, 50, 110);

        logoLabel1.setFont(new java.awt.Font("Lithos Pro Regular", 1, 36)); // NOI18N
        logoLabel1.setForeground(new java.awt.Color(242, 240, 234));
        logoLabel1.setText("The Hotel");
        mainPagePane.add(logoLabel1);
        logoLabel1.setBounds(90, 30, 230, 70);

        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 16)); // NOI18N

        LoginUsernameLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 17)); // NOI18N
        LoginUsernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        LoginUsernameLabel.setText("Username:");

        loginUsernameField.setColumns(20);
        loginUsernameField.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 17)); // NOI18N
        loginUsernameField.setForeground(new java.awt.Color(153, 153, 153));
        loginUsernameField.setText("Enter Username");
        loginUsernameField.setName("Enter Username"); // NOI18N
        loginUsernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        loginUsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterLoginAction(evt);
            }
        });

        loginPasswordLabel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 17)); // NOI18N
        loginPasswordLabel.setForeground(new java.awt.Color(51, 51, 51));
        loginPasswordLabel.setText("Password:");

        loginBtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 17)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(51, 51, 51));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        loginPasswordField.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 17)); // NOI18N
        loginPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        loginPasswordField.setText("password");
        loginPasswordField.setName("password"); // NOI18N
        loginPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        loginPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterLoginAction(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("New user? Open register tab.");

        javax.swing.GroupLayout loginPaneLayout = new javax.swing.GroupLayout(loginPane);
        loginPane.setLayout(loginPaneLayout);
        loginPaneLayout.setHorizontalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginPasswordLabel)
                            .addComponent(LoginUsernameLabel)
                            .addGroup(loginPaneLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(loginBtn))
                            .addComponent(loginUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPaneLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        loginPaneLayout.setVerticalGroup(
            loginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPaneLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(LoginUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loginPasswordLabel)
                .addGap(1, 1, 1)
                .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        loginPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginPasswordField, loginUsernameField});

        jTabbedPane1.addTab("Login", loginPane);

        nameLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 17)); // NOI18N
        nameLabel.setLabelFor(nameField);
        nameLabel.setText("Name:");

        nameField.setColumns(22);
        nameField.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        nameField.setForeground(new java.awt.Color(153, 153, 153));
        nameField.setText("Full Name");
        nameField.setName("Full Name"); // NOI18N
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterRegisterAction(evt);
            }
        });

        dobLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 17)); // NOI18N
        dobLabel.setLabelFor(dateChooserCombo);
        dobLabel.setText("Date of Birth:");

        streetTextField.setColumns(22);
        streetTextField.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        streetTextField.setForeground(new java.awt.Color(153, 153, 153));
        streetTextField.setText("Street");
        streetTextField.setName("Street"); // NOI18N
        streetTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        streetTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterRegisterAction(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 17)); // NOI18N
        addressLabel.setLabelFor(streetTextField);
        addressLabel.setText("Residential Address:");

        emailField.setColumns(22);
        emailField.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        emailField.setForeground(new java.awt.Color(153, 153, 153));
        emailField.setText("youremail@example.com");
        emailField.setName("youremail@example.com"); // NOI18N
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterRegisterAction(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 17)); // NOI18N
        emailLabel.setLabelFor(emailField);
        emailLabel.setText("Email ID:");

        usernameField.setColumns(22);
        usernameField.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText("Username");
        usernameField.setName("Username"); // NOI18N
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterRegisterAction(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 17)); // NOI18N
        usernameLabel.setLabelFor(usernameField);
        usernameLabel.setText("Username:");

        registerBtn.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 17)); // NOI18N
        passwordLabel.setLabelFor(passwordField);
        passwordLabel.setText("Password:");

        passwordField.setColumns(22);
        passwordField.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("password");
        passwordField.setName("password"); // NOI18N
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterRegisterAction(evt);
            }
        });

        passwordLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 17)); // NOI18N
        passwordLabel1.setLabelFor(passwordField1);
        passwordLabel1.setText("Password again:");

        passwordField1.setColumns(22);
        passwordField1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        passwordField1.setForeground(new java.awt.Color(153, 153, 153));
        passwordField1.setText("password");
        passwordField1.setName("password"); // NOI18N
        passwordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });
        passwordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enterRegisterAction(evt);
            }
        });

        dateChooserCombo.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo.setFormat(2);
    dateChooserCombo.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);

    cityTextField.setColumns(10);
    cityTextField.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
    cityTextField.setForeground(new java.awt.Color(153, 153, 153));
    cityTextField.setText("City");
    cityTextField.setName("City"); // NOI18N
    cityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            textFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            textFieldFocusLost(evt);
        }
    });
    cityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            enterRegisterAction(evt);
        }
    });

    stateTextField.setColumns(10);
    stateTextField.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
    stateTextField.setForeground(new java.awt.Color(153, 153, 153));
    stateTextField.setText("State");
    stateTextField.setName("State"); // NOI18N
    stateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            textFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            textFieldFocusLost(evt);
        }
    });
    stateTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            enterRegisterAction(evt);
        }
    });

    javax.swing.GroupLayout registerPaneLayout = new javax.swing.GroupLayout(registerPane);
    registerPane.setLayout(registerPaneLayout);
    registerPaneLayout.setHorizontalGroup(
        registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneLayout.createSequentialGroup()
            .addContainerGap(125, Short.MAX_VALUE)
            .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(registerBtn)
                .addComponent(passwordField1)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(usernameField)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(passwordLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(streetTextField, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dobLabel, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dateChooserCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneLayout.createSequentialGroup()
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(122, 122, 122))
    );
    registerPaneLayout.setVerticalGroup(
        registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(registerPaneLayout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(nameLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(dobLabel)
            .addGap(6, 6, 6)
            .addComponent(dateChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(addressLabel)
            .addGap(5, 5, 5)
            .addComponent(streetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(emailLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(usernameLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(passwordLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(passwordLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(21, 21, 21)
            .addComponent(registerBtn)
            .addContainerGap(84, Short.MAX_VALUE))
    );

    registerPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cityTextField, streetTextField});

    jTabbedPane1.addTab("Register", registerPane);

    mainPagePane.add(jTabbedPane1);
    jTabbedPane1.setBounds(-1, 140, 500, 660);

    bgImgLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rohith\\Downloads\\hotel_image_blur.jpg")); // NOI18N
    mainPagePane.add(bgImgLabel);
    bgImgLabel.setBounds(0, 0, 500, 800);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(mainPagePane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(mainPagePane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String username = loginUsernameField.getText();
        String password = loginPasswordField.getText();
        System.out.println(username + " " + password );

        if(TheHotelFinder.db.loginUser(username, password)){
            setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                     new HomePage().setVisible(true);
                }
            });
        }else{
            showMessage("Enter correct credentials.");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        String name = nameField.getText();
        String dob = dateChooserCombo.getText();
        String address[] = new String[3];
        address[0] = streetTextField.getText();
        address[1] = cityTextField.getText();
        address[2] = cityTextField.getText();
        String email = emailField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String password1 = passwordField1.getText();
        //System.out.println(name + " " + dob + " " +address + " " +email + " " +password );
        
        if(validate(name, dob, address, email, username, password, password1)){
            User u = new User(name, dob, address, email, username, password);
                if(TheHotelFinder.db.registerUser(u)){
                    showMessage("You have been registered succesfully.");
                    jTabbedPane1.setSelectedIndex(0);         
                }else{
                    //showMessage("Registration failed.");
                }

        }

    }//GEN-LAST:event_registerBtnActionPerformed

    private void textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusGained
        // TODO add your handling code here:
        javax.swing.JTextField tf = (javax.swing.JTextField)evt.getSource();
        if(tf.getText().equals(tf.getName())){
            tf.setText("");
        }
        tf.setForeground(new Color(0,0,0));
        
    }//GEN-LAST:event_textFieldFocusGained

    private void textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusLost
        // TODO add your handling code here:
        javax.swing.JTextField tf = (javax.swing.JTextField)evt.getSource();
        if(tf.getText().isEmpty()){
            tf.setForeground(new Color(153,153,153));
            tf.setText(tf.getName());        
        }
    }//GEN-LAST:event_textFieldFocusLost

    private void enterLoginAction(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterLoginAction
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            loginBtn.doClick();
        }
    }//GEN-LAST:event_enterLoginAction

    private void enterRegisterAction(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enterRegisterAction
        // TODO add your handling code here:
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            registerBtn.doClick();
        }
    }//GEN-LAST:event_enterRegisterAction
    
    
    public void clearFields(){
        loginUsernameField.setText(loginUsernameField.getName()); loginUsernameField.setForeground(new Color(153,153,153));
        loginPasswordField.setText(loginPasswordField.getName()); loginPasswordField.setForeground(new Color(153,153,153));
        nameField.setText(nameField.getName()); nameField.setForeground(new Color(153,153,153));
        streetTextField.setText(streetTextField.getName()); streetTextField.setForeground(new Color(153,153,153));
        cityTextField.setText(cityTextField.getName()); cityTextField.setForeground(new Color(153,153,153));
        stateTextField.setText(stateTextField.getName()); stateTextField.setForeground(new Color(153,153,153));
        usernameField.setText(usernameField.getName()); usernameField.setForeground(new Color(153,153,153));
        passwordField.setText(passwordField.getName()); passwordField.setForeground(new Color(153,153,153));
        passwordField1.setText(passwordField1.getName()); passwordField1.setForeground(new Color(153,153,153));
    }
    
    private boolean validate(String name, String  dob, String  address[], String  email, String username, String password, String password1){
        if(name.isEmpty()){
            showMessage("Name field is empty");
            return false;
        }
        if(password.isEmpty() | password.length()<6){
            showMessage("Minimum size for password is 6.");
            return false;
        }
        if(!password.equals(password1)){
            showMessage("Password does not match");
            return false;
        }
        if(email.isEmpty()){
            showMessage("Email field is empty");
            return false;
        }
        if(address[0].isEmpty() | address[1].isEmpty() | address[2].isEmpty()){
            showMessage("One of the Address fields is empty");
            return false;
        }
        if(username.isEmpty()){
            showMessage("Username field is empty");
            return false;
        }
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if(!email.matches(EMAIL_REGEX)){
            showMessage("Enter valid email address.");
            return false;
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM, yyyy");
        
        try{
            Date dobDate = formatter.parse(dob);
            if(dobDate.after(new Date())){
                showMessage("Enter valid date");
                return false;
            }
        }catch(ParseException e){
            System.out.println(e);
            showMessage("Enter Date of Birth");
            return false;
        }
        
        return true;
    }
    
    public void showMessage(String msg){
        jOptionPane1.showMessageDialog(this, msg);
    }
    
    public javax.swing.JOptionPane getJOption(){
        return jOptionPane1;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginUsernameLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel bgImgLabel;
    private javax.swing.JTextField cityTextField;
    private datechooser.beans.DateChooserCombo dateChooserCombo;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPane;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JTextField loginUsernameField;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JPanel mainPagePane;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel registerPane;
    private javax.swing.JLabel searchImageLabel;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetTextField;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
