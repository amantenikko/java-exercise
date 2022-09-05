import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class CollegeEntrants extends JFrame implements ActionListener,ItemListener
{
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	Label Header = new Label("********College Entrants Assessment********");
	Label FN = new Label("First Name  ");
	TextField FNtf = new TextField("",18);
	Label LN = new Label("Last Name ");
	TextField LNtf = new TextField("",18);
	Label FlN = new Label("Full Name ");
	TextField FlNtf = new TextField("",18);
	Label Sex = new Label("Sex ");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox male = new Checkbox("Male ",cbg,false);
	Checkbox female = new Checkbox("Female ",cbg,false);
	TextField Sextf = new TextField("",30);
	Label Header2 = new Label("************Grades Obtained in HS************");
	Label MathEx = new Label("Mathematics ");
	TextField MathExtf = new TextField("",4);
	Label EngEx = new Label("English ");
	TextField EngExtf = new TextField("",4);
	Label SciEx = new Label("Science ");
	TextField SciExtf = new TextField("",4);
	Label Ave = new Label("Grade ");
	TextField Avetf = new TextField("",20);
	Button ComputeBtn = new Button("Compute Average");
	Label Remark = new Label("Remarks ");
	TextField Remarktf = new TextField("",20);
	Choice Prog = new Choice();
	TextField Progtf = new TextField("",34);
	Timer timer = new Timer(40,this);
	Label credit = new Label("</> with <3 by Nikko Amante");
	
	CollegeEntrants()
	{
		setTitle(this.getClass().getCanonicalName());
		setLayout(new FlowLayout());
		add(Header);
		add(FN);
		add(FNtf);
		add(LN);
		add(LNtf);LNtf.addActionListener(this);
		add(FlN);
		add(FlNtf);
		FlNtf.setEditable(false);
		FlNtf.setBackground(new Color(200,250,250));
		add(Sex);
		add(male);male.addItemListener(this);
		add(female);female.addItemListener(this);
		add(Sextf);
		Sextf.setEditable(false);
		Sextf.setBackground(new Color(200,250,250));
		add(Header2);
		add(MathEx);
		add(MathExtf);
		add(EngEx);
		add(EngExtf);
		add(SciEx);
		add(SciExtf);
		add(ComputeBtn);
		ComputeBtn.addActionListener(this);
		add(Ave);
		add(Avetf);
		Avetf.setEditable(false);
		Avetf.setBackground(new Color(200,250,250));
		add(Remark);
		add(Remarktf);
		Remarktf.setEditable(false);
		Remarktf.setBackground(new Color(200,250,250));
		add(Prog);Prog.addItemListener(this);
		Prog.add("- Input Grades First -");
		add(Progtf);
		Progtf.setEditable(false);
		Progtf.setBackground(new Color(200,250,250));
		timer.start();
		add(credit);

		setSize(290, 450);
		setResizable(false);
		setVisible(true);
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent e) 
	{
		if (e.getItemSelectable() == male)
		{
			Sextf.setText("Good day, Sir");
		}
		if (e.getItemSelectable() == female)
		{
			Sextf.setText("Good day, Ma'am");
		}
		
		if (e.getItemSelectable() == Prog)
		{
			if(Prog.getSelectedItem() == "- Choose Program -")
			{
				Progtf.setText("");
			}
			if(Prog.getSelectedItem() == "BSIT")
			{
				Progtf.setText("Bachelor of Science in Information Technology");
			}
			if(Prog.getSelectedItem() == "BSCS")
			{
				Progtf.setText("Bachelor of Science in Computer Science");
			}
			if(Prog.getSelectedItem() == "BSCpE")
			{
				Progtf.setText("Bachelor of Science in Computer Engineering");
			}
		}

	}
		
	public void actionPerformed(ActionEvent e) 
	{	
		timer.start();
		FlNtf.setText(FNtf.getText()+" "+LNtf.getText());
		if (e.getSource() == ComputeBtn) {
			int TotalAverageInInt = (Integer.parseInt(MathExtf.getText())+Integer.parseInt(EngExtf.getText())+
									Integer.parseInt(SciExtf.getText()))/3;
			String TotalAverageInStr = Integer.toString(TotalAverageInInt);
			Avetf.setText(TotalAverageInStr);
			if (TotalAverageInInt > 74)
			{
				Remarktf.setText("You are Qualified");
				Prog.removeAll();
				Prog.add("- Choose Program -");
				Prog.add("BSIT");
				Prog.add("BSCS");
				Prog.add("BSCpE");
				Progtf.setText("");
				Prog.setEnabled(true);
				Progtf.setEnabled(true);
			}
			else
			{
				Remarktf.setText("You are not Qualified");
				Prog.removeAll();
				Prog.add("- Choose Program -");
				Progtf.setText("");
				Prog.setEnabled(false);
				Progtf.setEnabled(false);
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		new CollegeEntrants();
	}

}
