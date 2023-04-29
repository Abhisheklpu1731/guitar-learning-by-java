/*Java Program to learn guitar*/

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class Switch_Frame implements ActionListener

{

    static JFrame frame1;

    static JFrame frame2;

    static JFrame frame3;

    static JFrame frame4;

    static JFrame frame5;

    static JButton aboutguitar;

    static JButton chords;

    static JButton back;
    static JButton Back1;
    static JButton back2;

    static JButton gmajor;
    static JButton cmajor;
    static JButton dmajor;

    static JLabel l;

    // Driver function

    public static void main(String args[])

    {

        // Create frame 1

        frame1 = new JFrame("ABHI GUITAR LEARNING");

        frame1.setSize(300, 450);

        frame1.setLayout(null);

        frame1.getContentPane().setBackground(new Color(124, 60, 146));

        // image bg
        Container c = frame1.getContentPane(); // Gets the content layer
        JLabel label = new JLabel(); // JLabel Creation
        label.setIcon(new ImageIcon("ag1.jpg")); // Sets the image to be displayed as an icon
        label.setBounds(0, 0, 300, 450); // Sets the location of the image
        c.add(label); // Adds objects to the container

        // Create next and close buttons

        aboutguitar = new JButton("aboutguitar");

        chords = new JButton("chords");

        aboutguitar.setBounds(50, 320, 100, 30);

        chords.setBounds(150, 320, 100, 30);

        // Add the buttons to frame 1

        frame1.add(aboutguitar);

        frame1.add(chords);

        // Create an object

        Switch_Frame obj = new Switch_Frame();

        // Associate ActionListener with the buttons

        aboutguitar.addActionListener(obj);

        chords.addActionListener(obj);

        // Display frame 1

        frame1.setVisible(true);

    }

    // Function to perform actions related to button clicked

    public void actionPerformed(ActionEvent e)

    {

        String button = e.getActionCommand();

        if (button.equals("aboutguitar"))

        {

            create_frame2();

        }
        if (button.equals("chords"))

        {

            create_frame3();

        }
        if (button.equals("gmajor"))

        {

            create_frame4();

        }

        if (button.equals("Back"))

        {

            frame2.dispose();

        }
        if (button.equals("Back2"))

        {

            frame4.dispose();

        }
        if (button.equals("Back1"))

        {

            frame5.dispose();

        }

        if (button.equals("cmajor"))

        {

            create_frame5();

        }

    }

    // function to create Frame 2

    public static void create_frame2()

    {

        // Create frame 2

        frame2 = new JFrame("Frame 2");

        frame2.setSize(1651, 913);

        frame2.setLayout(null);

        frame2.getContentPane().setBackground(new Color(124, 60, 146));
        //
        Container c = frame2.getContentPane(); // Gets the content layer
        JLabel label = new JLabel(); // JLabel Creation
        label.setIcon(new ImageIcon("pg1.png")); // Sets the image to be displayed as an icon
        label.setBounds(0, 0, 1651, 913); // Sets the location of the image

        c.add(label); // Adds objects to the container

        // Create back button

        back = new JButton("Back");

        back.setBounds(0, 0, 100, 50);

        // Add the button to frame 2

        frame2.add(back);

        // Create an object

        Switch_Frame obj = new Switch_Frame();

        // Associate ActionListener with the buttons

        back.addActionListener(obj);

        // Display frame 2

        frame2.setVisible(true);

    }

    // new frame f3
    public static void create_frame3()

    {

        // Create frame 3

        frame3 = new JFrame("Frame 2");

        frame3.setSize(300, 450);

        frame3.setLayout(null);

        // image bg
        Container c = frame3.getContentPane(); // Gets the content layer
        JLabel label = new JLabel(); // JLabel Creation
        label.setIcon(new ImageIcon("ag1.jpg")); // Sets the image to be displayed as an icon
        label.setBounds(0, 0, 300, 450); // Sets the location of the image
        c.add(label); // Adds objects to the container

        // Create back button
        gmajor = new JButton("gmajor");

        gmajor.setBounds(110, 200, 80, 30);

        frame3.add(gmajor);
        //
        cmajor = new JButton("cmajor");

        cmajor.setBounds(110, 250, 80, 30);

        frame3.add(cmajor);

        // Display frame 3

        frame3.setVisible(true);

        // Create an object

        Switch_Frame obj = new Switch_Frame();

        // Associate ActionListener with the buttons

        gmajor.addActionListener(obj);
        cmajor.addActionListener(obj);
        dmajor.addActionListener(obj);

    }

    // frame 4 g major
    public static void create_frame4()

    {

        // Create frame 2

        frame4 = new JFrame("G major chord");

        frame4.setSize(1651, 913);

        frame4.setLayout(null);

        frame4.getContentPane().setBackground(new Color(124, 60, 146));
        //
        Container c = frame4.getContentPane(); // Gets the content layer
        JLabel label = new JLabel(); // JLabel Creation
        label.setIcon(new ImageIcon("gc.png")); // Sets the image to be displayed as an icon
        label.setBounds(-100, -20, 1980, 1090); // Sets the location of the image

        c.add(label); // Adds objects to the container

        // Create back button

        back2 = new JButton("Back2");

        back2.setBounds(0, 0, 100, 50);

        // Add the button to frame 2

        frame4.add(back2);

        // Create an object

        Switch_Frame obj = new Switch_Frame();

        // Associate ActionListener with the buttons

        back2.addActionListener(obj);

        // Display frame 4

        frame4.setVisible(true);

    }

    // frame 5 c major
    public static void create_frame5()

    {

        // Create frame 5

        frame5 = new JFrame("Frame 5");

        frame5.setSize(1651, 913);

        frame5.setLayout(null);

        frame5.getContentPane().setBackground(new Color(124, 60, 146));
        //
        Container c = frame5.getContentPane(); // Gets the content layer
        JLabel label = new JLabel(); // JLabel Creation
        label.setIcon(new ImageIcon("pg2.png")); // Sets the image to be displayed as an icon
        label.setBounds(-150, -75, 1980, 1090); // Sets the location of the image

        c.add(label); // Adds objects to the container

        // Create back button

        Back1 = new JButton("Back1");

        Back1.setBounds(0, 0, 100, 50);

        // Add the button to frame 2

        frame5.add(Back1);

        // Create an object

        Switch_Frame obj = new Switch_Frame();

        // Associate ActionListener with the buttons

        Back1.addActionListener(obj);

        // Display frame 5

        frame5.setVisible(true);

    }

}
