import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class iPhone extends JFrame implements MouseListener{
	Container ct;
	BackgroundPanel bgp; 
	Image iPhone_icon;
	
	public iPhone() {
	    JFrame jf1=new JFrame("CellPhone");
	    jf1.setBounds(600,200,300,605);
	    jf1.setUndecorated(true);
	   
	    jf1.setVisible(true);
	    jf1.setFocusable(true);
        jf1.addMouseListener(this);
        bgp=new BackgroundPanel((new ImageIcon(getClass().getResource("/image/iphone/iphone.png"))).getImage());  
        bgp.setBounds(0,0,300,605); 
        jf1.add(bgp);
     
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int point_x = e.getX();
		int point_y = e.getY();
		System.out.println(point_x + "," + point_y);
		if(point_y>=88 && point_y<=132){
			
			if(point_x>=36 && point_x<=80){
				System.out.println("Seeting");
			}else if(point_x>=98 && point_x<=142){
				System.out.println("Mail");
			}else if(point_x>=158 && point_x<=212){
				System.out.println("Status");
			}else if(point_x>=219 && point_x<=263){
				System.out.println("Calender");
			}
			
		}else if(point_y>=151 && point_y<=195){
			
			if(point_x>=36 && point_x<=80){
				System.out.println("Achieve");
			}else if(point_x>=98 && point_x<=142){
				System.out.println("Shopping");
			}else if(point_x>=158 && point_x<=212){
				System.out.println("Map");
			}else if(point_x>=219 && point_x<=263){
				System.out.println("Camera");
			}
			
		}else if(point_y>=478 && point_y<=522){
			
			if(point_x>=98 && point_x<=142){
				System.out.println("Chat");
			}else if(point_x>=158 && point_x<=212){
				System.out.println("Save");
			}
			
			
		}else if(point_y>=547 && point_y<=589){
			
			if(point_x>=129 && point_x<=171){
				System.out.println("back");
			}
			
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

class BackgroundPanel extends JPanel {  
    Image image;  
    public BackgroundPanel(Image image)  
    {  
        this.image=image;  
        this.setOpaque(true);  
    }  
    //Draw the back ground.  
    public void paintComponent(Graphics g)  
    {  
        super.paintComponents(g);  
        g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);  
          
    }  
} 
