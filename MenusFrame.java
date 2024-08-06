
package za.ac.tut.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenusFrame extends JFrame{
    
    private JMenuBar menuBar;
    
    //menu bar
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu viewMenu;
    
    //for view subMenu
    private JMenu editorsViewSubMenu;
    private JMenu splitViewSubMenu;
    
    //for file options
    private JMenuItem newProjectMenuItem;
    private JMenuItem newFileItem;
    private JMenuItem openProjectMenuItem;
    private JMenuItem openRecentMenuItem;
    private JMenuItem closeAllProjectMenuItem;
    
    //for Edit options
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pastMenuItem;
    
    //option inside the submenu for editors
    private JMenuItem sourceMenuItem;
    
    //option inside the submenu for split
    private JMenuItem horizontalMenuItem;
    private JMenuItem verticalMenuItem;
    private JMenuItem clearMenuItem;

    public MenusFrame() {
        
        setTitle("Menu Frame");
        setSize(700, 800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        //create a menu bar
        menuBar = new JMenuBar();
        
        //menus
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        editorsViewSubMenu = new JMenu("Editors");
        splitViewSubMenu = new JMenu("Split");
        
        //file menu items
        newProjectMenuItem = new JMenuItem("New Project...");
        newFileItem = new JMenuItem("New File...");
        openProjectMenuItem = new JMenuItem("Open Project...");
        openRecentMenuItem = new JMenuItem("Open Recent Project");
        closeAllProjectMenuItem = new JMenuItem("Close All Projects");
        
        //undo Menu Items
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cute", new ImageIcon("images/cut.png"));
        copyMenuItem = new JMenuItem("Copy", new ImageIcon("images/copy.png"));
        pastMenuItem = new JMenuItem("Paste", new ImageIcon("images/paste.png"));
        
        //view menu items
        sourceMenuItem = new JMenuItem("Source");
        editorsViewSubMenu.add(sourceMenuItem);
        
        horizontalMenuItem = new JMenuItem("Horizontally");
        verticalMenuItem = new JMenuItem("Vertically");
        clearMenuItem = new JMenuItem("Clear");
        splitViewSubMenu.add(horizontalMenuItem);
        splitViewSubMenu.add(verticalMenuItem);
        splitViewSubMenu.add(clearMenuItem);
        
        //add file items to the menu
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentMenuItem);
        fileMenu.add(closeAllProjectMenuItem);
        
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pastMenuItem);
        
        viewMenu.add(editorsViewSubMenu);
        viewMenu.add(splitViewSubMenu);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        setJMenuBar(menuBar);
        
        setVisible(true);
        
    }
    
    
    
}
