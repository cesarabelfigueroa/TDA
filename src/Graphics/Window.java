package Graphics;

import Resources.Application;
import Resources.Employee;
import Resources.Material;
import Resources.Product;
import Structures.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jvnet.substance.SubstanceLookAndFeel;

public class Window extends javax.swing.JFrame {

    Application application;

    public Window() {
        application = new Application(pb_assembling);
        Window.setDefaultLookAndFeelDecorated(false);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteGlassSkin");
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceMetalWallWatermark");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_materials = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        name_materials = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc_materials = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        brand_materials = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        snum_materials = new javax.swing.JTextField();
        btn_create_materials = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        mod_name_materials = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mod_desc_materials = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        mod_brand_materials = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        mod_snum_materials = new javax.swing.JTextField();
        btn_modify_materials = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cb_material = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_materials = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btn_delete_materials = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jd_products = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        name_products = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        desc_products = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        time_products = new javax.swing.JTextField();
        btn_create_products = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        mat_prod_1 = new javax.swing.JTable();
        btn_add_materials = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        mat_prod_2 = new javax.swing.JTable();
        btn_dt_materials = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        mod_name_products = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mod_desc_products = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        mod_time_products = new javax.swing.JTextField();
        btn_modify_products = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        cb_products = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_products = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        btn_delete_products = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jd_employees = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        name_employees = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        address_employees = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        salary_employees = new javax.swing.JTextField();
        btn_create_employees = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        idnum_employees = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        age_employees = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        btn_modify_employees = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        cb_employees = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        mod_name_employees = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        mod_idnum_employees = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        mod_age_employees = new javax.swing.JSpinner();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        mod_address_employees = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        mod_salary_employees = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        table_employees = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        btn_delete_employees = new javax.swing.JButton();
        jd_assembly = new javax.swing.JDialog();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        pb_assembling = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        list_products = new javax.swing.JList<>();
        jLabel24 = new javax.swing.JLabel();
        btn_add_product_assembly = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        table_products_assembling = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_materials = new javax.swing.JButton();
        btn_products = new javax.swing.JButton();
        btn_employees = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_assembling = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel3.setText("Name:");

        jLabel4.setText("Description: ");

        desc_materials.setColumns(20);
        desc_materials.setRows(5);
        jScrollPane1.setViewportView(desc_materials);

        jLabel5.setText("Brand: ");

        jLabel6.setText("Series Number: ");

        btn_create_materials.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/create.png"))); // NOI18N
        btn_create_materials.setText("CREATE");
        btn_create_materials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_materialsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(name_materials)
                            .addComponent(brand_materials)
                            .addComponent(snum_materials, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btn_create_materials, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_materials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brand_materials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snum_materials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_create_materials, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("NEW", jPanel4);

        jLabel7.setText("Name:");

        jLabel8.setText("Description: ");

        mod_desc_materials.setColumns(20);
        mod_desc_materials.setRows(5);
        jScrollPane2.setViewportView(mod_desc_materials);

        jLabel9.setText("Brand: ");

        jLabel10.setText("Series Number: ");

        btn_modify_materials.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/check.png"))); // NOI18N
        btn_modify_materials.setText("SAVE");
        btn_modify_materials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modify_materialsActionPerformed(evt);
            }
        });

        jLabel11.setText("SELECT MATERIAL:");

        cb_material.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_materialItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(16, 16, 16)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(mod_name_materials)
                            .addComponent(mod_brand_materials)
                            .addComponent(mod_snum_materials)
                            .addComponent(cb_material, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btn_modify_materials, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mod_name_materials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mod_brand_materials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mod_snum_materials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn_modify_materials, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("MODIFY", jPanel5);

        table_materials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DESCRIPTION", "BRAND", "SERIES NUMBER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_materials);

        jLabel12.setText("SELECT  MATERIAL:");

        btn_delete_materials.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete.png"))); // NOI18N
        btn_delete_materials.setText("DELETE");
        btn_delete_materials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_delete_materialsMouseClicked(evt);
            }
        });
        btn_delete_materials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_materialsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_delete_materials, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_delete_materials, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DELETE", jPanel6);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 102, 0));
        jLabel25.setText("MATERIALS");

        javax.swing.GroupLayout jd_materialsLayout = new javax.swing.GroupLayout(jd_materials.getContentPane());
        jd_materials.getContentPane().setLayout(jd_materialsLayout);
        jd_materialsLayout.setHorizontalGroup(
            jd_materialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_materialsLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jd_materialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_materialsLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jd_materialsLayout.setVerticalGroup(
            jd_materialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_materialsLayout.createSequentialGroup()
                .addGroup(jd_materialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_materialsLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2))
                    .addGroup(jd_materialsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N

        jLabel13.setText("Name:");

        jLabel14.setText("Description: ");

        desc_products.setColumns(20);
        desc_products.setRows(5);
        jScrollPane4.setViewportView(desc_products);

        jLabel15.setText("Time:");

        btn_create_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/create.png"))); // NOI18N
        btn_create_products.setText("CREATE");
        btn_create_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_productsActionPerformed(evt);
            }
        });

        mat_prod_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DESCRIPTION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(mat_prod_1);

        btn_add_materials.setText("ADD MATERIAL");
        btn_add_materials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_materialsActionPerformed(evt);
            }
        });

        mat_prod_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DESCRIPTION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mat_prod_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mat_prod_2MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(mat_prod_2);

        btn_dt_materials.setText("DELETE MATERIAL");
        btn_dt_materials.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_dt_materialsFocusLost(evt);
            }
        });
        btn_dt_materials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dt_materialsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(time_products)
                        .addComponent(name_products))
                    .addComponent(btn_create_products, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_add_materials)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dt_materials)
                .addGap(131, 131, 131))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(name_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add_materials)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(36, 36, 36)
                        .addComponent(btn_create_products, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dt_materials)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("NEW", jPanel7);

        jLabel17.setText("Name:");

        jLabel18.setText("Description: ");

        mod_desc_products.setColumns(20);
        mod_desc_products.setRows(5);
        jScrollPane5.setViewportView(mod_desc_products);

        jLabel19.setText("Time:");

        btn_modify_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/check.png"))); // NOI18N
        btn_modify_products.setText("SAVE");
        btn_modify_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modify_productsActionPerformed(evt);
            }
        });

        jLabel21.setText("SELECT PRODUCT:");

        cb_products.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_productsItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(btn_modify_products, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mod_name_products, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_products, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mod_time_products, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel17)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel19))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(mod_name_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mod_time_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(btn_modify_products, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("MODIFY", jPanel8);

        table_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DESCRIPTION", "TIME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane6.setViewportView(table_products);

        jLabel22.setText("SELECT  PRODUCT:");

        btn_delete_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete.png"))); // NOI18N
        btn_delete_products.setText("DELETE");
        btn_delete_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_delete_productsMouseClicked(evt);
            }
        });
        btn_delete_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_productsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btn_delete_products, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_delete_products, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("DELETE", jPanel9);

        jLabel20.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 0));
        jLabel20.setText("PRODUCTS");

        javax.swing.GroupLayout jd_productsLayout = new javax.swing.GroupLayout(jd_products.getContentPane());
        jd_products.getContentPane().setLayout(jd_productsLayout);
        jd_productsLayout.setHorizontalGroup(
            jd_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_productsLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jd_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_productsLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jd_productsLayout.setVerticalGroup(
            jd_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_productsLayout.createSequentialGroup()
                .addGroup(jd_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_productsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_productsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 102, 0));
        jLabel26.setText("EMPLOYEES");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N

        jLabel28.setText("Name:");

        jLabel29.setText("Address:");

        address_employees.setColumns(20);
        address_employees.setRows(5);
        jScrollPane8.setViewportView(address_employees);

        jLabel30.setText("Salary:");

        btn_create_employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/create.png"))); // NOI18N
        btn_create_employees.setText("CREATE");
        btn_create_employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_employeesActionPerformed(evt);
            }
        });

        jLabel38.setText("Id. Number:");

        jLabel39.setText("Age:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel39))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane8)
                                    .addComponent(salary_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel38))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name_employees, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(idnum_employees)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btn_create_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 225, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(name_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(idnum_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(age_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salary_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addComponent(btn_create_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jTabbedPane3.addTab("NEW", jPanel10);

        btn_modify_employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/check.png"))); // NOI18N
        btn_modify_employees.setText("SAVE");
        btn_modify_employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modify_employeesActionPerformed(evt);
            }
        });

        jLabel35.setText("SELECT EMPLOYEE:");

        cb_employees.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_employeesItemStateChanged(evt);
            }
        });

        jLabel40.setText("Name:");

        jLabel41.setText("Id. Number:");

        jLabel42.setText("Age:");

        jLabel43.setText("Address:");

        mod_address_employees.setColumns(20);
        mod_address_employees.setRows(5);
        jScrollPane18.setViewportView(mod_address_employees);

        jLabel44.setText("Salary:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel40)
                            .addComponent(jLabel44))
                        .addGap(5, 5, 5)))
                .addGap(68, 68, 68)
                .addComponent(cb_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mod_age_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mod_idnum_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mod_salary_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mod_name_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btn_modify_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(34, 34, 34)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mod_name_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mod_idnum_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mod_age_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mod_salary_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addComponent(btn_modify_employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        jTabbedPane3.addTab("MODIFY", jPanel11);

        table_employees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "ID. NUMBER", "AGE", "SALARY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane17.setViewportView(table_employees);

        jLabel37.setText("SELECT  EMPLOYEE:");

        btn_delete_employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/delete.png"))); // NOI18N
        btn_delete_employees.setText("DELETE");
        btn_delete_employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_delete_employeesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel37)
                .addContainerGap(626, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(btn_delete_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_delete_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("DELETE", jPanel12);

        javax.swing.GroupLayout jd_employeesLayout = new javax.swing.GroupLayout(jd_employees.getContentPane());
        jd_employees.getContentPane().setLayout(jd_employeesLayout);
        jd_employeesLayout.setHorizontalGroup(
            jd_employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_employeesLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jd_employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_employeesLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jd_employeesLayout.setVerticalGroup(
            jd_employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_employeesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jd_employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_employeesLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel31.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 102, 0));
        jLabel31.setText("ASSEMBLY");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N

        jLabel33.setText("CHOOSE PRODUCT: ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/play.png"))); // NOI18N
        jButton1.setText("START ASSEMBLING");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pause.png"))); // NOI18N
        jButton2.setText("PAUSE ASSEMBLING");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane10.setViewportView(list_products);

        jLabel24.setText("PRODUCTS CHOSEN: ");

        btn_add_product_assembly.setText("ADD >>>");
        btn_add_product_assembly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_product_assemblyMouseClicked(evt);
            }
        });

        table_products_assembling.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "TIME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(table_products_assembling);

        javax.swing.GroupLayout jd_assemblyLayout = new javax.swing.GroupLayout(jd_assembly.getContentPane());
        jd_assembly.getContentPane().setLayout(jd_assemblyLayout);
        jd_assemblyLayout.setHorizontalGroup(
            jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_assemblyLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(245, 245, 245))
            .addGroup(jd_assemblyLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jd_assemblyLayout.createSequentialGroup()
                .addGroup(jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_assemblyLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pb_assembling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jd_assemblyLayout.createSequentialGroup()
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_add_product_assembly)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_assemblyLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jd_assemblyLayout.setVerticalGroup(
            jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_assemblyLayout.createSequentialGroup()
                .addGroup(jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_assemblyLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_assemblyLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel32)))
                .addGap(74, 74, 74)
                .addGroup(jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel33))
                .addGroup(jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_assemblyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(pb_assembling, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jd_assemblyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73))
                    .addGroup(jd_assemblyLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btn_add_product_assembly)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_materials.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/screw.png"))); // NOI18N
        btn_materials.setText("MATERIALS");
        btn_materials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_materialsMouseClicked(evt);
            }
        });

        btn_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/cart.png"))); // NOI18N
        btn_products.setText("PRODUCTS");
        btn_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productsMouseClicked(evt);
            }
        });

        btn_employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/man.png"))); // NOI18N
        btn_employees.setText("EMPLOYEES");
        btn_employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_employeesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_employees, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(btn_products, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(btn_materials, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btn_materials, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_products, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 47, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_assembling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/process.png"))); // NOI18N
        btn_assembling.setText("ASSEMBLING PROCESS");
        btn_assembling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_assemblingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_assembling, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_assembling, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 340, 180));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 340, 130));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/w2.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_materialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_materialsMouseClicked
        jd_materials.setModal(true);
        jd_materials.pack();
        jd_materials.setLocationRelativeTo(this);
        jd_materials.setVisible(true);
    }//GEN-LAST:event_btn_materialsMouseClicked

    private void btn_productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productsMouseClicked
        refreshMaterialsTable(mat_prod_1, application.getMaterialsNames());
        jd_products.setModal(true);
        jd_products.pack();
        jd_products.setLocationRelativeTo(this);
        jd_products.setVisible(true);

    }//GEN-LAST:event_btn_productsMouseClicked

    private void btn_employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_employeesMouseClicked
        jd_employees.setModal(true);
        jd_employees.pack();
        jd_employees.setLocationRelativeTo(this);
        jd_employees.setVisible(true);
    }//GEN-LAST:event_btn_employeesMouseClicked

    private void btn_assemblingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_assemblingMouseClicked
        list_products.setModel(new DefaultListModel());
        DefaultListModel model = (DefaultListModel) list_products.getModel();
        LinkedList products = application.getCatalog_products();
        for (int i = 0; i < products.getSize(); i++) {
            model.addElement(products.at(i));
        }
        jd_assembly.setModal(true);
        jd_assembly.pack();
        jd_assembly.setLocationRelativeTo(this);
        jd_assembly.setVisible(true);

    }//GEN-LAST:event_btn_assemblingMouseClicked

    private void btn_delete_materialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_delete_materialsMouseClicked
        if (table_materials.getSelectedRow() >= 0) {
            mod_name_materials.setText("");
            mod_desc_materials.setText("");
            mod_brand_materials.setText("");
            mod_snum_materials.setText("");
            DefaultTableModel modelo = (DefaultTableModel) table_materials.getModel();
            String name = (String) modelo.getValueAt(table_materials.getSelectedRow(), 0);
            application.deleteMaterial((Material) application.getMaterialsNames().at(application.indexOfMaterial(name)));
            refreshMaterialCombobox(cb_material, application.getMaterialsNames());
            modelo.removeRow(table_materials.getSelectedRow());
            table_materials.setModel(modelo);
        }
    }//GEN-LAST:event_btn_delete_materialsMouseClicked

    private void btn_delete_productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_delete_productsMouseClicked
        if (table_products.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) table_products.getModel();
            modelo.removeRow(table_products.getSelectedRow());
            table_products.setModel(modelo);
        }
    }//GEN-LAST:event_btn_delete_productsMouseClicked

    private void btn_delete_employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_delete_employeesMouseClicked
        if (table_employees.getSelectedRow() >= 0) {
            mod_name_employees.setText("");
            mod_address_employees.setText("");
            mod_salary_employees.setText("");
            mod_idnum_employees.setText("");
            mod_age_employees.setValue(0);
            DefaultTableModel modelo = (DefaultTableModel) table_employees.getModel();
            String id = (String) modelo.getValueAt(table_employees.getSelectedRow(), 1);
            application.deleteEmployee((Employee) application.getListOfEmployees().at(application.indexOfEmployee(id)));
            refreshMaterialCombobox(cb_employees, application.getListOfEmployees());
            modelo.removeRow(table_employees.getSelectedRow());
            table_employees.setModel(modelo);
        }
    }//GEN-LAST:event_btn_delete_employeesMouseClicked

    public void refreshMaterialsTable(JTable table, LinkedList elements) {
        DefaultTableModel material_tb_model = (DefaultTableModel) table.getModel();
        material_tb_model.setRowCount(0);
        for (int i = 0; i < elements.getSize(); i++) {
            Object element = elements.at(i);
            if (element instanceof Material) {
                Object[] row = new Object[4];
                Material material = (Material) element;
                row[0] = material.getName();
                row[1] = material.getDescription();
                row[2] = material.getBrand();
                row[3] = material.getSeries_number();
                material_tb_model.addRow(row);
            } else if (element instanceof Employee) {
                Object[] row = new Object[4];
                Employee employee = (Employee) element;
                row[0] = employee.getNames();
                row[1] = employee.getId_number();
                row[2] = employee.getAge();
                row[3] = employee.getSalary();
                material_tb_model.addRow(row);
            } else if (element instanceof Product) {
                Object[] row = new Object[3];
                Product product = (Product) element;
                row[0] = product.getName();
                row[1] = product.getDescription();
                row[2] = product.getTime();
                material_tb_model.addRow(row);
            }
        }
    }

    public void refreshMaterialCombobox(JComboBox material_cb, LinkedList elements) {
        material_cb.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel material_cb_model = (DefaultComboBoxModel) material_cb.getModel();
        for (int i = 0; i < elements.getSize(); i++) {
            Object element = elements.at(i);
            material_cb_model.addElement(element);
        }
    }

    private void btn_create_materialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_materialsActionPerformed
        String name = name_materials.getText();
        if (application.indexOfMaterial(name) == -1) {
            if (!name.isEmpty()) {
                String description = desc_materials.getText();
                String brand = brand_materials.getText();
                String series_number = snum_materials.getText();
                Material material = new Material(name, description, brand, series_number);
                application.addMaterial(material);
                refreshMaterialsTable(table_materials, application.getMaterialsNames());
                refreshMaterialCombobox(cb_material, application.getMaterialsNames());
                name_materials.setText("");
                desc_materials.setText("");
                brand_materials.setText("");
                snum_materials.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "El material debe tener un nombre válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los nombres de los materiales no pueden repetirse.");
        }
    }//GEN-LAST:event_btn_create_materialsActionPerformed

    private void cb_materialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_materialItemStateChanged
        DefaultComboBoxModel material_cb_model = (DefaultComboBoxModel) cb_material.getModel();
        Material material = (Material) material_cb_model.getSelectedItem();
        mod_name_materials.setText(material.getName());
        mod_desc_materials.setText(material.getDescription());
        mod_brand_materials.setText(material.getBrand());
        mod_snum_materials.setText(material.getSeries_number());
    }//GEN-LAST:event_cb_materialItemStateChanged

    private void btn_modify_materialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modify_materialsActionPerformed
        DefaultComboBoxModel material_cb_model = (DefaultComboBoxModel) cb_material.getModel();
        Material material = (Material) material_cb_model.getSelectedItem();
        String name = mod_name_materials.getText();
        if (application.indexOfMaterial(name) == -1 || name.equals(material.getName())) {
            if (!name.isEmpty()) {
                String description = mod_desc_materials.getText();
                String brand = mod_brand_materials.getText();
                String series_number = mod_snum_materials.getText();
                material.setName(name);
                material.setDescription(description);
                material.setBrand(brand);
                material.setSeries_number(series_number);
                refreshMaterialsTable(table_materials, application.getMaterialsNames());
            } else {
                JOptionPane.showMessageDialog(this, "El material debe tener un nombre válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los nombres de los materiales no pueden repetirse.");
        }
    }//GEN-LAST:event_btn_modify_materialsActionPerformed

    private void btn_delete_materialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_materialsActionPerformed

    }//GEN-LAST:event_btn_delete_materialsActionPerformed

    private void btn_create_employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_employeesActionPerformed
        String id = idnum_employees.getText();
        if (application.indexOfEmployee(id) == -1) {
            if (!id.isEmpty()) {
                String name = name_employees.getText();
                int age = (int) age_employees.getValue();
                String address = address_employees.getText();
                double salary = Double.parseDouble(salary_employees.getText());
                Employee employee = new Employee(name, id, age, address, salary);
                application.addEmployee(employee);
                refreshMaterialsTable(table_employees, application.getListOfEmployees());
                refreshMaterialCombobox(cb_employees, application.getListOfEmployees());
                name_employees.setText("");
                address_employees.setText("");
                salary_employees.setText("");
                idnum_employees.setText("");
                age_employees.setValue(0);
            } else {
                JOptionPane.showMessageDialog(this, "El empleado debe tener un id válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "La identidad de los empleados no pueden repetirse.");
        }
    }//GEN-LAST:event_btn_create_employeesActionPerformed

    private void cb_employeesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_employeesItemStateChanged
        DefaultComboBoxModel employee_cb_model = (DefaultComboBoxModel) cb_employees.getModel();
        Employee employee = (Employee) employee_cb_model.getSelectedItem();
        mod_name_employees.setText(employee.getNames());
        mod_address_employees.setText(employee.getAddress());
        mod_salary_employees.setText("" + employee.getSalary());
        mod_idnum_employees.setText(employee.getId_number());
        mod_age_employees.setValue(employee.getAge());
    }//GEN-LAST:event_cb_employeesItemStateChanged

    private void btn_modify_employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modify_employeesActionPerformed
        DefaultComboBoxModel employee_cb_model = (DefaultComboBoxModel) cb_employees.getModel();
        Employee employee = (Employee) employee_cb_model.getSelectedItem();
        String id = mod_idnum_employees.getText();
        if (application.indexOfEmployee(id) == -1 || id.equals(employee.getId_number())) {
            if (!id.isEmpty()) {
                String name = mod_name_employees.getText();
                String address = mod_address_employees.getText();
                Double salary = Double.parseDouble(mod_salary_employees.getText());
                int age = (int) mod_age_employees.getValue();
                employee.setNames(name);
                employee.setId_number(id);
                employee.setSalary(salary);
                employee.setAge(age);
                employee.setAddress(address);
                refreshMaterialsTable(table_employees, application.getListOfEmployees());
            } else {
                JOptionPane.showMessageDialog(this, "El empleado debe tener un nombre válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "La identidad de los empleados no puede repetirse.");
        }
    }//GEN-LAST:event_btn_modify_employeesActionPerformed

    private void btn_add_product_assemblyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_product_assemblyMouseClicked
        if (list_products.getSelectedIndex() >= 0) {
            DefaultListModel listModel = (DefaultListModel) list_products.getModel();
            DefaultTableModel tableModel = (DefaultTableModel) table_products_assembling.getModel();
            String name = ((Product) listModel.get(list_products.getSelectedIndex())).getName();
            int time = ((Product) listModel.get(list_products.getSelectedIndex())).getTime();
            Object[] newRow = {name, time};
            tableModel.addRow(newRow);
        } else {
            JOptionPane.showMessageDialog(this, "No Product Selected");
        }
    }//GEN-LAST:event_btn_add_product_assemblyMouseClicked

    private void btn_create_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_productsActionPerformed
        String name = name_products.getText();
        if (application.indexOfProduct(name) == -1) {
            if (!name.isEmpty()) {
                String description = desc_products.getText();
                int time = Integer.parseInt(time_products.getText());
                Product product = new Product(name, description, time);
                DefaultTableModel modelo = (DefaultTableModel) mat_prod_2.getModel();
                for (int i = 0; i < mat_prod_2.getRowCount(); i++) {
                    Material material = (Material) application.getMaterialsNames().at(application.indexOfMaterial(modelo.getValueAt(i, 0).toString()));
                    product.getMaterials().insert(product.getMaterials().getSize(), material);
                }
                application.addProduct(product);
                refreshMaterialCombobox(cb_products, application.getCatalog_products());
                refreshMaterialsTable(table_products, application.getCatalog_products());
                name_products.setText("");
                desc_products.setText("");
                time_products.setText("");
                modelo = (DefaultTableModel) mat_prod_2.getModel();
                modelo.setRowCount(0);
                this.refreshMaterialsTable(mat_prod_1, application.getMaterialsNames());
            } else {
                JOptionPane.showMessageDialog(this, "El producto debe tener un nombre válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre de los productos no debe repetirse.");
        }
    }//GEN-LAST:event_btn_create_productsActionPerformed

    private void btn_dt_materialsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_dt_materialsFocusLost

    }//GEN-LAST:event_btn_dt_materialsFocusLost

    private void btn_add_materialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_materialsActionPerformed
        if (mat_prod_1.getSelectedRow() >= 0) {
            Material material = (Material) application.getListOfMaterials().at(application.indexOfMaterial(mat_prod_1.getValueAt(mat_prod_1.getSelectedRow(), 0).toString()));
            DefaultTableModel material_table_2 = (DefaultTableModel) mat_prod_2.getModel();
            DefaultTableModel modelo = (DefaultTableModel) mat_prod_1.getModel();
            Object[] row = new Object[2];
            row[0] = material.getName();
            row[1] = material.getDescription();
            material_table_2.addRow(row);
            modelo.removeRow(mat_prod_1.getSelectedRow());
            table_employees.setModel(modelo);
        }
    }//GEN-LAST:event_btn_add_materialsActionPerformed

    private void mat_prod_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mat_prod_2MouseClicked

    }//GEN-LAST:event_mat_prod_2MouseClicked

    private void btn_dt_materialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dt_materialsActionPerformed
        if (mat_prod_2.getSelectedRow() >= 0) {
            Material material = (Material) application.getListOfMaterials().at(application.indexOfMaterial(mat_prod_2.getValueAt(mat_prod_2.getSelectedRow(), 0).toString()));
            DefaultTableModel material_table_2 = (DefaultTableModel) mat_prod_1.getModel();
            DefaultTableModel modelo = (DefaultTableModel) mat_prod_2.getModel();
            Object[] row = new Object[2];
            row[0] = material.getName();
            row[1] = material.getDescription();
            material_table_2.addRow(row);
            modelo.removeRow(mat_prod_2.getSelectedRow());
            mat_prod_2.setModel(modelo);
        }
    }//GEN-LAST:event_btn_dt_materialsActionPerformed

    private void cb_productsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_productsItemStateChanged
        DefaultComboBoxModel material_cb_model = (DefaultComboBoxModel) cb_products.getModel();
        Product product = (Product) material_cb_model.getSelectedItem();
        mod_name_products.setText(product.getName());
        mod_desc_products.setText(product.getDescription());
        mod_time_products.setText("" + product.getTime());
    }//GEN-LAST:event_cb_productsItemStateChanged

    private void btn_modify_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modify_productsActionPerformed
        DefaultComboBoxModel material_cb_model = (DefaultComboBoxModel) cb_products.getModel();
        Product product = (Product) material_cb_model.getSelectedItem();
        String name = mod_name_products.getText();
        if (application.indexOfProduct(name) == -1 || product.getName().equals(name)) {
            if (!name.isEmpty()) {
                product.setName(mod_name_products.getText());
                product.setDescription(mod_desc_products.getText());
                product.setTime(Integer.parseInt(mod_time_products.getText()));
                refreshMaterialsTable(table_products, application.getCatalog_products());
            } else {
                JOptionPane.showMessageDialog(this, "El producto debe tener un nombre válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El nombre de los productos no debe repetirse.");
        }
    }//GEN-LAST:event_btn_modify_productsActionPerformed

    private void btn_delete_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_productsActionPerformed
        if (table_products.getSelectedRow() >= 0) {
            mod_name_products.setText("");
            mod_desc_products.setText("");
            mod_time_products.setText("");
            DefaultTableModel modelo = (DefaultTableModel) table_products.getModel();
            String name = (String) modelo.getValueAt(table_products.getSelectedRow(), 0);
            application.deleteProduct((Product) application.getCatalog_products().at(application.indexOfProduct(name)));
            refreshMaterialCombobox(cb_products, application.getCatalog_products());
            modelo.removeRow(table_products.getSelectedRow());
            table_employees.setModel(modelo);
        }
    }//GEN-LAST:event_btn_delete_productsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) table_products_assembling.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            String name = (String) model.getValueAt(i, 0);
            application.getProducts().queue((Product) application.getCatalog_products().at(application.indexOfProduct(name)));
            application.setValue(application.getValue() + ((Product) application.getProducts().peek()).getTime());
        }
        application.setStatus(true);
        application.setProgress(pb_assembling);
        application.start();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        application.setStatus(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Window().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address_employees;
    private javax.swing.JSpinner age_employees;
    private javax.swing.JTextField brand_materials;
    private javax.swing.JButton btn_add_materials;
    private javax.swing.JButton btn_add_product_assembly;
    private javax.swing.JButton btn_assembling;
    private javax.swing.JButton btn_create_employees;
    private javax.swing.JButton btn_create_materials;
    private javax.swing.JButton btn_create_products;
    private javax.swing.JButton btn_delete_employees;
    private javax.swing.JButton btn_delete_materials;
    private javax.swing.JButton btn_delete_products;
    private javax.swing.JButton btn_dt_materials;
    private javax.swing.JButton btn_employees;
    private javax.swing.JButton btn_materials;
    private javax.swing.JButton btn_modify_employees;
    private javax.swing.JButton btn_modify_materials;
    private javax.swing.JButton btn_modify_products;
    private javax.swing.JButton btn_products;
    private javax.swing.JComboBox<String> cb_employees;
    private javax.swing.JComboBox<String> cb_material;
    private javax.swing.JComboBox<String> cb_products;
    private javax.swing.JTextArea desc_materials;
    private javax.swing.JTextArea desc_products;
    private javax.swing.JTextField idnum_employees;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JDialog jd_assembly;
    private javax.swing.JDialog jd_employees;
    private javax.swing.JDialog jd_materials;
    private javax.swing.JDialog jd_products;
    private javax.swing.JList<String> list_products;
    private javax.swing.JTable mat_prod_1;
    private javax.swing.JTable mat_prod_2;
    private javax.swing.JTextArea mod_address_employees;
    private javax.swing.JSpinner mod_age_employees;
    private javax.swing.JTextField mod_brand_materials;
    private javax.swing.JTextArea mod_desc_materials;
    private javax.swing.JTextArea mod_desc_products;
    private javax.swing.JTextField mod_idnum_employees;
    private javax.swing.JTextField mod_name_employees;
    private javax.swing.JTextField mod_name_materials;
    private javax.swing.JTextField mod_name_products;
    private javax.swing.JTextField mod_salary_employees;
    private javax.swing.JTextField mod_snum_materials;
    private javax.swing.JTextField mod_time_products;
    private javax.swing.JTextField name_employees;
    private javax.swing.JTextField name_materials;
    private javax.swing.JTextField name_products;
    private javax.swing.JProgressBar pb_assembling;
    private javax.swing.JTextField salary_employees;
    private javax.swing.JTextField snum_materials;
    private javax.swing.JTable table_employees;
    private javax.swing.JTable table_materials;
    private javax.swing.JTable table_products;
    private javax.swing.JTable table_products_assembling;
    private javax.swing.JTextField time_products;
    // End of variables declaration//GEN-END:variables
}
