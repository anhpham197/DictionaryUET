package View;

import Controller.DictionaryController;
import Entity.Word;

import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Options extends javax.swing.JFrame {

    private DictionaryController controller;
    private Word word;
    private javax.swing.JLabel logo;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel defineLabel;
    private javax.swing.JTextArea defineTextArea;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel pronunciationLabel;
    private javax.swing.JTextArea pronunciationTextArea;
    private javax.swing.JLabel wordLabel;
    private javax.swing.JTextArea wordTextArea;
    public Options() {
        initComponents();
        setTitle("~ SELECT AN OPTION ~");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {
        setIconImages(null);
        wordLabel = new javax.swing.JLabel();
        pronunciationLabel = new javax.swing.JLabel();
        defineLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        pronunciationTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        defineTextArea = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        controller = new DictionaryController();
        word = new Word();


        wordLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        wordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordLabel.setText(" WORD");

        pronunciationLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        pronunciationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pronunciationLabel.setText(" PRONUNCIATION");

        defineLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        defineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defineLabel.setText(" DEFINE");

        wordTextArea.setLineWrap(true);
        wordTextArea.setColumns(20);
        wordTextArea.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        wordTextArea.setRows(5);
        jScrollPane1.setViewportView(wordTextArea);

        pronunciationTextArea.setLineWrap(true);
        pronunciationTextArea.setColumns(20);
        pronunciationTextArea.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        pronunciationTextArea.setRows(5);
        jScrollPane2.setViewportView(pronunciationTextArea);

        defineTextArea.setLineWrap(true);
        defineTextArea.setColumns(20);
        defineTextArea.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        defineTextArea.setRows(50);
        jScrollPane3.setViewportView(defineTextArea);

        deleteButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("icon dictionary\\book2.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(defineLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pronunciationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jScrollPane3)))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(pronunciationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(defineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                                        .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())
                                        .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int dialog = JOptionPane.showConfirmDialog(this, "Are you sure?", "VERIFY",
                JOptionPane.OK_CANCEL_OPTION);
        switch (dialog) {
            case JOptionPane.OK_OPTION:
                try {
                    Word output = controller.SearchWord(findWord());
                    if (findWord().length() == 0) {
                        JOptionPane.showMessageDialog(this, "Please enter your word!", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    } else if (output == null) {
                        JOptionPane.showMessageDialog(this, "This word doesn't exist!\nPlease try again.",
                                "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        controller.DeleteWord(findWord());
                        JOptionPane.showMessageDialog(this, "Successfully");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
                }
                wordTextArea.setText("");
                break;
            case JOptionPane.CANCEL_OPTION:
                break;
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        wordTextArea.setText("");
        pronunciationTextArea.setText("");
        defineTextArea.setText("");
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int dialog = JOptionPane.showConfirmDialog(this, "Are you sure?", "VERIFY", JOptionPane.OK_CANCEL_OPTION);
        word.setWord(findWord());
        word.setPronunciation(findPronunciation());
        word.setDefine(findDefine());
//      System.out.println("New Word: " + NewWord().length());
        switch (dialog) {
            case JOptionPane.OK_OPTION:
                try {
                    Word output = controller.SearchWord(findWord());
                    if (findWord().length() == 0) {
                        JOptionPane.showMessageDialog(this, "Please enter your new word!", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    } else if (output != null) {
                        JOptionPane.showMessageDialog(this, "This word has existed!\nPlease try again.", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        controller.AddNewWord(word);
                        JOptionPane.showMessageDialog(this, "Successfully");
                        wordTextArea.setText("");
                        pronunciationTextArea.setText("");
                        defineTextArea.setText("");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            case JOptionPane.CANCEL_OPTION:
                break;
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        int dialog = JOptionPane.showConfirmDialog(this, "Are you sure?", "VERIFY",
                JOptionPane.OK_CANCEL_OPTION);
        word.setWord(findWord());
        word.setPronunciation(findPronunciation());
        word.setDefine(findDefine());

        switch (dialog) {
            case JOptionPane.OK_OPTION:
                try {
                    Word output = controller.SearchWord(findWord());
                    if (findWord().length() == 0) {
                        JOptionPane.showMessageDialog(this, "Please enter your word!", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    } else if (output == null) {
                        JOptionPane.showMessageDialog(this, "This word doesn't exist!\nPlease try again.",
                                "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        controller.UpdateWord(word, findPronunciation(), findDefine());
                        JOptionPane.showMessageDialog(this, "Successfully");
                        wordTextArea.setText("");
                        pronunciationTextArea.setText("");
                        defineTextArea.setText("");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;

            case JOptionPane.CANCEL_OPTION:
                break;
        }
    }//GEN-LAST:event_editButtonActionPerformed

    public String findWord() {
        return wordTextArea.getText();
    }

    public String findPronunciation() {
        return pronunciationTextArea.getText();
    }

    public String findDefine() {
        return defineTextArea.getText();
    }

}
