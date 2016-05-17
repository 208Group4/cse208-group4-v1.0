
public class Events {
	public static void trigger(int pos[], int map_id){
		switch(map_id){
			case 1:
				if(pos[0]==0 && pos[1]==18){
					Panel.changeMap2();
				}
				else if(pos[0]==29 && pos[1]==18){
					Panel.changeMap3();
				}
				/*weishuang.Zhang*/
				else if(pos[0]==2 && pos[1]==2){
					Panel.npc1();
				}else if(pos[0]==9 && pos[1]==2){
					Panel.npc2();
				}else if(pos[0]==11 && pos[1]==2){
					Panel.npc3();
				}else if(pos[0]==20 && pos[1]==2){
					Panel.npc4();
				}else if(pos[0]==9 && pos[1]==10){
					Panel.npc5();
				}else if(pos[0]==14 && pos[1]==10){
					Panel.npc6();
				}else if(pos[0]==9 && pos[1]==14){
					Panel.npc7();
				}else if(pos[0]==20 && pos[1]==12){
					Panel.npc8();
				}else if(pos[0]==18 && pos[1]==15){
					Panel.npc9();
				}else if(pos[0]==20 && pos[1]==15){
					Panel.npc10();
				}else if(pos[0]==18 && pos[1]==17){
					Panel.npc11();
				}
				/*Weishuang.Zhang*/
				break;
				
				
			case 2:
				if(pos[0]==29 && pos[1]==4){
					Panel.changeMap1();
				}
				else if(pos[0]==20 && pos[1]==0){
					Panel.changeMap3();
				}
				/*Weishuang.Zhang*/
				else if(pos[0]==0 && pos[1]==3){
					Panel.npc12();
				}else if(pos[0]==11 && pos[1]==3){
					Panel.npc13();
				}else if(pos[0]==16 && pos[1]==3){
					Panel.npc14();
				}else if(pos[0]==19 && pos[1]==5){
					Panel.npc15();
				}else if(pos[0]==12 && pos[1]==10){
					Panel.npc16();
				}else if(pos[0]==19 && pos[1]==13){
					Panel.npc17();
				}else if(pos[0]==10 && pos[1]==15){
					Panel.npc18();
				}else if(pos[0]==19 && pos[1]==15){
					Panel.npc19();
				}else if(pos[0]==4 && pos[1]==18){
					Panel.npc20();
				}
				/*Weishuang.Zhang*/
				break;
			
			case 3:
				if(pos[0]==0 && pos[1]==18){
					Panel.changeMap2();
				}
				else if(pos[0]==20 && pos[1]==0){
					Panel.changeMap1();
				}
				/*Weishuang.Zhang*/
				else if(pos[0]==9 && pos[1]==4){
					Panel.npc21();
				}else if(pos[0]==19 && pos[1]==1){
					Panel.npc22();
				}else if(pos[0]==19 && pos[1]==4){
					Panel.npc23();
				}else if(pos[0]==9 && pos[1]==11){
					Panel.npc24();
				}else if(pos[0]==9 && pos[1]==16){
					Panel.npc25();
				}else if(pos[0]==19 && pos[1]==16){
					Panel.npc26();
				}
				/*Weishuang.Zhang*/
				break;	
	
		}
	}
}
