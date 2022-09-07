import java.awt.*;
import java.awt.event.*;
class CheckBoxGroupDemo extends Frame implements ItemListener
{
	CheckboxGroup cbg;
	Checkbox c1,c2,c3;
	Label L1;
	CheckBoxGroupDemo()
	{
		FlowLayout F1=new FlowLayout();
		setLayout(F1);
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox c1=new Checkbox("Male",false,cbg);
		Checkbox c2=new Checkbox("Female",false,cbg);
		Checkbox c3=new Checkbox("other",false,cbg);
		L1=new Label("                            ");
		add(c1);
		add(c2);
		add(c3);
		add(L1);
        c1.addItemListener(this);	
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemstatechanged(ItemEvent ie)
	{
		Checkbox result=cbg.getSelectedCheckbox();
		String str=result.getLabel();
		L1.setText("You have selected option :"+str);
	}	
	public static void main(String args[])
	{	
		CheckBoxGroupDemo f1=new CheckBoxGroupDemo();
		f1.setVisible(true);
		f1.setSize(800,800);
		f1.setTitle("Checkbox Demo");
	}	
}	