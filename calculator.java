import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class calculator implements ActionListener
{
	JFrame f;
	JButton B[]=new JButton[16];
	JTextField t;
	char op,ch;
	String st;
	double a,b,c;
	int i;
	public calculator()
	{
		f=new JFrame("CALCULATOR");
		f.getContentPane().setLayout(new GridLayout(4,4));
		f.setSize(800,1000);
for(i=0;i<10;i++)
	B[i]=new JButton(i+"");
B[10]=new JButton("+");
B[11]=new JButton("-");
B[12]=new JButton("*");
B[13]=new JButton("/");
B[14]=new JButton(".");
B[15]=new JButton("=");
B[0].setBounds(50,0,50,50);
B[1].setBounds(0,50,50,50);
B[2].setBounds(50,50,50,50);
B[3].setBounds(100,50,50,50);
B[4].setBounds(0,100,50,50);
B[5].setBounds(50,100,50,50);
B[6].setBounds(100,100,50,50);
B[7].setBounds(0,150,50,50);
B[8].setBounds(50,150,50,50);
B[9].setBounds(100,150,50,50);
B[10].setBounds(100,0,50,50);
B[11].setBounds(150,50,50,50);
B[12].setBounds(150,100,50,50);
B[13].setBounds(150,150,50,50);
B[14].setBounds(0,0,50,50);
B[15].setBounds(150,0,50,50);
t=new JTextField(15);
t.setBounds(0,200,200,50);
for(i=0;i<16;i++){
	B[i].addActionListener(this);
	f.getContentPane().add(B[i]);}
f.add(t);
f.setVisible(true);}
public void actionPerformed(ActionEvent ev){
st=ev.getActionCommand();
ch=st.charAt(0);
if(Character.isDigit(ch))
	t.setText(t.getText()+ch);
else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
	a=Double.parseDouble(t.getText());
	op=ch;
	t.setText("");}
else if(ch=='='){
	c=0.0;
	b=Double.parseDouble(t.getText());
	if(op=='+')
		c=a+b;
	else if(op=='-')
		c=a-b;
	else if(op=='*')
		c=a*b;
	else if(op=='/')
		c=a/b;
	t.setText(c+"");}
else{
	if(t.getText().indexOf(".")==-1)
		t.setText(t.getText()+".");}}
public static void main(String args[]){
new calculator();}}