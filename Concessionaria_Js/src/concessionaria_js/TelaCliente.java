package concessionaria_js;

import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// @author JoseV
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public TelaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnPreencher = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAdicionarCliente = new javax.swing.JButton();
        btnRemoverCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        txCPF = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txDataNascimento = new javax.swing.JTextField();
        txEndereco = new javax.swing.JTextField();
        txEstado = new javax.swing.JTextField();
        txCep = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txHistoricoCompras = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbClientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnLimparCliente = new javax.swing.JButton();
        btnAtualizarCliente = new javax.swing.JButton();
        txId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(7, 7, 7));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administração Concessionaria");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Concessionaria JS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnPreencher.setBackground(new java.awt.Color(51, 51, 51));
        btnPreencher.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnPreencher.setForeground(new java.awt.Color(255, 255, 255));
        btnPreencher.setText("Preencher cliente");
        btnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lista-Clientes");

        btnAdicionarCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarCliente.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnAdicionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarCliente.setText("Adicionar cliente");
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });

        btnRemoverCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnRemoverCliente.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnRemoverCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverCliente.setText("Remover cliente");
        btnRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOME:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ENDEREÇO:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CEP:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ESTADO:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EMAIL:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TELEFONE:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("HISTORICO COMPRAS:");

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DATA NASCIMENTO:");

        txNome.setBackground(new java.awt.Color(51, 51, 51));
        txNome.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txNome.setForeground(new java.awt.Color(255, 255, 255));
        txNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeActionPerformed(evt);
            }
        });

        txCPF.setBackground(new java.awt.Color(51, 51, 51));
        txCPF.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txCPF.setForeground(new java.awt.Color(255, 255, 255));

        txEmail.setBackground(new java.awt.Color(51, 51, 51));
        txEmail.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txEmail.setForeground(new java.awt.Color(255, 255, 255));

        txTelefone.setBackground(new java.awt.Color(51, 51, 51));
        txTelefone.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txTelefone.setForeground(new java.awt.Color(255, 255, 255));

        txDataNascimento.setBackground(new java.awt.Color(51, 51, 51));
        txDataNascimento.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txDataNascimento.setForeground(new java.awt.Color(255, 255, 255));

        txEndereco.setBackground(new java.awt.Color(51, 51, 51));
        txEndereco.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txEndereco.setForeground(new java.awt.Color(255, 255, 255));

        txEstado.setBackground(new java.awt.Color(51, 51, 51));
        txEstado.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txEstado.setForeground(new java.awt.Color(255, 255, 255));

        txCep.setBackground(new java.awt.Color(51, 51, 51));
        txCep.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txCep.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        txHistoricoCompras.setBackground(new java.awt.Color(51, 51, 51));
        txHistoricoCompras.setColumns(20);
        txHistoricoCompras.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        txHistoricoCompras.setForeground(new java.awt.Color(255, 255, 255));
        txHistoricoCompras.setRows(5);
        jScrollPane1.setViewportView(txHistoricoCompras);

        TbClientes.setBackground(new java.awt.Color(51, 51, 51));
        TbClientes.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        TbClientes.setForeground(new java.awt.Color(255, 255, 255));
        TbClientes.setModel(MontarTabela());
        jScrollPane2.setViewportView(TbClientes);

        jScrollPane3.setViewportView(jScrollPane2);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user_13333085.png"))); // NOI18N

        btnLimparCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnLimparCliente.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnLimparCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparCliente.setText("Limpar cliente");
        btnLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparClienteActionPerformed(evt);
            }
        });

        btnAtualizarCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarCliente.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnAtualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarCliente.setText("Atualizar cliente");
        btnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClienteActionPerformed(evt);
            }
        });

        txId.setEditable(false);
        txId.setBackground(new java.awt.Color(51, 51, 51));
        txId.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txId.setForeground(new java.awt.Color(255, 255, 255));
        txId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID:");

        btnVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnVoltar.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txDataNascimento)
                                    .addComponent(txTelefone)
                                    .addComponent(txEmail)
                                    .addComponent(txCep)
                                    .addComponent(txEstado)
                                    .addComponent(txEndereco)
                                    .addComponent(txCPF)
                                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(309, 309, 309)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRemoverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPreencher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherActionPerformed
        int selectedRow = TbClientes.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um cliente na tabela.");
            return;
        }

        // Obter o valor da célula da coluna 0 (que presumimos ser o ID do cliente)
        Object idObj = TbClientes.getValueAt(selectedRow, 0);

        // Verificar se o valor é nulo ou não é Integer
        if (idObj == null || !(idObj instanceof Integer)) {
            JOptionPane.showMessageDialog(null, "O ID do cliente selecionado não é um número válido.");
            return;
        }

        // Converter o valor para Integer de maneira segura
        int idCliente = (Integer) idObj;

        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o ClienteDao com a conexão obtida
            ClienteDao clienteDao = new ClienteDao(conn);

            // Busca o cliente pelo ID
            Cliente cliente = clienteDao.buscarClientePorId(idCliente);

            // Preenche os campos de texto com os dados do cliente encontrado
            txId.setText(String.valueOf(cliente.getId())); // ID
            txNome.setText(cliente.getNome()); // Nome
            txCPF.setText(cliente.getCPF()); // CPF
            txEndereco.setText(cliente.getEndereco()); // Endereço
            txEstado.setText(cliente.getEstado()); // Estado
            txCep.setText(cliente.getCep()); // CEP
            txEmail.setText(cliente.getEmail()); // Email
            txTelefone.setText(cliente.getTelefone()); // Telefone
            txHistoricoCompras.setText(cliente.getHistoricoCompras()); // Histórico de Compras
            txDataNascimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(cliente.getDataNascimento())); // Data de Nascimento

            // Fecha a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            // Exibe uma mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao buscar cliente: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPreencherActionPerformed

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed
        String nome = txNome.getText();
        String cpf = txCPF.getText();
        String endereco = txEndereco.getText();
        String estado = txEstado.getText();
        String cep = txCep.getText();
        String email = txEmail.getText();
        String telefone = txTelefone.getText();
        String dataNascimento = txDataNascimento.getText();
        String historicoCompras = txHistoricoCompras.getText();

        // Verifica se todos os campos obrigatórios estão preenchidos
        if (nome.isEmpty() || cpf.isEmpty() || endereco.isEmpty() || estado.isEmpty() || cep.isEmpty() || email.isEmpty() || telefone.isEmpty() || dataNascimento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação do CPF
        if (!validarCPF(cpf)) {
            JOptionPane.showMessageDialog(this, "CPF inválido. Por favor, insira um CPF válido no formato XXX.XXX.XXX-XX.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação do telefone
        if (!validarTelefone(telefone)) {
            JOptionPane.showMessageDialog(this, "Número de telefone inválido. Por favor, insira no formato (xx) xxxxx-xxxx.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação da data de nascimento
        SimpleDateFormat sdfInput = new SimpleDateFormat("dd/MM/yyyy");
        sdfInput.setLenient(false); // Não permitir datas inválidas como 30/02/2024
        Date dataNasc;
        try {
            dataNasc = sdfInput.parse(dataNascimento);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato inválido para a data de nascimento. Utilize o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Cria um objeto Cliente com os dados fornecidos
            Cliente cliente = new Cliente(0, nome, cpf, endereco, estado, cep, email, telefone, historicoCompras, dataNasc);

            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o ClienteDao com a conexão obtida
            ClienteDao clienteDao = new ClienteDao(conn);

            // Chama o método inserirCliente do ClienteDao para adicionar o cliente ao banco de dados
            clienteDao.inserirCliente(cliente);

            // Exibe uma mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Limpa os campos após cadastrar o cliente
            limparCampos();

            // Atualiza a tabela de clientes após adicionar um novo cliente
            atualizarTabelaClientes();

            // Fecha a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            // Exibe uma mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar cliente: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

// Método para validar número de telefone no formato (xx) xxxxx-xxxx
    private boolean validarTelefone(String telefone) {
        // Remove caracteres não numéricos, exceto parênteses, espaços e hífen
        telefone = telefone.replaceAll("[^0-9()\\s-]", "");

        // Verifica se o telefone possui pelo menos 10 dígitos (contando parênteses e hífen)
        if (telefone.length() < 10) {
            return false;
        }

        // Verifica se o telefone está no formato (xx) xxxxx-xxxx ou xx xxxxx-xxxx
        if (!telefone.matches("\\(\\d{2}\\)\\s?\\d{5}-\\d{4}")) {
            return false;
        }

        return true;
    }

// Função para validar CPF
    private boolean validarCPF(String cpf) {
        // Expressão regular para validar CPF no formato XXX.XXX.XXX-XX
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (!cpf.matches(regex)) {
            return false;
        }

        return true; // Temporário: considera como válido sempre
    }

// Método para limpar os campos de texto após adicionar um cliente
    private void limparCampos() {
        txNome.setText("");
        txCPF.setText("");
        txEndereco.setText("");
        txEstado.setText("");
        txCep.setText("");
        txEmail.setText("");
        txTelefone.setText("");
        txDataNascimento.setText("");
        txHistoricoCompras.setText("");
        txId.setText("");
    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

    private void btnRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverClienteActionPerformed
        int selectedRow = TbClientes.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um cliente na tabela.");
            return;
        }

        // Obter o valor da célula da coluna 0 (ID do cliente)
        Object idObj = TbClientes.getValueAt(selectedRow, 0);

        // Verificar se o valor é nulo
        if (idObj == null) {
            JOptionPane.showMessageDialog(null, "O ID do cliente selecionado não é um número válido.");
            return;
        }

        int idCliente;
        try {
            // Tentar converter o valor para Integer
            idCliente = Integer.parseInt(idObj.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O ID do cliente selecionado não é um número válido.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cliente selecionado?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                ClienteDao cd = new ClienteDao(suaLogicaParaObterConexao());

                boolean excluiuComSucesso = cd.excluirCliente(idCliente);
                if (excluiuComSucesso) {
                    JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                    atualizarTabelaClientes(); // Atualizar a tabela após a exclusão
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na exclusão do cliente!");
                }

                cd.desconectar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir cliente: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRemoverClienteActionPerformed

    private Connection suaLogicaParaObterConexao() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/concessionaria_js";
        String usuario = "root";
        String senha = "36814426";

        return DriverManager.getConnection(url, usuario, senha);
    }


    private void txNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeActionPerformed

    private void btnLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparClienteActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparClienteActionPerformed

    private void btnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClienteActionPerformed
        // Verifica se algum campo obrigatório está vazio
        if (txId.getText().isEmpty() || txNome.getText().isEmpty() || txCPF.getText().isEmpty()
                || txEndereco.getText().isEmpty() || txEstado.getText().isEmpty() || txCep.getText().isEmpty()
                || txEmail.getText().isEmpty() || txTelefone.getText().isEmpty() || txHistoricoCompras.getText().isEmpty()
                || txDataNascimento.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Por favor, Clique no botão preencher antes de atualizar o cliente.", "Campos obrigatórios não preenchidos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Agora continua com a lógica de atualização do cliente
        // Obtém o ID do cliente a partir do campo txId (que deve estar visível e preenchido)
        int idCliente;
        try {
            idCliente = Integer.parseInt(txId.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "O ID do cliente não é um número válido.");
            return;
        }

        // Obter os novos dados dos campos de texto
        String nome = txNome.getText();
        String cpf = txCPF.getText();
        String endereco = txEndereco.getText();
        String estado = txEstado.getText();
        String cep = txCep.getText();
        String email = txEmail.getText();
        String telefone = txTelefone.getText();
        String historicoCompras = txHistoricoCompras.getText();
        String dataNascimento = txDataNascimento.getText();

        // Validação do telefone
        if (!validarTelefone(telefone)) {
            JOptionPane.showMessageDialog(this, "Número de telefone inválido. Por favor, insira no formato (xx) xxxxx-xxxx.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação da data de nascimento
        SimpleDateFormat sdfInput = new SimpleDateFormat("dd/MM/yyyy");
        sdfInput.setLenient(false); // Não permitir datas inválidas como 30/02/2024
        Date dataNasc;
        try {
            dataNasc = sdfInput.parse(dataNascimento);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato inválido para a data de nascimento. Utilize o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Criar um objeto Cliente com os novos dados
        Cliente clienteAtualizado = new Cliente(idCliente, nome, cpf, endereco, estado, cep, email, telefone, historicoCompras, dataNasc);

        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o ClienteDao com a conexão obtida
            ClienteDao clienteDao = new ClienteDao(conn);

            // Chama o método atualizarCliente do ClienteDao para atualizar o cliente no banco de dados
            clienteDao.atualizarCliente(clienteAtualizado);

            // Exibe uma mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Limpa os campos após atualizar o cliente
            limparCampos();

            // Atualiza a tabela de clientes após atualizar o cliente
            atualizarTabelaClientes();

            // Fecha a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            // Exibe uma mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao atualizar cliente: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarClienteActionPerformed

    private void txIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    private DefaultTableModel MontarTabela() {
        String[] colunas = {"ID", "Nome", "Data de Nascimento", "CPF", "ENDEREÇO", "ESTADO", "CEP", "EMAIL", "TELEFONE", "Histórico de Compras"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o ClienteDao com a conexão obtida
            ClienteDao clienteDao = new ClienteDao(conn);

            // Chama o método para listar todos os clientes do banco de dados
            List<Cliente> clientes = clienteDao.listarClientes();

            // Preenche o modelo da tabela com os clientes recuperados do banco de dados
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            for (Cliente cliente : clientes) {
                Object[] linha = {
                    cliente.getId(),
                    cliente.getNome(),
                    sdf.format(cliente.getDataNascimento()),
                    cliente.getCPF(),
                    cliente.getEndereco(),
                    cliente.getEstado(),
                    cliente.getCep(),
                    cliente.getEmail(),
                    cliente.getTelefone(),
                    cliente.getHistoricoCompras()
                };
                model.addRow(linha);
            }

            // Fecha a conexão após o uso
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao consultar clientes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return model;
    }

    private void atualizarTabelaClientes() {
        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o ClienteDao com a conexão obtida
            ClienteDao clienteDao = new ClienteDao(conn);

            // Lista todos os clientes do banco de dados
            List<Cliente> clientes = clienteDao.listarClientes();

            // Obtém o modelo da tabela
            DefaultTableModel model = (DefaultTableModel) TbClientes.getModel();

            // Limpa todas as linhas da tabela antes de atualizar
            model.setRowCount(0);

            // Preenche a tabela com os dados dos clientes
            for (Cliente cliente : clientes) {
                Object[] row = {
                    cliente.getId(),
                    cliente.getNome(),
                    cliente.getDataNascimento(), // Ajuste para a ordem correta dos campos
                    cliente.getCPF(), // Ajuste para a ordem correta dos campos
                    cliente.getEndereco(),
                    cliente.getEstado(),
                    cliente.getCep(),
                    cliente.getEmail(),
                    cliente.getTelefone(),
                    cliente.getHistoricoCompras()
                };
                model.addRow(row);
            }

            // Fecha a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela de clientes: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbClientes;
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnAtualizarCliente;
    private javax.swing.JButton btnLimparCliente;
    private javax.swing.JButton btnPreencher;
    private javax.swing.JButton btnRemoverCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txCPF;
    private javax.swing.JTextField txCep;
    private javax.swing.JTextField txDataNascimento;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txEstado;
    private javax.swing.JTextArea txHistoricoCompras;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables
}
