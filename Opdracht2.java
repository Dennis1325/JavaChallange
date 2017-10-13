
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    private String tekst = "";
    private String tekst2 = "";
    private String tekst3 = "";
    private String tekst4 = "";
    private TextField tv1;

    public void init() {
        Button knop = new Button("toon tijden");
        knop.addActionListener(new Knop1Listener());
        tv1 = new TextField(10);
        Label label = new Label("voer een uur in");
        add(label);
        add(tv1);
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 50, 50);
        g.drawString(tekst2, 50, 75);
        g.drawString(tekst3, 50, 100);
        g.drawString(tekst4, 50, 125);
    }

    class Knop1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int tijd = Integer.parseInt(tv1.getText());
            int brisbane = 8;
            int aqtau = 3;
            int newyork = 6;
            int lima = 7;
            if (tijd <= 23) {
                tekst = "Brisbane is " + (tijd + brisbane) + ":00";
                tekst2 = "Aqtau is " + (tijd + aqtau) + ":00";
                tekst3 = "New York is " + (tijd - newyork) + ":00";
                tekst4 = "Lima is " + (tijd - lima) + ":00";

            }
            if (tijd + brisbane >= 23) {
                tekst = "Brisbane is " + (tijd + brisbane - 24) + ":00";
            }
            if (tijd + aqtau >= 23) {
                tekst2 = "Aqtau is " + (tijd + aqtau - 24) + ":00";
            }
            if (tijd - newyork >= 23) {
                tekst3 = "New York is " + (tijd - newyork - 24) + ":00";
            }
            if (tijd - lima >= 23) {
                tekst4 = "Lima is " + (tijd - lima - 24) + ":00";
            }
            if (tijd > 23) {
                tekst = "u heeft een verkeerd nummer ingetikt";
                tekst2 = "probeer een tijdstip tussen 0:00 en 23:00";
                tekst3 = "";
                tekst4 = "";
            }
            if (tijd < 0) {
                tekst = "u heeft een verkeerd nummer ingetikt";
                tekst2 = "probeer een tijdstip tussen 0:00 en 23:00";
                tekst3 = "";
                tekst4 = "";

            }

            repaint();
        }

    }
}
