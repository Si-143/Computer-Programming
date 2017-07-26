package jukebox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jukebox2 extends JFrame
                  implements ActionListener {
        JButton check = new JButton("Check Library");
        JButton playlist = new JButton("Create Playlist");
        JButton update = new JButton("Create Library");
        JButton quit = new JButton("Exit");
    public static void main(String[] args) {
    new Jukebox2();
    }
    
    public Jukebox2() {
        setLayout(new BorderLayout());
        setSize(750, 200);
        setTitle("Jukebox");

        // close application only by clicking the quit button
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        JPanel top = new JPanel();
        top.add(new JLabel("Select an option by clicking one of the buttons below"));
        add("North", top);

        JPanel bottom = new JPanel();
        bottom.add(check); check.addActionListener(this);
        bottom.add(playlist); playlist.addActionListener(this);
        bottom.add(update); update.addActionListener(this);
        bottom.add(quit); quit.addActionListener(this);
        add("South", bottom);

        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == update )
        new CreateLibary();
      if (e.getSource() == check)
          new CheckLibrary();
      if (e.getSource() == playlist)
        new playlist ();
      if (e.getSource() == quit)
     System.exit(0);    
    }
}