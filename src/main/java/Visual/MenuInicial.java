/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author sebas
 */
public class MenuInicial extends javax.swing.JFrame {
    
    int miPuerto = Puerto();

    /**
     * Creates new form MenuInicial
     */
    public MenuInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallas = new javax.swing.JTabbedPane();
        javax.swing.JPanel MenuInicial = new javax.swing.JPanel();
        monsterName_menu = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        puertoField = new javax.swing.JTextField();
        puertoText = new javax.swing.JLabel();
        nombreText = new javax.swing.JLabel();
        unirseBoton = new javax.swing.JButton();
        lobbyBoton = new javax.swing.JButton();
        salirBoton_menu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        monsterName_unirse = new javax.swing.JLabel();
        ipField_unirse = new javax.swing.JTextField();
        puertoField_unirse = new javax.swing.JTextField();
        ipLobbyText_unirse = new javax.swing.JLabel();
        puertoLobbyText_unirse = new javax.swing.JLabel();
        unirseBoton_unirse = new javax.swing.JButton();
        salirMenuBoton_unirse = new javax.swing.JButton();
        salirBoton_unirse = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jugadoresConectadosPanel = new javax.swing.JPanel();
        jugadoresConectadosText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jugadoresConectadosTextArea_lobby = new javax.swing.JTextArea();
        monsterName_lobby = new javax.swing.JLabel();
        lobbyText_lobby = new javax.swing.JLabel();
        ipField_lobby = new javax.swing.JTextField();
        puertoField_lobby = new javax.swing.JTextField();
        ipText_lobby = new javax.swing.JLabel();
        puertoText_lobby = new javax.swing.JLabel();
        iniciarBoton_lobby = new javax.swing.JButton();
        salirMenuBoton_lobby = new javax.swing.JButton();
        salirBoton_lobby = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantallas.setBackground(new java.awt.Color(147, 82, 83));

        MenuInicial.setBackground(new java.awt.Color(147, 82, 83));
        MenuInicial.setToolTipText("");

        monsterName_menu.setFont(new java.awt.Font("Viner Hand ITC", 3, 70)); // NOI18N
        monsterName_menu.setForeground(new java.awt.Color(12, 122, 16));
        monsterName_menu.setText("MONSTER TECG");

