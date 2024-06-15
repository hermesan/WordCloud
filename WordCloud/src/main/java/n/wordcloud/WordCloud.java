package n.wordcloud;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import UI.MainFrame;

/**
 *
 * 
 * @author muitet
 */
public class WordCloud {

    public static void main(String[] args) {    
        // TODO code application logic here
        MainFrame frame=new MainFrame();
        frame.setTitle("Word Cloud");
        frame.setSize(1000, 620);
        frame.setResizable(false);
        frame.setLocation(50, 50);
        frame.setVisible(true);
    }
}
