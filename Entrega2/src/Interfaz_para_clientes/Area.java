package Interfaz_para_clientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Area extends JPanel {
    private JTable tabla;
    private DefaultTableModel modelo;
    private JScrollPane scroll;
    private JPanel pSuperior;
    private JPanel pInferior;
    private JTextField tFiltro;
    private JLabel lFiltro;

    public PArea() {
        this.setLayout(new BorderLayout());

        // Panel superior
        this.pSuperior = new JPanel();
        this.pSuperior.setBackground(Color.decode("#CCDAD1"));
        this.pSuperior.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.pSuperior.setLayout(new GridLayout(1, 2, 10, 10));
        this.lFiltro = new JLabel("Filtro:");
        this.lFiltro.setFont(new Font("Tahoma", Font.BOLD, 30));
        this.tFiltro = new JTextField();
        this.tFiltro.setFont(new Font("Tahoma", Font.PLAIN, 30));
        this.tFiltro.setPreferredSize(new Dimension(300, 50));
        this.pSuperior.add(this.lFiltro);
        this.pSuperior.add(this.tFiltro);
        this.add(this.pSuperior, BorderLayout.NORTH);

        // Tabla
        this.modelo = new DefaultTableModel();
        this.tabla = new JTable(this.modelo);
        this.tabla.setRowHeight(30);
        this.tabla.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.scroll = new JScrollPane(this.tabla);
        this.add(this.scroll, BorderLayout.CENTER);

        // Panel inferior
        this.pInferior = new JPanel();
        this.pInferior.setBackground(Color.decode("#CCDAD1"));
        this.pInferior.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.pInferior.setLayout(new GridLayout(1, 2, 10, 10));
        this.add(this.pInferior, BorderLayout.SOUTH);
    }

    public void cambiarPanel(JPanel panel) {
        this.removeAll();
        this.add(panel);
        this.revalidate();
        this.repaint();
    }

    public JTable getTabla() {
        return tabla;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public JPanel getpSuperior() {
        return pSuperior;
    }

    public JPanel getpInferior() {
        return pInferior;
    }

    public JTextField gettFiltro() {
        return tFiltro;
    }

    public JLabel getlFiltro() {
        return lFiltro;
    }

}
