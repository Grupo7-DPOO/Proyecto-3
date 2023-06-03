package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class PReportes extends JDialog {

    private static final long serialVersionUID = 1L;
    private FPrincipal fPrincipal;
    private JButton ventasPorProductoButton;
    private JButton valorFacturasButton;
    private JButton clientesRegistradosButton;
    private JButton reservasRealizadasButton;

    public PReportes(FPrincipal fPrincipal) {
        this.setfPrincipal(fPrincipal);
        this.setTitle("Reportes");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel pBotones = new JPanel();
        pBotones.setLayout(new GridLayout(4, 1, 10, 10));
        pBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ventasPorProductoButton = new JButton("Ventas por Producto");
        ventasPorProductoButton.addActionListener(e -> {
            generarGraficaVentasPorProducto();
        });
        pBotones.add(ventasPorProductoButton);

        valorFacturasButton = new JButton("Valor de Facturas a lo largo del tiempo");
        valorFacturasButton.addActionListener(e -> {
            generarGraficaValorFacturas();
        });
        pBotones.add(valorFacturasButton);

        clientesRegistradosButton = new JButton("Cantidad de Clientes Registrados a lo largo del tiempo");
        clientesRegistradosButton.addActionListener(e -> {
            generarGraficaClientesRegistrados();
        });
        pBotones.add(clientesRegistradosButton);

        reservasRealizadasButton = new JButton("Cantidad de Reservas Realizadas");
        reservasRealizadasButton.addActionListener(e -> {
            generarGraficaReservasRealizadas();
        });
        pBotones.add(reservasRealizadasButton);

        this.add(pBotones, BorderLayout.CENTER);
    }

    private void generarGraficaVentasPorProducto() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Random random = new Random();
        int numProductos = 5;

        for (int i = 1; i <= numProductos; i++) {
            dataset.addValue(random.nextInt(1000), "Producto " + i, "Mes");
        }

        JFreeChart chart = ChartFactory.createBarChart("Ventas por Producto", "Producto", "Cantidad", dataset,
                PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, new Color(79, 129, 189));
        renderer.setSeriesPaint(1, new Color(192, 80, 77));
        renderer.setSeriesPaint(2, new Color(155, 187, 89));
        renderer.setSeriesPaint(3, new Color(128, 100, 162));
        renderer.setSeriesPaint(4, new Color(75, 172, 198));

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        JDialog dialog = new JDialog();
        dialog.setContentPane(chartPanel);
        dialog.setSize(600, 400);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    private void generarGraficaValorFacturas() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Random random = new Random();
        int numMeses = 12;

        for (int i = 1; i <= numMeses; i++) {
            dataset.addValue(random.nextInt(50000) + 50000, "Valor Facturas", "Mes " + i);
        }

        JFreeChart chart = ChartFactory.createLineChart("Valor de Facturas a lo largo del tiempo", "Mes", "Valor",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.getRenderer().setSeriesPaint(0, new Color(79, 129, 189));

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        JDialog dialog = new JDialog();
        dialog.setContentPane(chartPanel);
        dialog.setSize(600, 400);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    private void generarGraficaClientesRegistrados() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Random random = new Random();
        int numMeses = 12;

        for (int i = 1; i <= numMeses; i++) {
            dataset.addValue(random.nextInt(100) + 50, "Clientes Registrados", "Mes " + i);
        }

        JFreeChart chart = ChartFactory.createLineChart("Cantidad de Clientes Registrados a lo largo del tiempo", "Mes",
                "Cantidad", dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.getRenderer().setSeriesPaint(0, new Color(79, 129, 189));

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        JDialog dialog = new JDialog();
        dialog.setContentPane(chartPanel);
        dialog.setSize(600, 400);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    private void generarGraficaReservasRealizadas() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Random random = new Random();
        int numMeses = 12;

        for (int i = 1; i <= numMeses; i++) {
            dataset.addValue(random.nextInt(50) + 10, "Reservas Realizadas", "Mes " + i);
        }

        JFreeChart chart = ChartFactory.createLineChart("Cantidad de Reservas Realizadas", "Mes", "Cantidad", dataset,
                PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.getRenderer().setSeriesPaint(0, new Color(79, 129, 189));

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        JDialog dialog = new JDialog();
        dialog.setContentPane(chartPanel);
        dialog.setSize(600, 400);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    public FPrincipal getfPrincipal() {
        return fPrincipal;
    }

    public void setfPrincipal(FPrincipal fPrincipal) {
        this.fPrincipal = fPrincipal;
    }
}
