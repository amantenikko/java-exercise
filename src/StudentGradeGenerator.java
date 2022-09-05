import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGradeGenerator extends JFrame implements ActionListener,ItemListener
{
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	Label StudentInfo = new Label("********STUDENT INFORMATION********");
	Label StudentID = new Label("Student No. : ");
	TextField StudentIDField = new TextField("",18);
	Label StudentName = new Label("Student Name :");
	TextField StudentNameField = new TextField("",18);
	Label StudentProg = new Label("Program :");
	Checkbox ProgBox1 = new Checkbox("BSIT");
	Checkbox ProgBox2 = new Checkbox("BSCS");
	Checkbox ProgBox3 = new Checkbox("BSCpE");
	TextField ProgField = new TextField("",35);
	Label PrelimEx = new Label("Prelim :");
	TextField PrelimExField = new TextField("",4);
	Label MidtermEx = new Label("Midterm :");
	TextField MidtermExField = new TextField("",4);
	Label SemisEx = new Label("Semis :");
	TextField SemisExField = new TextField("",4);
	Label FinalEx = new Label("Finals :");
	TextField FinalExField = new TextField("",4);
	Label Grade = new Label("Grade :");
	TextField GradeField = new TextField("",7);
	Button ComputeBtn = new Button("Compute Grade");
	Label IQ = new Label("IQ :");
	TextField IQField = new TextField("",5);
	Label Remark = new Label("Remarks :");
	TextField RemarkField = new TextField("",5);
	Label credit = new Label("</> with <3 by Nikko Amante");
	
	StudentGradeGenerator() {
		setTitle(this.getClass().getCanonicalName().substring(7));
		setLayout(new FlowLayout());
		add(StudentInfo);
		add(StudentID);
		add(StudentIDField);
		add(StudentName);
		add(StudentNameField);
		add(StudentProg);
		add(ProgBox1);ProgBox1.addItemListener(this);
		add(ProgBox2);ProgBox2.addItemListener(this);
		add(ProgBox3);ProgBox3.addItemListener(this);
		add(ProgField);
		ProgField.setEditable(false);
		ProgField.setBackground(new Color(200,250,250));
		add(PrelimEx);
		add(PrelimExField);
		add(MidtermEx);
		add(MidtermExField);
		add(SemisEx);
		add(SemisExField);
		add(FinalEx);
		add(FinalExField);
		add(Grade);
		add(GradeField);
		GradeField.setEditable(false);
		GradeField.setBackground(new Color(200,250,250));
		add(ComputeBtn);
		ComputeBtn.addActionListener(this);
		add(IQ);
		add(IQField);
		IQField.setEditable(false);
		IQField.setBackground(new Color(200,250,250));
		add(Remark);
		add(RemarkField);
		RemarkField.setEditable(false);
		RemarkField.setBackground(new Color(200,250,250));
		add(credit);

		setSize(295, 350);
		setResizable(false);
		setVisible(true);
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent e) 
	{
		if (e.getItemSelectable() == ProgBox1) {
			ProgField.setText("Bachelor of Science in Information Technology");
			ProgBox2.setState(false);ProgBox3.setState(false);
		}
		if (e.getItemSelectable() == ProgBox2) {
			ProgField.setText("Bachelor of Science in Computer Science");
			ProgBox1.setState(false);ProgBox3.setState(false);
		}
		if (e.getItemSelectable() == ProgBox3) {
			ProgField.setText("Bachelor of Science in Computer Engineering");
			ProgBox2.setState(false);ProgBox1.setState(false);
		}
		if (e.getStateChange() == 2) {
			ProgField.setText("");
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == ComputeBtn) {
			try {
				int TotalAverageInInt = (Integer.parseInt(PrelimExField.getText())+Integer.parseInt(MidtermExField.getText())+
										Integer.parseInt(SemisExField.getText())+Integer.parseInt(FinalExField.getText()))/4;
				String TotalAverageInStr = String.valueOf(TotalAverageInInt);
				GradeField.setText(TotalAverageInStr);
				if (TotalAverageInInt >= 95) {
					RemarkField.setText("Passed");
					IQField.setText("1.00");
				}
				else if (TotalAverageInInt >= 93) {
					RemarkField.setText("Passed");
					IQField.setText("1.25");
				}
				else if (TotalAverageInInt >= 90) {
					RemarkField.setText("Passed");
					IQField.setText("1.50");
				}
				else if (TotalAverageInInt >= 87) {
					RemarkField.setText("Passed");
					IQField.setText("1.75");
				}
				else if (TotalAverageInInt >= 85) {
					RemarkField.setText("Passed");
					IQField.setText("2.00");
				}
				else if (TotalAverageInInt >= 83) {
					RemarkField.setText("Passed");
					IQField.setText("2.25");
				}
				else if (TotalAverageInInt >= 80) {
					RemarkField.setText("Passed");
					IQField.setText("2.50");
				}
				else if (TotalAverageInInt >= 77) {
					RemarkField.setText("Passed");
					IQField.setText("2.75");
				}
				else if (TotalAverageInInt >= 75) {
					RemarkField.setText("Passed");
					IQField.setText("3.00");
				}
				else {
					RemarkField.setText("Failed");
					IQField.setText("4.00");
				}
			} catch (Exception ex) {
				System.out.println("Error");
			}
		}
	}

	public static void main(String[] args) {
		new StudentGradeGenerator();
	}

}
