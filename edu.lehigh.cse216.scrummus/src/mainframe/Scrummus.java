
package mainframe;

/**
 *
 * @author Kyle Brownell
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Scrummus {
    private JFrame frame;
    private JFrame frame2;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem menuItemNewPlaylist;
    private JMenuItem menuItemAddFile;
    private JMenu menuEdit;
    private JMenuItem menuItemCopy;
    private JMenuItem menuItemPaste;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;
    private ImageIcon image;
    
    public Scrummus(){
        frame = new JFrame();
        frame2 = new JFrame();
        frame2.setSize(600,400);
        ScrumLayout customLayout = new ScrumLayout();

        frame.getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 12));
        frame.getContentPane().setLayout(customLayout);

        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");
        menuFile.getAccessibleContext().setAccessibleDescription(
                "This menu holds file operations");
        menuEdit.getAccessibleContext().setAccessibleDescription(
                "This menu holds editting operations");
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuItemNewPlaylist = new JMenuItem("New Playlist",
                KeyEvent.VK_T);
        menuItemNewPlaylist.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItemNewPlaylist.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItemAddFile = new JMenuItem("Add File to Library",
                KeyEvent.VK_T);
        menuItemAddFile.getAccessibleContext().setAccessibleDescription(
                "Open Frame");
        menuFile.add(menuItemNewPlaylist);
        menuFile.add(menuItemAddFile);
        
        menuItemAddFile.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                frame2.setVisible(true);
            }
            
        });
        frame.setJMenuBar(menuBar);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void main (String []args)
    {
        Scrummus myScrum = new Scrummus();
    }


}
class ScrumLayout implements LayoutManager {

    public ScrumLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 773 + insets.left + insets.right;
        dim.height = 505 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

    }
}