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
    private final JFrame frame;

    public MenuSetting(JFrame frame) {
        this.frame = frame;
        setText("Setting");
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
        //menuTheme.setMnemonic();
    }

    public void setAction() {

        theme1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    SwingUtilities.updateComponentTreeUI(frame);
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
                    SwingUtilities.updateComponentTreeUI(frame);

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
                    SwingUtilities.updateComponentTreeUI(frame);

                } catch (Exception e) {
                    System.out.println("theme 3 error");
                }
            }
        });
    }

    private void add() {
        add(menuTheme);
        menuTheme.add(theme1);
        menuTheme.add(theme2);
        menuTheme.add(theme3);
    }
}
