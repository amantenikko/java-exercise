import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeGenerator extends JFrame implements ActionListener,ItemListener
{
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	Label Name = new Label("Name :");
	TextField NameField = new TextField("",26);
	Label Program = new Label("Program :");
	Choice ProgCB = new Choice();
	TextField ProgField = new TextField("",35);
	Label Course = new Label("Course :");
	Choice CourseCB = new Choice();
	TextField CourseField = new TextField("",35);
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
	
	GradeGenerator()
	{
		setTitle(this.getClass().getCanonicalName());
		setLayout(new FlowLayout());
		add(Name);
		add(NameField);
		add(Program);
		add(ProgCB);ProgCB.addItemListener(this);
		ProgCB.add(" ");
		ProgCB.add("BSIT");
		ProgCB.add("BSCS");
		ProgCB.add("BSCpE");
		add(ProgField);
		ProgField.setEditable(false);
		ProgField.setBackground(new Color(200,250,250));
		add(Course);
		add(CourseCB);CourseCB.addItemListener(this);
		CourseCB.add(" ");
		CourseCB.add("MATH2");
		CourseCB.add("PHY1");
		CourseCB.add("CPE3");
		CourseCB.add("MATH3");
		CourseCB.add("CPE4");
		CourseCB.add("GEC2");
		CourseCB.add("PE2");
		CourseCB.add("NSTP2");
		CourseCB.add("CDSGA2");
		add(CourseField);
		CourseField.setEditable(false);
		CourseField.setBackground(new Color(200,250,250));
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

		setSize(295, 330);
		setResizable(false);
		setVisible(true);
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent e) 
	{
		if (e.getSource() == ProgCB && ProgCB.getItem(0) == " ") {
			ProgCB.remove(" ");
		}
		if (ProgCB.getSelectedItem() == "BSIT")
		{
			ProgField.setText("Bachelor of Science in Information Technology");			
		}
		if (ProgCB.getSelectedItem() == "BSCS")
		{
			ProgField.setText("Bachelor of Science in Computer Science");			
		}
		if (ProgCB.getSelectedItem() == "BSCpE")
		{
			ProgField.setText("Bachelor of Science in Computer Engineering");			
		}
		
		if (e.getSource() == CourseCB && CourseCB.getItem(0) == " ") {
			CourseCB.remove(" ");
		}
		if (CourseCB.getSelectedItem() == "MATH2")
		{
			CourseField.setText("Calculus 2");
		}
		if (CourseCB.getSelectedItem() == "PHY1")
		{
			CourseField.setText("Physics for Engineers");			
		}
		if (CourseCB.getSelectedItem() == "CPE3")
		{
			CourseField.setText("Object Oriented Programming");			
		}
		if (CourseCB.getSelectedItem() == "MATH3")
		{
			CourseField.setText("Engineering Data Analysis");			
		}
		if (CourseCB.getSelectedItem() == "CPE4")
		{
			CourseField.setText("Discrete Mathematics");			
		}
		if (CourseCB.getSelectedItem() == "GEC2")
		{
			CourseField.setText("Reading in Philippines History");			
		}
		if (CourseCB.getSelectedItem() == "PE2")
		{
			CourseField.setText("Rhythmic Activities");			
		}
		if (CourseCB.getSelectedItem() == "NSTP2")
		{
			CourseField.setText("National Service Training Program 2");			
		}
		if (CourseCB.getSelectedItem() == "CDSGA 2")
		{
			CourseField.setText("Gabrielian Ethics");			
		}
	}
		
	public void actionPerformed(ActionEvent e) 
	{
		try {
			if (e.getSource() == ComputeBtn) {
				int TotalAverageInInt = (Integer.parseInt(PrelimExField.getText())+Integer.parseInt(MidtermExField.getText())+
										Integer.parseInt(SemisExField.getText())+Integer.parseInt(FinalExField.getText()))/4;
				String TotalAverageInStr = Integer.toString(TotalAverageInInt);
				GradeField.setText(TotalAverageInStr);
				RemarkField.setBackground(Color.green);
				if (TotalAverageInInt >= 95)
				{
					RemarkField.setText("Passed");
					IQField.setText("1.00");
				}
				else if (TotalAverageInInt >= 93)
				{
					RemarkField.setText("Passed");
					IQField.setText("1.25");
				}
				else if (TotalAverageInInt >= 90)
				{
					RemarkField.setText("Passed");
					IQField.setText("1.50");
				}
				else if (TotalAverageInInt >= 87)
				{
					RemarkField.setText("Passed");
					IQField.setText("1.75");
				}
				else if (TotalAverageInInt >= 85)
				{
					RemarkField.setText("Passed");
					IQField.setText("2.00");
				}
				else if (TotalAverageInInt >= 83)
				{
					RemarkField.setText("Passed");
					IQField.setText("2.25");
				}
				else if (TotalAverageInInt >= 80)
				{
					RemarkField.setText("Passed");
					IQField.setText("2.50");
				}
				else if (TotalAverageInInt >= 77)
				{
					RemarkField.setText("Passed");
					IQField.setText("2.75");
				}
				else if (TotalAverageInInt >= 75)
				{
					RemarkField.setText("Passed");
					IQField.setText("3.00");
				}
				else
				{
					RemarkField.setText("Failed");
					RemarkField.setBackground(Color.red);
					IQField.setText("4.00");
				}
				
			}
		} catch (Exception ex) {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		new GradeGenerator();
	}

}
