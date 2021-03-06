/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tads4.sistemasroupas.views;

/**
 *
 * @author robson
 */
public class FormPesquisarEditarClientes extends javax.swing.JFrame {

    /**
     * Creates new form FormPesquisarClientes
     */
    public FormPesquisarEditarClientes() {
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

        jPanelPesquisar = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jPanelCadastrar = new javax.swing.JPanel();
        jLabelNome1 = new javax.swing.JLabel();
        jTextFieldNome1 = new javax.swing.JTextField();
        jLabelRg = new javax.swing.JLabel();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jLabelCpf = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabelSexo = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jLabelDataNascimento = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jPanelTelefones = new javax.swing.JPanel();
        jScrollPaneTelefones = new javax.swing.JScrollPane();
        jTableTelefones = new javax.swing.JTable();
        jButtonTelefone = new javax.swing.JButton();
        jPanelEmails = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmails = new javax.swing.JTable();
        jButtonEmail = new javax.swing.JButton();
        jPanelEnderecos = new javax.swing.JPanel();
        jScrollPanelEnderecos = new javax.swing.JScrollPane();
        jTableEnderecos = new javax.swing.JTable();
        jButtonEndereco = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Clientes");

        jPanelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Clientes"));

        jLabelNome.setText("Nome:");

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelId.setText("ID:");

        javax.swing.GroupLayout jPanelPesquisarLayout = new javax.swing.GroupLayout(jPanelPesquisar);
        jPanelPesquisar.setLayout(jPanelPesquisarLayout);
        jPanelPesquisarLayout.setHorizontalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisarLayout.createSequentialGroup()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPesquisarLayout.setVerticalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButtonPesquisar))
        );

        jPanelCadastrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanelCadastrar.setPreferredSize(new java.awt.Dimension(960, 104));

        jLabelNome1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNome1.setText("Nome:");
        jLabelNome1.setToolTipText("");

        jLabelRg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRg.setText("RG:");

        try {
            jFormattedTextFieldRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCpf.setText("CPF:");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSexo.setText("Sexo:");

        jRadioButtonMasculino.setText("Masculino");
        jRadioButtonMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMasculinoActionPerformed(evt);
            }
        });

        jRadioButtonFeminino.setText("Feminino");

        jLabelDataNascimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDataNascimento.setText("Data de Nascimento:");

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataNascimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastrarLayout = new javax.swing.GroupLayout(jPanelCadastrar);
        jPanelCadastrar.setLayout(jPanelCadastrarLayout);
        jPanelCadastrarLayout.setHorizontalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSexo)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jRadioButtonFeminino)
                .addGap(15, 15, 15))
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadastrarLayout.setVerticalGroup(
            jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarLayout.createSequentialGroup()
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome1)
                    .addComponent(jTextFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRg)
                    .addComponent(jLabelCpf)
                    .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSexo)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFeminino))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDataNascimento)
                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelTelefones.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefones"));
        jPanelTelefones.setPreferredSize(new java.awt.Dimension(473, 148));

        jTableTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Telefone", "Deletar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTelefones.setToolTipText("");
        jTableTelefones.setRowSelectionAllowed(false);
        jTableTelefones.getTableHeader().setReorderingAllowed(false);
        jScrollPaneTelefones.setViewportView(jTableTelefones);
        if (jTableTelefones.getColumnModel().getColumnCount() > 0) {
            jTableTelefones.getColumnModel().getColumn(0).setResizable(false);
            jTableTelefones.getColumnModel().getColumn(0).setPreferredWidth(360);
            jTableTelefones.getColumnModel().getColumn(1).setResizable(false);
            jTableTelefones.getColumnModel().getColumn(1).setPreferredWidth(3);
        }

        jButtonTelefone.setText("Adicionar Telefone");
        jButtonTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTelefonesLayout = new javax.swing.GroupLayout(jPanelTelefones);
        jPanelTelefones.setLayout(jPanelTelefonesLayout);
        jPanelTelefonesLayout.setHorizontalGroup(
            jPanelTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelefonesLayout.createSequentialGroup()
                .addGroup(jPanelTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTelefone))
                .addGap(20, 20, 20))
        );
        jPanelTelefonesLayout.setVerticalGroup(
            jPanelTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelefonesLayout.createSequentialGroup()
                .addComponent(jScrollPaneTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonTelefone))
        );

        jPanelEmails.setBorder(javax.swing.BorderFactory.createTitledBorder("Emails"));
        jPanelEmails.setPreferredSize(new java.awt.Dimension(473, 122));

        jTableEmails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Email", "Deletar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmails.setPreferredSize(new java.awt.Dimension(162, 192));
        jTableEmails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableEmails);
        if (jTableEmails.getColumnModel().getColumnCount() > 0) {
            jTableEmails.getColumnModel().getColumn(0).setResizable(false);
            jTableEmails.getColumnModel().getColumn(0).setPreferredWidth(370);
            jTableEmails.getColumnModel().getColumn(1).setResizable(false);
            jTableEmails.getColumnModel().getColumn(1).setPreferredWidth(3);
        }

        jButtonEmail.setLabel("Adicionar Email");
        jButtonEmail.setPreferredSize(new java.awt.Dimension(121, 23));

        javax.swing.GroupLayout jPanelEmailsLayout = new javax.swing.GroupLayout(jPanelEmails);
        jPanelEmails.setLayout(jPanelEmailsLayout);
        jPanelEmailsLayout.setHorizontalGroup(
            jPanelEmailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
            .addGroup(jPanelEmailsLayout.createSequentialGroup()
                .addComponent(jButtonEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelEmailsLayout.setVerticalGroup(
            jPanelEmailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmailsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelEnderecos.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereços"));

        jTableEnderecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "País", "UF", "Cidade", "Bairro", "CEP", "Rua", "Complemento", "Número", "Deletar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEnderecos.setMaximumSize(new java.awt.Dimension(200, 64));
        jTableEnderecos.setPreferredSize(new java.awt.Dimension(162, 192));
        jTableEnderecos.getTableHeader().setReorderingAllowed(false);
        jScrollPanelEnderecos.setViewportView(jTableEnderecos);
        if (jTableEnderecos.getColumnModel().getColumnCount() > 0) {
            jTableEnderecos.getColumnModel().getColumn(0).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableEnderecos.getColumnModel().getColumn(1).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTableEnderecos.getColumnModel().getColumn(2).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(2).setPreferredWidth(119);
            jTableEnderecos.getColumnModel().getColumn(3).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(3).setPreferredWidth(198);
            jTableEnderecos.getColumnModel().getColumn(4).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(4).setPreferredWidth(79);
            jTableEnderecos.getColumnModel().getColumn(5).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(5).setPreferredWidth(237);
            jTableEnderecos.getColumnModel().getColumn(6).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(6).setPreferredWidth(129);
            jTableEnderecos.getColumnModel().getColumn(7).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTableEnderecos.getColumnModel().getColumn(8).setResizable(false);
            jTableEnderecos.getColumnModel().getColumn(8).setPreferredWidth(45);
        }

        jButtonEndereco.setText("Adicionar Endereço");

        javax.swing.GroupLayout jPanelEnderecosLayout = new javax.swing.GroupLayout(jPanelEnderecos);
        jPanelEnderecos.setLayout(jPanelEnderecosLayout);
        jPanelEnderecosLayout.setHorizontalGroup(
            jPanelEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecosLayout.createSequentialGroup()
                .addComponent(jButtonEndereco)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPanelEnderecos)
        );
        jPanelEnderecosLayout.setVerticalGroup(
            jPanelEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecosLayout.createSequentialGroup()
                .addComponent(jScrollPanelEnderecos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonEndereco))
        );

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 0, 0));
        jButtonCancelar.setText("Cancelar");

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(0, 153, 0));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelEmails, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelEnderecos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelEmails, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jPanelTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEnderecos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jRadioButtonMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMasculinoActionPerformed

    private void jFormattedTextFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataNascimentoActionPerformed

    private void jButtonTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTelefoneActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(FormPesquisarEditarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesquisarEditarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesquisarEditarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesquisarEditarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesquisarEditarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEmail;
    private javax.swing.JButton jButtonEndereco;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonTelefone;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanelCadastrar;
    private javax.swing.JPanel jPanelEmails;
    private javax.swing.JPanel jPanelEnderecos;
    private javax.swing.JPanel jPanelPesquisar;
    private javax.swing.JPanel jPanelTelefones;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTelefones;
    private javax.swing.JScrollPane jScrollPanelEnderecos;
    private javax.swing.JTable jTableEmails;
    private javax.swing.JTable jTableEnderecos;
    private javax.swing.JTable jTableTelefones;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNome1;
    // End of variables declaration//GEN-END:variables
}
