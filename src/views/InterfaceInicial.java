package views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.participanteDao;
import model.bean.Participante;
import model.bean.Sala;
import model.bean.SalaCafe;
import model.bean.SalaEstudo;
import model.dao.salaCafeDao;
import model.dao.salaEstudoDao;

public class InterfaceInicial extends javax.swing.JFrame {

    public InterfaceInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        painelGuias = new javax.swing.JTabbedPane();
        guiaCadastroP = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtSNome = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaParticipantes = new javax.swing.JTable();
        guiaCadastroS = new javax.swing.JPanel();
        txtNomeSala = new javax.swing.JTextField();
        txtLotacao = new javax.swing.JTextField();
        cadastraSala = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaE = new javax.swing.JTable();
        guiaCadastroC = new javax.swing.JPanel();
        guiaCadastroS1 = new javax.swing.JPanel();
        txtNomeSalaC = new javax.swing.JTextField();
        txtLotacaoC = new javax.swing.JTextField();
        cadastraSalaC = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaSalaC = new javax.swing.JTable();
        guiaConsulta = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.setText("Nome");
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtSNome.setText("Sobrenome");
        txtSNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSNomeMouseClicked(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseClicked(evt);
            }
        });
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        tabelaParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaParticipantes);
        if (tabelaParticipantes.getColumnModel().getColumnCount() > 0) {
            tabelaParticipantes.getColumnModel().getColumn(0).setMinWidth(60);
            tabelaParticipantes.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        javax.swing.GroupLayout guiaCadastroPLayout = new javax.swing.GroupLayout(guiaCadastroP);
        guiaCadastroP.setLayout(guiaCadastroPLayout);
        guiaCadastroPLayout.setHorizontalGroup(
            guiaCadastroPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastroPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiaCadastroPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(guiaCadastroPLayout.createSequentialGroup()
                        .addGroup(guiaCadastroPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSNome, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(botaoCadastrar)
                            .addComponent(txtNome))
                        .addGap(0, 575, Short.MAX_VALUE)))
                .addContainerGap())
        );
        guiaCadastroPLayout.setVerticalGroup(
            guiaCadastroPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastroPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtSNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCadastrar)
                .addGap(17, 17, 17))
        );

        painelGuias.addTab("Cadastro Participantes", guiaCadastroP);

        txtNomeSala.setText("Nome");
        txtNomeSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeSalaActionPerformed(evt);
            }
        });

        txtLotacao.setText("Lotação");

        cadastraSala.setText("Cadastrar");
        cadastraSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraSalaActionPerformed(evt);
            }
        });

        tabelaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Lotação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaE);
        if (tabelaE.getColumnModel().getColumnCount() > 0) {
            tabelaE.getColumnModel().getColumn(0).setResizable(false);
            tabelaE.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout guiaCadastroSLayout = new javax.swing.GroupLayout(guiaCadastroS);
        guiaCadastroS.setLayout(guiaCadastroSLayout);
        guiaCadastroSLayout.setHorizontalGroup(
            guiaCadastroSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastroSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiaCadastroSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(guiaCadastroSLayout.createSequentialGroup()
                        .addGroup(guiaCadastroSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guiaCadastroSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNomeSala)
                                .addComponent(txtLotacao, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(cadastraSala))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        guiaCadastroSLayout.setVerticalGroup(
            guiaCadastroSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastroSLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastraSala)
                .addGap(16, 16, 16))
        );

        painelGuias.addTab("Cadastro Salas", guiaCadastroS);

        txtNomeSalaC.setText("Nome");
        txtNomeSalaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeSalaCActionPerformed(evt);
            }
        });

        txtLotacaoC.setText("Lotação");

        cadastraSalaC.setText("Cadastrar");
        cadastraSalaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraSalaCActionPerformed(evt);
            }
        });

        tabelaSalaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Lotação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaSalaC);
        if (tabelaSalaC.getColumnModel().getColumnCount() > 0) {
            tabelaSalaC.getColumnModel().getColumn(0).setResizable(false);
            tabelaSalaC.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout guiaCadastroS1Layout = new javax.swing.GroupLayout(guiaCadastroS1);
        guiaCadastroS1.setLayout(guiaCadastroS1Layout);
        guiaCadastroS1Layout.setHorizontalGroup(
            guiaCadastroS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastroS1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guiaCadastroS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(guiaCadastroS1Layout.createSequentialGroup()
                        .addGroup(guiaCadastroS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guiaCadastroS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNomeSalaC)
                                .addComponent(txtLotacaoC, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(cadastraSalaC))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        guiaCadastroS1Layout.setVerticalGroup(
            guiaCadastroS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastroS1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeSalaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLotacaoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastraSalaC)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout guiaCadastroCLayout = new javax.swing.GroupLayout(guiaCadastroC);
        guiaCadastroC.setLayout(guiaCadastroCLayout);
        guiaCadastroCLayout.setHorizontalGroup(
            guiaCadastroCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
            .addGroup(guiaCadastroCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(guiaCadastroCLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(guiaCadastroS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        guiaCadastroCLayout.setVerticalGroup(
            guiaCadastroCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
            .addGroup(guiaCadastroCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(guiaCadastroCLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(guiaCadastroS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        painelGuias.addTab("Cadastro Café", guiaCadastroC);

        javax.swing.GroupLayout guiaConsultaLayout = new javax.swing.GroupLayout(guiaConsulta);
        guiaConsulta.setLayout(guiaConsultaLayout);
        guiaConsultaLayout.setHorizontalGroup(
            guiaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        guiaConsultaLayout.setVerticalGroup(
            guiaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        painelGuias.addTab("Consulta", guiaConsulta);

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGuias)
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        //Cadastra os participantes

        if (txtNome.getText().equals("")||txtSNome.getText().equals("")){         
            JOptionPane.showMessageDialog(null, "Campo de texto vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;                    
        }        
        
        Participante participante = new Participante();
        participanteDao dao = new participanteDao();
        participante.setNome(txtNome.getText());
        participante.setSobrenome(txtSNome.getText());
        dao.create(participante);
 
//        atualizarTabela();   
        
        txtNome.setText(null);
        txtSNome.setText(null);


    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        txtNome.setText(null);
    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtSNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSNomeMouseClicked
        txtSNome.setText(null);
    }//GEN-LAST:event_txtSNomeMouseClicked

    private void botaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseClicked

    }//GEN-LAST:event_botaoCadastrarMouseClicked

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtNomeSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeSalaActionPerformed

    private void txtNomeSalaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeSalaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeSalaCActionPerformed

    private void cadastraSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraSalaActionPerformed
//        IMPLEMETAR HERANÇA SEXTA FEIRA
        
        if (txtNomeSala.getText().equals("")||txtLotacao.getText().equals("")){         
            JOptionPane.showMessageDialog(null, "Campo de texto vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;                    
        }        
        
        Sala sala = new Sala();
        salaEstudoDao daoe = new salaEstudoDao();
        sala.setNomeSala(txtNomeSala.getText());
        sala.setLotacao(Integer.parseInt(txtLotacao.getText()));
        daoe.create((SalaEstudo) sala);
        
//        Sala.adicionaSala(sala);
 
//        atualizarTabelaEstudo();   
        
        txtNomeSala.setText(null);
        txtLotacao.setText(null);
    }//GEN-LAST:event_cadastraSalaActionPerformed

    private void cadastraSalaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraSalaCActionPerformed
        if (txtNomeSalaC.getText().equals("")||txtLotacaoC.getText().equals("")){         
            JOptionPane.showMessageDialog(null, "Campo de texto vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;                    
        }        
        
        Sala sala = new Sala();
        salaCafeDao daoc = new salaCafeDao();
        sala.setNomeSala(txtNomeSala.getText());
        sala.setLotacao(Integer.parseInt(txtLotacao.getText()));
        daoc.create((SalaCafe) sala);
        
//        Sala.adicionaSala(sala);
 
//        atualizarTabelaEstudo();   
        
        txtNomeSalaC.setText(null);
        txtLotacaoC.setText(null);
    
    }//GEN-LAST:event_cadastraSalaCActionPerformed

    //Insere os usuários cadastrados na tabela
    private void atualizarTabela() {
        DefaultTableModel dtmdadosTabela = (DefaultTableModel) tabelaParticipantes.getModel();
        dtmdadosTabela.setRowCount(0);
        for (Participante participante : Participante.getParticipante()) {
            Object[] dados = {participante.getId(), participante.getNome(), participante.getSobrenome()};
            dtmdadosTabela.addRow(dados);
        }
    }

    private void atualizarTabelaEstudo(){
        DefaultTableModel dtmdadosTabela = (DefaultTableModel) tabelaE.getModel();
        dtmdadosTabela.setRowCount(0);
        for (Sala sala : Sala.getSala()) {
            Object[] dados = {sala.getNomeSala(), sala.getLotacao()};
            dtmdadosTabela.addRow(dados);
        }
    }
    private void atualizarTabelaCafe(){
        DefaultTableModel dtmdadosTabela = (DefaultTableModel) tabelaSalaC.getModel();
        dtmdadosTabela.setRowCount(0);
        for (Sala sala : Sala.getSala()) {
            Object[] dados = {sala.getNomeSala(), sala.getLotacao()};
            dtmdadosTabela.addRow(dados);
        }
    }
    
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton cadastraSala;
    private javax.swing.JButton cadastraSalaC;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel guiaCadastroC;
    private javax.swing.JPanel guiaCadastroP;
    private javax.swing.JPanel guiaCadastroS;
    private javax.swing.JPanel guiaCadastroS1;
    private javax.swing.JPanel guiaConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JTable tabelaE;
    private javax.swing.JTable tabelaParticipantes;
    private javax.swing.JTable tabelaSalaC;
    private javax.swing.JTextField txtLotacao;
    private javax.swing.JTextField txtLotacaoC;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeSala;
    private javax.swing.JTextField txtNomeSalaC;
    private javax.swing.JTextField txtSNome;
    // End of variables declaration//GEN-END:variables
}
