import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Deck extends JFrame{
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JLabel a,b,c,d;
	
public static void main(String[] args){

	Deck frame = new Deck();
	frame.setTitle("Deck");
	frame.setVisible(true);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);

	}
	public Deck(){
		this.add(p2,BorderLayout.SOUTH);
  		this.add(p1,BorderLayout.NORTH);		

		ImageIcon[] deck = new ImageIcon[52];  
		for(int i = 0 ; i <52 ;i++){
   		deck[i] = new ImageIcon((getClass().getResource("card/"+(i+1)+".png")));
  		}
		int x,y,n,m;
		do{ x = (int)( Math.random() * 52 );
		 y = (int)( Math.random() * 52 );
		 n = (int)( Math.random() * 52 );
		 m = (int)( Math.random() * 52 );
		}while(x == y || y == n || n == m || x == m || y == m || x == n);
		p1.setLayout(new GridLayout(1,4,5,5));
		a = new JLabel(deck[x]);
		b = new JLabel(deck[y]);
		c = new JLabel(deck[n]);
		d = new JLabel(deck[m]);

		p1.add(a);
		p1.add(b);
		p1.add(c);
		p1.add(d);
		
	JButton button = new JButton("Refresh");
	p2.add(button,BorderLayout.SOUTH);	

	button.addActionListener(new DeckListener());
		
	}

		class DeckListener implements ActionListener{
			ImageIcon[] deck = new ImageIcon[52];
			
			@Override
			public void actionPerformed(ActionEvent e){
			for(int i = 0 ; i <52 ;i++){
   			deck[i] = new ImageIcon((getClass().getResource("card/"+(i+1)+".png")));
  			}
			int x,y,n,m;
				do{ x = (int)( Math.random() * 52 );
				 y = (int)( Math.random() * 52 );
		 		 n = (int)( Math.random() * 52 );
				 m = (int)( Math.random() * 52 );
				}while(x == y || y == n || n == m || x == m || y == m || x == n);
				p1.repaint();	 
				a.setIcon(deck[x]);
				b.setIcon(deck[y]);
				c.setIcon(deck[n]);
				d.setIcon(deck[m]);
		}
	}


}


