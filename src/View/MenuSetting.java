package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuSetting extends JMenu {
    private final JMenu menuTheme;
    private final JMenuItem theme1;
    private final JMenuItem theme2;
    private final JMenuItem theme3;
    private final DictionaryView dictionaryView;
    private final JMenu menuAudio;
    private final JMenuItem voice1;
    private final JMenuItem voice2;

    public MenuSetting(DictionaryView frame) {
        this.dictionaryView = frame;
        setText("Setting");
        voice1 = new JMenuItem("Male");
        voice2 = new JMenuItem("Female");
        menuAudio = new JMenu("Select Speaker's Voice");
        menuTheme = new JMenu("Theme");
        theme1 = new JMenuItem("Nimbus");
        theme2 = new JMenuItem("Window");
        theme3 = new JMenuItem("Default");

        setShortCutKey();
        setAction();
        add();
    }

    private void setShortCutKey() {
        setMnemonic(KeyEvent.VK_S);
        menuAudio.setMnemonic(KeyEvent.VK_A);
        menuTheme.setMnemonic(KeyEvent.VK_T);
        //menuTheme.setMnemonic();
    }

    public void setAction() {

        theme1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(dictionaryView);
                } catch (Exception e) {
                    System.out.println("theme 1 error");
                }
            }
        });
        theme2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(dictionaryView);

                } catch (Exception e) {
                    System.out.println("theme 2 error");
                }
            }
        });
        theme3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(dictionaryView);

                } catch (Exception e) {
                    System.out.println("theme 3 error");
                }
            }
        });
        voice1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dictionaryView.setSpeaker("m");

            }
        });
        voice2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dictionaryView.setSpeaker("fm");

            }
        });

    }

    private void add() {
        add(menuTheme);
        add(menuAudio);
        menuAudio.add(voice1);
        menuAudio.add(voice2);
        menuTheme.add(theme1);
        menuTheme.add(theme2);
        menuTheme.add(theme3);
    }
}
