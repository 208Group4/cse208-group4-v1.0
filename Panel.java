import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Panel extends JPanel implements KeyListener {



	/*set window size*/
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 900;

	/*set texture amount*/
	private static final int ROW = 15;
	private static final int COL = 20;
	
	/*set texture size*/
	private static final int CS = 60;



	private int[][] map_test = {

				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},			//1

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//2

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//3
                
				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//4

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//5

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//6

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//7

				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},			//8

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//9

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//10

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//11

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//12

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//13

				{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},			//14

				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}			//15
				
	};




	private Image image_1;
	private Image image_2;
	private Image image_role;
	
	private int x, y;
	private static final int LEFT = 0;
	private static final int RIGHT = 1;
	private static final int UP = 2;
	private static final int DOWN = 3;
	
	
	public Panel() {

        		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));				/*set panel size*/
                
		loadImage();
        x = 8;
        y = 8;
        
        setFocusable(true);
        addKeyListener(this);
        
	}





	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		drawMap(g);
		drawRole(g);

	}

	private void loadImage() {

		ImageIcon icon = new ImageIcon(getClass().getResource("image/1.png"));
		image_1 = icon.getImage();

		icon = new ImageIcon(getClass().getResource("image/2.png"));
		image_2 = icon.getImage();

		icon = new ImageIcon(getClass().getResource("image/3.png"));
		image_role = icon.getImage();

	}



	private void drawRole(Graphics g) {
		g.drawImage(image_role, x * CS, y * CS, this);
	}
	
	
	private void drawMap(Graphics g) {

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				switch (map_test[i][j]) {
				
				case 0 : 
					g.drawImage(image_1, j * CS, i * CS, this);
					break;
					
				case 1 : 
					g.drawImage(image_2, j * CS, i * CS, this);
					break;

				default:
					break;

				}
			}
		}
	}



		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keyCode = e.getKeyCode();
			
			switch (keyCode) {
				case KeyEvent.VK_LEFT :
					move(LEFT);
				break;
				
				case KeyEvent.VK_RIGHT :
					move(RIGHT);
				break;
				
				case KeyEvent.VK_UP :
					move(UP);
				break;
				
				 case KeyEvent.VK_DOWN :
					 move(DOWN);
				break;
			}
			
			repaint();
		}

		private boolean isAllow(int x, int y) {
			if (map_test[y][x] == 1) {
				return false;
			}
	       
			return true;
		}
		
		private void move(int event) {
			switch (event) {
			case LEFT:
				if (isAllow(x-1, y)) 
					x--;
				break;
			case RIGHT:
				if (isAllow(x+1, y)) 
					x++;
				break;
			case UP:
				if (isAllow(x, y-1)) 
					y--;
				break;
			case DOWN:
				if (isAllow(x, y+1)) 
					y++;
				break;
			default:
				break;
	        }
	    }

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

}