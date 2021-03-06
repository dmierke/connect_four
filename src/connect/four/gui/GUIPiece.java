/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.four.gui;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class GUIPiece extends JLabel
{
	int glowNum;
	ImageIcon glow1;
	ImageIcon glow2;
	ImageIcon glow3;
	ImageIcon glow4;
	ImageIcon[] glowing;
	
	public GUIPiece(int playerNum)
	{
		setSize(145, 145);
		setOpaque(false);
		setText("");
		ImageIcon redIcon = loadIcon("/red_glow/glow1.png");
		ImageIcon blueIcon = loadIcon("/blue_glow/glow1.png");
		if (playerNum == 0)
		{
			setIcon(redIcon);
			glowNum = 0;
			glow1 = loadIcon("/red_glow/glow1.png");
			glow2 = loadIcon("/red_glow/glow2.png");
			glow3 = loadIcon("/red_glow/glow3.png");
			glow4 = loadIcon("/red_glow/glow4.png");
		}
		else
		{
			setIcon(blueIcon);
			glowNum = 1;
			glow1 = loadIcon("/blue_glow/glow1.png");
			glow2 = loadIcon("/blue_glow/glow2.png");
			glow3 = loadIcon("/blue_glow/glow3.png");
			glow4 = loadIcon("/blue_glow/glow4.png");
		}
		
		glowing = new ImageIcon[] { glow1, glow2, glow3, glow4, glow3, glow2 };
		revalidate();
		repaint();
		setVisible(true);
	}
	
	ImageIcon getGlow(int index)
	{
		return glowing[index];
	}
	
	private ImageIcon loadIcon(String iconPath)
	{
		URL iconURL = getClass().getResource(iconPath);
		return new ImageIcon(iconURL);
	}
	
}
