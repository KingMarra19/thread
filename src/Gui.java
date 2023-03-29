import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    JButton avvia,stop;

    public synchronized JLabel getLabel() {
        return label;
    }

    JLabel label;
    JFrame frame;
    JPanel sud,centre;

    public synchronized Boolean getB() {
        return b;
    }

    public synchronized void setB(Boolean b) {
        this.b = b;
    }

    Boolean b;
    public Gui (){
        b= Boolean.FALSE;
        avvia= new JButton("avvia");
        stop= new JButton("stop");
        label=new JLabel("timer");
        frame= new JFrame();
        sud=new JPanel();
        centre= new JPanel();
        sud.setLayout(new GridLayout(1,2));
        sud.add(avvia);
        sud.add(stop);
        centre.add(label);
        avvia.addActionListener(e -> {

           if(getB()==false){
               setB(true);
               Timer t=new Timer(this);
               t.start();
           }
        });
        stop.addActionListener(e -> {
           setB(false);
        });
        frame.add(sud,BorderLayout.SOUTH);
        frame.add(centre,BorderLayout.CENTER);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
