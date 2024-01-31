package VentanasRST;

import Clases.AvanceCot;
import Clases.Cliente;
import Clases.Conectar;
import Clases.Cotizacion;
import Clases.Despacho;
import Clases.Log;
import Clases.Presupuesto;
import Clases.RestarFechas;
import Clases.ScrollSens;
import Clases.Seguimiento;
import Clases.Solicitud;
import Clases.TextAreaRenderer;
import Clases.exportarExcel;
import Clases.tools;
import Ventanas.cargando;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import rojerusan.RSTableMetro;

/**
 *
 * @author Rojeru San
 */
public class consultaCotizacionVentas extends javax.swing.JFrame {

    int max = 0;
    String sql = " select * from cotizacion";
    String original = sql;
    cargando carga = new cargando();

    public consultaCotizacionVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);//Transparente      
        changeIcon();
        setLocation(0, 0);
        cerrarButton1.setVisible(false);
        setMaximimar(0);
        mostrarInfo();
        llenarDatos();
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cerrarButton = new javax.swing.JButton();
        cerrarButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelFiltro = new javax.swing.JPanel();
        RSPanelMaterialGradient1 = new RSMaterialComponent.RSPanelMaterialGradient();
        fecha2 = new rojeru_san.rsdate.RSDateChooser();
        jLabel9 = new javax.swing.JLabel();
        estadoCombo = new RSMaterialComponent.RSComboBox();
        jLabel7 = new javax.swing.JLabel();
        buscarDatosButton = new rojeru_san.complementos.RSButtonHover();
        filtroLabel = new javax.swing.JLabel();
        vendedorCombo = new RSMaterialComponent.RSComboBox();
        fecha1 = new rojeru_san.rsdate.RSDateChooser();
        jLabel5 = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ScrollTabla = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new rojerusan.RSTableMetro();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Registro de Cotizaciones - SDGS");
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));
        panelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHeaderMouseDragged(evt);
            }
        });
        panelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelHeaderMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelHeaderMouseReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        cerrarButton.setBackground(new java.awt.Color(255, 255, 255));
        cerrarButton.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        cerrarButton.setText("X");
        cerrarButton.setBorderPainted(false);
        cerrarButton.setContentAreaFilled(false);
        cerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarButton.setIconTextGap(0);
        cerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarButtonActionPerformed(evt);
            }
        });

        cerrarButton1.setBackground(new java.awt.Color(255, 255, 255));
        cerrarButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/maximize_32x32.png"))); // NOI18N
        cerrarButton1.setBorderPainted(false);
        cerrarButton1.setContentAreaFilled(false);
        cerrarButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Consulta de Registro de Cotizaciones - SDGS");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(cerrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cerrarButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelFiltro.setBackground(new java.awt.Color(255, 255, 255));

        RSPanelMaterialGradient1.setColorPrimario(new java.awt.Color(161, 54, 48));
        RSPanelMaterialGradient1.setColorSecundario(new java.awt.Color(153, 153, 153));

        fecha2.setColorBackground(new java.awt.Color(161, 54, 48));
        fecha2.setColorButtonHover(new java.awt.Color(161, 54, 48));
        fecha2.setColorDiaActual(new java.awt.Color(77, 164, 98));
        fecha2.setColorForeground(new java.awt.Color(0, 0, 0));
        fecha2.setFormatoFecha("dd/MM/yyyy");
        fecha2.setPlaceholder("Hasta");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("C) Estado");

        estadoCombo.setForeground(new java.awt.Color(0, 0, 0));
        estadoCombo.setMaximumRowCount(10);
        estadoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Esperando Aprobación", "Aprobados", "Rechazados" }));
        estadoCombo.setAutoscrolls(true);
        estadoCombo.setColorArrow(new java.awt.Color(161, 54, 48));
        estadoCombo.setColorBorde(new java.awt.Color(0, 0, 0));
        estadoCombo.setColorBoton(new java.awt.Color(204, 204, 204));
        estadoCombo.setColorDisabledIndex(new java.awt.Color(153, 153, 153));
        estadoCombo.setColorFondo(new java.awt.Color(255, 255, 255));
        estadoCombo.setColorSeleccion(new java.awt.Color(161, 54, 48));
        estadoCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("A) Vendedor");

        buscarDatosButton.setBackground(new java.awt.Color(192, 121, 117));
        buscarDatosButton.setText("Buscar Datos");
        buscarDatosButton.setColorHover(new java.awt.Color(161, 54, 48));
        buscarDatosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDatosButtonActionPerformed(evt);
            }
        });

        filtroLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        filtroLabel.setForeground(new java.awt.Color(255, 255, 255));
        filtroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filtroLabel.setText("Filtros de Búsqueda");
        filtroLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        vendedorCombo.setForeground(new java.awt.Color(0, 0, 0));
        vendedorCombo.setMaximumRowCount(10);
        vendedorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "RSItem 2", "RSItem 3", "RSItem 4", "RSItem 1", "RSItem 2", "RSItem 3", "RSItem 4", "RSItem 1", "RSItem 2", "RSItem 3", "RSItem 4" }));
        vendedorCombo.setAutoscrolls(true);
        vendedorCombo.setColorArrow(new java.awt.Color(161, 54, 48));
        vendedorCombo.setColorBorde(new java.awt.Color(0, 0, 0));
        vendedorCombo.setColorBoton(new java.awt.Color(204, 204, 204));
        vendedorCombo.setColorDisabledIndex(new java.awt.Color(153, 153, 153));
        vendedorCombo.setColorFondo(new java.awt.Color(255, 255, 255));
        vendedorCombo.setColorSeleccion(new java.awt.Color(161, 54, 48));
        vendedorCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        fecha1.setColorBackground(new java.awt.Color(161, 54, 48));
        fecha1.setColorButtonHover(new java.awt.Color(161, 54, 48));
        fecha1.setColorDiaActual(new java.awt.Color(77, 164, 98));
        fecha1.setColorForeground(new java.awt.Color(0, 0, 0));
        fecha1.setFormatoFecha("dd/MM/yyyy");
        fecha1.setPlaceholder("Desde");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("B) Rango de Fecha");

        javax.swing.GroupLayout RSPanelMaterialGradient1Layout = new javax.swing.GroupLayout(RSPanelMaterialGradient1);
        RSPanelMaterialGradient1.setLayout(RSPanelMaterialGradient1Layout);
        RSPanelMaterialGradient1Layout.setHorizontalGroup(
            RSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RSPanelMaterialGradient1Layout.createSequentialGroup()
                .addGroup(RSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RSPanelMaterialGradient1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(RSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(filtroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vendedorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addGroup(RSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(estadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RSPanelMaterialGradient1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)))))
                    .addGroup(RSPanelMaterialGradient1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscarDatosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        RSPanelMaterialGradient1Layout.setVerticalGroup(
            RSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RSPanelMaterialGradient1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(filtroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vendedorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(RSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RSPanelMaterialGradient1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarDatosButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFiltroLayout = new javax.swing.GroupLayout(panelFiltro);
        panelFiltro.setLayout(panelFiltroLayout);
        panelFiltroLayout.setHorizontalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroLayout.createSequentialGroup()
                .addComponent(RSPanelMaterialGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        panelFiltroLayout.setVerticalGroup(
            panelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RSPanelMaterialGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenido al panel de consulta de Cotizaciones para Ventas");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/2number_2.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/1number_1.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/3number_3.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Ingrese los parámetros deseados para buscar en el registro de cotizaciones");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("y Presione el Botón de < Buscar Datos >");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Una vez visualizado los datos, utilice el boton de Excel para generar");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("un documento el cual pueda compartir o aplicar diferentes filtros");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/search_64x64.png"))); // NOI18N

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Excel_64x64.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Utilice la función <Reestablecer> para nuevas búsquedas");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("o modifique los filtros para cambiar los resultados");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/refresh_64x64.png"))); // NOI18N

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setPreferredSize(new java.awt.Dimension(877, 646));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Excel_2013_23480.png"))); // NOI18N
        jButton1.setText("Generar excel");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHideActionText(true);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setIconTextGap(5);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/refresh_32x32.png"))); // NOI18N
        jButton2.setText("Reestablecer");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setHideActionText(true);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(5);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "OT", "MES", "Fec. Ingreso", "Cliente", "Contacto", "Producto", "Monto s/Igv", "Facturación", "Fec. Entrega", "Estado", "Plano", "Materiales", "Habilitado", "Mecanizado", "Ensamble", "Soldeo", "Granallado", "Pintura", "Despacho", "Grado Avance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.setBackgoundHead(new java.awt.Color(161, 54, 48));
        tablaDatos.setBackgoundHover(new java.awt.Color(192, 121, 117));
        tablaDatos.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaDatos.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaDatos.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaDatos.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaDatos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaDatos.setPreferredScrollableViewportSize(new java.awt.Dimension(2900, 400));
        tablaDatos.setSelectionBackground(new java.awt.Color(192, 121, 117));
        jScrollPane1.setViewportView(tablaDatos);
        if (tablaDatos.getColumnModel().getColumnCount() > 0) {
            tablaDatos.getColumnModel().getColumn(0).setMinWidth(55);
            tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(55);
            tablaDatos.getColumnModel().getColumn(0).setMaxWidth(55);
            tablaDatos.getColumnModel().getColumn(1).setMinWidth(100);
            tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaDatos.getColumnModel().getColumn(1).setMaxWidth(100);
            tablaDatos.getColumnModel().getColumn(2).setMinWidth(140);
            tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(140);
            tablaDatos.getColumnModel().getColumn(2).setMaxWidth(140);
            tablaDatos.getColumnModel().getColumn(3).setMinWidth(60);
            tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(110);
            tablaDatos.getColumnModel().getColumn(3).setMaxWidth(110);
            tablaDatos.getColumnModel().getColumn(5).setMinWidth(100);
            tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(220);
            tablaDatos.getColumnModel().getColumn(5).setMaxWidth(220);
            tablaDatos.getColumnModel().getColumn(6).setMinWidth(100);
            tablaDatos.getColumnModel().getColumn(6).setPreferredWidth(200);
            tablaDatos.getColumnModel().getColumn(6).setMaxWidth(200);
            tablaDatos.getColumnModel().getColumn(7).setMinWidth(140);
            tablaDatos.getColumnModel().getColumn(7).setPreferredWidth(140);
            tablaDatos.getColumnModel().getColumn(7).setMaxWidth(140);
            tablaDatos.getColumnModel().getColumn(8).setMinWidth(140);
            tablaDatos.getColumnModel().getColumn(8).setPreferredWidth(140);
            tablaDatos.getColumnModel().getColumn(8).setMaxWidth(140);
            tablaDatos.getColumnModel().getColumn(9).setMinWidth(140);
            tablaDatos.getColumnModel().getColumn(9).setPreferredWidth(140);
            tablaDatos.getColumnModel().getColumn(9).setMaxWidth(140);
            tablaDatos.getColumnModel().getColumn(10).setMinWidth(120);
            tablaDatos.getColumnModel().getColumn(10).setPreferredWidth(120);
            tablaDatos.getColumnModel().getColumn(10).setMaxWidth(120);
            tablaDatos.getColumnModel().getColumn(11).setMinWidth(100);
            tablaDatos.getColumnModel().getColumn(11).setPreferredWidth(100);
            tablaDatos.getColumnModel().getColumn(11).setMaxWidth(100);
            tablaDatos.getColumnModel().getColumn(12).setMinWidth(80);
            tablaDatos.getColumnModel().getColumn(12).setPreferredWidth(130);
            tablaDatos.getColumnModel().getColumn(12).setMaxWidth(130);
            tablaDatos.getColumnModel().getColumn(13).setMinWidth(120);
            tablaDatos.getColumnModel().getColumn(13).setPreferredWidth(120);
            tablaDatos.getColumnModel().getColumn(13).setMaxWidth(120);
            tablaDatos.getColumnModel().getColumn(14).setMinWidth(80);
            tablaDatos.getColumnModel().getColumn(14).setPreferredWidth(130);
            tablaDatos.getColumnModel().getColumn(14).setMaxWidth(130);
            tablaDatos.getColumnModel().getColumn(15).setMinWidth(80);
            tablaDatos.getColumnModel().getColumn(15).setPreferredWidth(140);
            tablaDatos.getColumnModel().getColumn(15).setMaxWidth(140);
            tablaDatos.getColumnModel().getColumn(16).setMinWidth(70);
            tablaDatos.getColumnModel().getColumn(16).setPreferredWidth(120);
            tablaDatos.getColumnModel().getColumn(16).setMaxWidth(120);
            tablaDatos.getColumnModel().getColumn(17).setMinWidth(80);
            tablaDatos.getColumnModel().getColumn(17).setPreferredWidth(130);
            tablaDatos.getColumnModel().getColumn(17).setMaxWidth(130);
            tablaDatos.getColumnModel().getColumn(18).setMinWidth(70);
            tablaDatos.getColumnModel().getColumn(18).setPreferredWidth(120);
            tablaDatos.getColumnModel().getColumn(18).setMaxWidth(120);
            tablaDatos.getColumnModel().getColumn(19).setMinWidth(80);
            tablaDatos.getColumnModel().getColumn(19).setPreferredWidth(130);
            tablaDatos.getColumnModel().getColumn(19).setMaxWidth(130);
            tablaDatos.getColumnModel().getColumn(20).setMinWidth(100);
            tablaDatos.getColumnModel().getColumn(20).setPreferredWidth(120);
            tablaDatos.getColumnModel().getColumn(20).setMaxWidth(120);
        }

        ScrollTabla.setViewportView(jScrollPane1);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(panelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarDatosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDatosButtonActionPerformed
        buscarDatosButton.setEnabled(false);
        new Thread(this::mostrarCargando).start();
        new Thread(this::buscarDatos).start();

    }//GEN-LAST:event_buscarDatosButtonActionPerformed

    private void panelHeaderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_panelHeaderMouseReleased

    private void panelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMousePressed

        setOpacity((float) 0.8);
        xx = evt.getX();
        yy = evt.getY();

    }//GEN-LAST:event_panelHeaderMousePressed

    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void cerrarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarButton1ActionPerformed

        setMaximimar(max);
    }//GEN-LAST:event_cerrarButton1ActionPerformed

    private void cerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarButtonActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarButtonActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setContentAreaFilled(true);
        jButton1.setBorderPainted(true);
        jButton1.setForeground(new Color(161, 54, 48));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setContentAreaFilled(true);
        jButton2.setBorderPainted(true);
        jButton2.setForeground(new Color(161, 54, 48));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton2.setForeground(Color.black);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        if (modelo.getRowCount() < 1) {
            mostrarInfo();
        } else {
            int rsp = JOptionPane.showConfirmDialog(rootPane, "¿Desea Resetear los datos Mostrados?", "Resetear Resultados", JOptionPane.OK_CANCEL_OPTION);
            if (rsp == 0) {
                mostrarInfo();
                vaciarTabla();

            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);

        new Thread(this::mostrarCargando).start();
        new Thread(this::Exportar).start();
    }//GEN-LAST:event_jButton1ActionPerformed
    int xx, yy;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaCotizacionVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSPanelMaterialGradient RSPanelMaterialGradient1;
    private javax.swing.JScrollPane ScrollTabla;
    private rojeru_san.complementos.RSButtonHover buscarDatosButton;
    private javax.swing.JButton cerrarButton;
    private javax.swing.JButton cerrarButton1;
    private RSMaterialComponent.RSComboBox estadoCombo;
    private rojeru_san.rsdate.RSDateChooser fecha1;
    private rojeru_san.rsdate.RSDateChooser fecha2;
    private javax.swing.JLabel filtroLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelInfo;
    private rojerusan.RSTableMetro tablaDatos;
    private RSMaterialComponent.RSComboBox vendedorCombo;
    // End of variables declaration//GEN-END:variables

    public void setMaximimar() {
        switch (max) {
            case 0:
                GraphicsEnvironment env
                        = GraphicsEnvironment.getLocalGraphicsEnvironment();
                this.setMaximizedBounds(env.getMaximumWindowBounds());
                this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

                break;
            case 1:
                this.setResizable(false);
                this.setExtendedState(NORMAL);
                break;
        }
    }

    public void setMaximimar(int rsp) {
        switch (rsp) {
            case 0:
                GraphicsEnvironment env
                        = GraphicsEnvironment.getLocalGraphicsEnvironment();
                this.setMaximizedBounds(env.getMaximumWindowBounds());
                this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
                max++;
                break;
            case 1:
                this.setExtendedState(NORMAL);
                max--;
                break;
        }
    }

    private void mostrarInfo() {
        panelDatos.setVisible(false);
        panelInfo.setVisible(true);
    }

    private void mostrarDatos() {
        panelDatos.setVisible(true);
        panelInfo.setVisible(false);
    }

    private void buscarDatos() {
        mostrarDatos();
        vaciarTabla();
        sql = original;
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        if (vendedorCombo.getSelectedIndex() > 0) {
            String vendedor = vendedorCombo.getSelectedItem().toString();
            sql += " where responsable ='" + vendedor + "' ";
        }
        String fecha1x = new SimpleDateFormat("dd/MM/yyyy").format(fecha1.getDatoFecha());
        String fecha2x = new SimpleDateFormat("dd/MM/yyyy").format(fecha2.getDatoFecha());
        if (!sql.equals(original)) {
            sql += " and  str_to_date(fecha, '%d/%m/%Y') >= str_to_date('"+fecha1x+"', '%d/%m/%Y')  and  str_to_date(fecha, '%d/%m/%Y') <= str_to_date('"+fecha2x+"', '%d/%m/%Y')  ";
        } else {
            sql += " where  str_to_date(fecha, '%d/%m/%Y') >= str_to_date('"+fecha1x+"', '%d/%m/%Y')  and  str_to_date(fecha, '%d/%m/%Y') <= str_to_date('"+fecha2x+"', '%d/%m/%Y')  ";
        }
        if (estadoCombo.getSelectedIndex() > 0) { // Para indicar el estado del proceso

            if (estadoCombo.getSelectedIndex() == 1) {
                sql += " and estado ='Cot. Creada - Esperando por Cliente'";
            } else if (estadoCombo.getSelectedIndex() == 2) {
                sql += " and estado !='Cot. Creada - Esperando por Cliente' and estado != 'Rechazado'";
            } else if (estadoCombo.getSelectedIndex() == 3) {
                sql += " and estado ='Rechazado'";
            }

        }
        int cont = 1;

        try (Connection con = new Conectar("rstcot").getCon()) {
            System.out.println("sql: "+sql);
            PreparedStatement pst = con.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
                
                
                //String responsablex = rs.getString("responsable");
                String fechax = rs.getString("fecha");
                String numCot = rs.getString("numeroCot");
                String estadox = rs.getString("estado");
                int idCot = rs.getInt("id");
                //int idPresu = rs.getInt("idPresupuesto");
                int tiempoFabricacion = rs.getInt("tiempoFabricacion");
                //Presupuesto presupuesto = new Presupuesto().buscarID(idPresu);
                //Solicitud solicitud = new Solicitud().buscarID(presupuesto.getIdSolicitud());
                //Cliente cliente = new Cliente().buscarId(solicitud.getIdCliente());
               // Seguimiento seguimiento = new Seguimiento().buscarEspecifico("Cotización", idCot, "Cierre Listo");
                String peso = rs.getDouble("toneladas") < 1 ? "-" : rs.getDouble("toneladas") + "";
               // String fechaCierre = seguimiento.getId() == 0 ? "-" : seguimiento.getFecha();
                String montoCot = rs.getDouble("monto") < 1 ? "-" : rs.getDouble("monto") + "";
                String montoOc = rs.getDouble("montoOc") < 1 ? "-" : rs.getDouble("montoOc") + "";

                Double montoDespachado = new Despacho().getMontoDespachado(idCot);
                String montoDespachadoX = montoDespachado == 0.0 ? "-" : new DecimalFormat("#.00").format(montoDespachado) + "";
                String fechaConfirmacionPlano
                        = buscarFecha(idCot) == null ? "-" : buscarFecha(idCot);

                String lastFechaDespacho = new Despacho().getLastFechaDespacho(idCot);

                String fechaFinalPlazo = "-";
                
                if (!fechaConfirmacionPlano.equals("-") && fechaConfirmacionPlano != null) {
                    fechaFinalPlazo = new tools().sumarDiaHabilFECHA(fechaConfirmacionPlano, rs.getInt("tiempoFabricacion"));
                }

                /*int diasBrecha = -777;
                    if (!fechaFinalPlazo.equals("-") && !lastFechaDespacho.equals("-")) {
                        diasBrecha = new RestarFechas().RestarFechas(fechaFinalPlazo, lastFechaDespacho);
                    }*/
                String estadoDespacho = "-";
                estadoDespacho = estadox;
                montoDespachado = Double.parseDouble(new DecimalFormat("#.00").format(montoDespachado));

                //System.out.println("Mes: "+mes);
                String contacto = new Cotizacion().buscarID(idCot).getPresupuesto().getSolicitud().getPersonaContacto();
                String producto = rs.getString("nombreProducto");
                Double montoIGv = Double.parseDouble(montoCot);
                montoIGv = Double.parseDouble((new DecimalFormat("#.00").format(montoIGv * 1.18)));
                estadox = estadox.equalsIgnoreCase("Proceso Terminado") ? "Cerrado" : "Abierto";
                AvanceCot ac = new AvanceCot().buscarIdCot(idCot);
                Double plano = Double.parseDouble(ac.getPlano());
                Double materiales = Double.parseDouble(ac.getMateriales());
                Double habilitado = Double.parseDouble(ac.getHabilitado());
                Double mecanizado = Double.parseDouble(ac.getMecanizado());
                Double ensamble = Double.parseDouble(ac.getEnsamble());
                Double soldeo = Double.parseDouble(ac.getSoldeo());
                Double granallado = Double.parseDouble(ac.getGranallado());
                Double pintura = Double.parseDouble(ac.getPintura());
                Double despacho = Double.parseDouble(ac.getDespacho());
                Double total = (plano + materiales + habilitado + mecanizado + ensamble + soldeo + granallado + pintura + despacho) / 9;
                String ot = rs.getString("numOt").equals("0") ? "-" : rs.getString("numOt");
                String mes = new tools().getMes(Integer.parseInt(fechax.substring(3, 5)));
                DecimalFormat df = new DecimalFormat("#.00");
                String fechaz = new Cotizacion().getFechaConfirmacionOC(idCot);

                modelo.addRow(new Object[]{
                    cont, ot, mes.toUpperCase(), fechaz, rs.getString("cliente"), contacto, producto, montoCot, montoIGv,
                    fechaFinalPlazo, estadox, df.format(plano), df.format(materiales), df.format(habilitado), df.format(mecanizado),
                    df.format(ensamble), df.format(soldeo), df.format(granallado), df.format(pintura), df.format(despacho), df.format(total)

                });
                /*if (producto.length() > 20) {
                    int cant =producto.length()*8;
                    TableColumn columna;
                    columna = tablaDatos.getColumnModel().getColumn(6);
                    columna.setPreferredWidth(cant);
                    columna.setMaxWidth(cant);
                    columna.setMinWidth(cant);
                   
                  tablaDatos.setPreferredScrollableViewportSize(new Dimension(tablaDatos.getWidth()+cant, tablaDatos.getHeight()));
                  tablaDatos.repaint();
                }*/

                /*modelo.addRow(new Object[]{
                            cont, numCot, solicitud.getFecha(),
                            responsablex, presupuesto.getTipo(),
                            cliente.getNombre1(), fechax,
                            montoCot+" $", montoOc+" $", montoDespachado+"$", peso,
                            fechaCierre, lastFechaDespacho, estadoDespacho

                        });*/
                cont++;
            }

        } catch (Exception e) {
            Logger.getLogger(consultaCotizacionVentas.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(rootPane, e);
        }
        buscarDatosButton.setEnabled(true);
        new Thread(this::ocultarCargando).start();
        //tablaDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //resizeColumnWidth(tablaDatos);

        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "No se encontraron resultados");
            vaciarTabla();
        }

        /*
        else {
            Double pesoTemp = 0.0;
            Double montoCotTemp = 0.0;
            Double montoOCTemp = 0.0;
            String montoCotString = "-";
            String montoOCString = "-";
            String pesoString = "-";
            Double totalDespachado = 0.0;
            String despachadoString ="-";
            for (int i = 0; i < modelo.getRowCount(); i++) {
                montoCotString = tablaDatos.getValueAt(i, 7).toString().replace(" $", "");
                montoOCString = tablaDatos.getValueAt(i, 8).toString().replace(" $", "");
                despachadoString = tablaDatos.getValueAt(i, 9).toString().replace(" $", "");
                pesoString = tablaDatos.getValueAt(i, 10).toString().replace(" $", "");

                if (!montoCotString.equals("-")) {
                    montoCotTemp += Double.parseDouble(montoCotString);
                }
                if (!montoOCString.equals("-")) {
                    montoOCTemp += Double.parseDouble(montoOCString);
                }

                if (!pesoString.equals("-")) {
                    pesoTemp += Double.parseDouble(pesoString);
                }
                if(!despachadoString.equals("-")) {
                    totalDespachado += Double.parseDouble(despachadoString.replace("$", ""));
                }

            }
             DecimalFormat df = new DecimalFormat("#.00");
             montoOCString = df.format(montoOCTemp);
             montoOCTemp = Double.parseDouble(montoOCString);
           /*
             modelo.addRow(new Object[]{
                "-", "Total", "->", "->", "->", "->", "->", new DecimalFormat("#.00").format(montoCotTemp)+" $", montoOCTemp+" $",totalDespachado+" $", pesoTemp, "-", "-", "-", "-"
            });
            
        }*/
    }

    private String buscarFecha(int idCot) {

        String temp = "";
        temp = new Seguimiento().buscarEspecifico("Cotización", idCot, "Plano Confirmado - Esperando Entrega").getFecha();

        return temp;
    }

    private void vaciarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        modelo.setRowCount(0);

    }

    private void llenarDatos() {
        ScrollSens ss = new ScrollSens(ScrollTabla);
        ss.aumentarSens(40);
        fecha1.setDatoFecha(new Date());
        fecha2.setDatoFecha(new Date());
        ArrayList<String> lista = (ArrayList) new Log().listarxNivel(1).clone();
        vendedorCombo.removeAllItems();
        vendedorCombo.addItem("Todos");
        for (String valor : lista) {
            vendedorCombo.addItem(valor);
        }
    }

    private void mostrarCargando() {
        carga.setVisible(true);
    }
                                                        
    private void ocultarCargando() {
        carga.setVisible(false);
    }
 
    private void Exportar() {              
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();          
            if (modelo.getRowCount() > 0) {
                new exportarExcel().Exportar(tablaDatos, "Consulta Cotizacion");
                new Thread(this::ocultarCargando).start();
                jButton1.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debe haber al menos 1 resultado en la tabla");
            }

        } catch (IOException ex) {
            Logger.getLogger(consultaCotizacionVentas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    public void resizeColumnWidth(RSTableMetro table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 80; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 50, width);
            }
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
}
