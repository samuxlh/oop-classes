import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;



public class Janela implements ActionListener{

	static JFrame jan1 = new JFrame("Titulo Temporario");

	static JLabel rotVal1 = new JLabel("Valor 1");
	static JLabel rotVal2 = new JLabel("Valor 2");
	static JLabel rotTotal = new JLabel("Total");

	static JTextField cxVal1 = new JTextField(10);
	static JTextField cxVal2 = new JTextField(10);
	static JTextField cxTotal = new JTextField(10);

	static JButton btLimpar = new JButton("Limpar");
	static JButton btSair = new JButton("Sair");
	static JButton btSomar = new JButton("+");
	static JButton btSub = new JButton("-");
	static JButton btMul = new JButton("x");
	static JButton btDiv = new JButton("/");

	static Janela j1 = new Janela();

	
	public static void main(String arg[]){

		criaJan();
	}

	public static void criaJan(){
		jan1.setDefaultCloseOperation(jan1.EXIT_ON_CLOSE);
		int larg = 500, alt = 200;
		jan1.setTitle("Titulo Permanente");
		jan1.setSize(larg, alt);

		jan1.add(rotVal1);
		jan1.add(cxVal1);

		jan1.add(rotVal2);
		jan1.add(cxVal2);

		jan1.add(rotTotal);
		jan1.add(cxTotal);

		jan1.add(btSomar);
		jan1.add(btSub);
		jan1.add(btMul);
		jan1.add(btDiv);
		jan1.add(btLimpar);
		jan1.add(btSair);

		btLimpar.addActionListener(j1);
		btSair.addActionListener(j1);
		btSomar.addActionListener(j1);
		btSub.addActionListener(j1);
		btMul.addActionListener(j1);
		btDiv.addActionListener(j1);

		jan1.setLayout(new FlowLayout());
		jan1.setVisible(true);

	}//Final do main
	
	public void actionPerformed(ActionEvent evt){

		if(evt.getSource().equals(btSomar)){
			somar();
		}
		if(evt.getSource().equals(btSub)){
			sub();
		}
		if(evt.getSource().equals(btMul)){
			mul();
		}
		if(evt.getSource().equals(btDiv)){
			div();
		}

		if(evt.getSource().equals(btLimpar)){
			limpar();
		}
		if(evt.getSource().equals(btSair)){
			sair();
		}
	}

	public void limpar(){
		cxVal1.setText("");
		cxVal2.setText("");
		cxTotal.setText("");
		cxVal1.requestFocus();
	}
	
	public void sair(){
		int x = JOptionPane.showConfirmDialog(
				null,
				"Deseja realmente sair?",
				"Saida",
				JOptionPane.YES_NO_OPTION	
			);
		if(x == 0){
			jan1.dispose();
		}
		else{
			limpar();
		}
	}

	public void somar(){
		int x = Integer.parseInt(cxVal1.getText());
		int y = Integer.parseInt(cxVal2.getText());
		int s = x+y; 

		cxTotal.setText(s+"");
	}

	public void sub(){
		int x = Integer.parseInt(cxVal1.getText());
		int y = Integer.parseInt(cxVal2.getText());
		int s = x-y; 

		cxTotal.setText(s+"");
	}

	public void mul(){
		int x = Integer.parseInt(cxVal1.getText());
		int y = Integer.parseInt(cxVal2.getText());
		int s = x*y;
		cxTotal.setText(s+"");
	}

	public void div(){
		float x = Integer.parseInt(cxVal1.getText());
		float y = Integer.parseInt(cxVal2.getText());
		float s = x/y;
		cxTotal.setText(s+"");
	}


}