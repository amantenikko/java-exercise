import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MealChangeGenerator extends JFrame implements ActionListener, ItemListener
{
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	int PriceInt = 0;
	int SubtotalInt = 0;
	final Double TaxPercent = 0.12;
	Label ChusMilKumbo = new Label("                   Choose Meal Combo                   ");
	Checkbox Meal1Bx = new Checkbox("Meal 1 ");
	Checkbox Meal2Bx = new Checkbox("Meal 2 ");
	Checkbox Meal3Bx = new Checkbox("Meal 3 ");
	Checkbox Meal4Bx = new Checkbox("Meal 4 ");
	Label Price = new Label("     Price : ");
	TextField Pricetf = new TextField("",15);
	Checkbox RiceBx = new Checkbox("Add Rice              ");
	Checkbox DrinksBx = new Checkbox("Add Drinks              ");
	Label Subtotal = new Label("Subtotal :    ");
	TextField Subtotaltf = new TextField("",10);
	Button ComputeTax = new Button("Compute Tax");
	Label VatableAmnt = new Label("     Vatable Amount : ");
	TextField VatableAmnttf = new TextField("",13);
	Label VAT = new Label("          VAT :     ");
	TextField VATtf = new TextField("",13);
	Label AmntPaid = new Label("Amount Paid : ");
	TextField AmntPaidtf = new TextField("",10);
	Button ComputePaid = new Button("Compute Paid");
	Label Change = new Label("Change : ");
	TextField Changetf = new TextField("",10);
	Label credit = new Label("</> with <3 by Nikko Amante");
	
	MealChangeGenerator() {
		setTitle(this.getClass().getCanonicalName());
		setLayout(new FlowLayout());
		add(ChusMilKumbo);
		add(Meal1Bx);
		Meal1Bx.addItemListener(this);
		add(Meal2Bx);
		Meal2Bx.addItemListener(this);
		add(Meal3Bx);
		Meal3Bx.addItemListener(this);
		add(Meal4Bx);
		Meal4Bx.addItemListener(this);
		add(Price);
		add(Pricetf);
		Pricetf.setEditable(false);
		Pricetf.setBackground(new Color(200,250,250));
		add(RiceBx);
		RiceBx.addItemListener(this);
		add(DrinksBx);
		DrinksBx.addItemListener(this);
		add(Subtotal);
		add(Subtotaltf);
		Subtotaltf.setEditable(false);
		Subtotaltf.setBackground(new Color(200,250,250));
		add(ComputeTax);
		ComputeTax.addActionListener(this);
		add(VatableAmnt);
		add(VatableAmnttf);
		VatableAmnttf.setEditable(false);
		VatableAmnttf.setBackground(new Color(200,250,250));
		add(VAT);
		add(VATtf);
		VATtf.setEditable(false);
		VATtf.setBackground(new Color(200,250,250));
		add(AmntPaid);
		add(AmntPaidtf);
		add(ComputePaid);
		ComputePaid.addActionListener(this);
		ComputePaid.setEnabled(false);
		add(Change);
		add(Changetf);
		Changetf.setEditable(false);
		Changetf.setBackground(new Color(200,250,250));
		add(credit);

		setSize(315,330);
		setResizable(false);
		setVisible(true);
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try {
			if (e.getSource() == ComputeTax) {
				VatableAmnttf.setText(Double.toString((PriceInt+SubtotalInt)*TaxPercent));
				VATtf.setText(Double.toString(SubtotalInt+PriceInt+((PriceInt+SubtotalInt)*TaxPercent)));
				ComputePaid.setEnabled(true);
			}
			if (e.getSource() == ComputePaid) {
				Changetf.setText(Double.toString(Double.parseDouble(AmntPaidtf.getText())-(SubtotalInt+PriceInt+((PriceInt+SubtotalInt)*TaxPercent))));
			}
		} catch (Exception ex) {
			System.out.println("Error");
		}
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (ComputePaid.isEnabled()) ComputePaid.setEnabled(false);
		if (e.getItemSelectable() == Meal1Bx) {
			if (Meal1Bx.getState()) {
				PriceInt += 25;
			}
			else {
				PriceInt -= 25;
			}
		}
		if (e.getItemSelectable() == Meal2Bx) {
			if (Meal2Bx.getState()) {
				PriceInt += 30;
			}
			else {
				PriceInt -= 30;
			}
		}
		if (e.getItemSelectable() == Meal3Bx) {
			if (Meal3Bx.getState()) {
				PriceInt += 35;
			}
			else {
				PriceInt -= 35;
			}
		}
		if (e.getItemSelectable() == Meal4Bx) {
			if (Meal4Bx.getState()) {
				PriceInt += 40;
			}
			else {
				PriceInt -= 40;
			}
		}
				
		
		if (e.getItemSelectable() == RiceBx) {
			if (RiceBx.getState()) {
				SubtotalInt += 5;
			}
			else {
				SubtotalInt -= 5;
			}
		}
		if (e.getItemSelectable() == DrinksBx) {
			if (DrinksBx.getState()) {
				SubtotalInt += 20;
			}
			else {
				SubtotalInt -= 20;
			}
		}
		
		
		if (PriceInt == 0) {
			Pricetf.setText("");
		}
		else {
			Pricetf.setText(Integer.toString(PriceInt));
		}
		
		if (SubtotalInt == 0 && PriceInt == 0) {
			Subtotaltf.setText("");
		}
		else {
			Subtotaltf.setText(Integer.toString(PriceInt+SubtotalInt));
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(args);
		new MealChangeGenerator();
	}
}
