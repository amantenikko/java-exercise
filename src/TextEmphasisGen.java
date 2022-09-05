import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEmphasisGen extends JFrame implements ItemListener
{
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	Label lbl = new Label("Enter Text : ");
	TextField tf = new TextField("",20);
	Font Boldfnt = new Font("Arial",Font.BOLD,12);
	Font Italicfnt = new Font("Arial",Font.ITALIC,12);
	Font BnIfnt = new Font("Arial",Font.BOLD+Font.ITALIC,12);
	Font Normfnt = new Font("Arial",Font.PLAIN,12);
	Checkbox BoldBx = new Checkbox("Bold");; 
	Checkbox ItalicBx = new Checkbox("Italic");
	Checkbox BnIBx = new Checkbox("Bold Italic"); 
	Checkbox NormBx = new Checkbox("Normal"); 
	Label credit = new Label("</> with <3 by Nikko Amante");

	TextEmphasisGen() {
		setTitle(this.getClass().getCanonicalName());
		setLayout(new FlowLayout());
		add(lbl);
		add(tf);
		add(BoldBx);
		add(ItalicBx);
		add(BnIBx);
		add(NormBx);
		BoldBx.addItemListener(this);
		ItalicBx.addItemListener(this);
		BnIBx.addItemListener(this);
		NormBx.addItemListener(this);
		BoldBx.setFont(Boldfnt);
		ItalicBx.setFont(Italicfnt);
		BnIBx.setFont(BnIfnt);
		NormBx.setFont(Normfnt);
		NormBx.setState(true);
		add(credit);

		setSize(280,100);
		setResizable(false);
		setVisible(true);
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent e){
		if (e.getItemSelectable() == BoldBx) {
			tf.setFont(Boldfnt);
			ItalicBx.setState(false);
			BnIBx.setState(false);
			NormBx.setState(false);
			if (BoldBx.getState() == false) {
				BoldBx.setState(true);
			}
		}
		if (e.getItemSelectable() == ItalicBx) {
			tf.setFont(Italicfnt);
			BoldBx.setState(false);
			BnIBx.setState(false);
			NormBx.setState(false);
			if (ItalicBx.getState() == false) {
				ItalicBx.setState(true);
			}
		}
		if (e.getItemSelectable() == BnIBx) {
			tf.setFont(BnIfnt);
			BoldBx.setState(false);
			ItalicBx.setState(false);
			NormBx.setState(false);
			if (BnIBx.getState() == false) {
				BnIBx.setState(true);
			}
		}
		if (e.getItemSelectable() == NormBx) {
			tf.setFont(Normfnt);
			BoldBx.setState(false);
			ItalicBx.setState(false);
			BnIBx.setState(false);
			if (NormBx.getState() == false) {
				NormBx.setState(true);
			}
		}
	}
	
	public static void main(String[] args) {
		new TextEmphasisGen();
	}

}
