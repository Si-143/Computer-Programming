/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author ts348
 */
public class CreateLibary extends JFrame
     implements ActionListener {
    JTextField musicText = new JTextField(100);
        JButton check = new JButton("Check Library");
        JButton playlist = new JButton("Create Playlist");
        JButton quit = new JButton("Exit");
        JButton main = new JButton("Main menu");
  

    
public CreateLibary() {
        setLayout(new BorderLayout());
        setSize(450, 100);
        setTitle("Jukebox");

        // close application only by clicking the quit button
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        JPanel top = new JPanel();
        top.add(new JLabel("Select an option by clicking one of the buttons below"));
        add("North", top);

        JPanel bottom = new JPanel();
        add(musicText);
        
        bottom.add(check); check.addActionListener(this);
        bottom.add(playlist); playlist.addActionListener(this);
        bottom.add(quit); quit.addActionListener(this);
        add("South", bottom);

        setResizable(false);
        setVisible(true);
}
      public void actionPerformed(ActionEvent e) {

      if (e.getSource() == main )
        new Jukebox2();
      if (e.getSource() == check)
          new CheckLibrary();
      if (e.getSource() == playlist)
        new playlist ();
       if (e.getSource() == quit)
     System.exit(0);    
}
}