        nombreField.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 14)); // NOI18N

        puertoField.setEditable(false);
        puertoField.setFont(nombreField.getFont());

        puertoText.setBackground(new java.awt.Color(102, 204, 0));
        puertoText.setFont(nombreText.getFont());
        puertoText.setForeground(new java.awt.Color(12, 122, 16));
        puertoText.setText("Tu n�mero de puerto");

        nombreText.setBackground(new java.awt.Color(102, 204, 0));
        nombreText.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 24)); // NOI18N
        nombreText.setForeground(new java.awt.Color(12, 122, 16));
        nombreText.setText("Escribe tu nombre");

        unirseBoton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        unirseBoton.setText("Unirse");
        unirseBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unirseBotonActionPerformed(evt);
            }
        });

        lobbyBoton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        lobbyBoton.setText("Crear Lobby");
        lobbyBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lobbyBotonActionPerformed(evt);
            }
        });

        salirBoton_menu.setFont(salirMenuBoton_lobby.getFont());
        salirBoton_menu.setText("Salir");
        salirBoton_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBoton_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuInicialLayout = new javax.swing.GroupLayout(MenuInicial);
        MenuInicial.setLayout(MenuInicialLayout);
        MenuInicialLayout.setHorizontalGroup(
            MenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuInicialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(unirseBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(MenuInicialLayout.createSequentialGroup()
                .addGroup(MenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInicialLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(monsterName_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuInicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInicialLayout.createSequentialGroup()
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInicialLayout.createSequentialGroup()
                                .addComponent(puertoField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(puertoText, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MenuInicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salirBoton_menu)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(MenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuInicialLayout.createSequentialGroup()
                    .addGap(161, 161, 161)
                    .addComponent(lobbyBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );
        MenuInicialLayout.setVerticalGroup(
            MenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monsterName_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreText))
                .addGap(63, 63, 63)
                .addGroup(MenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puertoField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puertoText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(unirseBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(salirBoton_menu)
                .addGap(56, 56, 56))
            .addGroup(MenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuInicialLayout.createSequentialGroup()
                    .addContainerGap(413, Short.MAX_VALUE)
                    .addComponent(lobbyBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(163, 163, 163)))
        );

        puertoField.setText(String.valueOf(miPuerto));

        pantallas.addTab("tab1", MenuInicial);

        jPanel2.setBackground(new java.awt.Color(147, 82, 83));

        monsterName_unirse.setFont(monsterName_menu.getFont());
        monsterName_unirse.setForeground(monsterName_menu.getForeground());
        monsterName_unirse.setText("MONSTER TECG");

        ipField_unirse.setFont(puertoField.getFont());

        puertoField_unirse.setFont(puertoField.getFont());

        ipLobbyText_unirse.setFont(nombreText.getFont());
        ipLobbyText_unirse.setText("Escriba iP del Lobby");

        puertoLobbyText_unirse.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 24)); // NOI18N
        puertoLobbyText_unirse.setText("Escriba puerto del Lobby");

        unirseBoton_unirse.setFont(unirseBoton.getFont());
        unirseBoton_unirse.setText("Unirse");
        unirseBoton_unirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unirseBoton_unirseActionPerformed(evt);
            }
        });

        salirMenuBoton_unirse.setFont(unirseBoton.getFont());
        salirMenuBoton_unirse.setText("Menu Principal");
        salirMenuBoton_unirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuBoton_unirseActionPerformed(evt);
            }
        });

        salirBoton_unirse.setFont(salirBoton_menu.getFont());
        salirBoton_unirse.setText("Salir");
        salirBoton_unirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBoton_unirseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(monsterName_unirse)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ipField_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puertoField_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(ipLobbyText_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(puertoLobbyText_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unirseBoton_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salirMenuBoton_unirse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirBoton_unirse)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monsterName_unirse)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(puertoField_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipField_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipLobbyText_unirse)
                    .addComponent(puertoLobbyText_unirse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115)
                .addComponent(unirseBoton_unirse, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirMenuBoton_unirse)
                    .addComponent(salirBoton_unirse))
                .addGap(65, 65, 65))
        );

        pantallas.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(147, 82, 83));

        jugadoresConectadosPanel.setBackground(new java.awt.Color(150, 89, 90));

        jugadoresConectadosText.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 14)); // NOI18N
        jugadoresConectadosText.setText("Jugadores conectados:");

        jugadoresConectadosTextArea_lobby.setEditable(false);
        jugadoresConectadosTextArea_lobby.setBackground(jPanel2.getBackground());
        jugadoresConectadosTextArea_lobby.setColumns(20);
        jugadoresConectadosTextArea_lobby.setFont(jugadoresConectadosText.getFont());
        jugadoresConectadosTextArea_lobby.setRows(5);
        jScrollPane2.setViewportView(jugadoresConectadosTextArea_lobby);

        javax.swing.GroupLayout jugadoresConectadosPanelLayout = new javax.swing.GroupLayout(jugadoresConectadosPanel);
        jugadoresConectadosPanel.setLayout(jugadoresConectadosPanelLayout);
        jugadoresConectadosPanelLayout.setHorizontalGroup(
            jugadoresConectadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jugadoresConectadosPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jugadoresConectadosText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jugadoresConectadosPanelLayout.setVerticalGroup(
            jugadoresConectadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jugadoresConectadosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jugadoresConectadosText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        monsterName_lobby.setFont(new java.awt.Font("Viner Hand ITC", 3, 55)); // NOI18N
        monsterName_lobby.setForeground(monsterName_unirse.getForeground());
        monsterName_lobby.setText("MONSTER TECG");

        lobbyText_lobby.setBackground(monsterName_menu.getForeground());
        lobbyText_lobby.setFont(new java.awt.Font("Viner Hand ITC", 3, 30)); // NOI18N
        lobbyText_lobby.setForeground(monsterName_menu.getForeground());
        lobbyText_lobby.setText("LOBBY");

        ipField_lobby.setEditable(false);
        ipField_lobby.setFont(puertoField.getFont());

        puertoField_lobby.setEditable(false);
        puertoField_lobby.setFont(puertoField_unirse.getFont());

        ipText_lobby.setFont(nombreText.getFont());
        ipText_lobby.setText("iP del Lobby");

        puertoText_lobby.setFont(nombreText.getFont());
        puertoText_lobby.setText("Puerto del Lobby");

        iniciarBoton_lobby.setFont(unirseBoton.getFont());
        iniciarBoton_lobby.setText("Iniciar Partida");

        salirMenuBoton_lobby.setFont(salirMenuBoton_unirse.getFont());
        salirMenuBoton_lobby.setText("Menu Principal");
        salirMenuBoton_lobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuBoton_lobbyActionPerformed(evt);
            }
        });

        salirBoton_lobby.setFont(salirBoton_menu.getFont());
        salirBoton_lobby.setText("Salir");
        salirBoton_lobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBoton_lobbyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ipField_lobby, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(puertoField_lobby, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(lobbyText_lobby))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(monsterName_lobby))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(iniciarBoton_lobby, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(salirMenuBoton_lobby)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salirBoton_lobby))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(ipText_lobby, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(136, 136, 136)
                                    .addComponent(puertoText_lobby, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jugadoresConectadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jugadoresConectadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monsterName_lobby)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lobbyText_lobby, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(puertoField_lobby)
                    .addComponent(ipField_lobby, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipText_lobby)
                    .addComponent(puertoText_lobby))
                .addGap(80, 80, 80)
                .addComponent(iniciarBoton_lobby, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirMenuBoton_lobby)
                    .addComponent(salirBoton_lobby))
                .addGap(77, 77, 77))
        );

        try{
            ipField_lobby.setText(InetAddress.getLocalHost().getHostAddress());
        }

        catch (IOException e){
            e.getMessage();
        }
        puertoField_lobby.setText(String.valueOf(miPuerto));

        pantallas.addTab("tab3", jPanel3);

        jPanel1.setBackground(new java.awt.Color(147, 82, 83));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        pantallas.addTab("tab4", jPanel1);

        getContentPane().add(pantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void unirseBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unirseBotonActionPerformed
        // TODO add your handling code here:
        pantallas.setSelectedIndex(1);
    }//GEN-LAST:event_unirseBotonActionPerformed

    private void lobbyBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lobbyBotonActionPerformed
        // TODO add your handling code here:
        pantallas.setSelectedIndex(2);
    }//GEN-LAST:event_lobbyBotonActionPerformed

    private void unirseBoton_unirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unirseBoton_unirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unirseBoton_unirseActionPerformed

    private void salirMenuBoton_unirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuBoton_unirseActionPerformed
        // TODO add your handling code here:
        pantallas.setSelectedIndex(0);
    }//GEN-LAST:event_salirMenuBoton_unirseActionPerformed

    private void salirMenuBoton_lobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuBoton_lobbyActionPerformed
        // TODO add your handling code here:
        pantallas.setSelectedIndex(0);
    }//GEN-LAST:event_salirMenuBoton_lobbyActionPerformed

    private void salirBoton_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBoton_menuActionPerformed
        // TODO add your handling code here:
        int salir = JOptionPane.showConfirmDialog(null, "�Est�s seguro que quieres salir del juego?");
        switch(salir){
            case JOptionPane.YES_OPTION:
                System.exit(0);
                
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_salirBoton_menuActionPerformed

    private void salirBoton_unirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBoton_unirseActionPerformed
        // TODO add your handling code here:
        int salir = JOptionPane.showConfirmDialog(null, "�Est�s seguro que quieres salir del juego?");
        switch(salir){
            case JOptionPane.YES_OPTION:
                System.exit(0);
                
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_salirBoton_unirseActionPerformed

    private void salirBoton_lobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBoton_lobbyActionPerformed
        // TODO add your handling code here:
        int salir = JOptionPane.showConfirmDialog(null, "�Est�s seguro que quieres salir del juego?");
        switch(salir){
            case JOptionPane.YES_OPTION:
                System.exit(0);
                
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_salirBoton_lobbyActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarBoton_lobby;
    private javax.swing.JTextField ipField_lobby;
    private javax.swing.JTextField ipField_unirse;
    private javax.swing.JLabel ipLobbyText_unirse;
    private javax.swing.JLabel ipText_lobby;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jugadoresConectadosPanel;
    private javax.swing.JLabel jugadoresConectadosText;
    private javax.swing.JTextArea jugadoresConectadosTextArea_lobby;
    private javax.swing.JButton lobbyBoton;
    private javax.swing.JLabel lobbyText_lobby;
    private javax.swing.JLabel monsterName_lobby;
    private javax.swing.JLabel monsterName_menu;
    private javax.swing.JLabel monsterName_unirse;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreText;
    private javax.swing.JTabbedPane pantallas;
    private javax.swing.JTextField puertoField;
    private javax.swing.JTextField puertoField_lobby;
    private javax.swing.JTextField puertoField_unirse;
    private javax.swing.JLabel puertoLobbyText_unirse;
    private javax.swing.JLabel puertoText;
    private javax.swing.JLabel puertoText_lobby;
    private javax.swing.JButton salirBoton_lobby;
    private javax.swing.JButton salirBoton_menu;
    private javax.swing.JButton salirBoton_unirse;
    private javax.swing.JButton salirMenuBoton_lobby;
    private javax.swing.JButton salirMenuBoton_unirse;
    private javax.swing.JButton unirseBoton;
    private javax.swing.JButton unirseBoton_unirse;
    // End of variables declaration//GEN-END:variables

    public int Puerto(){
        
        Random puertoNuevo = new Random();
        
        int puerto = 0;
        
        while(puerto <= 9010){
            
            puerto = puertoNuevo.nextInt(11789);
        }
        
        return puerto;
    }
}

