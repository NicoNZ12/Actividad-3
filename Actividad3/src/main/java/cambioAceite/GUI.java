package cambioAceite;

import dao.Main;
import interfaces.DAOAutoImplementacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        autoLabel = new javax.swing.JLabel();
        aceiteLabel = new javax.swing.JLabel();
        patenteLabel = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        txtAuto = new javax.swing.JTextField();
        txtAceite = new javax.swing.JTextField();
        filtroAceiteCheckBox = new javax.swing.JCheckBox();
        filtroAireCheckBox = new javax.swing.JCheckBox();
        filtroCombCheckBox = new javax.swing.JCheckBox();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mi Lubricentro");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Cambio de Aceite");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        autoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        autoLabel.setText("Auto");

        aceiteLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aceiteLabel.setText("Aceite");

        patenteLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        patenteLabel.setText("Patente");

        filtroAceiteCheckBox.setBackground(new java.awt.Color(204, 204, 204));
        filtroAceiteCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        filtroAceiteCheckBox.setText("Filtro de Aceite");
        filtroAceiteCheckBox.setBorder(null);

        filtroAireCheckBox.setBackground(new java.awt.Color(204, 204, 204));
        filtroAireCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        filtroAireCheckBox.setText("Filtro de Aire");
        filtroAireCheckBox.setBorder(null);

        filtroCombCheckBox.setBackground(new java.awt.Color(204, 204, 204));
        filtroCombCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        filtroCombCheckBox.setText("Filtro de Combustible");
        filtroCombCheckBox.setBorder(null);

        btnAgregar.setBackground(new java.awt.Color(0, 255, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 153, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(153, 51, 255));
        btnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(patenteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(autoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAuto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aceiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAceite))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(filtroAceiteCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(filtroAireCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(filtroCombCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patenteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAceite, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroAceiteCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtroAireCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtroCombCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PATENTE", "AUTO", "ACEITE", "FILTRO ACEITE", "FILTRO AIRE", "FILTRO COMBUSTIBLE"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(541, 541, 541))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Lógica
    public void limpiar() {
        txtAceite.setText("");
        txtAuto.setText("");
        txtPatente.setText("");
        filtroAceiteCheckBox.setSelected(false);
        filtroAireCheckBox.setSelected(false);
        filtroCombCheckBox.setSelected(false);
    }

    public void mostrar() {
        String sql = "SELECT * FROM cambioAceite";

        Main con = new Main();

        Connection conexion = con.establecerConexion();

        System.out.println(sql);

        DefaultTableModel model = new DefaultTableModel();

        try {
            Statement st = conexion.createStatement();

            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metaData = rs.getMetaData();
            int numColumnas = metaData.getColumnCount();

            for (int column = 1; column <= numColumnas; column++) {
                model.addColumn(metaData.getColumnName(column));
            }

            while (rs.next()) {
                Object[] rowData = new Object[numColumnas];
                for (int i = 0; i < numColumnas; i++) {
                    rowData[i] = rs.getObject(i + 1);
                }
                model.addRow(rowData);
            }
            TablaDatos.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregar() {
        DAOAutoImplementacion auto_dao = new DAOAutoImplementacion();
        Auto autoCambio = new Auto();

        if (txtAceite.getText().equals("") || txtAuto.getText().equals("") || txtPatente.getText().equals("")
                || filtroAceiteCheckBox.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese los datos que desea agregar");
        } else {
            String patente = txtPatente.getText().toUpperCase();
            String auto = txtAuto.getText();
            String aceite = txtAceite.getText();
            boolean filtroAceite = filtroAceiteCheckBox.isSelected();
            boolean filtroAire = filtroAireCheckBox.isSelected();
            boolean filtroComb = filtroCombCheckBox.isSelected();

            autoCambio.setPatente(patente);
            autoCambio.setAuto(auto);
            autoCambio.setAceite(aceite);
            autoCambio.setFiltroAceite(filtroAceite);
            autoCambio.setFiltroAire(filtroAire);
            autoCambio.setFiltroCombustible(filtroComb);

            auto_dao.agregar(autoCambio);
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente!");
            limpiar();
            mostrar();
        }
    }

    public void eliminar() {
        DAOAutoImplementacion auto_dao = new DAOAutoImplementacion();

        Auto auto = new Auto();

        if (txtPatente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el registro que desea eliminar");
        } else {
            String patente = txtPatente.getText();
            auto.setPatente(patente);

            auto_dao.eliminar(auto);
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente!");
            mostrar();
        }
    }

    public void actualizar() {
        DAOAutoImplementacion auto_dao = new DAOAutoImplementacion();
        Auto auto = new Auto();

        if (txtPatente.getText().isEmpty() || txtAuto.getText().isEmpty()
                || txtAceite.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, indique que registro desea actualizar");
        } else {
            String patente = txtPatente.getText().toUpperCase();
            String autoNombre = txtAuto.getText();
            String aceite = txtAceite.getText();
            boolean filtroAceite = filtroAceiteCheckBox.isSelected();
            boolean filtroAire = filtroAireCheckBox.isSelected();
            boolean filtroComb = filtroCombCheckBox.isSelected();

            auto.setPatente(patente);
            auto.setAuto(autoNombre);
            auto.setAceite(aceite);
            auto.setFiltroAceite(filtroAceite);
            auto.setFiltroAire(filtroAire);
            auto.setFiltroCombustible(filtroComb);


            auto_dao.actualizar(auto);
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente!");
            mostrar();
        }
    }
    
    public void buscar() {
        DAOAutoImplementacion auto_dao = new DAOAutoImplementacion();
        Auto auto = new Auto();

        if (txtPatente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese la patente a buscar");
        } else {
            String patente = txtPatente.getText();
            auto.setPatente(patente);

            boolean encontrado = auto_dao.buscar(auto);

            if (encontrado) {
                // Seteo la tabla para mostrar solo este registro
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Patente");
                model.addColumn("Auto");
                model.addColumn("Aceite");
                model.addColumn("Filtro de Aceite");
                model.addColumn("Filtro de Aire");
                model.addColumn("Filtro de Combustible");

                model.addRow(new Object[]{
                    auto.getPatente(),
                    auto.getAuto(),
                    auto.getAceite(),
                    auto.isFiltroAceite(),
                    auto.isFiltroAire(),
                    auto.isFiltroCombustible()
                });

                TablaDatos.setModel(model);

                txtPatente.setText(auto.getPatente());
                txtAuto.setText(auto.getAuto());
                txtAceite.setText(auto.getAceite());
                filtroAceiteCheckBox.setSelected(auto.isFiltroAceite());
                filtroAireCheckBox.setSelected(auto.isFiltroAire());
                filtroCombCheckBox.setSelected(auto.isFiltroCombustible());

                JOptionPane.showMessageDialog(null, "Registro encontrado correctamente!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el registro con la patente proporcionada");
            }
        }
    }

    //Llama a acción - botones

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Registro no seleccionado");
        } else {
            String patente = (String) TablaDatos.getValueAt(fila, 1);
            String auto = (String) TablaDatos.getValueAt(fila, 2);
            String aceite = (String) TablaDatos.getValueAt(fila, 3);
            boolean filtroAceite = (boolean) TablaDatos.getValueAt(fila, 4);
            boolean filtroAire = (boolean) TablaDatos.getValueAt(fila, 5);
            boolean filtroComb = (boolean) TablaDatos.getValueAt(fila, 6);

            txtPatente.setText(patente);
            txtAuto.setText(auto);
            txtAceite.setText(aceite);
            filtroAceiteCheckBox.setSelected(filtroAceite);
            filtroAireCheckBox.setSelected(filtroAire);
            filtroCombCheckBox.setSelected(filtroComb);
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
        limpiar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       mostrar();
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JLabel aceiteLabel;
    private javax.swing.JLabel autoLabel;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JCheckBox filtroAceiteCheckBox;
    private javax.swing.JCheckBox filtroAireCheckBox;
    private javax.swing.JCheckBox filtroCombCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patenteLabel;
    private javax.swing.JTextField txtAceite;
    private javax.swing.JTextField txtAuto;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
