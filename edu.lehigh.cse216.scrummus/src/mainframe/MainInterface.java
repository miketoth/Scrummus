/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

/**
 *
 * @author Jon
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainInterface extends JFrame {
    JLabel leftPane;
    JLabel library;
    JButton musicB;
    JButton videoB;
    JLabel musicG;
    JLabel videoG;
    JLabel playlists;
    JButton played;
    JButton recent;
    JButton latest;
    JLabel playedG;
    JLabel recentG;
    JLabel latestG;
    JScrollPane scrollpane;
    JButton nameB;
    JButton artistB;
    JButton timeB;
    JButton albumB;
    JButton genreB;
    JButton playlistB;
    JLabel mainScreen;
    JLabel msPane;
    JButton playB;
    JButton nextB;
    JButton previousB;
    JButton volumeDecr;
    JButton volumeIncr;
    JLabel volume;
    String filename = "blue.jpg";
    ImageIcon icon = new ImageIcon(getClass().getResource(filename));
    String filename2 = "play.png";
    ImageIcon icon2 = new ImageIcon(getClass().getResource(filename2));
    String filename3 = "speaker.png";
    ImageIcon icon3 = new ImageIcon(getClass().getResource(filename3));

    public MainInterface() {
        InterfaceLayout customLayout = new InterfaceLayout();

        getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 12));
        getContentPane().setLayout(customLayout);

        leftPane = new JLabel();
        getContentPane().add(leftPane); //1

        library = new JLabel("Library");
        getContentPane().add(library);  //2

        musicB = new JButton("Music");
        getContentPane().add(musicB);  //3

        videoB = new JButton("Video");
        getContentPane().add(videoB);  //4

        musicG = new JLabel();
        getContentPane().add(musicG); //5

        videoG = new JLabel();
        getContentPane().add(videoG);//6

        playlists = new JLabel("Playlists");
        getContentPane().add(playlists);//7

        played = new JButton("Most Played");
        getContentPane().add(played);//8

        recent = new JButton("Most Recent");
        getContentPane().add(recent);//9

        latest = new JButton("Latest Added");
        getContentPane().add(latest);//10

        playedG = new JLabel();//11
        getContentPane().add(playedG);

        recentG = new JLabel();//12
        getContentPane().add(recentG);

        latestG = new JLabel();//13
        getContentPane().add(latestG);

        scrollpane = new JScrollPane();
        getContentPane().add(scrollpane);//14

        nameB = new JButton("Name");
        getContentPane().add(nameB);//15

        artistB = new JButton("Artist");
        getContentPane().add(artistB);//16

        timeB = new JButton("Time");
        getContentPane().add(timeB);//17

        albumB = new JButton("Album");
        getContentPane().add(albumB);//18

        genreB = new JButton("Genre");
        getContentPane().add(genreB);//19

        playlistB = new JButton("Playlist");
        getContentPane().add(playlistB);//20

        mainScreen = new JLabel(icon);
        mainScreen.setIcon(icon);
        getContentPane().add(mainScreen);//21

        msPane = new JLabel(); //icon
        //msPane.setIcon(icon);//22
        getContentPane().add(msPane);

        playB = new JButton(icon2);
        playB.setIcon(icon2);//23
        getContentPane().add(playB);

        nextB = new JButton("Next");
        getContentPane().add(nextB);//24

        previousB = new JButton("Previous");
        getContentPane().add(previousB);//25

        volumeDecr = new JButton("M");
        getContentPane().add(volumeDecr);//26

        volumeIncr = new JButton("P");
        getContentPane().add(volumeIncr);//27

        volume = new JLabel(icon3);
        volume.setIcon(icon3);
        getContentPane().add(volume);//28

        setSize(getPreferredSize());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        MainInterface window = new MainInterface();

        window.setTitle("Interface");
        window.pack();
        window.show();
    }
}

class InterfaceLayout implements LayoutManager {

    public InterfaceLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 1061 + insets.left + insets.right;
        dim.height = 612 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+0,insets.top+80,200,520);}//1
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+96,184,32);}//2
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+72,insets.top+144,104,24);}//3
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+72,insets.top+176,104,24);}//4
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+48,insets.top+144,16,16);}//5
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+48,insets.top+176,16,16);}//6
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+256,184,32);}//7
        c = parent.getComponent(7);
        if (c.isVisible()) {c.setBounds(insets.left+72,insets.top+312,104,24);}//8
        c = parent.getComponent(8);
        if (c.isVisible()) {c.setBounds(insets.left+72,insets.top+352,104,24);}//9
        c = parent.getComponent(9);
        if (c.isVisible()) {c.setBounds(insets.left+72,insets.top+392,104,24);}//10
        c = parent.getComponent(10);
        if (c.isVisible()) {c.setBounds(insets.left+48,insets.top+312,16,16);}//11
        c = parent.getComponent(11);
        if (c.isVisible()) {c.setBounds(insets.left+48,insets.top+352,16,16);}//12
        c = parent.getComponent(12);
        if (c.isVisible()) {c.setBounds(insets.left+48,insets.top+392,16,16);}//13
        c = parent.getComponent(13);
        if (c.isVisible()) {c.setBounds(insets.left+200,insets.top+448,856,152);}//14
        c = parent.getComponent(14);
        if (c.isVisible()) {c.setBounds(insets.left+200,insets.top+408,136,40);}//15
        c = parent.getComponent(15);
        if (c.isVisible()) {c.setBounds(insets.left+336,insets.top+408,152,40);}//16
        c = parent.getComponent(16);
        if (c.isVisible()) {c.setBounds(insets.left+488,insets.top+408,136,40);}//17
        c = parent.getComponent(17);
        if (c.isVisible()) {c.setBounds(insets.left+624,insets.top+408,136,40);}//18
        c = parent.getComponent(18);
        if (c.isVisible()) {c.setBounds(insets.left+760,insets.top+408,144,40);}//19
        c = parent.getComponent(19);
        if (c.isVisible()) {c.setBounds(insets.left+904,insets.top+408,152,40);}//20
        c = parent.getComponent(20);
        if (c.isVisible()) {c.setBounds(insets.left+200,insets.top+80,856,265);}//21
        c = parent.getComponent(21);
        if (c.isVisible()) {c.setBounds(insets.left+200,insets.top+336,856,72);}//22
        c = parent.getComponent(22);
        if (c.isVisible()) {c.setBounds(insets.left+584,insets.top+352,88,50);}//23 (88,40)
        c = parent.getComponent(23);
        if (c.isVisible()) {c.setBounds(insets.left+688,insets.top+360,72,24);}//24
        c = parent.getComponent(24);
        if (c.isVisible()) {c.setBounds(insets.left+496,insets.top+360,72,24);}//25
        c = parent.getComponent(25);
        if (c.isVisible()) {c.setBounds(insets.left+880,insets.top+360,32,32);}//26
        c = parent.getComponent(26);
        if (c.isVisible()) {c.setBounds(insets.left+984,insets.top+360,32,32);}//27
        c = parent.getComponent(27);
        if (c.isVisible()) {c.setBounds(insets.left+920,insets.top+352,56,40);} //56, 40 //28
    }
}
