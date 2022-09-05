import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaQuiz extends JFrame implements ActionListener, ItemListener
{
	GridLayout gl = new GridLayout(11,2,70,0);
	int NumCount = 0;
	int NumAns[] = new int[10];
	int CorrectAns = 0;
	CheckboxGroup cbg = new CheckboxGroup();
	Label q = new Label("1.) Question Number 1");
	Checkbox a = new Checkbox("A.",cbg,false);
	Checkbox b = new Checkbox("B.",cbg,false);
	Checkbox c = new Checkbox("C.",cbg,false);
	Checkbox d = new Checkbox("D.",cbg,false);
	Button btn = new Button("Next");
	Label[] ans = new Label[10];
	Label result = new Label("Result");
	Label result2 = new Label("Score :");
	Label result3 = new Label("Remark :");
	Label result4 = new Label("Grade :");
	Label info = new Label(" </> with <3 by Nikko Amante");
	
	JavaQuiz()
	{
		for(int i = 0; i <= 9; i++)
		{
			ans[i] = new Label((i+1)+".)");
			ans[i].setBackground(Color.LIGHT_GRAY);
		}
		setLayout(gl);
		add(q);add(ans[0]);
		add(a);a.addItemListener(this);add(ans[1]);
		add(b);b.addItemListener(this);add(ans[2]);
		add(c);c.addItemListener(this);add(ans[3]);
		add(d);d.addItemListener(this);add(ans[4]);
		add(btn);btn.addActionListener(this);btn.setBackground(Color.cyan);add(ans[5]);
		add(result);add(ans[6]);
		add(result2);add(ans[7]);
		add(result4);add(ans[8]);
		add(result3);add(ans[9]);
		add(info);

		setBounds(350,50,650,670);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn)
		{
			if(NumCount == 0)
			{
				q.setText("2.) Question Number 2");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				NumCount++;
			}
			else if(NumCount == 1)
			{
				q.setText("3.) Question Number 3");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				NumCount++;
			}
			else if(NumCount == 2)
			{
				q.setText("4.) Question Number 4");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				NumCount++;
			}
			else if(NumCount == 3)
			{
				q.setText("5.) Question Number 5");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				NumCount++;
			}
			else if(NumCount == 4)
			{
				q.setText("6.) Question Number 6");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				NumCount++;
			}
			else if(NumCount == 5)
			{
				q.setText("7.) Question Number 7");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				NumCount++;
			}
			else if(NumCount == 6)
			{
				q.setText("8.) Question Number 8");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				NumCount++;
			}
			else if(NumCount == 7)
			{
				q.setText("9.) Question Number 9");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				NumCount++;
			}
			else if(NumCount == 8)
			{
				q.setText("10.) Question Number 10");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				btn.setLabel("Submit");
				NumCount++;
			}
			else if(NumCount == 9)
			{
				CorrectAns=0;
				for(int i = 0; i <= 9; i++)
				{
					if(NumAns[i] == 1)
					{
						CorrectAns++;
					}
				}
				result2.setText("Score : "+String.valueOf(CorrectAns)+" / 10");
				if(CorrectAns == 0)
				{
					result4.setText("Grade : 60");result3.setText("Remark : Failed");
				}
				else if(CorrectAns == 1)
				{
					result4.setText("Grade : 63");result3.setText("Remark : Failed");
				}
				else if(CorrectAns == 2)
				{
					result4.setText("Grade : 66");result3.setText("Remark : Failed");
				}
				else if(CorrectAns == 3)
				{
					result4.setText("Grade : 68");result3.setText("Remark : Failed");
				}
				else if(CorrectAns == 4)
				{
					result4.setText("Grade : 70");result3.setText("Remark : Failed");
				}
				else if(CorrectAns == 5)
				{
					result4.setText("Grade : 75");result3.setText("Remark : Passed");
				}
				else if(CorrectAns == 6)
				{
					result4.setText("Grade : 80");result3.setText("Remark : Passed");
				}
				else if(CorrectAns == 7)
				{
					result4.setText("Grade : 85");result3.setText("Remark : Passed");
				}
				else if(CorrectAns == 8)
				{
					result4.setText("Grade : 90");result3.setText("Remark : Passed");
				}
				else if(CorrectAns == 9)
				{
					result4.setText("Grade : 95");result3.setText("Remark : Passed");	
				}
				else
				{
					result4.setText("Grade : 100");result3.setText("Remark : Passed");
				}
				a.setEnabled(false);
				b.setEnabled(false);
				c.setEnabled(false);
				d.setEnabled(false);
				btn.setLabel("Retry");
				NumCount++;
			} else {
				for(int i = 0; i <= 9; i++)
				{
					ans[i].setText((i+1)+".)");
				}

				q.setText("1.) Question Number 1");
				a.setLabel("A.");
				b.setLabel("B.");
				c.setLabel("C.");
				d.setLabel("D.");
				result.setText("Result");
				result2.setText("Score :");
				result3.setText("Remark :");
				result4.setText("Grade :");
				a.setEnabled(true);
				b.setEnabled(true);
				c.setEnabled(true);
				d.setEnabled(true);
				btn.setLabel("Next");
				NumCount = 0;
			}
		}
			cbg.setSelectedCheckbox(null);
			
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItemSelectable() == a)
		{
			NumAns[NumCount] = 1;
			ans[NumCount].setText((NumCount+1)+".) A");
		}
		if(e.getItemSelectable() == b)
		{
			NumAns[NumCount] = 2;
			ans[NumCount].setText((NumCount+1)+".) B");
		}
		if(e.getItemSelectable() == c)
		{
			NumAns[NumCount] = 3;
			ans[NumCount].setText((NumCount+1)+".) C");
		}
		if(e.getItemSelectable() == d)
		{
			NumAns[NumCount] = 4;
			ans[NumCount].setText((NumCount+1)+".) D");
		}
	}

	public static void main(String[] args) {
		new JavaQuiz();
	}
}
