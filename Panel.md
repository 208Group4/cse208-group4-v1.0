import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class Panel extends JPanel implements KeyListener, MouseListener{

	/*set window size*/
	static final int WIDTH = 900;
	static final int ROW = 15;
	static final int HEIGHT = 900;
	static final int COL = 15;

	/*set texture size*/
	static final int CS = 60;

	SetMaps map = new SetMaps();
	Image image_role;
	Image iPhone_icon;
	static int mapOrigin[] = {0,0};
	static int x_map = 1;
	static int y_map = 1;
	static int x_sc = 1;
	static int y_sc = 1;
	int pos[] = {0,0};
	static int map_id = 1;
	static final int LEFT = 0;
	static final int RIGHT = 1;
	static final int UP = 2;
	static final int DOWN = 3;
	boolean cellPhone = true;
	
	
	public Panel() {

		setPreferredSize(new Dimension(WIDTH, HEIGHT));				/*set panel size*/
		LoadImage li = new LoadImage();
		li.loadImage();
		loadComponent();
        setBackground(Color.lightGray );
        setFocusable(true);
        addKeyListener(this);
        addMouseListener(this);
        setLayout(null);
     
	}

	
	public static void changeMap2(){
		x_map = 1;
		y_map = 4;
		x_sc = 1;
		y_sc = 4;
		map_id = 2;
		mapOrigin[0] = 0;
		mapOrigin[1] = 0;
		
	}
	
	public static void changeMap1(){
		x_map = 1;
		y_map = 1;
		x_sc = 1;
		y_sc = 1;
		map_id = 1;
		mapOrigin[0] = 0;
		mapOrigin[1] = 0;
		
	}
	
	public static void changeMap3(){
		x_map = 1;
		y_map = 1;
		x_sc = 1;
		y_sc = 1;
		map_id = 3;
		mapOrigin[0] = 0;
		mapOrigin[1] = 0;
		}
		
	/*Weishuang.Zhang*/
	public static void npc1(){
		System.out.println("zhe shi npc1-map1");
	}
    public static void npc2(){
    	System.out.println("zhe shi npc2-map1");
	}
    public static void npc3(){
    	System.out.println("zhe shi npc3-map1");
	}
    public static void npc4(){
    	System.out.println("zhe shi npc4-map1");
	}
    public static void npc5(){
    	System.out.println("zhe shi npc5-map1");
	}
    public static void npc6(){
    	System.out.println("zhe shi npc6-map1");
	}
    public static void npc7(){
    	System.out.println("zhe shi npc7-map1");
	}
    public static void npc8(){
    	System.out.println("zhe shi npc8-map1");
	}
    public static void npc9(){
    	System.out.println("zhe shi npc9-map1");
	}
    public static void npc10(){
    	System.out.println("zhe shi npc10-map1");
	}
    public static void npc11(){
    	System.out.println("zhe shi npc11-map1");
	}
    public static void npc12(){
    	System.out.println("zhe shi npc12-map2");
	}
    public static void npc13(){
    	System.out.println("zhe shi npc13-map2");
	}
    public static void npc14(){
    	System.out.println("zhe shi npc14-map2");
	}
    public static void npc15(){
    	System.out.println("zhe shi npc15-map2");
	}
    public static void npc16(){
    	System.out.println("zhe shi npc16-map2");
	}
    public static void npc17(){
    	System.out.println("zhe shi npc17-map2");
	}
    public static void npc18(){
    	System.out.println("zhe shi npc18-map2");
	}
    public static void npc19(){
    	System.out.println("zhe shi npc19-map2");
	}
    public static void npc20(){
    	System.out.println("zhe shi npc20-map2");
	}
    public static void npc21(){
    	System.out.println("zhe shi npc21-map3");
	}
    public static void npc22(){
    	System.out.println("zhe shi npc22-map3");
	}
    public static void npc23(){
    	System.out.println("zhe shi npc23-map3");
	}
    public static void npc24(){
    	System.out.println("zhe shi npc24-map3");
	}
    public static void npc25(){
    	System.out.println("zhe shi npc25-map3");
	}
    public static void npc26(){
    	System.out.println("zhe shi npc26-map3");
	}
    /*Weishuang.Zhang*/
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		switch(map_id){
		
		case 1:
			map.drawMap(g, mapOrigin, SetMaps.map_1);
			drawComponent(g, x_sc , y_sc);
			break;
		case 2:
			map.drawMap(g, mapOrigin, SetMaps.map_2);
			drawComponent(g, x_sc , y_sc);
			break;
		case 3:
			map.drawMap(g, mapOrigin, SetMaps.map_3);
			drawComponent(g, x_sc , y_sc);
			break;
		}
		
	}
	private void loadComponent(){
		ImageIcon icon = new ImageIcon(getClass().getResource("/image/3.png"));
		image_role = icon.getImage();
		
		icon = new ImageIcon(getClass().getResource("/image/iphone/icon.png"));
		iPhone_icon = icon.getImage();
	}
	private void drawComponent(Graphics g, int x_sc, int y_sc){
		g.drawImage(image_role, x_sc * CS, y_sc * CS, this);
		g.drawImage(iPhone_icon, 700,  700, this);
	}
	
	

	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		int point_x = e.getX();
		int point_y = e.getY();
		
		
		if(point_y>=700 && point_y<=850 && point_x>=700 && point_x<=850 && cellPhone){
			cellPhone = false;
			iPhone phone = new iPhone();
		}
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
	@Override
	public void mousePressed(MouseEvent e) {
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

		private boolean isAllow(int x, int y, int map_id) {
			int position = 0;
			switch(map_id){
			case 1:
				position = SetMaps.map_1[y][x];
				break;
			case 2:
				position = SetMaps.map_2[y][x];
				break;
			case 3:
				position = SetMaps.map_3[y][x];
				break;
			}
			
			boolean road = (position>=10 && position<=25);
			boolean npc = (position>=1850 && position<=1900);
			boolean floor = position==2;
			if (road || floor || npc) {
				return true;
			}
	       
			return false;
		}
	
		private void move(int event) {
			switch (event) {
			case LEFT:
/*			System.out.println(SetMaps.map_1[y_map][x_map-1]);
			System.out.print(x);System.out.println(y);*/
				if (isAllow(x_map-1, y_map, map_id)) {	
					
					if(x_sc>6){
						x_map--;
						x_sc--;
					}else{
						if(mapOrigin[0]>0){
							mapOrigin[0]--;
							x_map--;
						}else{
							x_map--;
							x_sc--;
						}
					}
					pos[0] = x_map;
					pos[1] = y_map;
				}
				break;			
			case RIGHT:
/*				System.out.println(SetMaps.map_1[y][x+1]);
				System.out.print(x);System.out.println(y);*/
				if (isAllow(x_map+1, y_map, map_id)) {
					if(x_sc<9){
						x_map++;
						x_sc++;
					}else{
						if(mapOrigin[0]+15<SetMaps.col_1){
							mapOrigin[0]++;
							x_map++;
						}else{
							x_map++;
							x_sc++;
						}
						
					}
					pos[0] = x_map;
					pos[1] = y_map;
				}
				break;
			case UP:
/*				System.out.println(SetMaps.map_1[y-1][x]);
				System.out.print(x);System.out.println(y);*/
				if (isAllow(x_map, y_map-1, map_id)) {
					if(y_sc>6){
						y_map--;
						y_sc--;
					}else{
						if(mapOrigin[1]>0){
							mapOrigin[1]--;
							y_map--;
						}else{
							y_map--;
							y_sc--;
						}
					}
					pos[0] = x_map;
					pos[1] = y_map;
				}
				break;
			case DOWN:
/*				System.out.println(SetMaps.map_1[y+1][x]);
				System.out.print(x);System.out.println(y);*/
				if (isAllow(x_map, y_map+1, map_id)) {
					if(y_sc<9){
						y_map++;
						y_sc++;
					}else{
						if(mapOrigin[1]+15<SetMaps.row_1){
							mapOrigin[1]++;
							y_map++;
						}else{
							y_map++;
							y_sc++;
						}
						
					}
					pos[0] = x_map;
					pos[1] = y_map;
				}
				break;
			default:
				break;
	        }
			Events.trigger(pos, map_id);
	    }
		

		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}



		

}
