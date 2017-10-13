import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet{
    Button knop;
    TextField tv1;
    TextField tv2;
    TextField tv3;
    int Valerie = 40;
    int Jeroen = 80;
    int Hans = 60;
    Label valerielabel;
    Label jeroenlabel;
    Label hanslabel;

    public void init(){
        valerielabel = new Label("Valerie");
        jeroenlabel = new Label("Jeroen");
        hanslabel = new Label("Hans");
        tv1 = new TextField(4);
        tv2 = new TextField(4);
        tv3 = new TextField(4);
        knop = new Button("Toon");
        knop.addActionListener(new KnopListener());
        add(valerielabel);
        add(tv1);
        add(jeroenlabel);
        add(tv2);
        add(hanslabel);
        add(tv3);
        add(knop);

    }
    public void paint( Graphics g){
        g.drawLine(60, 60, 60, 200);
        g.drawLine(60, 200, 300, 200);
        //de lijntjes die de Stappengrootte laat zien
        g.drawLine(55, 180, 65, 180);
        g.drawLine(55, 160, 65, 160);
        g.drawLine(55, 140, 65, 140);
        g.drawLine(55, 120, 65, 120);
        g.drawLine(55, 100, 65, 100);
        g.drawLine(55, 80, 65, 80);
        g.drawLine(55,60,65,60);
        g.drawString("0",35,200);
        g.drawString("20",35,180);
        g.drawString("40",35,160);
        g.drawString("60",35,140);
        g.drawString("80",35,120);
        g.drawString("100",30,100);
        g.drawString("120",30,80);
        g.drawString("140",30,60);
        g.drawString("Valerie", 85, 220);
        g.drawString("Jeroen", 165, 220);
        g.drawString("Hans", 245, 220);
        g.setColor(Color.red);
        g.fillRect(80, 200-Valerie,50,Valerie);
        g.fillRect(160,200-Jeroen,50,Jeroen);
        g.fillRect(240,200-Hans,50,Hans);

    }

    class KnopListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Valerie = Integer.parseInt(tv1.getText());
            Jeroen = Integer.parseInt(tv2.getText());
            Hans = Integer.parseInt(tv3.getText());
            repaint();
        }
    }
}
