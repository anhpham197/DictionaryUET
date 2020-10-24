package View;

import API.Speaker;
import Controller.DictionaryController;
import Entity.Word;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DictionaryView extends JFrame {
    /**
     * Creates new form DictionaryView
     */
    DictionaryController controller;
    Options options;
    private final List<Word> listWord;
    private JMenuBar menu;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTextPane jTextPane1;
    private JList<Word> listSearchWord;
    private JButton speakButton;
    private JButton undoButton;
    private JButton optionsButton;
    private JLabel searchIcon;
    private JTextField searchTextField;
    private JTextArea showDefine;
    private JButton transButton;
    //API
    private Speaker speaker;

    public DictionaryView() throws SQLException {
        controller = new DictionaryController();
        options = new Options();
        //get all words from DB
        listWord = controller.ShowList();
        initComponents();
        initAPI();
        // Set Title
        setTitle("~ DICTIONARY UET BY OASISSS ~");
        setJMenuBar(menu);

        setMenu();
        setDefaultWordList();
        SetAction();
    }

    private void initAPI() {
        speaker = new Speaker();
    }

    private void initComponents() {

        jScrollPane2 = new JScrollPane();
        jTextPane1 = new JTextPane();
        jScrollPane1 = new JScrollPane();
        listSearchWord = new JList<>();
        searchTextField = new JTextField();
        searchIcon = new JLabel();
        transButton = new JButton();
        jScrollPane3 = new JScrollPane();
        showDefine = new JTextArea();
        optionsButton = new JButton();
        speakButton = new JButton();
        undoButton = new JButton();
        menu = new JMenuBar();
        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));

        listSearchWord.setBackground(new Color(204, 255, 204));
        listSearchWord.setBorder(new MatteBorder(null));
        listSearchWord.setFont(new Font("Consolas", 2, 14)); // NOI18N
        jScrollPane1.setViewportView(listSearchWord);

        searchIcon.setIcon(new ImageIcon("icon dictionary\\book1.png")); // NOI18N

        searchTextField.add(searchIcon);

        showDefine.setLineWrap(true);
        showDefine.setBackground(new Color(204, 204, 204));
        showDefine.setColumns(20);
        showDefine.setFont(new Font("Consolas", 0, 14)); // NOI18N
        showDefine.setRows(5);
        showDefine.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(51, 51, 0)));
        showDefine.setEditable(false);
        jScrollPane3.setViewportView(showDefine);

        transButton.setBackground(new Color(82, 182, 255));
        transButton.setFont(new Font("Arial Black", 1, 11)); // NOI18N
        transButton.setText("TRANS");
        transButton.setToolTipText("Translate");
        transButton.setBorder(new MatteBorder(null));

        optionsButton.setBackground(new Color(153, 153, 255));
        optionsButton.setFont(new Font("Arial Black", 1, 11)); // NOI18N
        optionsButton.setText("OPTIONS");
        optionsButton.setBorder(new MatteBorder(null));

        speakButton.setIcon(new ImageIcon("icon dictionary\\speaker1.png"));
        speakButton.setBackground(new Color(255, 255, 255));
        speakButton.setFont(new Font("Arial Black", 1, 11)); // NOI18N
        speakButton.setToolTipText("Speak");
        speakButton.setBorder(new MatteBorder(null));

        undoButton.setIcon(new ImageIcon("icon dictionary\\undo1.png"));
        undoButton.setBackground(new Color(255, 255, 255));
        undoButton.setFont(new Font("Arial Black", 1, 11)); // NOI18N
        undoButton.setToolTipText("Undo");
        undoButton.setBorder(new MatteBorder(null));


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, true)
                                        .addGroup(layout.createSequentialGroup()

                                                .addComponent(searchIcon)
                                                //.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(searchTextField, 100, 200, 600)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(transButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))

                                        .addComponent(jScrollPane1, 300, 300, Short.MAX_VALUE))

                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, true)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 400, 800)
                                                .addGap(5, 10, 12))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(optionsButton, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 15, 25)
                                                .addComponent(speakButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 15, 25)
                                                .addComponent(undoButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 15, 25)
                                        )))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(optionsButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 10, 15)
                                        .addComponent(speakButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 10, 15)
                                        .addComponent(undoButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(5, 15, 15)
                                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 400, 3000)
                                .addGap(5, 10, 15))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.CENTER, layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                                .addComponent(searchTextField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(transButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(searchIcon, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 412, 2000)
                                .addGap(10, 15, 20))
        );
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void SetAction() {//GEN-FIRST:event_SearchActionPerformed
        searchTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                updateWordList(searchTextField.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                updateWordList(searchTextField.getText());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                updateWordList(searchTextField.getText());
            }
        });
        searchTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transButtonActionPerformed();
            }
        });
        listSearchWord.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showDefine.setText(listSearchWord.getSelectedValue().showInTextArea());
                searchTextField.setText(listSearchWord.getSelectedValue().getWord());
                setDefaultWordList();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //don't use.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //don't use.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //don't use.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //don't use.
            }
        });
        optionsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                optionsButtonActionPerformed();
            }
        });
        transButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                transButtonActionPerformed();
            }
        });
        speakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speakButtonActionPerformed();
            }
        });

    }

    private void setDefaultWordList() {
        DefaultListModel<Word> listModelWord = new DefaultListModel<>();
        for (Word a : listWord) {
            listModelWord.addElement(a);
        }
        listSearchWord.setModel(listModelWord);
    }

    private void updateWordList(String characters) {
        DefaultListModel<Word> listModelWord = new DefaultListModel<>();
        for (Word a : listWord) {
            if (a.getWord().contains(characters)) {
                listModelWord.addElement(a);
            }
        }

        listSearchWord.setModel(listModelWord);
    }

    private void transButtonActionPerformed() {//GEN-FIRST:event_transButtonActionPerformed
        showDefine.setText("");
        String text = searchTextField.getText();
        try {
            Word res = controller.SearchWord(text);
            if (res != null) {
                showDefine.setText(res.showInTextArea());
            } else {
                //search online word
                JOptionPane.showMessageDialog(this, "Can't find your word \nPlease try again! ", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DictionaryView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_transButtonActionPerformed

    private void speakButtonActionPerformed() {
        System.out.println("press Speaker");
        try {
            String text = searchTextField.getText();
            if (text.length() <= 0) {
                JOptionPane.showMessageDialog(this, "Can't find your word \nPlease try again! ", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (text.length() > 0 && text.length() <= 150) {
                speaker.buildMP3(text);
                speaker.play();
            } else {
                JOptionPane.showMessageDialog(this, "Your text is too long \n Please try again!", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void optionsButtonActionPerformed() {//GEN-FIRST:event_optionsButtonActionPerformed
        options.setVisible(true);
    }//GEN-LAST:event_optionsButtonActionPerformed

    private void setMenu() {
        menu.add(new MenuSetting(this));
    }


    // End of variables declaration//GEN-END:variables
}
