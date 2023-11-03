
package Calculadora;

public class Calculadora extends javax.swing.JFrame {
    int numero1, numero2;
    String signo;
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Calculadora Simple");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_operacion = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_restar = new javax.swing.JButton();
        btn_sumar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(179, 229, 252));

        txt_operacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_operacion.setForeground(new java.awt.Color(55, 62, 71));
        txt_operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txt_resultado.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txt_resultado.setForeground(new java.awt.Color(55, 62, 71));
        txt_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(55, 62, 71));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circuloI.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setBorderPainted(false);
        btn_igual.setContentAreaFilled(false);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 40, 40));

        btn_9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setBorderPainted(false);
        btn_9.setContentAreaFilled(false);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 40, 40));

        btn_dividir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_dividir.setForeground(new java.awt.Color(55, 62, 71));
        btn_dividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_dividir.setText("/");
        btn_dividir.setBorder(null);
        btn_dividir.setBorderPainted(false);
        btn_dividir.setContentAreaFilled(false);
        btn_dividir.setFocusPainted(false);
        btn_dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 40, 40));

        btn_porcentaje.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(55, 62, 71));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setBorder(null);
        btn_porcentaje.setBorderPainted(false);
        btn_porcentaje.setContentAreaFilled(false);
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 40, 40));

        btn_multiplicar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_multiplicar.setForeground(new java.awt.Color(55, 62, 71));
        btn_multiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_multiplicar.setText("x");
        btn_multiplicar.setBorder(null);
        btn_multiplicar.setBorderPainted(false);
        btn_multiplicar.setContentAreaFilled(false);
        btn_multiplicar.setFocusPainted(false);
        btn_multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 40));

        btn_restar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_restar.setForeground(new java.awt.Color(55, 62, 71));
        btn_restar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_restar.setText("-");
        btn_restar.setBorder(null);
        btn_restar.setBorderPainted(false);
        btn_restar.setContentAreaFilled(false);
        btn_restar.setFocusPainted(false);
        btn_restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_restar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 40, 40));

        btn_sumar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_sumar.setForeground(new java.awt.Color(55, 62, 71));
        btn_sumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_sumar.setText("+");
        btn_sumar.setBorder(null);
        btn_sumar.setBorderPainted(false);
        btn_sumar.setContentAreaFilled(false);
        btn_sumar.setFocusPainted(false);
        btn_sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 40, 40));

        btn_borrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(55, 62, 71));
        btn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_borrar.setText("c");
        btn_borrar.setBorder(null);
        btn_borrar.setBorderPainted(false);
        btn_borrar.setContentAreaFilled(false);
        btn_borrar.setFocusPainted(false);
        btn_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        btn_7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setBorderPainted(false);
        btn_7.setContentAreaFilled(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, 40));

        btn_8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setBorderPainted(false);
        btn_8.setContentAreaFilled(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 40, 40));

        btn_6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setBorderPainted(false);
        btn_6.setContentAreaFilled(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, 40));

        btn_4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setBorderPainted(false);
        btn_4.setContentAreaFilled(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 40, 40));

        btn_5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setBorderPainted(false);
        btn_5.setContentAreaFilled(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 40, 40));

        btn_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setBorderPainted(false);
        btn_3.setContentAreaFilled(false);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 40, 40));

        btn_1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setBorderPainted(false);
        btn_1.setContentAreaFilled(false);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 40, 40));

        btn_2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setBorderPainted(false);
        btn_2.setContentAreaFilled(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 40, 40));

        btn_0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setBorderPainted(false);
        btn_0.setContentAreaFilled(false);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 40, 40));

        btn_punto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(55, 62, 71));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circulon.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setBorder(null);
        btn_punto.setBorderPainted(false);
        btn_punto.setContentAreaFilled(false);
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulob.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        numero2 = Integer.parseInt(txt_operacion.getText().substring(txt_operacion.getText().indexOf(signo) + 2));//Busca el signo o la operacion que se realiza
    switch (signo) {
        case "+":
            txt_resultado.setText(Integer.toString(numero1 + numero2));
            break;
        case "-":
            txt_resultado.setText(Integer.toString(numero1 - numero2));
            break;
        case "/":
            txt_resultado.setText(Integer.toString(numero1 / numero2));
            break;
        case "*":
            txt_resultado.setText(Integer.toString(numero1 * numero2));
            break;          
    }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
      txt_operacion.setText(txt_operacion.getText()+"9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        numero1 = Integer.parseInt(txt_operacion.getText());
        signo = "/";
        txt_operacion.setText(numero1 + " / ");
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        numero1 = Integer.parseInt(txt_operacion.getText());
        signo = "*";
        txt_operacion.setText(numero1 + " * ");
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restarActionPerformed
        numero1 = Integer.parseInt(txt_operacion.getText());
        signo = "-";
        txt_operacion.setText(numero1 + " - ");
    }//GEN-LAST:event_btn_restarActionPerformed

    private void btn_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumarActionPerformed
        numero1 = Integer.parseInt(txt_operacion.getText());
        signo = "+";
        txt_operacion.setText(numero1 + " + ");
    }//GEN-LAST:event_btn_sumarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        txt_operacion.setText("");
        txt_resultado.setText("");
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+ "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+ "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+ "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+ "4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+ "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+ "3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+ "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        txt_operacion.setText(txt_operacion.getText()+ "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        txt_operacion.setText(txt_operacion.getText() + "0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        txt_operacion.setText(txt_operacion.getText()+".");

    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        numero1 = Integer.parseInt(txt_operacion.getText());
        signo = "%";
        txt_operacion.setText(numero1 + " % ");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

 
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_restar;
    private javax.swing.JButton btn_sumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_operacion;
    private javax.swing.JLabel txt_resultado;
    // End of variables declaration//GEN-END:variables
}
