/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yulian
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class BarCharts extends JPanel{

public BarCharts() {
this.setPreferredSize(new Dimension(600, 600));
this.setBackground(Color.WHITE);
}

protected void paintComponent(Graphics g) {
super.paintComponent(g);
Graphics2D g2 = (Graphics2D) g;

GeneralPath gp = new GeneralPath(GeneralPath.WIND_NON_ZERO);


gp.moveTo(77,50); //menambahkan garis dibelakang
gp.lineTo(79,50);
gp.moveTo(80,450);
gp.lineTo(80,50);
gp.moveTo(77,90);
gp.lineTo(79,90);
gp.moveTo(140,450);
gp.lineTo(140,50);
gp.moveTo(77,130);
gp.lineTo(79,130);
gp.moveTo(200,450);
gp.lineTo(200,50);
gp.moveTo(77,170);
gp.lineTo(79,170);
gp.moveTo(260,450);
gp.lineTo(260,50);
gp.moveTo(77,210);
gp.lineTo(79,210);
gp.moveTo(320,450);
gp.lineTo(320,50);
gp.moveTo(77,250);
gp.lineTo(79,250);
gp.moveTo(380,450);
gp.lineTo(380,50);
gp.moveTo(77,290);
gp.lineTo(79,290);
gp.moveTo(440,450);
gp.lineTo(440,50);
gp.moveTo(77,330);
gp.lineTo(79,330);
gp.moveTo(77,370);
gp.lineTo(79,370);
gp.moveTo(77,410);
gp.lineTo(79,410);
gp.moveTo(77,447);
gp.lineTo(441,447);

gp.closePath(); //menutup kurva
g2.draw(gp);


g2.drawString("N10",50,75); //menambahkan label
g2.drawString("N09",50,115);
g2.drawString("N08",50,155);
g2.drawString("N07",50,195);
g2.drawString("N06",50,235);
g2.drawString("N05",50,275);
g2.drawString("N04",50,315);
g2.drawString("N03",50,355);
g2.drawString("N02",50,395);
g2.drawString("N01",50,435);
g2.drawString("0",77,470);
//g2.drawString("110",5,70);
g2.drawString("20",135,470);
//g2.drawString("90",13,110);
g2.drawString("40",195,470);
//g2.drawString("70",13,150);
g2.drawString("60",255,470);
//g2.drawString("50",13,190);
g2.drawString("80",315,470);
//g2.drawString("30",13,230);
g2.drawString("100",370,470);
//g2.drawString("10",13,270);
g2.drawString("120",430,470);
g2.drawString("Series1",510,252);

Shape kotak10 = new Rectangle2D.Double(80,65,105,15); //36 membuat kotak
Shape kotak9 = new Rectangle2D.Double(80,105,105,15); //36
Shape kotak8 = new Rectangle2D.Double(80,145,315,15); //109
Shape kotak7 = new Rectangle2D.Double(80,185,225,15); //73
Shape kotak6 = new Rectangle2D.Double(80,225,295,15); //98
Shape kotak5 = new Rectangle2D.Double(80,265,255,15); //84
Shape kotak4 = new Rectangle2D.Double(80,305,240,15); //80
Shape kotak3 = new Rectangle2D.Double(80,345,300,15); //100
Shape kotak2 = new Rectangle2D.Double(80,385,155,15); //51
Shape kotak1 = new Rectangle2D.Double(80,425,90,15); //30
Shape series1 = new Rectangle2D.Double(490,240,15,15);

g2.setColor(Color.BLUE);
g2.fill(kotak10);
g2.fill(kotak9);
g2.fill(kotak8);
g2.fill(kotak7);
g2.fill(kotak6);
g2.fill(kotak5);
g2.fill(kotak4);
g2.fill(kotak3);

g2.fill(kotak2);
g2.fill(kotak1);
g2.fill(series1);

//Tulisan Nama Kelompok
g2.setColor(Color.RED);
g2.drawString("Created by :", 50, 500);
g2.drawString("Yulian Islam Prayoga", 130, 520);
g2.drawString("Ifanka Maulika", 130, 540);
g2.drawString("Imam Surya Romadon", 130, 560);
g2.drawString("I Ketut Yudi Prawira", 130, 580);
}

public static void main(String args[]) {
// TODO code nandaka logic here

//Buat frame dengan title sesuai kebutuhan
JFrame frame = new JFrame ("Bar Chart");
frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e)
{

System.exit(0);
}
});

//tambahkan objek dari BarCharts
BarCharts canvas = new BarCharts();
frame.getContentPane().add(canvas);
frame.pack();

frame.setLocationRelativeTo(null);
frame.setVisible(true);
}
}
