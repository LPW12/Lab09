// Lab09Ast.java
// This is the student, starting file of Lab 09A.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the re-defined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.

import java.awt.*;
import java.applet.*;

public class Lab09Ast extends Applet
{
    public void paint(Graphics g)
    {       
        xmasTree myTree = new xmasTree();
            myTree.drawTrunk(g);
            myTree.drawLeaves(g);
            myTree.drawOrnament(g);
            myTree.drawStar(g);
            myTree.drawPresants(g);
    }
}

class Tree
{
    // Do NOT alter this Tree class in any way!

    public void drawTrunk(Graphics g)
    {
        Expo.setColor(g,Expo.brown);
        Expo.fillRectangle(g,475,395,525,600);
    }

    public void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.green);
        Expo.fillCircle(g,500,300,100);
    }
}

class pineTree extends Tree
{
    public void drawLeaves(Graphics g)  
    {   
        Expo.setColor(g,Expo.green);
        Expo.fillPolygon(g,400,500,600,500,501,350); //Bottom
        Expo.fillPolygon(g,425,425,575,425,501,300); //Middle
        Expo.fillPolygon(g,450,350,550,350,501,250); // Top
    }
}

class xmasTree extends pineTree
{
    public void drawOrnament(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        Expo.fillCircle(g,468,425,10);
        Expo.fillCircle(g,475,475,10);
        Expo.fillCircle(g,512,350,10);
        Expo.fillCircle(g,550,480,10);
        Expo.fillCircle(g,530,410,10);
        Expo.fillCircle(g,520,450,10);
        Expo.fillCircle(g,480,380,10);
        Expo.fillCircle(g,495,308,10);        
    }    
    
    public void drawStar(Graphics g)
    {
        Expo.setColor(g,Expo.yellow);
        Expo.fillStar(g,501,235,35,5);
    }
    
    public void drawPresants(Graphics g)
    {
        Expo.setColor(g,Expo.blue);
        Expo.fillRectangle(g,450,510,350,600); //Blue Present
        Expo.setColor(g,Expo.red);
        Expo.fillRectangle(g,650,510,550,600); //Red Present
        Expo.setColor(g,Expo.gold);
        Expo.fillRectangle(g,415,510,385,600); //Blue Verticle Stripe
        Expo.fillRectangle(g,450,540,350,565); //Blue Horizontal Stripe
        Expo.fillRectangle(g,650,540,550,565); //Red Horizontal Stripe
        Expo.fillRectangle(g,615,510,585,600); //Red Verticle Stripe                
    }
}