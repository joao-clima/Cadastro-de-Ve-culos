package view;

import Controller.ControleVeiculo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Veiculo;

public class VeiculoFrm extends javax.swing.JFrame {

    ControleVeiculo ctrlv1 = new ControleVeiculo();

    public VeiculoFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnManutencao = new javax.swing.JButton();
        btnBom = new javax.swing.JButton();
        btnQuebrado = new javax.swing.JButton();
        cmbStatus = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMarca.setText("Marca:");

        lblModelo.setText("Modelo:");

        lblCor.setText("Cor:");

        lblPlaca.setText("Placa:");

        lblAno.setText("Ano:");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Cor", "Ano", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVeiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVeiculos);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblStatus.setText("Status:");

        btnManutencao.setText("Buscar em Manutenção");
        btnManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManutencaoActionPerformed(evt);
            }
        });

        btnBom.setText("Buscar Bons");
        btnBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBomActionPerformed(evt);
            }
        });

        btnQuebrado.setText("Buscar Quebrados");
        btnQuebrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuebradoActionPerformed(evt);
            }
        });

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Bom", "Manutenção", "Quebrado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnManutencao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuebrado)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMarca)
                            .addComponent(lblPlaca)
                            .addComponent(lblModelo)
                            .addComponent(lblCor)
                            .addComponent(lblAno)
                            .addComponent(lblStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAno)
                            .addComponent(txtCor)
                            .addComponent(txtModelo)
                            .addComponent(txtMarca)
                            .addComponent(txtPlaca)
                            .addComponent(cmbStatus, 0, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaca))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelo))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCor))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnExcluir)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpar)
                    .addComponent(btnManutencao)
                    .addComponent(btnBom)
                    .addComponent(btnQuebrado))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        boolean inseriu = false;
            try {
                        if (this.txtMarca.getText().isEmpty() || this.txtAno.getText().isEmpty() || this.txtModelo.getText().isEmpty() || this.txtPlaca.getText().isEmpty() || this.txtCor.getText().isEmpty() || this.cmbStatus.getSelectedItem() == "") {
                            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                        }else{
                            inseriu = ctrlv1.insereVeiculo(this.txtPlaca.getText(), this.txtMarca.getText(), this.txtModelo.getText(), this.txtCor.getText(), Integer.parseInt(this.txtAno.getText()), (String) this.cmbStatus.getSelectedItem());
                        }
            } catch (SQLException ex) {
                //Logger.getLogger(VeiculoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (inseriu) {
                JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
                this.txtPlaca.setText("");
                this.txtMarca.setText("");
                this.txtModelo.setText("");
                this.txtCor.setText("");
                this.txtAno.setText("");    
                this.cmbStatus.setSelectedItem("");
                btnBuscarActionPerformed(evt);
            }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        boolean excluiu = false;
        
        try{          
            int i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja exlcuir?");
            if(i == JOptionPane.YES_OPTION) {
                excluiu = ctrlv1.excluiVeiculo(this.txtPlaca.getText(), this.txtMarca.getText(), this.txtModelo.getText(), this.txtCor.getText(), Integer.parseInt(this.txtAno.getText()), (String) this.cmbStatus.getSelectedItem());
            }
            else if(i == JOptionPane.NO_OPTION) {
                excluiu = false;
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
            }
            else if(i == JOptionPane.CANCEL_OPTION) {
                excluiu = false;
            }
        }catch (SQLException ex){            
        }
        if(excluiu){
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");        
            this.txtPlaca.setText("");
            this.txtMarca.setText("");
            this.txtModelo.setText("");
            this.txtCor.setText("");
            this.txtAno.setText("");
            this.cmbStatus.setSelectedItem("");
            ((DefaultTableModel) tblVeiculos.getModel()).removeRow(tblVeiculos.getSelectedRow());
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            DefaultTableModel dados = (DefaultTableModel) tblVeiculos.getModel();
            dados.setNumRows(0);
            ArrayList lista = ctrlv1.buscarVeiculo();
            Iterator it = lista.iterator();
            while (it.hasNext()){
                Veiculo v1 = (Veiculo) it.next();
                dados.addRow(new Object[]{v1.getPlaca(), v1.getMarca(), v1.getModelo(), v1.getCor(), v1.getAno(), v1.getStatus()});
            }
        }catch(SQLException ex){
            //Logger.getLogger(VeiculoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.txtPlaca.setText("");
        this.txtMarca.setText("");
        this.txtModelo.setText("");
        this.txtCor.setText("");
        this.txtAno.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeiculosMouseClicked
        txtPlaca.setText((String) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 0));
        txtMarca.setText((String) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 1));
        txtModelo.setText((String) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 2));
        txtCor.setText((String) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 3));
        txtAno.setText((Integer.toString((int) tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 4))));  
        cmbStatus.setSelectedItem(tblVeiculos.getValueAt(tblVeiculos.getSelectedRow(), 5));
    }//GEN-LAST:event_tblVeiculosMouseClicked

    private void btnManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManutencaoActionPerformed
        try{
                DefaultTableModel dados = (DefaultTableModel) tblVeiculos.getModel();
                dados.setNumRows(0);
                ArrayList lista = ctrlv1.buscarManutencao();
                Iterator it = lista.iterator();
                while (it.hasNext()){
                    Veiculo v1 = (Veiculo) it.next();
                    dados.addRow(new Object[]{v1.getPlaca(), v1.getMarca(), v1.getModelo(), v1.getCor(), v1.getAno(), v1.getStatus()});
                }
        }catch(SQLException ex){
            //Logger.getLogger(VeiculoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnManutencaoActionPerformed

    private void btnBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBomActionPerformed
        try{
                DefaultTableModel dados = (DefaultTableModel) tblVeiculos.getModel();
                dados.setNumRows(0);
                ArrayList lista = ctrlv1.buscarBom();
                Iterator it = lista.iterator();
                while (it.hasNext()){
                    Veiculo v1 = (Veiculo) it.next();
                    dados.addRow(new Object[]{v1.getPlaca(), v1.getMarca(), v1.getModelo(), v1.getCor(), v1.getAno(), v1.getStatus()});
                }
        }catch(SQLException ex){
            //Logger.getLogger(VeiculoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBomActionPerformed

    private void btnQuebradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuebradoActionPerformed
        try{
                DefaultTableModel dados = (DefaultTableModel) tblVeiculos.getModel();
                dados.setNumRows(0);
                ArrayList lista = ctrlv1.buscarQuebrado();
                Iterator it = lista.iterator();
                while (it.hasNext()){
                    Veiculo v1 = (Veiculo) it.next();
                    dados.addRow(new Object[]{v1.getPlaca(), v1.getMarca(), v1.getModelo(), v1.getCor(), v1.getAno(), v1.getStatus()});
                }
        }catch(SQLException ex){
            //Logger.getLogger(VeiculoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQuebradoActionPerformed

        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculoFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBom;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnManutencao;
    private javax.swing.JButton btnQuebrado;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
