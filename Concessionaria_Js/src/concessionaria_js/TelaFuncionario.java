package concessionaria_js;
 

import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;


//@author JoseV
public class TelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionario
     */
    public TelaFuncionario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txEmail = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txCargo = new javax.swing.JTextField();
        txEndereco = new javax.swing.JTextField();
        txEstado = new javax.swing.JTextField();
        txCep = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbFuncionarios = new javax.swing.JTable();
        btnRemoverFuncionario = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnLimparFuncionario = new javax.swing.JButton();
        btnAtualizarFuncionario = new javax.swing.JButton();
        txId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnPreencherFuncionario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAdicionarFuncionario = new javax.swing.JButton();
        txNome = new javax.swing.JTextField();
        txCPF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txDataContratacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(7, 7, 7));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txEmail.setBackground(new java.awt.Color(51, 51, 51));
        txEmail.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txEmail.setForeground(new java.awt.Color(255, 255, 255));

        txTelefone.setBackground(new java.awt.Color(51, 51, 51));
        txTelefone.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txTelefone.setForeground(new java.awt.Color(255, 255, 255));

        txCargo.setBackground(new java.awt.Color(51, 51, 51));
        txCargo.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txCargo.setForeground(new java.awt.Color(255, 255, 255));

        txEndereco.setBackground(new java.awt.Color(51, 51, 51));
        txEndereco.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txEndereco.setForeground(new java.awt.Color(255, 255, 255));

        txEstado.setBackground(new java.awt.Color(51, 51, 51));
        txEstado.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txEstado.setForeground(new java.awt.Color(255, 255, 255));

        txCep.setBackground(new java.awt.Color(51, 51, 51));
        txCep.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txCep.setForeground(new java.awt.Color(255, 255, 255));

        TbFuncionarios.setBackground(new java.awt.Color(51, 51, 51));
        TbFuncionarios.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        TbFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        TbFuncionarios.setModel(MontarTabela());
        jScrollPane2.setViewportView(TbFuncionarios);

        jScrollPane3.setViewportView(jScrollPane2);

        btnRemoverFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        btnRemoverFuncionario.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnRemoverFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverFuncionario.setText("Remover Funcionario");
        btnRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFuncionarioActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user_13333085.png"))); // NOI18N

        btnLimparFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        btnLimparFuncionario.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnLimparFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparFuncionario.setText("Limpar Funcionario");
        btnLimparFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFuncionarioActionPerformed(evt);
            }
        });

        btnAtualizarFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarFuncionario.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnAtualizarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarFuncionario.setText("Atualizar Funcionario");
        btnAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncionarioActionPerformed(evt);
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

        btnPreencherFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        btnPreencherFuncionario.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnPreencherFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnPreencherFuncionario.setText("Preencher Funcionario");
        btnPreencherFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherFuncionarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lista-Funcionarios");

        btnAdicionarFuncionario.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarFuncionario.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnAdicionarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarFuncionario.setText("Adicionar Funcionario");
        btnAdicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarFuncionarioActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOME:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ENDEREÇO:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CEP:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ESTADO:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EMAIL:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TELEFONE:");

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cargo:");

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Data Contratacao:");

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Administração Concessionaria");

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 3, 26)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Concessionaria JS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txDataContratacao.setBackground(new java.awt.Color(51, 51, 51));
        txDataContratacao.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txDataContratacao.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(342, 342, 342)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txDataContratacao, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoverFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimparFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAtualizarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPreencherFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnAdicionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPreencherFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txDataContratacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFuncionarioActionPerformed
        int selectedRow = TbFuncionarios.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um funcionário na tabela.");
        return;
    }

    // Obter o valor da célula da coluna 0 (ID do funcionário)
    Object idObj = TbFuncionarios.getValueAt(selectedRow, 0);

    // Verificar se o valor é nulo
    if (idObj == null) {
        JOptionPane.showMessageDialog(null, "O ID do funcionário selecionado não é um número válido.");
        return;
    }

    int idFuncionario;
    try {
        // Tentar converter o valor para Integer
        idFuncionario = Integer.parseInt(idObj.toString());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "O ID do funcionário selecionado não é um número válido.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o funcionário selecionado?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            FuncionarioDao fd = new FuncionarioDao(conn);

            boolean excluiuComSucesso = fd.excluirFuncionario(idFuncionario);
            if (excluiuComSucesso) {
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
                atualizarTabelaFuncionarios(); // Atualizar a tabela após a exclusão
            } else {
                JOptionPane.showMessageDialog(null, "Erro na exclusão do funcionário!");
            }

            // Fecha a conexão após o uso
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnRemoverFuncionarioActionPerformed

    private void btnLimparFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFuncionarioActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparFuncionarioActionPerformed

    private void btnAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFuncionarioActionPerformed
      // Verifica se algum campo obrigatório está vazio
    if (txId.getText().isEmpty() || txNome.getText().isEmpty() || txCPF.getText().isEmpty()
        || txEndereco.getText().isEmpty() || txEstado.getText().isEmpty() || txCep.getText().isEmpty()
        || txEmail.getText().isEmpty() || txTelefone.getText().isEmpty() || txCargo.getText().isEmpty()
        || txDataContratacao.getText().isEmpty()) {

        JOptionPane.showMessageDialog(this, "Por favor, clique no botão preencher antes de atualizar o funcionário.", "Campos obrigatórios não preenchidos", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Agora continua com a lógica de atualização do funcionário
    // Obtém o ID do funcionário a partir do campo txId (que deve estar visível e preenchido)
    int idFuncionario;
    try {
        idFuncionario = Integer.parseInt(txId.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "O ID do funcionário não é um número válido.");
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
    String cargo = txCargo.getText();
    String dataContratacao = txDataContratacao.getText();

    // Validação do telefone
    if (!validarTelefone(telefone)) {
        JOptionPane.showMessageDialog(this, "Número de telefone inválido. Por favor, insira no formato (xx) xxxxx-xxxx.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validação da data de contratação
    SimpleDateFormat sdfInput = new SimpleDateFormat("dd/MM/yyyy");
    sdfInput.setLenient(false); // Não permitir datas inválidas como 30/02/2024
    Date dataContrat;
    try {
        dataContrat = sdfInput.parse(dataContratacao);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Formato inválido para a data de contratação. Utilize o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Criar um objeto Funcionario com os novos dados
    Funcionario funcionarioAtualizado = new Funcionario(idFuncionario, nome, cpf, endereco, estado, cep, email, telefone, dataContrat, cargo);

    try {
        // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();

        // Instancia o FuncionarioDao com a conexão obtida
        FuncionarioDao funcionarioDao = new FuncionarioDao(conn);

        // Chama o método atualizarFuncionario do FuncionarioDao para atualizar o funcionário no banco de dados
        funcionarioDao.atualizarFuncionario(funcionarioAtualizado);

        // Exibe uma mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Funcionário atualizado com sucesso no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        // Limpa os campos após atualizar o funcionário
        limparCampos();

        // Atualiza a tabela de funcionários após atualizar o funcionário
        atualizarTabelaFuncionarios();

        // Fecha a conexão após o uso
        conn.close();

    } catch (SQLException ex) {
        // Exibe uma mensagem de erro caso ocorra uma exceção SQL
        JOptionPane.showMessageDialog(this, "Erro ao atualizar funcionário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAtualizarFuncionarioActionPerformed

    private void txIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPreencherFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherFuncionarioActionPerformed
       int selectedRow = TbFuncionarios.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um funcionário na tabela.");
        return;
    }

    // Obter o valor da célula da coluna 0 (que presumimos ser o ID do funcionário)
    Object idObj = TbFuncionarios.getValueAt(selectedRow, 0);

    // Verificar se o valor é nulo ou não é Integer
    if (idObj == null || !(idObj instanceof Integer)) {
        JOptionPane.showMessageDialog(null, "O ID do funcionário selecionado não é um número válido.");
        return;
    }

    // Converter o valor para Integer de maneira segura
    int idFuncionario = (Integer) idObj;

    try {
        // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();

        // Instancia o FuncionarioDao com a conexão obtida
        FuncionarioDao funcionarioDao = new FuncionarioDao(conn);

        // Busca o funcionário pelo ID
        Funcionario funcionario = funcionarioDao.buscarFuncionarioPorId(idFuncionario);

        // Preenche os campos de texto com os dados do funcionário encontrado
        txId.setText(String.valueOf(funcionario.getId())); // ID
        txNome.setText(funcionario.getNome()); // Nome
        txCPF.setText(funcionario.getCPF()); // CPF
        txEndereco.setText(funcionario.getEndereco()); // Endereço
        txEstado.setText(funcionario.getEstado()); // Estado
        txCep.setText(funcionario.getCep()); // CEP
        txEmail.setText(funcionario.getEmail()); // Email
        txTelefone.setText(funcionario.getTelefone()); // Telefone
        txDataContratacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(funcionario.getDataContratacao())); // Data Contratacao
        txCargo.setText(funcionario.getCargo()); // Cargo

        // Fecha a conexão após o uso
        conn.close();

    } catch (SQLException ex) {
        // Exibe uma mensagem de erro caso ocorra uma exceção SQL
        JOptionPane.showMessageDialog(this, "Erro ao buscar funcionário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnPreencherFuncionarioActionPerformed

    private void btnAdicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarFuncionarioActionPerformed
        String nome = txNome.getText();
    String cpf = txCPF.getText();
    String endereco = txEndereco.getText();
    String estado = txEstado.getText();
    String cep = txCep.getText();
    String email = txEmail.getText();
    String telefone = txTelefone.getText();
    String dataContratacao = txDataContratacao.getText();
    String cargo = txCargo.getText();

    // Verifica se todos os campos obrigatórios estão preenchidos
    if (nome.isEmpty() || cpf.isEmpty() || endereco.isEmpty() || estado.isEmpty() || cep.isEmpty() || email.isEmpty() || telefone.isEmpty() || dataContratacao.isEmpty() || cargo.isEmpty()) {
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

    // Validação da data de contratação
    SimpleDateFormat sdfInput = new SimpleDateFormat("dd/MM/yyyy");
    sdfInput.setLenient(false); // Não permitir datas inválidas como 30/02/2024
    Date dataContr;
    try {
        dataContr = sdfInput.parse(dataContratacao);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Formato inválido para a data de contratação. Utilize o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Cria um objeto Funcionario com os dados fornecidos
        Funcionario funcionario = new Funcionario(0, nome, cpf, endereco, estado, cep, email, telefone, dataContr, cargo);

        // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();

        // Instancia o FuncionarioDao com a conexão obtida
        FuncionarioDao funcionarioDao = new FuncionarioDao(conn);

        // Chama o método inserirFuncionario do FuncionarioDao para adicionar o funcionario ao banco de dados
        funcionarioDao.inserirFuncionario(funcionario);

        // Exibe uma mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        // Limpa os campos após cadastrar o Funcionario
        limparCampos();

        // Atualiza a tabela de Funcionarios após adicionar um novo funcionário
        atualizarTabelaFuncionarios();

        // Fecha a conexão após o uso
        conn.close();

    } catch (SQLException ex) {
        // Exibe uma mensagem de erro caso ocorra uma exceção SQL
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar funcionário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
            txCargo.setText("");
            txDataContratacao.setText("");
            txId.setText("");
    }//GEN-LAST:event_btnAdicionarFuncionarioActionPerformed

    private void txNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    private DefaultTableModel MontarTabela() {
    String[] colunas = {"ID", "Nome", "CPF", "ENDEREÇO", "ESTADO", "CEP", "EMAIL", "TELEFONE", "DATA CONTRATAÇÃO", "CARGO"};
    DefaultTableModel model = new DefaultTableModel(colunas, 0);

    try {
        // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();

        // Instancia o FuncionarioDao com a conexão obtida
        FuncionarioDao funcionarioDao = new FuncionarioDao(conn);

        // Chama o método para listar todos os funcionários do banco de dados
        List<Funcionario> funcionarios = funcionarioDao.listarFuncionarios();

        // Preenche o modelo da tabela com os funcionários recuperados do banco de dados
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Funcionario funcionario : funcionarios) {
            Object[] linha = {
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getCPF(),
                funcionario.getEndereco(),
                funcionario.getEstado(),
                funcionario.getCep(),
                funcionario.getEmail(),
                funcionario.getTelefone(),
                sdf.format(funcionario.getDataContratacao()),
                funcionario.getCargo()
            };
            model.addRow(linha);
        }

        // Fecha a conexão após o uso
        conn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erro ao consultar funcionários: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }

    return model;
}

  private void atualizarTabelaFuncionarios() {
    try {
        // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();

        // Instancia o FuncionarioDao com a conexão obtida
        FuncionarioDao funcionarioDao = new FuncionarioDao(conn);

        // Lista todos os funcionários do banco de dados
        List<Funcionario> funcionarios = funcionarioDao.listarFuncionarios();

        // Obtém o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) TbFuncionarios.getModel();

        // Limpa todas as linhas da tabela antes de atualizar
        model.setRowCount(0);

        // Preenche a tabela com os dados dos funcionários
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Funcionario funcionario : funcionarios) {
            Object[] row = {
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getCPF(),
                funcionario.getEndereco(),
                funcionario.getEstado(),
                funcionario.getCep(),
                funcionario.getEmail(),
                funcionario.getTelefone(),
                sdf.format(funcionario.getDataContratacao()),
                funcionario.getCargo()
            };
            model.addRow(row);
        }

        // Fecha a conexão após o uso
        conn.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela de funcionários: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbFuncionarios;
    private javax.swing.JButton btnAdicionarFuncionario;
    private javax.swing.JButton btnAtualizarFuncionario;
    private javax.swing.JButton btnLimparFuncionario;
    private javax.swing.JButton btnPreencherFuncionario;
    private javax.swing.JButton btnRemoverFuncionario;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txCPF;
    private javax.swing.JTextField txCargo;
    private javax.swing.JTextField txCep;
    private javax.swing.JTextField txDataContratacao;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txEstado;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables
}
