/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik_batang_edukasi;

import java.awt.Color;
import java.awt.GradientPaint;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

//mungkin itu saja .... kita akan ketemu di tutorial lainnya..
//salam annnabe...
/**
 *
 * @author MrRoot
 */
//kita akan membuat grafik batang...
//tetapi sebelumnya kita harus menginputkan jar freechart...


public class Grafik_Batang_Edukasi extends ApplicationFrame{

    public Grafik_Batang_Edukasi(String title){
        super(title);
        CategoryDataset dataset = createDataset();//nanti kita akan membuat method createdata set
        JFreeChart chart = createChart(dataset);//kita akan membuat method createChart....
        ChartPanel chartPanel = new ChartPanel(chart,false);
        setContentPane(chartPanel);
    }
    //kali ini kita akan membuat method createDataset
    
    private static CategoryDataset createDataset(){
        //kita akan memasukkan 3 perbandingan Grafik...
        
        String seri1 = "Java Programming";
        String seri2 = "Android Programming";
        String seri3 = "Desain";
        
        //kita akan membuat pilihan dari 3 seri itu..
        
        String categori1="2010";
        String categori2 = "2011";
        String cateogri3 = "2012";
        String categori4 = "2013";
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(92.42, seri1, categori1);
        dataset.addValue(44.42, seri1, categori2);
        dataset.addValue(79.42, seri1, cateogri3);
        
        dataset.addValue(92.42, seri1, categori4);
        //yang android programming..
        dataset.addValue(92.42, seri2, categori1);
        dataset.addValue(92.42, seri2, categori2);
        dataset.addValue(92.42, seri2, cateogri3);
        dataset.addValue(92.42, seri2, categori4);

        //kita akan membuat grafik desain nya...
        
        dataset.addValue(92.42, seri3, categori1);
        
        dataset.addValue(92.42, seri3, categori2);
        
        dataset.addValue(92.42, seri3, cateogri3);
        
        dataset.addValue(92.42, seri3, categori4);

        return dataset;

    }

    //kita akan membuat methood createChart
    
    private JFreeChart createChart(CategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Grafik EDUKASI","Data","EDUKASI GRAFIK",dataset, PlotOrientation.VERTICAL, true,true,true);
        chart.setBackgroundPaint(Color.white);
        CategoryPlot plot = (CategoryPlot)chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);
        final NumberAxis rangeAxis = (NumberAxis)plot.getRangeAxis();
        BarRenderer render = (BarRenderer)plot.getRenderer();
        render.setDrawBarOutline(false);
        GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.CYAN,0.0f,0.0f, new  Color(0, 0, 64));
        GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.GREEN,0.0f,0.0f, new  Color(0, 0, 64));
        GradientPaint gp2 = new GradientPaint(0.0f, 0.0f, Color.RED,0.0f,0.0f, new  Color(0, 0, 64));
        
        
        return chart;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
Grafik_Batang_Edukasi demo = new Grafik_Batang_Edukasi("DEMO GRAFIK");
demo.pack();
RefineryUtilities.centerFrameOnScreen(demo);
demo.setVisible(true);
    }
}

//itu saja dari saya//
//selamat mengerjakan dan ketemu di tutorial selanjutnya..

//salam annabe