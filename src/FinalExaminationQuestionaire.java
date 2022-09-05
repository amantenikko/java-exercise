import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FinalExaminationQuestionaire extends JFrame implements ActionListener, ItemListener
{
	GridLayout gl = new GridLayout(30,2,30,3);
	int numCorrect=0;
	boolean[] isCorrect=new boolean[10];
	Label[] quest=new Label[10];
	CheckboxGroup[] cbg = new CheckboxGroup[10];
	Checkbox[] cba=new Checkbox[10];
	Checkbox[] cbb=new Checkbox[10];
	Checkbox[] cbc=new Checkbox[10];
	Checkbox[] cbd=new Checkbox[10];
	Font fnt = new Font("Arial",Font.BOLD,13);
	Button Submit=new Button("Submit");
	Label result=new Label(" </> with <3 by Nikko Amante");
	Label namelbl=new Label("Name :");
	TextField nametf=new TextField("",10);
	Label programlbl=new Label("Program :");
	Choice programchc=new Choice();
	Label scorelbl=new Label("Score      : ");
	Label gradelbl=new Label("Grade     : ");
	Label remarklbl=new Label("Remark  : ");
	Label blank=new Label("");
	
	FinalExaminationQuestionaire()
	{
		setTitle(this.getClass().getCanonicalName());
		setLayout(gl);
		Submit.setEnabled(false);
		programchc.addItemListener(this);
		programchc.add("-Choose Program-");
		programchc.add("BSIT");
		programchc.add("BSCpE");
		programchc.add("BSCS");
		
		for(int i=0; i<=9; i++)
		{
			isCorrect[i] = false;
			cbg[i] = new CheckboxGroup();
			if(i==0)
			{
				quest[i]=new Label("1.) Which method is the starting point for all Java programs?");
				cba[i]=new Checkbox("A. main",cbg[i],false);
				cbb[i]=new Checkbox("B. start",cbg[i],false);
				cbc[i]=new Checkbox("C. package",cbg[i],false);
				cbd[i]=new Checkbox("D. class",cbg[i],false);
			}
			if(i==1)
			{
				quest[i]=new Label("2.) Which method prints text in a Java program?");
				cba[i]=new Checkbox("A. System.printText()",cbg[i],false);
				cbb[i]=new Checkbox("B. System.out()",cbg[i],false);
				cbc[i]=new Checkbox("C. out.writeText()",cbg[i],false);
				cbd[i]=new Checkbox("D. System.out.println()",cbg[i],false);
			}
			if(i==2)
			{
				quest[i]=new Label("3.) Which data type would you use for a city name?");
				cba[i]=new Checkbox("A. String",cbg[i],false);
				cbb[i]=new Checkbox("B. Int",cbg[i],false);
				cbc[i]=new Checkbox("C. Double",cbg[i],false);
				cbd[i]=new Checkbox("D. Char",cbg[i],false);
			}
			if(i==3)
			{
				quest[i]=new Label("4.) In Java, an array starts counting from...");
				cba[i]=new Checkbox("A. 2",cbg[i],false);
				cbb[i]=new Checkbox("B. 0",cbg[i],false);
				cbc[i]=new Checkbox("C. 3",cbg[i],false);
				cbd[i]=new Checkbox("D. 1",cbg[i],false);
			}
			if(i==4)
			{
				quest[i]=new Label("5.) It is to be embedded in a Web page or viewed by the Java Applet Viewer.");
				cba[i]=new Checkbox("A. Frame",cbg[i],false);
				cbb[i]=new Checkbox("B. Applet",cbg[i],false);
				cbc[i]=new Checkbox("C. Eclipse",cbg[i],false);
				cbd[i]=new Checkbox("D. Browser",cbg[i],false);
			}
			if(i==5)
			{
				quest[i]=new Label("6.) It  is a component used to display a single line of read only text but not allows to edit the text.");
				cba[i]=new Checkbox("A. TextField",cbg[i],false);
				cbb[i]=new Checkbox("B. Button",cbg[i],false);
				cbc[i]=new Checkbox("C. Label",cbg[i],false);
				cbd[i]=new Checkbox("D. Checkbox",cbg[i],false);
			}
			if(i==6)
			{
				quest[i]=new Label("7.) It is a text component that allows the editing of a single line text.");
				cba[i]=new Checkbox("A. TextField",cbg[i],false);
				cbb[i]=new Checkbox("B. Button",cbg[i],false);
				cbc[i]=new Checkbox("C. Checkbox",cbg[i],false);
				cbd[i]=new Checkbox("D. Label",cbg[i],false);
			}
			if(i==7)
			{
				quest[i]=new Label("8.)  Clicking on _____ changes its state from on to off or from off to on.");
				cba[i]=new Checkbox("A. Button",cbg[i],false);
				cbb[i]=new Checkbox("B. Checkbox",cbg[i],false);
				cbc[i]=new Checkbox("C. Switch",cbg[i],false);
				cbd[i]=new Checkbox("D. Label",cbg[i],false);
			}
			if(i==8)
			{
				quest[i]=new Label("9.)  It is notified whenever you click on the button. These implements is found in java.awt.event package.");
				cba[i]=new Checkbox("A. ItemEvent",cbg[i],false);
				cbb[i]=new Checkbox("B. ActionEvent",cbg[i],false);
				cbc[i]=new Checkbox("C. ItemListener",cbg[i],false);
				cbd[i]=new Checkbox("D. ActionListener",cbg[i],false);
			}
			if(i==9)
			{
				quest[i]=new Label("10.) It is used to arrange the components in rectangular grid.");
				cba[i]=new Checkbox("A. BorderLayout",cbg[i],false);
				cbb[i]=new Checkbox("B. RectangleLayout",cbg[i],false);
				cbc[i]=new Checkbox("C. GridLayout",cbg[i],false);
				cbd[i]=new Checkbox("D. ViewLayout",cbg[i],false);
			}
			quest[i].setFont(fnt);
			quest[i].setBackground(new Color(200,250,250));
			cba[i].setBackground(Color.LIGHT_GRAY);
			cbb[i].setBackground(Color.LIGHT_GRAY);
			cbc[i].setBackground(Color.LIGHT_GRAY);
			cbd[i].setBackground(Color.LIGHT_GRAY);
		}
		
		for(int i=0; i<=3; i++)
		{
			add(quest[i]);add(quest[i+6]);
			add(cba[i]);add(cba[i+6]);
			add(cbb[i]);add(cbb[i+6]);
			add(cbc[i]);add(cbc[i+6]);
			add(cbd[i]);add(cbd[i+6]);
			cba[i].addItemListener(this);cba[i+6].addItemListener(this);
			cbb[i].addItemListener(this);cbb[i+6].addItemListener(this);
			cbc[i].addItemListener(this);cbc[i+6].addItemListener(this);
			cbd[i].addItemListener(this);cbd[i+6].addItemListener(this);
		}
		add(quest[4]);add(blank);
		add(cba[4]);add(namelbl);
		add(cbb[4]);add(nametf);
		add(cbc[4]);add(programlbl);
		add(cbd[4]);add(programchc);
		add(quest[5]);add(scorelbl);
		add(cba[5]);add(gradelbl);
		add(cbb[5]);add(remarklbl);
		add(cbc[5]);add(Submit);Submit.addActionListener(this);
		add(cbd[5]);add(result);
		cba[4].addItemListener(this);cba[5].addItemListener(this);
		cbb[4].addItemListener(this);cbb[5].addItemListener(this);
		cbc[4].addItemListener(this);cbc[5].addItemListener(this);
		cbd[4].addItemListener(this);cbd[5].addItemListener(this);
		
		setBounds(350,50,650,670);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==Submit)
		{
			numCorrect=0;
			for(int i=0; i<=9; i++)
			{	
				if(isCorrect[i]==true)
				{
					numCorrect++;
				}
				cba[i].setEnabled(false);
				cbb[i].setEnabled(false);
				cbc[i].setEnabled(false);
				cbd[i].setEnabled(false);
				if(cba[i].getState()==true&&isCorrect[i]==false) {
					cba[i].setBackground(new Color(255,150,150));
				}
				if(cbb[i].getState()==true&&isCorrect[i]==false) {
					cbb[i].setBackground(new Color(255,150,150));
				}
				if(cbc[i].getState()==true&&isCorrect[i]==false) {
					cbc[i].setBackground(new Color(255,150,150)); 
				}
				if(cbd[i].getState()==true&&isCorrect[i]==false)
				{
					cbd[i].setBackground(new Color(255,150,150));
				}
			}
			cba[0].setBackground(new Color(150,255,150));
			cbd[1].setBackground(new Color(150,255,150));
			cba[2].setBackground(new Color(150,255,150));
			cbb[3].setBackground(new Color(150,255,150));
			cbb[4].setBackground(new Color(150,255,150));
			cbc[5].setBackground(new Color(150,255,150));
			cba[6].setBackground(new Color(150,255,150));
			cbb[7].setBackground(new Color(150,255,150));
			cbd[8].setBackground(new Color(150,255,150));
			cbc[9].setBackground(new Color(150,255,150));
			
			nametf.setEditable(false);nametf.setBackground(Color.WHITE);
			programchc.setEnabled(false);;programchc.setForeground(Color.BLACK);
			scorelbl.setText("Score      : "+String.valueOf(numCorrect)+" / 10");
			if(numCorrect==10)
			{
				gradelbl.setText("Grade     : 100");remarklbl.setText("Remark  : Passed");
			}else if(numCorrect==9)
			{
				gradelbl.setText("Grade     : 95");remarklbl.setText("Remark  : Passed");
			}else if(numCorrect==8)
			{
				gradelbl.setText("Grade     : 90");remarklbl.setText("Remark  : Passed");
			}else if(numCorrect==7)
			{
				gradelbl.setText("Grade     : 85");remarklbl.setText("Remark  : Passed");
			}else if(numCorrect==6)
			{
				gradelbl.setText("Grade     : 80");remarklbl.setText("Remark  : Passed");
			}else if(numCorrect==5)
			{
				gradelbl.setText("Grade     : 75");remarklbl.setText("Remark  : Passed");
			}else if(numCorrect==4)
			{
				gradelbl.setText("Grade     : 70");remarklbl.setText("Remark  : Failed");
			}else if(numCorrect==3)
			{
				gradelbl.setText("Grade     : 68");remarklbl.setText("Remark  : Failed");
			}else if(numCorrect==2)
			{
				gradelbl.setText("Grade     : 65");remarklbl.setText("Remark  : Failed");
			}else if(numCorrect==1)
			{
				gradelbl.setText("Grade     : 63");remarklbl.setText("Remark  : Failed");
			}else 
			{
				gradelbl.setText("Grade     : 60");remarklbl.setText("Remark  : Failed");
			}
		}
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItemSelectable()==cba[0]||e.getItemSelectable()==cbb[0]||e.getItemSelectable()==cbc[0]||e.getItemSelectable()==cbd[0])
		{
			if(cba[0].getState()==true)
			{
					isCorrect[0]=true;
			}else{
					isCorrect[0]=false;
			}
		}
		if(e.getItemSelectable()==cba[1]||e.getItemSelectable()==cbb[1]||e.getItemSelectable()==cbc[1]||e.getItemSelectable()==cbd[1])
		{
			if(cbd[1].getState()==true)
			{
				isCorrect[1]=true;
			}else{
				isCorrect[1]=false;
			}
		}
		if(e.getItemSelectable()==cba[2]||e.getItemSelectable()==cbb[2]||e.getItemSelectable()==cbc[2]||e.getItemSelectable()==cbd[2])
		{
			if(cba[2].getState()==true)
			{
				isCorrect[2]=true;
			}else{
				isCorrect[2]=false;
			}
		}
		if(e.getItemSelectable()==cba[3]||e.getItemSelectable()==cbb[3]||e.getItemSelectable()==cbc[3]||e.getItemSelectable()==cbd[3])
		{
			if(cbb[3].getState()==true)
			{
				isCorrect[3]=true;
			}else{
				isCorrect[3]=false;
			}
		}
		if(e.getItemSelectable()==cba[4]||e.getItemSelectable()==cbb[4]||e.getItemSelectable()==cbc[4]||e.getItemSelectable()==cbd[4])
		{
			if(cbb[4].getState()==true)
			{
				isCorrect[4]=true;
			}else{
				isCorrect[4]=false;
			}
		}
		if(e.getItemSelectable()==cba[5]||e.getItemSelectable()==cbb[5]||e.getItemSelectable()==cbc[5]||e.getItemSelectable()==cbd[5])
		{
			if(cbc[5].getState()==true)
			{
				isCorrect[5]=true;
			}else{
				isCorrect[5]=false;
			}
		}
		if(e.getItemSelectable()==cba[6]||e.getItemSelectable()==cbb[6]||e.getItemSelectable()==cbc[6]||e.getItemSelectable()==cbd[6])
		{
			if(cba[6].getState()==true)
			{
				isCorrect[6]=true;
			}else{
				isCorrect[6]=false;
			}
		}
		if(e.getItemSelectable()==cba[7]||e.getItemSelectable()==cbb[7]||e.getItemSelectable()==cbc[7]||e.getItemSelectable()==cbd[7])
		{
			if(cbb[7].getState()==true)
			{
				isCorrect[7]=true;
			}else{
				isCorrect[7]=false;
			}
		}
		if(e.getItemSelectable()==cba[8]||e.getItemSelectable()==cbb[8]||e.getItemSelectable()==cbc[8]||e.getItemSelectable()==cbd[8])
		{
			if(cbd[8].getState()==true)
			{
				isCorrect[8]=true;
			}else{
				isCorrect[8]=false;
			}
		}
		if(e.getItemSelectable()==cba[9]||e.getItemSelectable()==cbb[9]||e.getItemSelectable()==cbc[9]||e.getItemSelectable()==cbd[9])
		{
			if(cbc[9].getState()==true)
			{
				isCorrect[9]=true;
			}else{
				isCorrect[9]=false;
			}
		}
		if(programchc.getSelectedItem() != "-Choose Program-")
		{
			Submit.setEnabled(true);
		}else{
			Submit.setEnabled(false);
		}
	}

	public static void main(String[] args) {
		new FinalExaminationQuestionaire();
	}
}
