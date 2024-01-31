package VentanasRST;

import Clases.Log;
import Clases.Propiedades;
import Panels.panelDocumentos;
import Panels.panelInicio;
import Panels.panelComunicacion;
import Panels.panelConfiguracion;
import Panels.panelConsultar;
import Panels.panelUsuarios;
import Ventanas.Splash;
import Ventanas.logginz;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author soporte
 */
public class Main extends javax.swing.JFrame {

    panelInicio pinicio = new panelInicio();
    panelUsuarios pusuarios = new panelUsuarios();
    panelDocumentos pdocumentos;// = new panelDocumentos();
    panelComunicacion pseguimiento= new panelComunicacion();
    panelConsultar  pConsultar = new panelConsultar();
    panelConfiguracion pConfig = new panelConfiguracion();
    
    static Log l;
    public static int max = 0;

    public Main() {
        initComponents();
        pdocumentos = new panelDocumentos();
        changeIcon();
        scrollSubMenu.setViewportView(pinicio);
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        selectMenu(1);
    }

    public Main(Log l) {
        initComponents();
        this.l=l;
        pdocumentos = new panelDocumentos();
        changeIcon();
        AWTUtilities.setWindowOpaque(this, false);        
        selectMenu(1);
        scrollSubMenu.setViewportView(pinicio);
        iniciar();
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialShadow1 = new elevacion.MaterialShadow();
        principal = new javax.swing.JPanel();
        panelUsuario = new javax.swing.JPanel();
        vendedorTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        cargoTxt = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        exitButon = new RSMaterialComponent.RSButtonIconShadow();
        maximizarButton = new RSMaterialComponent.RSButtonIconShadow();
        minimzarButton = new RSMaterialComponent.RSButtonIconShadow();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelSubMenu = new javax.swing.JPanel();
        scrollSubMenu = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();
        menu4 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        menu6 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        menu1 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        menu2 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        menu3 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        menu5 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        panelContenido = new javax.swing.JPanel();
        scrollContenido = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - Sistema de Gestión de Solicitudes Rossetti S.A.C.");
        setUndecorated(true);

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        panelUsuario.setBackground(new java.awt.Color(161, 54, 48));
        panelUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        panelUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelUsuarioMouseDragged(evt);
            }
        });
        panelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelUsuarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelUsuarioMouseReleased(evt);
            }
        });

        vendedorTxt.setBackground(new java.awt.Color(255, 255, 255));
        vendedorTxt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        vendedorTxt.setForeground(new java.awt.Color(255, 255, 255));
        vendedorTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        vendedorTxt.setText("@Name Vendedor");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/user_person_customer_man_1532.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido (a):");

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logout256_24927.png"))); // NOI18N
        logoutButton.setContentAreaFilled(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        cargoTxt.setBackground(new java.awt.Color(255, 255, 255));
        cargoTxt.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        cargoTxt.setForeground(new java.awt.Color(255, 255, 255));
        cargoTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cargoTxt.setText("Vendedor");

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                                .addComponent(cargoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(panelUsuarioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(vendedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vendedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panelHeader.setBackground(new java.awt.Color(161, 54, 48));
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

        exitButon.setBackground(new java.awt.Color(161, 54, 48));
        exitButon.setBackgroundHover(new java.awt.Color(255, 204, 204));
        exitButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButon.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        exitButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButonActionPerformed(evt);
            }
        });

        maximizarButton.setBackground(new java.awt.Color(161, 54, 48));
        maximizarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximizarButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CROP_DIN);
        maximizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximizarButtonActionPerformed(evt);
            }
        });

        minimzarButton.setBackground(new java.awt.Color(161, 54, 48));
        minimzarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimzarButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CALL_TO_ACTION);
        minimzarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimzarButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menú Principal - Sistema de Gestión de Solicitudes de Ventas .    Rossetti S.A.C");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 32x32.jpg"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(minimzarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maximizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maximizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minimzarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        panelSubMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelSubMenu.setPreferredSize(new java.awt.Dimension(208, 500));

        scrollSubMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelSubMenuLayout = new javax.swing.GroupLayout(panelSubMenu);
        panelSubMenu.setLayout(panelSubMenuLayout);
        panelSubMenuLayout.setHorizontalGroup(
            panelSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelSubMenuLayout.setVerticalGroup(
            panelSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSubMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollSubMenu))
        );

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        menu4.setBackground(new java.awt.Color(255, 255, 255));
        menu4.setForeground(new java.awt.Color(0, 0, 0));
        menu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Search_find_magnifier_248.png"))); // NOI18N
        menu4.setText("Consultas");
        menu4.setColorHover(new java.awt.Color(255, 255, 255));
        menu4.setColorLine(new java.awt.Color(161, 54, 48));
        menu4.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu4ActionPerformed(evt);
            }
        });

        menu6.setBackground(new java.awt.Color(255, 255, 255));
        menu6.setForeground(new java.awt.Color(0, 0, 0));
        menu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/1492616984-13-setting-configure-repair-support-optimization-google_83419.png"))); // NOI18N
        menu6.setText("Configuración");
        menu6.setColorHover(new java.awt.Color(255, 255, 255));
        menu6.setColorLine(new java.awt.Color(161, 54, 48));
        menu6.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu6ActionPerformed(evt);
            }
        });

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setForeground(new java.awt.Color(0, 0, 0));
        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/homeflat_106039.png"))); // NOI18N
        menu1.setText("Inicio");
        menu1.setColorHover(new java.awt.Color(255, 255, 255));
        menu1.setColorLine(new java.awt.Color(161, 54, 48));
        menu1.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        menu2.setBackground(new java.awt.Color(255, 255, 255));
        menu2.setForeground(new java.awt.Color(0, 0, 0));
        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/users_844.png"))); // NOI18N
        menu2.setText("Usuarios");
        menu2.setColorHover(new java.awt.Color(255, 255, 255));
        menu2.setColorLine(new java.awt.Color(161, 54, 48));
        menu2.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        menu3.setBackground(new java.awt.Color(255, 255, 255));
        menu3.setForeground(new java.awt.Color(0, 0, 0));
        menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/file_icon_129115.png"))); // NOI18N
        menu3.setText("Procesos");
        menu3.setColorHover(new java.awt.Color(255, 255, 255));
        menu3.setColorLine(new java.awt.Color(161, 54, 48));
        menu3.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3ActionPerformed(evt);
            }
        });

        menu5.setBackground(new java.awt.Color(255, 255, 255));
        menu5.setForeground(new java.awt.Color(0, 0, 0));
        menu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/chat-26_icon-icons.com_65943.png"))); // NOI18N
        menu5.setText("  Comunicación");
        menu5.setColorHover(new java.awt.Color(255, 255, 255));
        menu5.setColorLine(new java.awt.Color(161, 54, 48));
        menu5.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(menu4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(menu3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(menu2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(menu1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));

        scrollContenido.setBackground(new java.awt.Color(255, 255, 255));
        scrollContenido.setBorder(null);

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollContenido)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollContenido, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(panelSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(panelSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        selectMenu(1);
    }//GEN-LAST:event_menu1ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        selectMenu(2);
    }//GEN-LAST:event_menu2ActionPerformed

    private void menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3ActionPerformed
        selectMenu(3);
    }//GEN-LAST:event_menu3ActionPerformed

    private void menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu4ActionPerformed
        selectMenu(7);
    }//GEN-LAST:event_menu4ActionPerformed

    private void menu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu6ActionPerformed
        selectMenu(6);
    }//GEN-LAST:event_menu6ActionPerformed

    private void minimzarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimzarButtonActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimzarButtonActionPerformed

    private void maximizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximizarButtonActionPerformed
        if (max == 0) {
            setMaximimar();
            max++;

        } else if (max == 1) {
            setMaximimar();
            max--;
        }
    }//GEN-LAST:event_maximizarButtonActionPerformed

    private void exitButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButonActionPerformed

        int rsp = JOptionPane.showConfirmDialog(panelContenido, "¿Esta seguro de Cerrar el Sistema?", "Salir", JOptionPane.OK_CANCEL_OPTION);
        if (rsp == 0) {
            new Splash().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_exitButonActionPerformed
    int xx, yy;
    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        /* if (max == 0) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xx, y - yy);
        }
*/
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void panelUsuarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMouseDragged
        
        if (max == 0) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xx, y - yy);
        }
        
    }//GEN-LAST:event_panelUsuarioMouseDragged

    private void panelUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMousePressed
       
        if (max == 0) {
            setOpacity((float) 0.8);
            xx = evt.getX();
            yy = evt.getY();
            setCursor(new Cursor(HAND_CURSOR));
        }
        
    }//GEN-LAST:event_panelUsuarioMousePressed

    private void panelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMousePressed
        
        if (max == 0) {
            xx=0;
            yy=0;
            setOpacity((float) 0.8);
            xx = evt.getX();
            yy = evt.getY();
        }
        
    }//GEN-LAST:event_panelHeaderMousePressed

    private void panelUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMouseReleased
        
        if (max == 0) {
            setOpacity((float) 1.0);
             setCursor(new Cursor(NORMAL));
        }
        
    }//GEN-LAST:event_panelUsuarioMouseReleased

    private void panelHeaderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseReleased
        if (max == 0) {
            setOpacity((float) 1.0);
        }
    }//GEN-LAST:event_panelHeaderMouseReleased

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.l = null;
        new logginz().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void menu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu5ActionPerformed
        selectMenu(5);
    }//GEN-LAST:event_menu5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Main().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel cargoTxt;
    private RSMaterialComponent.RSButtonIconShadow exitButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logoutButton;
    private elevacion.MaterialShadow materialShadow1;
    private RSMaterialComponent.RSButtonIconShadow maximizarButton;
    private rojeru_san.rsbutton.RSButtonSelectedIcon menu1;
    private rojeru_san.rsbutton.RSButtonSelectedIcon menu2;
    private rojeru_san.rsbutton.RSButtonSelectedIcon menu3;
    private rojeru_san.rsbutton.RSButtonSelectedIcon menu4;
    private rojeru_san.rsbutton.RSButtonSelectedIcon menu5;
    private rojeru_san.rsbutton.RSButtonSelectedIcon menu6;
    private RSMaterialComponent.RSButtonIconShadow minimzarButton;
    public static javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSubMenu;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JPanel principal;
    public static javax.swing.JScrollPane scrollContenido;
    private javax.swing.JScrollPane scrollSubMenu;
    private static javax.swing.JLabel vendedorTxt;
    // End of variables declaration//GEN-END:variables

    private void selectMenu(int seleccion) {

        switch (seleccion) {
            case 1:
                //Fuentes
                setFuentes(1);
                setColor(1);
                setSeleccion(1);
                subMenu(1);

                break;
            case 2:
                setFuentes(2);
                setColor(2);
                setSeleccion(2);
                subMenu(2);
                break;
            case 3:
                setFuentes(3);
                setColor(3);
                setSeleccion(3);
                subMenu(3);
                break;
            case 4:
                setFuentes(4);
                setColor(4);
                setSeleccion(4);
                subMenu(4);
                break;
            case 5:
                setFuentes(5);
                setColor(5);
                setSeleccion(5);
                subMenu(5);

                break;
            case 6:
                setFuentes(6);
                setColor(6);
                setSeleccion(6);
                subMenu(6);
                break;
            case 7:
                setFuentes(7);
                setColor(7);
                setSeleccion(7);
                subMenu(7);
                break;
            case 8:
                setFuentes(8);
                setColor(8);
                setSeleccion(8);
                subMenu(8);
                break;

        }
    }

    private void setFuentes(int seleccion) {
        switch (seleccion) {
            case 1:

                menu1.setFont(new Font("Segoe UI", Font.BOLD, 16));

                menu2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                break;
            case 2:
                //Fuentes
                menu2.setFont(new Font("Segoe UI", Font.BOLD, 16));

                menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                break;
            case 3:
                //Fuentes
                menu3.setFont(new Font("Segoe UI", Font.BOLD, 16));

                menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                break;
            case 4:
                //Fuentes
                //menu4.setFont(new Font("Segoe UI", Font.BOLD, 16));

                menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                break;
            case 5:
                menu5.setFont(new Font("Segoe UI", Font.BOLD, 16));

                menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu2.setFont(new Font("Segoe UI", Font.PLAIN, 15));

                //menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                break;
            case 6:
                menu6.setFont(new Font("Segoe UI", Font.BOLD, 16));

                menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                
                //menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                break;
            case 7:
                menu4.setFont(new Font("Segoe UI", Font.BOLD, 16));

                menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                break;
            case 8:
                menu6.setFont(new Font("Segoe UI", Font.BOLD, 16));

                menu1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                //menu4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
                break;

        }

    }

    private void setColor(int seleccion) {
        switch (seleccion) {
            case 1:
                menu1.setForeground(new Color(161, 54, 48));

                menu2.setForeground(Color.black);
                menu3.setForeground(Color.black);
                //menu4.setForeground(Color.black);
                menu5.setForeground(Color.black);
                //menu6.setForeground(Color.black);
                menu4.setForeground(Color.black);
                menu6.setForeground(Color.black);
                break;
            case 2:
                menu2.setForeground(new Color(161, 54, 48));

                menu1.setForeground(Color.black);
                menu3.setForeground(Color.black);
                //menu4.setForeground(Color.black);
                menu5.setForeground(Color.black);
                //menu6.setForeground(Color.black);
                menu4.setForeground(Color.black);
                menu6.setForeground(Color.black);
                break;
            case 3:
                menu3.setForeground(new Color(161, 54, 48));

                menu2.setForeground(Color.black);
                menu1.setForeground(Color.black);
                //menu4.setForeground(Color.black);
                menu5.setForeground(Color.black);
                //menu6.setForeground(Color.black);
                menu4.setForeground(Color.black);
                menu6.setForeground(Color.black);
                break;
            case 4:
                //menu4.setForeground(new Color(161, 54, 48));

                menu2.setForeground(Color.black);
                menu3.setForeground(Color.black);
                menu1.setForeground(Color.black);
                menu5.setForeground(Color.black);
                //menu6.setForeground(Color.black);
                menu4.setForeground(Color.black);
                menu6.setForeground(Color.black);
                break;
            case 5:
                menu5.setForeground(new Color(161, 54, 48));

                menu2.setForeground(Color.black);
                menu3.setForeground(Color.black);
                menu1.setForeground(Color.black);
                menu4.setForeground(Color.black);
                menu6.setForeground(Color.black);
                break;
            case 6:
                menu6.setForeground(new Color(161, 54, 48));

                menu2.setForeground(Color.black);
                menu3.setForeground(Color.black);
                menu5.setForeground(Color.black);
                menu1.setForeground(Color.black);
                menu4.setForeground(Color.black);

                break;
            case 7:
                menu4.setForeground(new Color(161, 54, 48));

                menu2.setForeground(Color.black);
                menu3.setForeground(Color.black);
                //menu4.setForeground(Color.black);
                menu5.setForeground(Color.black);
                //menu6.setForeground(Color.black);
                menu1.setForeground(Color.black);
                menu6.setForeground(Color.black);
                break;
            case 8:
                menu6.setForeground(new Color(161, 54, 48));

                menu2.setForeground(Color.black);
                menu3.setForeground(Color.black);
                //menu4.setForeground(Color.black);
                menu5.setForeground(Color.black);
                //menu6.setForeground(Color.black);
                menu4.setForeground(Color.black);
                menu1.setForeground(Color.black);
                break;

        }

    }

    private void setSeleccion(int i) {
        switch (i) {
            case 1:
                menu1.setSelected(true);

                menu2.setSelected(false);
                menu3.setSelected(false);
                //menu4.setSelected(false);
                menu5.setSelected(false);
                //menu6.setSelected(false);
                menu4.setSelected(false);
                menu6.setSelected(false);

                break;
            case 2:
                menu2.setSelected(true);

                menu1.setSelected(false);
                menu3.setSelected(false);
                //menu4.setSelected(false);
                menu5.setSelected(false);
                //menu6.setSelected(false);
                menu4.setSelected(false);
                menu6.setSelected(false);
                break;
            case 3:
                menu3.setSelected(true);

                menu2.setSelected(false);
                menu1.setSelected(false);
                //menu4.setSelected(false);
                menu5.setSelected(false);
                //menu6.setSelected(false);
                menu4.setSelected(false);
                menu6.setSelected(false);
                break;
            case 4:
                //menu4.setSelected(true);

                menu2.setSelected(false);
                menu3.setSelected(false);
                menu1.setSelected(false);
                menu5.setSelected(false);
                //menu6.setSelected(false);
                menu4.setSelected(false);
                menu6.setSelected(false);
                break;
            case 5:
                menu5.setSelected(true);

                menu2.setSelected(false);
                menu3.setSelected(false);

                menu1.setSelected(false);

                menu4.setSelected(false);
                menu6.setSelected(false);
                break;
            case 6:
                menu6.setSelected(true);

                menu2.setSelected(false);
                menu3.setSelected(false);
                //menu4.setSelected(false);
                menu5.setSelected(false);
                menu1.setSelected(false);
                menu4.setSelected(false);
                break;
            case 7:
                menu4.setSelected(true);

                menu2.setSelected(false);
                menu3.setSelected(false);
                //menu4.setSelected(false);
                menu5.setSelected(false);
                //menu6.setSelected(false);
                menu1.setSelected(false);
                menu6.setSelected(false);
                break;
            case 8:
                menu6.setSelected(true);

                menu2.setSelected(false);
                menu3.setSelected(false);
                //menu4.setSelected(false);
                menu5.setSelected(false);
                //menu6.setSelected(false);
                menu4.setSelected(false);
                menu1.setSelected(false);
                break;

        }
    }

    private void subMenu(int i) {
        switch (i) {
            case 1:
                scrollSubMenu.setViewportView(pinicio);
                pinicio.setOpcion();
                break;
            case 2://pusuarios
                scrollSubMenu.setViewportView(pusuarios);
                pusuarios.setOpcion();
                break;
            case 3:
                scrollSubMenu.setViewportView(pdocumentos);
                pdocumentos.setOpcion();
                break;
            case 4:
                break;
            case 5:
                scrollSubMenu.setViewportView(pseguimiento);
                pseguimiento.setOpcion();

                break;
            case 6:
                //pConfig
                scrollSubMenu.setViewportView(pConfig);
                pConfig.setOpcion();
                break;
            case 7:
                scrollSubMenu.setViewportView(pConsultar);
                //pConsultar.setOpcion();
                break;
            case 8:
                break;
        }
    }

    public void setLog(Log l) {
        this.l = l;
        setVendedor(l.getNomLargo());
    }

    private void iniciar() {
        try {
            setVendedor(l.getNomLargo());
            if(l.getNivel() == 1)cargoTxt.setText("Vendedor");
            if(l.getNivel() == 2)cargoTxt.setText("Diseñador Industrial");
            if(l.getNivel() == 3)cargoTxt.setText("Administrador");
            
            scrollSubMenu.setViewportView(pinicio);
            selectMenu(1);
            Propiedades p = new Propiedades();
            p.validarLastLocation(vendedorTxt.getText());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelContenido, e);
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
        
            new notificacionCierres().setVisible(true);
    }

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

                break;
            case 1:
                this.setExtendedState(NORMAL);
                break;
        }
    }

    public static String getVendedor() {
        return vendedorTxt.getText().equals("@Name Vendedor") ? "vacio" : vendedorTxt.getText();
    }

    

    public void setVendedor(String x) {
        this.vendedorTxt.setText(x);
    }
    public static Log getLog(){
        return l;
    }
}
