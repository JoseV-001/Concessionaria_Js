package concessionaria_js;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

//@author JoseV
public class TelaInvetarioDeCarros extends javax.swing.JFrame {

    public TelaInvetarioDeCarros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txMarca = new javax.swing.JTextField();
        txPreco = new javax.swing.JTextField();
        txModelo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txAno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txCor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdicionarCarro = new javax.swing.JButton();
        btnRemoverCarro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbInventario = new javax.swing.JTable();
        txPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnAtualizarCarro = new javax.swing.JButton();
        btnPreencherCarro = new javax.swing.JButton();
        btnLimparCarro = new javax.swing.JButton();
        txId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(7, 7, 7));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txMarca.setBackground(new java.awt.Color(51, 51, 51));
        txMarca.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txMarca.setForeground(new java.awt.Color(255, 255, 255));
        txMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMarcaActionPerformed(evt);
            }
        });

        txPreco.setBackground(new java.awt.Color(51, 51, 51));
        txPreco.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txPreco.setForeground(new java.awt.Color(255, 255, 255));

        txModelo.setBackground(new java.awt.Color(51, 51, 51));
        txModelo.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txModelo.setForeground(new java.awt.Color(255, 255, 255));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MARCA:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MODELO:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administração Concessionaria");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ANO:");

        txAno.setBackground(new java.awt.Color(51, 51, 51));
        txAno.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txAno.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("COR:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PLACA:");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PREÇO:");

        txCor.setBackground(new java.awt.Color(51, 51, 51));
        txCor.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txCor.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lista-Invetario(CARROS)");

        btnAdicionarCarro.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarCarro.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnAdicionarCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarCarro.setText("Adicionar Carro");
        btnAdicionarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCarroActionPerformed(evt);
            }
        });

        btnRemoverCarro.setBackground(new java.awt.Color(51, 51, 51));
        btnRemoverCarro.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnRemoverCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverCarro.setText("Remover Carro");
        btnRemoverCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCarroActionPerformed(evt);
            }
        });

        TbInventario.setBackground(new java.awt.Color(51, 51, 51));
        TbInventario.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        TbInventario.setForeground(new java.awt.Color(255, 255, 255));
        TbInventario.setModel(MontarTabela());
        jScrollPane2.setViewportView(TbInventario);

        jScrollPane3.setViewportView(jScrollPane2);

        txPlaca.setBackground(new java.awt.Color(51, 51, 51));
        txPlaca.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txPlaca.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user_13333085.png"))); // NOI18N

        btnVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnVoltar.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAtualizarCarro.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizarCarro.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnAtualizarCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarCarro.setText("Atualizar Carro");
        btnAtualizarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCarroActionPerformed(evt);
            }
        });

        btnPreencherCarro.setBackground(new java.awt.Color(51, 51, 51));
        btnPreencherCarro.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnPreencherCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnPreencherCarro.setText("Preencher Carro");
        btnPreencherCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreencherCarroActionPerformed(evt);
            }
        });

        btnLimparCarro.setBackground(new java.awt.Color(51, 51, 51));
        btnLimparCarro.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnLimparCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparCarro.setText("Limpar Carro");
        btnLimparCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCarroActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txAno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                        .addComponent(txModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txCor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAtualizarCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimparCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoverCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdicionarCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPreencherCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPreencherCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
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

    private void txMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMarcaActionPerformed

    private void btnAdicionarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCarroActionPerformed
        // Capturar os dados dos campos de texto
        String marca = txMarca.getText();
        String modelo = txModelo.getText();
        String anoStr = txAno.getText();
        String cor = txCor.getText();
        String placa = txPlaca.getText();
        String precoStr = txPreco.getText();

        // Verificar se todos os campos obrigatórios estão preenchidos
        if (marca.isEmpty() || modelo.isEmpty() || anoStr.isEmpty() || cor.isEmpty() || placa.isEmpty() || precoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar o preço
        double preco;
        try {
            preco = Double.parseDouble(precoStr);
            if (preco <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um preço válido maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Sai do método se o preço não for válido
        }

        // Validar o ano
        int ano;
        try {
            if (!isValidYear(anoStr)) {
                throw new NumberFormatException();
            }
            ano = Integer.parseInt(anoStr);
            if (ano < 1900 || ano > 2100) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um ano válido entre 1900 e 2100.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Sai do método se o ano não for válido
        }

        // Validar a placa
        if (!isValidPlaca(placa)) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma placa válida (formato ABC1D23).", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Sai do método se a placa não for válida
        }

        try {
            // Criar um objeto Carro com os dados fornecidos
            Carro carro = new Carro(0, marca, modelo, ano, cor, placa, preco);

            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instanciar o CarroDao com a conexão obtida
            CarroDao carroDao = new CarroDao(conn);

            // Chamar o método inserirCarro do CarroDao para adicionar o carro ao banco de dados
            carroDao.inserirCarro(carro);

            // Exibir mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Carro adicionado com sucesso ao banco de dados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Limpar os campos de texto após adicionar o carro
            limparCampos();

            // Atualizar a tabela após adicionar o novo carro
            atualizarTabela();

            // Fechar a conexão após o uso
            conn.close();
        } catch (SQLException ex) {
            // Exibir mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao adicionar carro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para verificar se uma string é numérica
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); // Expressão regular para verificar se a string é um número
    }

    // Método para validar uma data no formato dd/MM/yyyy
    private boolean isValidYear(String yearStr) {
        return yearStr.matches("\\d{4}"); // Expressão regular para verificar se o ano possui exatamente quatro dígitos numéricos
    }

    private boolean isValidPlaca(String placa) {
    return placa.matches("[A-Z]{3}-\\d{4}"); // Expressão regular para verificar o formato da placa TOY-2211
}

    // Método para limpar os campos de texto após adicionar um cliente
    private void limparCampos() {
        txMarca.setText("");
        txModelo.setText("");
        txAno.setText("");
        txCor.setText("");
        txPlaca.setText("");
        txPreco.setText("");
        txId.setText("");
    }//GEN-LAST:event_btnAdicionarCarroActionPerformed

    private void btnRemoverCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCarroActionPerformed
      // Obter a linha selecionada na tabela
    int selectedRow = TbInventario.getSelectedRow();
    
    // Verificar se uma linha está selecionada
    if (selectedRow != -1) {
        // Exibir mensagem de confirmação
        int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o carro selecionado?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            // Obter o modelo da tabela
            DefaultTableModel model = (DefaultTableModel) TbInventario.getModel();
            
            // Obter o ID do carro selecionado (supondo que o ID esteja na coluna 0 da tabela)
            Object idObj = model.getValueAt(selectedRow, 0);
            
            if (idObj instanceof Integer) {
                int idCarro = (Integer) idObj;
                
                try {
                    // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
                    Conexao conexao = new Conexao();
                    Connection conn = conexao.getConexao();
                    
                    // Instancia o CarroDao com a conexão obtida
                    CarroDao carroDao = new CarroDao(conn);
                    
                    // Remove o carro do banco de dados
                    carroDao.excluirCarro(idCarro);
                    
                    // Remove a linha da tabela na interface gráfica
                    model.removeRow(selectedRow);
                    
                    JOptionPane.showMessageDialog(this, "Carro removido com sucesso!", "Remoção bem-sucedida", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Fecha a conexão após o uso
                    conn.close();
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao remover carro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID do carro selecionado não é válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecione um carro para remover.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnRemoverCarroActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // Fecha a janela atual
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAtualizarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCarroActionPerformed
       // Verifica se foi selecionada alguma linha na tabela
    int selectedRow = TbInventario.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um carro na tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtém o ID do carro selecionado
    Object idObj = TbInventario.getValueAt(selectedRow, 0);

    // Verifica se o ID é um valor inteiro
    if (idObj == null || !(idObj instanceof Integer)) {
        JOptionPane.showMessageDialog(null, "O ID do carro selecionado não é válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int idCarro = (Integer) idObj;

    // Captura os dados dos campos de texto
    String marca = txMarca.getText();
    String modelo = txModelo.getText();
    String anoStr = txAno.getText();
    String cor = txCor.getText();
    String placa = txPlaca.getText();
    String precoStr = txPreco.getText();

    // Verifica se todos os campos obrigatórios estão preenchidos
    if (marca.isEmpty() || modelo.isEmpty() || anoStr.isEmpty() || cor.isEmpty() || placa.isEmpty() || precoStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar o preço
    double preco;
    try {
        preco = Double.parseDouble(precoStr);
        if (preco <= 0) {
            throw new NumberFormatException();
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor, insira um preço válido maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; // Sai do método se o preço não for válido
    }

    // Validar o ano
    int ano;
    try {
        if (!isValidYear(anoStr)) {
            throw new NumberFormatException();
        }
        ano = Integer.parseInt(anoStr);
        if (ano < 1900 || ano > 2100) {
            throw new NumberFormatException();
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor, insira um ano válido entre 1900 e 2100.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; // Sai do método se o ano não for válido
    }

    // Validar a placa
    if (!isValidPlaca(placa)) {
        JOptionPane.showMessageDialog(this, "Por favor, insira uma placa válida (formato AAA-1234).", "Erro", JOptionPane.ERROR_MESSAGE);
        return; // Sai do método se a placa não for válida
    }

    try {
        // Criar um objeto Carro com os dados atualizados
        Carro carro = new Carro(idCarro, marca, modelo, ano, cor, placa, preco);

        // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();

        // Instanciar o CarroDao com a conexão obtida
        CarroDao carroDao = new CarroDao(conn);

        // Chamar o método atualizarCarro do CarroDao para atualizar o carro no banco de dados
        carroDao.atualizarCarro(carro);

        // Exibir mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Carro atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        // Limpar os campos de texto após atualizar o carro
        limparCampos();

        // Atualizar a tabela após a atualização do carro
        atualizarTabela();

        // Fechar a conexão após o uso
        conn.close();

    } catch (SQLException ex) {
        // Exibir mensagem de erro caso ocorra uma exceção SQL
        JOptionPane.showMessageDialog(this, "Erro ao atualizar carro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAtualizarCarroActionPerformed

    private void btnPreencherCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreencherCarroActionPerformed
        // Verifica se foi selecionada alguma linha na tabela
        int selectedRow = TbInventario.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um carro na tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

// Obtém o ID do carro selecionado
        Object idObj = TbInventario.getValueAt(selectedRow, 0);

// Verifica se o ID é um valor inteiro
        if (idObj == null || !(idObj instanceof Integer)) {
            JOptionPane.showMessageDialog(null, "O ID do carro selecionado não é válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idCarro = (Integer) idObj;

        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o CarroDao com a conexão obtida
            CarroDao carroDao = new CarroDao(conn);

            // Busca o carro pelo ID
            Carro carro = carroDao.buscarCarroPorId(idCarro);

            // Preenche o campo txId com o ID do carro encontrado
            txId.setText(String.valueOf(carro.getId()));

            // Preenche os demais campos de texto com os dados do carro encontrado
            txMarca.setText(carro.getMarca());
            txModelo.setText(carro.getModelo());
            txAno.setText(String.valueOf(carro.getAno()));
            txCor.setText(carro.getCor());
            txPlaca.setText(carro.getPlaca());
            txPreco.setText(String.valueOf(carro.getPreco()));

            // Fecha a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            // Exibe uma mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao buscar carro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPreencherCarroActionPerformed

    private void btnLimparCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCarroActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCarroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInvetarioDeCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInvetarioDeCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInvetarioDeCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInvetarioDeCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInvetarioDeCarros().setVisible(true);
            }
        });
    }

    // Método para montar o modelo da tabela com os dados dos carros
    private DefaultTableModel MontarTabela() {
        String[] colunas = {"ID", "Marca", "Modelo", "Ano", "Cor", "Placa", "Preço"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o CarroDao com a conexão obtida
            CarroDao carroDao = new CarroDao(conn);

            // Chama o método para listar todos os carros do inventário no banco de dados
            List<Carro> carros = carroDao.listarCarros();

            // Preenche o modelo da tabela com os carros recuperados do banco de dados
            for (Carro carro : carros) {
                Object[] linha = {
                    carro.getId(),
                    carro.getMarca(),
                    carro.getModelo(),
                    carro.getAno(),
                    carro.getCor(),
                    carro.getPlaca(),
                    carro.getPreco()
                };
                model.addRow(linha);
            }

            // Fecha a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            // Exibe uma mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao montar tabela de carros: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return model;
    }

    private void atualizarTabela() {
        try {
            // Cria uma instância da classe Conexao para obter a conexão com o banco de dados
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConexao();

            // Instancia o CarroDao com a conexão obtida
            CarroDao carroDao = new CarroDao(conn);

            // Limpa o modelo atual da tabela
            DefaultTableModel model = (DefaultTableModel) TbInventario.getModel();
            model.setRowCount(0);

            // Chama o método para listar todos os carros do inventário no banco de dados
            List<Carro> carros = carroDao.listarCarros();

            // Preenche o modelo da tabela com os carros recuperados do banco de dados
            for (Carro carro : carros) {
                Object[] linha = {
                    carro.getId(),
                    carro.getMarca(),
                    carro.getModelo(),
                    carro.getAno(),
                    carro.getCor(),
                    carro.getPlaca(),
                    carro.getPreco()
                };
                model.addRow(linha);
            }

            // Fecha a conexão após o uso
            conn.close();

        } catch (SQLException ex) {
            // Exibe uma mensagem de erro caso ocorra uma exceção SQL
            JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela de carros: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbInventario;
    private javax.swing.JButton btnAdicionarCarro;
    private javax.swing.JButton btnAtualizarCarro;
    private javax.swing.JButton btnLimparCarro;
    private javax.swing.JButton btnPreencherCarro;
    private javax.swing.JButton btnRemoverCarro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField txAno;
    private javax.swing.JTextField txCor;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txMarca;
    private javax.swing.JTextField txModelo;
    private javax.swing.JTextField txPlaca;
    private javax.swing.JTextField txPreco;
    // End of variables declaration//GEN-END:variables
}
