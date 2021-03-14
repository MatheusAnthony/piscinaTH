package Piscininhaegidio;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Piscina extends JFrame implements ActionListener {
    JLabel lblnum1, lblnum2, lblnum3, lblcalcular, lblresult;
    JTextField txtnum1, txtnum2,txtnum3, txtresult;
    JButton btnresult, btnlimpar;
    

   
    public static void main(String[] args) {
        JFrame janela=new Piscina();
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    Piscina()
    { 
        setTitle("Capacidade da piscina");
        setBounds(300,50,330,330);
        getContentPane().setBackground(new Color(153,206,235));
        getContentPane().setLayout(new GridLayout(6,2));
        
        lblnum1=new JLabel ("Largura");
        lblnum1.setForeground(Color.black);
        lblnum1.setFont(new Font("",Font.BOLD,14));
        
        lblnum2=new JLabel ("Comprimento");
        lblnum2.setForeground(Color.black);
        lblnum2.setFont(new Font("",Font.BOLD,14));
        
        lblnum3=new JLabel ("Profundidade");
        lblnum3.setForeground(Color.black);
        lblnum3.setFont(new Font("",Font.BOLD,14));
        
        lblresult=new JLabel ("Resultado");
        lblresult.setForeground(Color.black);
        lblresult.setFont(new Font("",Font.BOLD,14));
        
        lblcalcular=new JLabel ("Calcular");
        lblcalcular.setForeground(Color.black);
        lblcalcular.setFont(new Font("",Font.BOLD,14));
        
        btnresult=new JButton("Calcular");  btnresult.addActionListener(this);
        btnlimpar=new JButton("Limpar");  btnlimpar.addActionListener(this);
          
        txtnum1=new JTextField();  
        txtnum2=new JTextField();
        txtnum3=new JTextField();
        txtresult=new JTextField();
        
        getContentPane().add(lblnum1); getContentPane().add(txtnum1);
        getContentPane().add(lblnum2); getContentPane().add(txtnum2);
        getContentPane().add(lblnum3); getContentPane().add(txtnum3);
        getContentPane().add(lblcalcular); getContentPane().add(btnresult);
        getContentPane().add(lblresult); getContentPane().add(txtresult);   
        getContentPane().add(btnlimpar);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==btnlimpar)
        {
          txtnum1.setText("");
          txtnum2.setText("");
          txtnum3.setText("");
          txtresult.setText("");
          return;
          
        }
        double num1=0, num2=0, num3=0, result=0;
        try 
        {
            num1=Double.parseDouble(txtnum1.getText());
            num2=Double.parseDouble(txtnum2.getText());
            num3=Double.parseDouble(txtnum3.getText());
        }
        catch(NumberFormatException erro)
        {
            txtresult.setText("Apenas Números");
            return;
        }
        if(e.getSource()==btnresult) result=(num1*num2*num3)*300;
        txtresult.setText(""+result);
    }
   
}

