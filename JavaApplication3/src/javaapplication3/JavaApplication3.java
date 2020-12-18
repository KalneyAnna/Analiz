package javaapplication3;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;





public class JavaApplication3 extends JFrame {
    double srdiv =0;
    double ydiv =0;
    private JLabel ps1;
    private JLabel prognoz;
    private JLabel pe1;
    private JLabel roa1;
    private JLabel roe1;
    private JLabel de1;
    private JLabel srdiv1;
    private JLabel ydiv1;
    private JLabel high1;
    private JLabel low1;
    private JLabel sred1;
    private JLabel sr;

    public JavaApplication3() { 
        super("анализ ценных бумаг"); 
       
        Scanner in = new Scanner(System.in);
        
        System.out.print("Введите P/S: ");
        double ps = in.nextDouble();
        
          System.out.println("P/S= "+ ps);
          
        System.out.print("Введите P/Е: ");
        double pe = in.nextDouble();
        
          System.out.println("P/Е= "+ pe);
          
        System.out.print("Введите ROA: ");
        double roa = in.nextDouble();
        
          System.out.println("ROA= "+ roa);
          
        System.out.print("Введите ROE: ");
        double roe = in.nextDouble();
        
          System.out.println("ROE= "+ roe);
          
        System.out.print("Введите Debt/Equity: ");
        double de = in.nextDouble();
        
          System.out.println("Debt/Equity= "+ de);
          
        System.out.print("Средние дивиденды за 5 лет %: ");
        double srdiv = in.nextDouble();
        
          System.out.println("Средние дивиденды за 5 лет % = "+ srdiv);
          
        System.out.print("Дивиденды за год % = ");
        double ydiv = in.nextDouble();
        
          System.out.println("Дивиденды за год % = "+ ydiv); 
          
        System.out.print("Высшая цена торгов за 52 недели: ");  
        double high = in.nextDouble();
        
          System.out.println("Высшая цена торгов за 52 недели = " + high);
          
        System.out.print("Нижняя цена торгов за 52 недели: ");  
        double low = in.nextDouble();
        
          System.out.println("Нижняя цена торгов за 52 недели = " + low); 
          
        System.out.print("Текущая цена торгов за 52 недели: ");  
        double sred = in.nextDouble();
        
          System.out.println("Текущая цена торгов за 52 недели = " + sred); 
          
         in.close();
         
       if (pe < 15 || ps < 2.8 || roa>7.5 || roe > 10 || de < 180){//не жесткая оценка
    System.out.println("Не жесткая оценка - рентабильно");
}
else{
    System.out.println("Не жесткая оценка - нерентабильно");
}
        if (pe < 16 & ps < 2 & (roa+roe)>16 & de < 180){//жесткая оценка
    System.out.println("Жесткая оценка - рентабильно");
}
else{
    System.out.println("Жесткая оценка - нерентабильно");
}
    System.out.println("Прогноз дивидендной доходности за текущий год %: "+ (srdiv*2+ydiv)/3);  
    double a = (srdiv*2+ydiv)/3;
    System.out.println("Средняя цена за 52 недели: "+ (high+sred*3+low)/5); 
    double b = (high+sred*3+low)/5;
    System.out.println("Доход в рублях: "+ (b/100)* a);
    
    if (roe > 15 & roa > 5.5){//оценка бизнеса
    System.out.println("Бизнес хорош!");
}
else{
    System.out.println("Думайте еще");
}
    if (de > 300){//долговая нагрузка
    System.out.println("Большой долг");
}
else{
    System.out.println("Долговая нагрузка в норме");
}
    
         //countLabel = new JLabel("бюджет: " +  + "     ");
 ps1 = new JLabel("P/s " + ps+"  ");
 pe1 = new JLabel("P/E: " + pe+"  ");
 roa1 = new JLabel("ROA: " + roa+"  ");
 roe1 = new JLabel("ROE: " + roe+"  ");
 de1 = new JLabel("Debt/Equity: " + de+"  ");
 srdiv1 = new JLabel("Средние дивиденды за 5 лет: " + srdiv+"  ");
 ydiv1 = new JLabel("Средние дивиденды за год: " + ydiv+"  ");
 high1 = new JLabel("Высшая цена торгов за 52 недели: " + high+"  ");
 low1 = new JLabel("Нижняя цена торгов за 52 недели : " + low+"  ");
 sred1 = new JLabel("Средние дивиденды за 5 лет %: " + sred+"  ");
 prognoz = new JLabel("Прогноз дивидендной доходностиза текущий год: " +(srdiv*2+ydiv)/3+"  " );
 sr = new JLabel("Средняя цена за 52 недели: "+ (high+sred*3+low)/5+"  "); 
       JPanel label = new JPanel(new FlowLayout());
       JPanel label1 = new JPanel(new FlowLayout());
       JPanel label2 = new JPanel(new FlowLayout());
       JPanel label3 = new JPanel(new FlowLayout());
       /* Расставляем компоненты по местам */
 label1.add(ps1);
 label1.add(pe1);
 label1.add(roa1);
 label1.add(roe1);
 label1.add(de1);
 label1.add(prognoz);
 label2.add(srdiv1);
 label2.add(ydiv1);
 label.add(high1);
 label.add(low1);
 label2.add(sred1);
 label.add(sr);
 add(label, BorderLayout.SOUTH);
 add(label1,BorderLayout.NORTH);
 add(label2,BorderLayout.WEST);


} 
    public static void main(String[] args) throws IOException {
 
JavaApplication3 app = new JavaApplication3();
app.setVisible(true);
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
app.pack(); /* оптим. размер в завис. от содержимого окна  */

}
    }
