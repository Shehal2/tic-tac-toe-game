/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author My
 */
public class Tictactoe extends javax.swing.JFrame {

    private String startGame="X";
    private int XCount = 0;
    private int OCount = 0;
    boolean checker;
    
    public Tictactoe() {
        initComponents();
    }
    
    private void gamescore()
    {
        lblPlayerX.setText(String.valueOf(XCount));
        lblPlayerO.setText(String.valueOf(OCount)); 
    }
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame ="O";
        }
        else
         {
            startGame ="X";
        }
    }
    
    private void winningGame()
    {
        String b1 =jbtnTic1.getText();
        String b2 =jbtnTic2.getText();
        String b3 =jbtnTic3.getText();
        String b4 =jbtnTic4.getText();
        String b5 =jbtnTic5.getText();
        String b6 =jbtnTic6.getText();
        String b7 =jbtnTic7.getText();
        String b8 =jbtnTic8.getText();
        String b9 =jbtnTic9.getText();
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
              JOptionPane.showMessageDialog(this,"Player X Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic1.setBackground(Color.ORANGE);
              jbtnTic2.setBackground(Color.ORANGE);
              jbtnTic3.setBackground(Color.ORANGE);
              XCount++;
              gamescore();
        }
        
        if (b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
              JOptionPane.showMessageDialog(this,"Player X Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic4.setBackground(Color.ORANGE);
              jbtnTic5.setBackground(Color.ORANGE);
              jbtnTic6.setBackground(Color.ORANGE);
              XCount++;
              gamescore();
        }
        
        if (b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
              JOptionPane.showMessageDialog(this,"Player X Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic7.setBackground(Color.ORANGE);
              jbtnTic8.setBackground(Color.ORANGE);
              jbtnTic9.setBackground(Color.ORANGE);
              XCount++;
              gamescore();
        }
        
        if (b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
              JOptionPane.showMessageDialog(this,"Player X Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic1.setBackground(Color.ORANGE);
              jbtnTic5.setBackground(Color.ORANGE);
              jbtnTic9.setBackground(Color.ORANGE);
              XCount++;
              gamescore();
        }
        
        if (b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
              JOptionPane.showMessageDialog(this,"Player X Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic3.setBackground(Color.ORANGE);
              jbtnTic6.setBackground(Color.ORANGE);
              jbtnTic9.setBackground(Color.ORANGE);
              XCount++;
              gamescore();
        }
          if (b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
              JOptionPane.showMessageDialog(this,"Player X Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic1.setBackground(Color.ORANGE);
              jbtnTic4.setBackground(Color.ORANGE);
              jbtnTic7.setBackground(Color.ORANGE);
              XCount++;
              gamescore();
        }
          
        if (b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
              JOptionPane.showMessageDialog(this,"Player X Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic2.setBackground(Color.ORANGE);
              jbtnTic5.setBackground(Color.ORANGE);
              jbtnTic8.setBackground(Color.ORANGE);
              XCount++;
              gamescore();
        }
        
        if (b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
              JOptionPane.showMessageDialog(this,"Player X Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic3.setBackground(Color.ORANGE);
              jbtnTic5.setBackground(Color.ORANGE);
              jbtnTic7.setBackground(Color.ORANGE);
              XCount++;
              gamescore();
        }
        
        
        
        if (b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
              JOptionPane.showMessageDialog(this,"Player O Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic1.setBackground(Color.GREEN);
              jbtnTic2.setBackground(Color.GREEN);
              jbtnTic3.setBackground(Color.GREEN);
              OCount++;
              gamescore();
        }
        
        if (b4 == ("O") && b5== ("O") && b6 == ("O"))
        {
              JOptionPane.showMessageDialog(this,"Player O Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic4.setBackground(Color.GREEN);
              jbtnTic5.setBackground(Color.GREEN);
              jbtnTic6.setBackground(Color.GREEN);
              OCount++;
              gamescore();
        }
       if (b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
              JOptionPane.showMessageDialog(this,"Player O Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic7.setBackground(Color.GREEN);
              jbtnTic8.setBackground(Color.GREEN);
              jbtnTic9.setBackground(Color.GREEN);
              OCount++;
              gamescore();
        }
       
      
        
        if (b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
              JOptionPane.showMessageDialog(this,"Player O Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic1.setBackground(Color.GREEN);
              jbtnTic4.setBackground(Color.GREEN);
              jbtnTic7.setBackground(Color.GREEN);
              OCount++;
              gamescore();
        }
        
        if (b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
              JOptionPane.showMessageDialog(this,"Player O Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic2.setBackground(Color.GREEN);
              jbtnTic5.setBackground(Color.GREEN);
              jbtnTic8.setBackground(Color.GREEN);
              OCount++;
              gamescore();
        }
        
        if (b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
              JOptionPane.showMessageDialog(this,"Player O Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic3.setBackground(Color.GREEN);
              jbtnTic6.setBackground(Color.GREEN);
              jbtnTic9.setBackground(Color.GREEN);
              OCount++;
              gamescore();
        }
        
        if (b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
              JOptionPane.showMessageDialog(this,"Player O Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic1.setBackground(Color.GREEN);
              jbtnTic5.setBackground(Color.GREEN);
              jbtnTic9.setBackground(Color.GREEN);
              OCount++;
              gamescore();
        }
        
        if (b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
              JOptionPane.showMessageDialog(this,"Player O Wins","Game",JOptionPane.INFORMATION_MESSAGE); 
              jbtnTic3.setBackground(Color.GREEN);
              jbtnTic5.setBackground(Color.GREEN);
              jbtnTic7.setBackground(Color.GREEN);
              OCount++;
              gamescore();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbtnNGame = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPlayerX = new javax.swing.JLabel();
        lblPlayerO = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(1010, 2147483647));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jbtnNGame.setBackground(new java.awt.Color(102, 255, 102));
        jbtnNGame.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnNGame.setText("New Game");
        jbtnNGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jbtnNGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNGameActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(255, 51, 51));
        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnReset.setBackground(new java.awt.Color(153, 153, 153));
        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnNGame, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnNGame, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Player O :");

        lblPlayerX.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerX.setText("0");
        lblPlayerX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPlayerX.setOpaque(true);

        lblPlayerO.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerO.setText("0");
        lblPlayerO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPlayerO.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Player X :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 500, 470));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jbtnTic2.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });

        jbtnTic4.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });

        jbtnTic7.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });

        jbtnTic3.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });

        jbtnTic5.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });

        jbtnTic1.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });

        jbtnTic8.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });

        jbtnTic9.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });

        jbtnTic6.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jbtnTic6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbtnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jbtnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbtnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jbtnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jbtnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbtnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jbtnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 480, 470));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setText("Tic Tac Toe");

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Tic tac toe 2\\unnamed.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 990, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1010, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        jbtnTic4.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
       frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"Are you want to Exit","Game",
                  JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
       jbtnTic1.setEnabled(true);
       jbtnTic2.setEnabled(true);
       jbtnTic3.setEnabled(true);
       jbtnTic4.setEnabled(true);
       jbtnTic5.setEnabled(true);
       jbtnTic6.setEnabled(true);
       jbtnTic7.setEnabled(true);
       jbtnTic8.setEnabled(true);
       jbtnTic9.setEnabled(true);
       
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
       jbtnTic1.setBackground(Color.LIGHT_GRAY);
       jbtnTic2.setBackground(Color.LIGHT_GRAY);
       jbtnTic3.setBackground(Color.LIGHT_GRAY);
       jbtnTic4.setBackground(Color.LIGHT_GRAY);
       jbtnTic5.setBackground(Color.LIGHT_GRAY);
       jbtnTic6.setBackground(Color.LIGHT_GRAY);
       jbtnTic7.setBackground(Color.LIGHT_GRAY);
       jbtnTic8.setBackground(Color.LIGHT_GRAY);
       jbtnTic9.setBackground(Color.LIGHT_GRAY);
       
       
        
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnNGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNGameActionPerformed
       jbtnTic1.setEnabled(true);
       jbtnTic2.setEnabled(true);
       jbtnTic3.setEnabled(true);
       jbtnTic4.setEnabled(true);
       jbtnTic5.setEnabled(true);
       jbtnTic6.setEnabled(true);
       jbtnTic7.setEnabled(true);
       jbtnTic8.setEnabled(true);
       jbtnTic9.setEnabled(true);
       
       lblPlayerX.setText("");
       lblPlayerO.setText("");
       
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
       jbtnTic1.setBackground(Color.LIGHT_GRAY);
       jbtnTic2.setBackground(Color.LIGHT_GRAY);
       jbtnTic3.setBackground(Color.LIGHT_GRAY);
       jbtnTic4.setBackground(Color.LIGHT_GRAY);
       jbtnTic5.setBackground(Color.LIGHT_GRAY);
       jbtnTic6.setBackground(Color.LIGHT_GRAY);
       jbtnTic7.setBackground(Color.LIGHT_GRAY);
       jbtnTic8.setBackground(Color.LIGHT_GRAY);
       jbtnTic9.setBackground(Color.LIGHT_GRAY);
       
       XCount=0;
       OCount=0;
       
       
        
    }//GEN-LAST:event_jbtnNGameActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
    jbtnTic1.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
     jbtnTic2.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        jbtnTic3.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        jbtnTic5.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        jbtnTic6.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
      jbtnTic7.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        jbtnTic8.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
       jbtnTic9.setText(startGame);
    if (startGame.equalsIgnoreCase("X"))
    {
        checker = false;
    }
    else
    {
        checker=true;
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    // End of variables declaration//GEN-END:variables
}
