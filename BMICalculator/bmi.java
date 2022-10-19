import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class bmi extends JFrame
{
    JLabel height =  new JLabel();
    JLabel weight = new JLabel();
    JLabel bmi1 = new JLabel();
    JLabel feet = new JLabel();
    JLabel inches = new JLabel();
    JLabel pounds = new JLabel();
    
    JTextField textH = new JTextField();
    JTextField textW = new JTextField();
    JTextField textBMI = new JTextField();
    JTextField textIn = new JTextField();
    
    JButton compute = new JButton();
    JButton clear = new JButton();
    JButton exit = new JButton();
    
    public bmi(){
        setTitle("BMI Calculator");
        
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridC = new GridBagConstraints();
        
        height.setText("Height:");
        gridC.gridx = 0;
        gridC.gridy = 0;
        getContentPane().add(height,gridC);
        
        weight.setText("Weight:");
        gridC.gridx = 0;
        gridC.gridy = 1;
        getContentPane().add(weight,gridC);
        
        bmi1.setText("BMI:");
        gridC.gridx = 0;
        gridC.gridy = 2;
        getContentPane().add(bmi1,gridC);
        
        textH.setText("");
        textH.setColumns(5);
        gridC.gridx = 1;
        gridC.gridy = 0;
        getContentPane().add(textH,gridC);
        
        textW.setText("");
        textW.setColumns(5);
        gridC.gridx = 1;
        gridC.gridy = 1;
        getContentPane().add(textW,gridC);
        
        textBMI.setColumns(10);
        gridC.gridx = 1;
        gridC.gridy = 2;
        getContentPane().add(textBMI,gridC);
        
        feet.setText("feet");
        gridC.gridx = 2;
        gridC.gridy = 0;
        getContentPane().add(feet,gridC);
        
        pounds.setText("pounds");
        gridC.gridx = 2;
        gridC.gridy = 1;
        getContentPane().add(pounds,gridC);
        
        inches.setText("inches");
        gridC.gridx = 4;
        gridC.gridy = 0;
        getContentPane().add(inches,gridC);
        
        textIn.setText("");
        textIn.setColumns(5);
        gridC.gridx = 3;
        gridC.gridy = 0;
        getContentPane().add(textIn,gridC);
        
        compute.setText("Compute BMI");
        gridC.gridx = 1;
        gridC.gridy = 3;
        getContentPane().add(compute,gridC);
        compute.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String height = textH.getText();
                String weight = textW.getText();
                double prod = Double.parseDouble(height) *  Double.parseDouble(height);
                double divide = prod / Double.parseDouble(weight);
                double result = divide * 703;
                String ans = ""+result;
                textBMI.setText(ans);
            }
        });
        
        clear.setText("Clear");
        gridC.gridx = 2;
        gridC.gridy = 3;
        getContentPane().add(clear,gridC);
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textH.setText("");
                textW.setText("");
                textBMI.setText("");
                textIn.setText("");
            }
        });
        
        exit.setText("Exit");
        gridC.gridx = 3;
        gridC.gridy = 3;
        getContentPane().add(exit,gridC);
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
            }
        });
        
        pack();
    }
    public static void main(String[]args){
        bmi newBMI = new bmi();
        newBMI.setVisible(true);
        newBMI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
