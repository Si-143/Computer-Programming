/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author ts348
 */
public class playlist extends JFrame
 implements ActionListener {
    JTextField musicText = new JTextField(10);
        JButton check = new JButton("Check Library");
        JButton main = new JButton("Main Menu");
        JButton quit = new JButton("Exit");

public playlist(){
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
        bottom.add(main); main.addActionListener(this);
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
       if (e.getSource() == quit)
     System.exit(0);    
}
}
