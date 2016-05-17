import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


public class LoadImage {
	
	Image grass;
	Image tree;
	Image floor;
	Image iPhone;
	Image[] road = new Image[12];
	Image[] hotel = new Image[58];
	Image[] CB = new Image[46];
	Image[] FB = new Image[40];
	/*Weishuang.Zhang*/
	Image[] dormitory1= new Image[32];
	Image[] dormitory2= new Image[32];
	Image[] dormitory3= new Image[32];
	Image[] dormitory4= new Image[32];
	Image[] dormitory5= new Image[32];
	Image[] dormitory6= new Image[32];
	Image[] laundry = new Image[27];
	Image[] clinic= new Image[34];
	Image[] police= new Image[16];
	Image[] bookstore= new Image[12];
	Image[] park= new Image[35];
	Image[] serviceCenter= new Image[32];
	Image[] ATM = new Image[4];
	Image[] npc = new Image[26];
	/*Weishuang.Zhang*/
	
	/*Zixian.Wang*/
	Image[] SB = new Image[42];
	Image[] IBSS = new Image[48];
	Image[] company1 = new Image[14];
	Image[] company2 = new Image[12];
	Image[] company3 = new Image[14];
	/*Zixian.Wang*/
	
	//Wang Baichuan 
	Image[] restaurant= new Image[53];
	Image[] bakery= new Image[20];
	Image[] haircut= new Image[14];
	Image[] fruit= new Image[20];
	Image[] cafe= new Image[21];
	Image[] cloth= new Image[15];
	Image[] familymart= new Image[17];
	Image[] hamburger= new Image[16];
	Image[] electronic= new Image[13];
	Image[] cybercafe= new Image[15];
	Image[] WXB= new Image[65];
	Image[] accessories= new Image[16];
	//Wang Baichuan
	public void loadImage() {
		
		ImageIcon icon = new ImageIcon(getClass().getResource("image/1.png"));
		grass = icon.getImage();

		icon = new ImageIcon(getClass().getResource("/image/2.png"));
		tree = icon.getImage();
		
		icon = new ImageIcon(getClass().getResource("/image/floor.png"));
		floor = icon.getImage();
		

		
		for(int i=0;i<12;i++){
			icon = new ImageIcon(getClass().getResource("/image/road"+i+".png"));
			road[i] = icon.getImage();
		}		
		icon = new ImageIcon(getClass().getResource("/image/iphone/iphone.png"));
		iPhone = icon.getImage();
		
		

		/*Weishuang.Zhang*/
		for(int i=0;i<12;i++){
			icon = new ImageIcon(getClass().getResource("/image/bookstore/bookstore"+i+".gif"));
			bookstore[i] = icon.getImage();
		}
		
		for(int i=0;i<27;i++){
		    icon = new ImageIcon(getClass().getResource("/image/laundry/lundary"+i+".gif"));
		    laundry[i] = icon.getImage();
		}
		
		for(int i=0;i<33;i++){
		    icon = new ImageIcon(getClass().getResource("/image/clinic/clinic"+i+".gif"));
		    clinic[i] = icon.getImage();
		}
		
		for(int i=0;i<34;i++){
		    icon = new ImageIcon(getClass().getResource("/image/clinic/clinic"+i+".gif"));
		    clinic[i] = icon.getImage();
		}
		
		for(int i=0;i<4;i++){
		    icon = new ImageIcon(getClass().getResource("/image/ATM/ATM"+i+".gif"));
		    ATM[i] = icon.getImage();
		}
		
		for(int i=0;i<32;i++){
		    icon = new ImageIcon(getClass().getResource("/image/dormitory1/dormitory"+i+".gif"));
		    dormitory1[i] = icon.getImage();
		}
		
		for(int i=0;i<32;i++){
		    icon = new ImageIcon(getClass().getResource("/image/dormitory2/dormitory"+i+".gif"));
		    dormitory2[i] = icon.getImage();
		}
		for(int i=0;i<32;i++){
		    icon = new ImageIcon(getClass().getResource("/image/dormitory3/dormitory"+i+".gif"));
		    dormitory3[i] = icon.getImage();
		}
		
		for(int i=0;i<32;i++){
		    icon = new ImageIcon(getClass().getResource("/image/dormitory4/dormitory"+i+".gif"));
		    dormitory4[i] = icon.getImage();
		}
		
		for(int i=0;i<32;i++){
		    icon = new ImageIcon(getClass().getResource("/image/dormitory5/dormitory"+i+".gif"));
		    dormitory5[i] = icon.getImage();
		}
		
		for(int i=0;i<32;i++){
		    icon = new ImageIcon(getClass().getResource("/image/dormitory6/dormitory"+i+".gif"));
		    dormitory6[i] = icon.getImage();
		}
		
		for(int i=0;i<16;i++){
		    icon = new ImageIcon(getClass().getResource("/image/police/police"+i+".gif"));
		    police[i] = icon.getImage();
		}
		
		for(int i=0;i<32;i++){
		    icon = new ImageIcon(getClass().getResource("/image/serviceCenter/service-center"+i+".gif"));
		    serviceCenter[i] = icon.getImage();
		}
		
		for(int i=0;i<35;i++){
		    icon = new ImageIcon(getClass().getResource("/image/park/park"+i+".gif"));
		    park[i] = icon.getImage();
		}
		for(int i=0;i<26;i++){
		    icon = new ImageIcon(getClass().getResource("/image/npc/npc"+i+".gif"));
		    npc[i] = icon.getImage();
		}
		/*Weishuang.Zhang*/
		
		/*Zixian.Wang*/
		for(int i=0;i<42;i++){
			icon = new ImageIcon(getClass().getResource("/image/SB/SB"+i+".gif"));
			SB[i] = icon.getImage();
		}
		
		for(int i=0;i<48;i++){
			icon = new ImageIcon(getClass().getResource("/image/IBSS/IBSS"+i+".gif"));
			IBSS[i] = icon.getImage();
		}
		
		
		for(int i=0;i<14;i++){
			icon = new ImageIcon(getClass().getResource("/image/company1/company(1)"+i+".gif"));
			company1[i] = icon.getImage();
		}
		
		for(int i=0;i<12;i++){
			icon = new ImageIcon(getClass().getResource("/image/company2/company(2)"+i+".gif"));
			company2[i] = icon.getImage();
		}
		
		for(int i=0;i<14;i++){
			icon = new ImageIcon(getClass().getResource("/image/company3/company(3)"+i+".gif"));
			company3[i] = icon.getImage();
		}	
		for(int i=0;i<58;i++){
			icon = new ImageIcon(getClass().getResource("/image/hotel/hotel"+i+".gif"));
			hotel[i] = icon.getImage();
		}
		
		for(int i=0;i<46;i++){
			icon = new ImageIcon(getClass().getResource("/image/CB/CB"+i+".gif"));
			CB[i] = icon.getImage();
		}
		
		for(int i=0;i<40;i++){
			icon = new ImageIcon(getClass().getResource("/image/FB/FB"+i+".gif"));
			FB[i] = icon.getImage();
		}
		/*Zixian.Wang*/
		
		//Wang Baichuan
		for(int i=0;i<53;i++){
			icon = new ImageIcon(getClass().getResource("/image/restaurant/restaurant"+i+".gif"));
			restaurant[i] = icon.getImage();
		}
		for(int i=0;i<20;i++){
			icon = new ImageIcon(getClass().getResource("/image/bakery/bakery"+i+".gif"));
			bakery[i] = icon.getImage();
		}
		for(int i=0;i<14;i++){
			icon = new ImageIcon(getClass().getResource("/image/haircut/haircut"+i+".gif"));
			haircut[i] = icon.getImage();
		}	
		for(int i=0;i<20;i++){
			icon = new ImageIcon(getClass().getResource("/image/fruit/fruit"+i+".gif"));
			fruit[i] = icon.getImage();
		}	
	
		for(int i=0;i<13;i++){
			icon = new ImageIcon(getClass().getResource("/image/electronic/electronic"+i+".gif"));
			electronic[i] = icon.getImage();
		}	
		for(int i=0;i<21;i++){
			icon = new ImageIcon(getClass().getResource("/image/cafe/cafe"+i+".gif"));
			cafe[i] = icon.getImage();			
		
		}
		for(int i=0;i<15;i++){
			icon = new ImageIcon(getClass().getResource("/image/cloth/cloth"+i+".gif"));
			cloth[i] = icon.getImage();			
		}
		for(int i=0;i<17;i++){
			icon = new ImageIcon(getClass().getResource("/image/familymart/familymart"+i+".gif"));
			familymart[i] = icon.getImage();					
		}
		for(int i=0;i<16;i++){
			icon = new ImageIcon(getClass().getResource("/image/hamburger/hamburger"+i+".gif"));
			hamburger[i] = icon.getImage();	
		}
		for(int i=0;i<15;i++){
			icon = new ImageIcon(getClass().getResource("/image/cybercafe/cybercafe"+i+".gif"));
			cybercafe[i] = icon.getImage();	
		}	
			for(int i=0;i<16;i++){
				icon = new ImageIcon(getClass().getResource("/image/accessories/accessories"+i+".gif"));
				accessories[i] = icon.getImage();	
		}	
		for(int i=0;i<65;i++){
			icon = new ImageIcon(getClass().getResource("/image/WXB/WXB"+i+".gif"));
			WXB[i] = icon.getImage();
	   }	
				//Wang Baichuan
				}			
	}
