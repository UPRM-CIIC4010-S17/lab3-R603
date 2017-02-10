import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
			/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;	
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw top stripe
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width, 65);
                                       
                        //Draw bottom stripe
                        g.setColor(Color.RED);
                        g.fillRect(x1, getHeight() - 65, width, 65);
                        
                        //Draw middle stripe
                        g.setColor(Color.RED);
                        g.fillRect(x1, height/2 - 65/2, width, 70);
                        
                        //Triangle
                        Polygon p = new Polygon();
                        p.addPoint(x1, getHeight());//bottom vertex
                        p.addPoint(x1 + 200, y1 + 175);
                        p.addPoint(x1, y1);
                        //p.addPoint(x1 + 25, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
			
                        //Star
                        Polygon p2 = new Polygon();
                        //left
                        p2.addPoint(x1 + 69, y1 + 163);//25 + 44
                        //top
                        p2.addPoint(x1 + 85, y1 + 163);//41
                        p2.addPoint(x1 + 91, y1 + 148);//47
                        p2.addPoint(x1 + 97, y1 + 163);//53
                        //right
                        p2.addPoint(x1 + 113, y1 + 163);//69
                        p2.addPoint(x1 + 100, y1 + 173);//56
                        p2.addPoint(x1 + 105, y1 + 188);//61
                        //bottom
                        p2.addPoint(x1 + 91, y1 + 178);//47
                        //left
                        p2.addPoint(x1 + 78, y1 + 188);//34
                        p2.addPoint(x1 + 82, y1 + 173);//38
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        System.out.println(p2.getBounds());
                        
                        
                      //Draw red line
//                      g.setColor(Color.RED);
//                      g.drawLine(x1, y1, x2, y2);
//                                     
//                      //Draw blue line
//                      g.setColor(Color.BLUE);
//                      g.drawLine(x1, y2, x2, y1);
                        

                        
//                      //Draw oval
//                      g.setColor(Color.LIGHT_GRAY);
//                      g.fillOval(width/2 - 55/2, height/2 - 55/2, 55, 55);
                      	
			
			
			}
}