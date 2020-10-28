package View;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MenuHelp extends JMenu {
    private JMenuItem about;
    private AboutUs windowAboutUs;
    private class AboutUs extends JFrame {
        private JLabel image;
        private JButton githubButton;
        public AboutUs() {
            githubButton = new JButton("Source code");
            githubButton.setBounds(300,380,60,50);
            githubButton.setVisible(true);
            githubButton.setBackground(new Color(11,19,62));
            githubButton.setForeground(new Color(255, 255, 255));
            image = new JLabel(new ImageIcon("lib\\icon dictionary\\aboutus.png"));
            setBackground(new Color(11,19,62));
            //setSize(450,420);
            setTitle("About Us");
            setResizable(false);

            //add(githubButton,BorderLayout.SOUTH);
            //add(image,BorderLayout.CENTER);
            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                            .addComponent(image,443,443,443))

                            .addGroup(layout.createSequentialGroup()
                            .addComponent(githubButton,200,200,200)));
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(image,331,331,331)
                                .addComponent(githubButton,40,40,40)));
            pack();
            setLocationRelativeTo(null);

            githubButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        Desktop d = Desktop.getDesktop();
                        d.browse(new URI("https://github.com/anhpham197/DictionaryUET"));
                    } catch (IOException | URISyntaxException ex){
                        System.out.println("Error connect github");
                    }
                }
            });
        }
    }

    public MenuHelp() {
        about = new JMenuItem("About Us");
        setText("Help");
        setShortCutKey();
        setAction();
        add();
    }

    private void setAction() {
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                windowAboutUs = new AboutUs();
                windowAboutUs.setVisible(true);
            }
        });
    }
    private void add() {

        add(about);

    }

    private void setShortCutKey() {
        setMnemonic(KeyEvent.VK_H);
    }


}
