package jukebox;
//Import from java libary
//java.awt = Contains all of the classes for creating user interfaces and for painting graphics and images.
import java.awt.*;
//java.awt.event= Provides interfaces and classes for dealing with different types of events with the AWT components.
import java.awt.event.*;
//javax.swing = all java language. works on all java program. 
import javax.swing.*;
// name of the class//JFrame = An extended version of java.awt.
public class CheckLibrary extends JFrame
//
// ActionListener= The listener interface for receiving action events.
                  implements ActionListener {
    // create new JTextfield named "trackNo"
    JTextField trackNo = new JTextField(2);
    // create new textarea named "information"
    TextArea information = new TextArea(6, 50);
    // create new JButton name "list" 
    JButton list = new JButton("List All Tracks");
    // create new Jbutton name "check"
    JButton check = new JButton("Check Track");
    public CheckLibrary() {
        // set borderlayout
        setLayout(new BorderLayout());
        //border size
        setBounds(100, 100, 400, 200);
        // set title name to "check library" 
        setTitle("Check Library");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel top = new JPanel();
        // add JLabel
        top.add(new JLabel("Enter Track Number:"));
        // add buttons (trackNo,check,List) to the top section of the GUI
        top.add(trackNo);
        top.add(check);
        top.add(list);
        // listen for the button "list" beening pressed. 
        list.addActionListener(this);
        // listen for the button "check" beening pressed. 
        check.addActionListener(this);
        add("North", top);
        // add the middle  panel to the GUI 
        JPanel middle = new JPanel();
        // show the list of song in the information text area. 
        information.setText(LibraryData.listAll());
        middle.add(information);
        add("Center", middle);
// the user is unable to change the size of the GUI 
        setResizable(false);
        //  user is able to see the GUI. 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //action when the list button is pressed. 
        if (e.getSource() == list) {
                    //action when the informtation button is pressed. 
            information.setText(LibraryData.listAll());
        } else {
            // if the program is unable to find the song
            String key = trackNo.getText();
            String name = LibraryData.getName(key);
            if (name == null) {
                // when number is no vaild. 
                information.setText("No such track number");
            } else {
                //type in name of song in text field.
                information.setText(name + " - " + LibraryData.getArtist(key));
                information.append("\nRating: " + stars(LibraryData.getRating(key)));
                information.append("\nPlay count: " + LibraryData.getPlayCount(key));
            }
        }
    }

    private String stars(int rating) {
        String stars = "";
        for (int i = 0; i < rating; ++i) {
            stars += "*";
        }
        return stars;
    }
}