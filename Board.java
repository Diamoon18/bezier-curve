package Lab3_K;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.CubicCurve2D;

import javax.swing.JPanel;

public class Board extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double x[][] = new double[26][4];
    double y[][] = new double[26][4];
    double px;
    double py;
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setValues();
        drawBeziere(g);
    }
	
	 public void setValues(){
		 x[0][0] = 157;
   	  		y[0][0] = 69; 
   	  	 x[0][1] = 191;
   	  	 	y[0][1] = 41;
   	  	 x[0][2] = 203;
   	  	 	y[0][2] = 297;
   	  	 x[0][3] = 159;
   	  	 	y[0][3] = 299;
   	  	 	
   	  	x[1][0] = 159;
   	  		y[1][0] = 299;
   	  	x[1][1] = 132;
   	  		y[1][1] = 300;
   	  	x[1][2] = 123;
   	  		y[1][2] = 287;
   	  	x[1][3] = 123;
   	  		y[1][3] = 291;
   	  		
   	  	x[2][0] = 123;
	  		y[2][0] = 291;
	  	x[2][1] = 123;
	  		y[2][1] = 303;
	  	x[2][2] = 123;
	  		y[2][2] = 311;
	  	x[2][3] = 123;
	  		y[2][3] = 332;
	  		
	  	x[3][0] = 123;
	  		y[3][0] = 332;
	  	x[3][1] = 123;
	  		y[3][1] = 338;
	  	x[3][2] = 221;
	  		y[3][2] = 335;
	  	x[3][3] = 256;
	  		y[3][3] = 333;
   	  		
	  	x[4][0] = 256;
	  		y[4][0] = 333;
	  	x[4][1] = 299;
	  		y[4][1] = 331;
	  	x[4][2] = 356;
	  		y[4][2] = 320;
	  	x[4][3] = 361;
	  		y[4][3] = 241;
	  		
	  	x[5][0] = 361;
	  		y[5][0] = 241;
	  	x[5][1] = 363;
	  		y[5][1] = 208;
	  	x[5][2] = 359;
	  		y[5][2] = 127;
	  	x[5][3] = 358;
	  		y[5][3] = 119;
	  	
	  	x[6][0] = 361;
	  		y[6][0] = 241;
	  	x[6][1] = 363;
	  		y[6][1] = 208;
	  	x[6][2] = 359;
	  		y[6][2] = 127;
	  	x[6][3] = 358;
	  		y[6][3] = 119;
	  		
	  	x[7][0] = 358;
	  		y[7][0] = 119;
	  	x[7][1] = 352;
	  		y[7][1] = 73;
	  	x[7][2] = 315;
	  		y[7][2] = 39;
	  	x[7][3] = 241;
	  		y[7][3] = 36;
	  		
	  	x[8][0] = 241;
	  		y[8][0] = 36;
	  	x[8][1] = 218;
	  		y[8][1] = 35;
	  	x[8][2] = 116;
	  		y[8][2] = 28;
	  	x[8][3] = 117;
	  		y[8][3] = 44;
	  		
	  	x[9][0] = 117;
	  		y[9][0] = 44;
	  	x[9][1] = 119;
	  		y[9][1] = 64;
	  	x[9][2] = 117;
	  		y[9][2] = 89;
	  	x[9][3] = 120;
	  		y[9][3] = 76;
	  		
	  	x[10][0] = 120;
	  		y[10][0] = 76;
	  	x[10][1] = 124;
	  		y[10][1] = 61;
	  	x[10][2] = 171;
	  		y[10][2] = 65;
	  	x[10][3] = 157;
	  		y[10][3] = 69;
	  		
	  	x[11][0] = 255;
	  		y[11][0] = 69;
	  	x[11][1] = 259;
	  		y[11][1] = 61;
	  	x[11][2] = 304;
	  		y[11][2] = 47;
	  	x[11][3] = 316;
	  		y[11][3] = 175;
	  		
	  	x[12][0] = 316;
	  		y[12][0] = 175;
	  	x[12][1] = 316;
	  		y[12][1] = 179;
	  	x[12][2] = 327;
	  		y[12][2] = 307;
	  	x[12][3] = 239;
	  		y[12][3] = 297;
	  		
	  	x[13][0] = 239;
	  		y[13][0] = 297;
	  	x[13][1] = 208;
	  		y[13][1] = 293;
	  	x[13][2] = 214;
	  		y[13][2] = 85;
	  	x[13][3] = 255;
	  		y[13][3] = 69;
	  	
	  	x[14][0] = 265;
	  		y[14][0] = 297;
	  	x[14][1] = 238;
	  		y[14][1] = 233;
	  	x[14][2] = 255;
	  		y[14][2] = 85;
	  	x[14][3] = 280;
	  		y[14][3] = 70;
	  		
	  	x[15][0] = 410;
	  		y[15][0] = 173;
	  	x[15][1] = 410;
	  		y[15][1] = 158;
	  	x[15][2] = 410;
	  		y[15][2] = 317;
	  	x[15][3] = 411;
	  		y[15][3] = 332;
	  		
	  	x[16][0] = 411;
	  		y[16][0] = 332;
	  	x[16][1] = 414;
	  		y[16][1] = 358;
	  	x[16][2] = 471;
	  		y[16][2] = 358;
	  	x[16][3] = 474;
	  		y[16][3] = 332;
	  		
	  	x[17][0] = 474;
	  		y[17][0] = 332;
	  	x[17][1] = 475;
	  		y[17][1] = 316;
	  	x[17][2] = 475;
	  		y[17][2] = 158;
	  	x[17][3] = 475;
	  		y[17][3] = 173;
	  		
	  	x[18][0] = 475;
	  		y[18][0] = 173;
	  	x[18][1] = 476;
	  		y[18][1] = 158;
	  	x[18][2] = 426;
	  		y[18][2] = 148;
	  	x[18][3] = 411;
	  		y[18][3] = 171;
	  		
	  	x[19][0] = 411;
	  		y[19][0] = 171;
	  	x[19][1] = 407;
	  		y[19][1] = 187;
	  	x[19][2] = 471;
	  		y[19][2] = 198;
	  	x[19][3] = 475;
	  		y[19][3] = 174;
	  		
	  	x[20][0] = 422;
	  		y[20][0] = 108;
	  	x[20][1] = 421;
	  		y[20][1] = 93;
	  	x[20][2] = 462;
	  		y[20][2] = 52;
	  	x[20][3] = 463;
	  		y[20][3] = 37;
	  		
	  	x[21][0] = 463;
	  		y[21][0] = 37;
	  	x[21][1] = 464;
	  		y[21][1] = 22;
	  	x[21][2] = 477;
	  		y[21][2] = 95;
	  	x[21][3] = 471;
	  		y[21][3] = 119;
	  		
	  	x[22][0] = 471;
	  		y[22][0] = 119;
	  	x[22][1] = 467;
	  		y[22][1] = 134;
	  	x[22][2] = 436;
	  		y[22][2] = 183;
	  	x[22][3] = 423;
	  		y[22][3] = 110;
	  		

	  	x[23][0] = 149;
	  		y[23][0] = 411;
	  	x[23][1] = 375;
	  		y[23][1] = 509;
	  	x[23][2] = 236;
	  		y[23][2] = 339;
	  	x[23][3] = 484;
	  		y[23][3] = 391;
	  		
	  	x[24][0] = 196;
	  		y[24][0] = 362;
	  	x[24][1] = 313;
	  		y[24][1] = 470;
	  	x[24][2] = 548;
	  		y[24][2] = 439;
	  	x[24][3] = 481;
	  		y[24][3] = 390;
	  		  
	  	x[25][0] = 149;
	  		y[25][0] = 411;
	  	x[25][1] = 97;
	  		y[25][1] = 354;
	  	x[25][2] = 175;
	  		y[25][2] = 347;
	  	x[25][3] = 196;
	  		y[25][3] = 362;
	  		  
	 }
	
	private void drawBeziere(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
        g2d.setBackground(Color.BLACK);
        g2d.fillRect(0, 0, 900, 600);
        g2d.setColor(Color.CYAN);
        
        for(int i = 0; i < 26; i++) {
        	for(double t = 0.0; t <= 1.0; t+=0.005) {
            	px = Math.pow(1-t, 3)*x[i][0] + 3*t*Math.pow(1-t, 2)*x[i][1] + 3*t*t*Math.pow(1-t, 1)*x[i][2] + Math.pow(t, 3) * x[i][3];
            	py = Math.pow(1-t, 3)*y[i][0] + 3*t*Math.pow(1-t, 2)*y[i][1] + 3*t*t*Math.pow(1-t, 1)*y[i][2] + Math.pow(t, 3) * y[i][3];
            	g2d.drawLine((int)px, (int)py, (int)px, (int)py);
            }
        }
        g2d.dispose();
	}
}