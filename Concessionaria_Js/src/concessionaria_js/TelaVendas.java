package concessionaria_js;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

//@author JoseV
public class TelaVendas extends javax.swing.JFrame {

    public TelaVendas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdicionarVenda = new javax.swing.JButton();
        btnRemoverVenda = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbVendas = new javax.swing.JTable();
        txNomeCliente = new javax.swing.JTextField();
        txPreco = new javax.swing.JTextField();
        txCarVendido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txVendedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txDataVenda = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPreencher = new javax.swing.JButton();
        btnLimparVenda = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAtualizarVenda = new javax.swing.JButton();
        txId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));

        jPanel1.setBackground(new java.awt.Color(7, 7, 7));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAdicionarVenda.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarVenda.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnAdicionarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarVenda.setText("Adicionar Venda");
        btnAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarVendaActionPerformed(evt);
            }
        });

        btnRemoverVenda.setBackground(new java.awt.Color(51, 51, 51));
        btnRemoverVenda.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnRemoverVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverVenda.setText("Remover Venda");
        btnRemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverVendaActionPerformed(evt);
            }
        });

        TbVendas.setBackground(new java.awt.Color(51, 51, 51));
        TbVendas.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        TbVendas.setForeground(new java.awt.Color(255, 255, 255));
        TbVendas.setModel(MontarTabela());
        jScrollPane2.setViewportView(TbVendas);

        jScrollPane3.setViewportView(jScrollPane2);

        txNomeCliente.setBackground(new java.awt.Color(51, 51, 51));
        txNomeCliente.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        txNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeClienteActionPerformed(evt);
            }
        });

        txPreco.setBackground(new java.awt.Color(51, 51, 51));
        txPreco.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txPreco.setForeground(new java.awt.Color(255, 255, 255));

        txCarVendido.setBackground(new java.awt.Color(51, 51, 51));
        txCarVendido.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txCarVendido.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOME DO CLIENTE:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CARRO VENDIDO:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VENDEDOR:");

        txVendedor.setBackground(new java.awt.Color(51, 51, 51));
        txVendedor.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txVendedor.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATA VENDA:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PREÇO:");

        txDataVenda.setBackground(new java.awt.Color(51, 51, 51));
        txDataVenda.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txDataVenda.setForeground(new java.awt.Color(255, 255, 255));

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
                .addComponent(jLabel3)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administração Concessionaria");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lista-Vendas");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user_13333085.png"))); // NOI18N

        btnPreencher.setBackground(new java.awt.Color(51, 51, 51));
        btnPreencher.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnPreencher.setForeground(new java.awt.Color(255, 255, 255));
        btnPreencher.setText("Preencher Venda");
        btnPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherActionPerformed(evt);
            }
        });

        btnLimparVenda.setBackground(new java.awt.Color(51, 51, 51));
        btnLimparVenda.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnLimparVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparVenda.setText("Limpar Venda");
        btnLimparVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparVendaActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnVoltar.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAtualizarVenda.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarVenda.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnAtualizarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarVenda.setText("Atualizar Venda");
        btnAtualizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarVendaActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(283, 283, 283)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txCarVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRemoverVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAdicionarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtualizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimparVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txCarVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnAdicionarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarVendaActionPerformed
        // Capturar os dados dos campos de texto
        String nomeCliente = txNomeCliente.getText();
        String carroVendido = txCarVendido.getText();
        String vendedor = txVendedor.getText();
        String dataVenda = txDataVenda.getText();
        String preco = txPreco.getText();

        // Verificar se todos os campos obrigatórios estão preenchidos
        if (nomeCliente.isEmpty() || carroVendido.isEmpty() || vendedor.isEmpty() || dataVenda.isEmpty() || preco.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar o preço
        if (!isNumeric(preco) || Double.parseDouble(preco) <= 0) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um preço válido maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Sai do método se o preço não for válido
        }

        // Validar a data de venda
        if (!isValidDate(dataVenda)) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma data de venda válida no formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Sai do método se a data não for válida
        }

        // Converter a data de venda para um objeto Date
        Date dataVendaDate = parseDate(dataVenda);

        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instanciar o VendaDao com a conexão obtida
            VendaDao vendaDao = new VendaDao(conn);

            // Cria um objeto Venda com os dados fornecidos
            Venda venda = new Venda(0, dataVendaDate, carroVendido, nomeCliente, vendedor, Double.parseDouble(preco));

            // Chamar o método para inserir a venda no banco de dados
            vendaDao.inserirVenda(venda);

            // Exibir mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Venda cadastrada com sucesso no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Limpar os campos após o cadastro
            limparCampos();

            // Fechar a conexão com o banco de dados
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar venda no banco de dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Método para limpar os campos de texto após adicionar um cliente

    private void limparCampos() {
        txNomeCliente.setText("");
        txCarVendido.setText("");
        txVendedor.setText("");
        txDataVenda.setText("");
        txPreco.setText("");
        txId.setText("");
    }//GEN-LAST:event_btnAdicionarVendaActionPerformed

    private void btnRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVendaActionPerformed
        // Obter a linha selecionada
        int selectedRow = TbVendas.getSelectedRow();
        // Verificar se uma linha está selecionada
        if (selectedRow != -1) {
            // Obter o modelo da tabela
            DefaultTableModel model = (DefaultTableModel) TbVendas.getModel();
            // Obter o ID da venda selecionada
            int vendaId = (int) model.getValueAt(selectedRow, 0); // Supondo que o ID está na primeira coluna

            try {
                // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
                Conexao conexao = new Conexao();
                Connection conn = conexao.getConexao();

                // Instanciar o VendaDao com a conexão obtida
                VendaDao vendaDao = new VendaDao(conn);

                // Remover a venda do banco de dados
                vendaDao.excluirVenda(vendaId);

                // Remover a linha da tabela
                model.removeRow(selectedRow);

                // Exibir mensagem de sucesso
                JOptionPane.showMessageDialog(this, "Venda removida com sucesso!", "Remoção bem-sucedida", JOptionPane.INFORMATION_MESSAGE);

                // Fechar a conexão após o uso
                conn.close();

            } catch (SQLException ex) {
                // Exibir uma mensagem de erro caso ocorra uma exceção SQL
                JOptionPane.showMessageDialog(this, "Erro ao remover venda: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma venda para remover.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverVendaActionPerformed

    private void txNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeClienteActionPerformed

    private void btnPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherActionPerformed
        int selectedRow = TbVendas.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma venda na tabela.");
            return;
        }

        // Obter o valor da célula da coluna 0 (que presumimos ser o ID da venda)
        Object idObj = TbVendas.getValueAt(selectedRow, 0);

        // Verificar se o valor é nulo ou não é Integer
        if (idObj == null || !(idObj instanceof Integer)) {
            JOptionPane.showMessageDialog(null, "O ID da venda selecionada não é um número válido.");
            return;
        }

        // Converter o valor para Integer de maneira segura
        int idVenda = (Integer) idObj;

        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o VendaDao com a conexão obtida
            VendaDao vendaDao = new VendaDao(conn);

            // Busca a venda pelo ID
            Venda venda = vendaDao.buscarVendaPorId(idVenda);

            // Preenche os campos de texto com os dados da venda encontrada
            txId.setText(String.valueOf(venda.getId())); // ID
            txNomeCliente.setText(venda.getCliente()); // Cliente
            txCarVendido.setText(venda.getCarroVendido()); // Carro Vendido
            txVendedor.setText(venda.getFuncionarioVendas()); // Vendedor
            txDataVenda.setText(new SimpleDateFormat("dd/MM/yyyy").format(venda.getDataVenda())); // Data de Venda
            txPreco.setText(String.valueOf(venda.getValor())); // Valor

            // Fecha a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            // Exibe uma mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao buscar venda: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPreencherActionPerformed

    private void btnLimparVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparVendaActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparVendaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // Fecha a janela atual
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAtualizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarVendaActionPerformed
        if (!txId.getText().isEmpty()) {
            int vendaId = Integer.parseInt(txId.getText());

            // Capturar os dados dos campos de texto
            String nomeCliente = txNomeCliente.getText();
            String carroVendido = txCarVendido.getText();
            String vendedor = txVendedor.getText();
            String dataVenda = txDataVenda.getText();
            String preco = txPreco.getText();

            // Validar os campos obrigatórios
            if (nomeCliente.isEmpty() || carroVendido.isEmpty() || vendedor.isEmpty() || dataVenda.isEmpty() || preco.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar o preço
            if (!isNumeric(preco) || Double.parseDouble(preco) <= 0) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um preço válido maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar a data de venda
            if (!isValidDate(dataVenda)) {
                JOptionPane.showMessageDialog(this, "Por favor, insira uma data de venda válida no formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Converter a data de venda para um objeto Date
            Date dataVendaDate = parseDate(dataVenda);

            try {
                // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
                Conexao conexao = new Conexao();
                Connection conn = conexao.getConexao();

                // Instanciar o VendaDao com a conexão obtida
                VendaDao vendaDao = new VendaDao(conn);

                // Cria um objeto Venda com os dados fornecidos
                Venda venda = new Venda(vendaId, dataVendaDate, carroVendido, nomeCliente, vendedor, Double.parseDouble(preco));

                // Chamar o método para atualizar a venda no banco de dados
                vendaDao.atualizarVenda(venda);

                // Exibir mensagem de sucesso
                JOptionPane.showMessageDialog(this, "Venda atualizada com sucesso no banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                // Atualizar a tabela de vendas após atualizar uma venda
                atualizarTabelaVendas();

                // Fechar a conexão após o uso
                conn.close();

            } catch (SQLException ex) {
                // Exibir uma mensagem de erro caso ocorra uma exceção SQL
                JOptionPane.showMessageDialog(this, "Erro ao atualizar venda: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma venda para atualizar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarVendaActionPerformed

    private void txIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    private DefaultTableModel MontarTabela() {
        String[] colunas = {"ID", "Data da Venda", "Carro Vendido", "Cliente", "Funcionário de Vendas", "Valor"};

        // Cria o modelo da tabela com as colunas especificadas
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Prepara a consulta SQL para obter os dados da tabela vendas
            String sql = "SELECT id, DataVenda, carroVendido, Cliente, funcionarioVendas, Valor FROM vendas";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Executa a consulta e obtém o resultado
            ResultSet rs = stmt.executeQuery();

            // Processa cada linha do resultado e adiciona ao modelo da tabela
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id"),
                    rs.getDate("DataVenda"),
                    rs.getString("carroVendido"),
                    rs.getString("Cliente"),
                    rs.getString("funcionarioVendas"),
                    rs.getDouble("Valor")
                };
                model.addRow(row);
            }

            // Fecha os recursos
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados de vendas: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return model;
    }

    private void atualizarTabelaVendas() {
        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instanciar o VendaDao com a conexão obtida
            VendaDao vendaDao = new VendaDao(conn);

            // Obter a lista de vendas do banco de dados
            List<Venda> vendas = vendaDao.listarVendas();

            // Obter o modelo da tabela
            DefaultTableModel model = (DefaultTableModel) TbVendas.getModel();

            // Limpar os dados existentes na tabela
            model.setRowCount(0);

            // Preencher a tabela com os dados das vendas
            for (Venda venda : vendas) {
                Object[] row = {
                    venda.getId(),
                    venda.getCliente(),
                    venda.getCarroVendido(),
                    venda.getFuncionarioVendas(),
                    venda.getDataVenda(),
                    venda.getValor()
                };
                model.addRow(row);
            }

            // Fechar a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            // Exibir uma mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela de vendas: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); // Expressão regular para verificar se a string é um número
    }

// Método para validar uma data no formato dd/MM/yyyy
    private boolean isValidDate(String date) {
        return date.matches("\\d{2}/\\d{2}/\\d{4}"); // Expressão regular para verificar o formato da data
    }

// Método para converter uma string no formato dd/MM/yyyy para um objeto Date
    private Date parseDate(String dateStr) {
        try {
            return new java.text.SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbVendas;
    private javax.swing.JButton btnAdicionarVenda;
    private javax.swing.JButton btnAtualizarVenda;
    private javax.swing.JButton btnLimparVenda;
    private javax.swing.JButton btnPreencher;
    private javax.swing.JButton btnRemoverVenda;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txCarVendido;
    private javax.swing.JTextField txDataVenda;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNomeCliente;
    private javax.swing.JTextField txPreco;
    private javax.swing.JTextField txVendedor;
    // End of variables declaration//GEN-END:variables
}
