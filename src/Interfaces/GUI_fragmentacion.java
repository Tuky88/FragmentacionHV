package Interfaces;

import dao.consultarRelacionDAO;
import entity.descEntity;
import dao.FuncionesGUI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class GUI_fragmentacion extends javax.swing.JFrame {

    consultarRelacionDAO cR = new consultarRelacionDAO();
    FuncionesGUI fG = new FuncionesGUI();
    String ipjulian = "8.9.0.153";
    String ipmeji = "172.20.10.10";
    /* Contador de predicados simples */
    int cps = 0;

    /* arreglo que contienen los predicados simples */
    public GUI_fragmentacion() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        initComponents();

        this.setResizable(false);
        this.setTitle(" Fragmentación ");

        /* Leer las entidades de la base de datos */
        List<String> entidades = new ArrayList<String>();
        entidades = this.cR.consultarEntidades();
        Iterator<String> item = entidades.iterator();
        while (item.hasNext()) {
            String o = (String) item.next();
            this.jComboBoxEsquemaSel.addItem(o);
            this.jComboBoxRelacionSel.addItem(o);
        }

        /* Definir tamaño a la tabla */
        //this.fG.sizeTable(this.jTableRelacion.getColumnModel());
        this.jCheckBoxAtributo1.setVisible(false);
        this.jCheckBoxAtributo1.setSelected(true);
        this.jCheckBoxAtributo2.setVisible(false);
        this.jCheckBoxAtributo3.setVisible(false);
        this.jCheckBoxAtributo4.setVisible(false);
        this.jCheckBoxAtributo5.setVisible(false);
        this.jCheckBoxAtributo6.setVisible(false);
        this.jCheckBoxAtributo7.setVisible(false);
        this.jCheckBoxAtributo8.setVisible(false);
        this.jCheckBoxAtributo9.setVisible(false);
        this.jCheckBoxAtributo10.setVisible(false);
        this.jCheckBoxAtributo11.setVisible(false);
        this.jCheckBoxAtributo12.setVisible(false);
        jTableExpresion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = jTableExpresion.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(65);
        columnModel.getColumn(1).setPreferredWidth(278);
        columnModel.getColumn(2).setPreferredWidth(65);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jTabbedPaneFragmentacion = new javax.swing.JTabbedPane();
        jPanelFragmentacionHorizontal = new javax.swing.JPanel();
        jPanelCondicionesFrag = new javax.swing.JPanel();
        LabelLeerEsquema = new javax.swing.JLabel();
        jComboBoxEsquemaSel = new javax.swing.JComboBox<>();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableContenidoRelacion = new javax.swing.JTable();
        jPanelDefinirPredicadosSimples = new javax.swing.JPanel();
        jLabelAtributo = new javax.swing.JLabel();
        jLabelOperador = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jComboBoxAtributo = new javax.swing.JComboBox<>();
        jComboBoxOperador = new javax.swing.JComboBox<>();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jButtonGenerarPS = new javax.swing.JButton();
        jPanelGenerarFragmentosMiniterminos = new javax.swing.JPanel();
        jLabelMostrarPredicadosSimples = new javax.swing.JLabel();
        jButtonGenerarFM = new javax.swing.JButton();
        jScrollPaneTabla3 = new javax.swing.JScrollPane();
        jTablePredicadosSimples = new javax.swing.JTable();
        jPanelColocarFragmentosMiniterminos = new javax.swing.JPanel();
        jLabelSitio = new javax.swing.JLabel();
        jComboBoxSitio = new javax.swing.JComboBox<>();
        jButtonEnviarFH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCondicion = new javax.swing.JTable();
        jPanelFragmentacionVertical = new javax.swing.JPanel();
        jPanelDefinirDominioFragmentos = new javax.swing.JPanel();
        jLabelCargarRelación = new javax.swing.JLabel();
        jComboBoxRelacionSel = new javax.swing.JComboBox<>();
        jScrollPaneTablaRel = new javax.swing.JScrollPane();
        jTableRelacion = new javax.swing.JTable();
        jPanelSeleccionarAtributos = new javax.swing.JPanel();
        jCheckBoxAtributo1 = new javax.swing.JCheckBox();
        jCheckBoxAtributo2 = new javax.swing.JCheckBox();
        jButtonGenerarF = new javax.swing.JButton();
        jCheckBoxAtributo3 = new javax.swing.JCheckBox();
        jCheckBoxAtributo4 = new javax.swing.JCheckBox();
        jCheckBoxAtributo5 = new javax.swing.JCheckBox();
        jCheckBoxAtributo6 = new javax.swing.JCheckBox();
        jCheckBoxAtributo7 = new javax.swing.JCheckBox();
        jCheckBoxAtributo8 = new javax.swing.JCheckBox();
        jCheckBoxAtributo9 = new javax.swing.JCheckBox();
        jCheckBoxAtributo10 = new javax.swing.JCheckBox();
        jCheckBoxAtributo11 = new javax.swing.JCheckBox();
        jCheckBoxAtributo12 = new javax.swing.JCheckBox();
        jPanelExpresionesAlgrebraicas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableExpresion = new javax.swing.JTable();
        jPanelColocacionFragmentos = new javax.swing.JPanel();
        jLabelSeleccionarSitio = new javax.swing.JLabel();
        jButtonEnviarFV = new javax.swing.JButton();
        jComboBoxSitio1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Fragmentacion"); // NOI18N

        jTabbedPaneFragmentacion.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanelFragmentacionHorizontal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanelCondicionesFrag.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCondicionesFrag.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Definir condiciones de Fragmentación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanelCondicionesFrag.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        LabelLeerEsquema.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelLeerEsquema.setText("Leer Esquema [Relación]");

        jComboBoxEsquemaSel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxEsquemaSel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEsquemaSelItemStateChanged(evt);
            }
        });
        jComboBoxEsquemaSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEsquemaSelActionPerformed(evt);
            }
        });

        jTableContenidoRelacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableContenidoRelacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Field", "Type", "Null", "Key", "Default", "Extra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableContenidoRelacion.setEnabled(false);
        jScrollPaneTabla.setViewportView(jTableContenidoRelacion);

        javax.swing.GroupLayout jPanelCondicionesFragLayout = new javax.swing.GroupLayout(jPanelCondicionesFrag);
        jPanelCondicionesFrag.setLayout(jPanelCondicionesFragLayout);
        jPanelCondicionesFragLayout.setHorizontalGroup(
            jPanelCondicionesFragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCondicionesFragLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCondicionesFragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCondicionesFragLayout.createSequentialGroup()
                        .addComponent(LabelLeerEsquema)
                        .addGap(45, 45, 45)
                        .addComponent(jComboBoxEsquemaSel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelCondicionesFragLayout.setVerticalGroup(
            jPanelCondicionesFragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCondicionesFragLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelCondicionesFragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLeerEsquema)
                    .addComponent(jComboBoxEsquemaSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDefinirPredicadosSimples.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDefinirPredicadosSimples.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Definir condiciones de Fragmentación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanelDefinirPredicadosSimples.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelAtributo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAtributo.setText("Atributo:");

        jLabelOperador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelOperador.setText("Operador:");

        jLabelValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelValor.setText("Valor:");

        jComboBoxAtributo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxAtributo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAtributoItemStateChanged(evt);
            }
        });

        jComboBoxOperador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxOperador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOperadorItemStateChanged(evt);
            }
        });

        jTextFieldValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Tipo:");

        jTextFieldTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButtonGenerarPS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonGenerarPS.setText("Generar Predicados Simples");
        jButtonGenerarPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarPSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDefinirPredicadosSimplesLayout = new javax.swing.GroupLayout(jPanelDefinirPredicadosSimples);
        jPanelDefinirPredicadosSimples.setLayout(jPanelDefinirPredicadosSimplesLayout);
        jPanelDefinirPredicadosSimplesLayout.setHorizontalGroup(
            jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDefinirPredicadosSimplesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGenerarPS)
                    .addGroup(jPanelDefinirPredicadosSimplesLayout.createSequentialGroup()
                        .addComponent(jLabelAtributo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDefinirPredicadosSimplesLayout.createSequentialGroup()
                                .addComponent(jComboBoxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDefinirPredicadosSimplesLayout.createSequentialGroup()
                                .addGroup(jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelOperador)
                                    .addComponent(jLabelValor))
                                .addGap(46, 46, 46)
                                .addGroup(jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxOperador, 0, 125, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValor))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelDefinirPredicadosSimplesLayout.setVerticalGroup(
            jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDefinirPredicadosSimplesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAtributo)
                    .addComponent(jComboBoxAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOperador)
                    .addComponent(jComboBoxOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelDefinirPredicadosSimplesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGenerarPS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelGenerarFragmentosMiniterminos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGenerarFragmentosMiniterminos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Definir condiciones de Fragmentación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanelGenerarFragmentosMiniterminos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelMostrarPredicadosSimples.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelMostrarPredicadosSimples.setText("Mostrar Predicados Simples");

        jButtonGenerarFM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonGenerarFM.setText("Generar F.M.");
        jButtonGenerarFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarFMActionPerformed(evt);
            }
        });

        jTablePredicadosSimples.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTablePredicadosSimples.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número de Predicado", "Predicado", "GenerarFM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTabla3.setViewportView(jTablePredicadosSimples);

        javax.swing.GroupLayout jPanelGenerarFragmentosMiniterminosLayout = new javax.swing.GroupLayout(jPanelGenerarFragmentosMiniterminos);
        jPanelGenerarFragmentosMiniterminos.setLayout(jPanelGenerarFragmentosMiniterminosLayout);
        jPanelGenerarFragmentosMiniterminosLayout.setHorizontalGroup(
            jPanelGenerarFragmentosMiniterminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGenerarFragmentosMiniterminosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGenerarFM)
                .addGap(186, 186, 186))
            .addGroup(jPanelGenerarFragmentosMiniterminosLayout.createSequentialGroup()
                .addGroup(jPanelGenerarFragmentosMiniterminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGenerarFragmentosMiniterminosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelMostrarPredicadosSimples))
                    .addGroup(jPanelGenerarFragmentosMiniterminosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPaneTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGenerarFragmentosMiniterminosLayout.setVerticalGroup(
            jPanelGenerarFragmentosMiniterminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGenerarFragmentosMiniterminosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelMostrarPredicadosSimples)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPaneTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonGenerarFM)
                .addGap(23, 23, 23))
        );

        jPanelColocarFragmentosMiniterminos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelColocarFragmentosMiniterminos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Definir condiciones de Fragmentación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanelColocarFragmentosMiniterminos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabelSitio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSitio.setText("Sitio:");

        jComboBoxSitio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxSitio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "local", "Julian", "Omar" }));

        jButtonEnviarFH.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonEnviarFH.setText("Enviar");
        jButtonEnviarFH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarFHActionPerformed(evt);
            }
        });

        tablaCondicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fragmento", "Condiciones"
            }
        ));
        jScrollPane1.setViewportView(tablaCondicion);

        javax.swing.GroupLayout jPanelColocarFragmentosMiniterminosLayout = new javax.swing.GroupLayout(jPanelColocarFragmentosMiniterminos);
        jPanelColocarFragmentosMiniterminos.setLayout(jPanelColocarFragmentosMiniterminosLayout);
        jPanelColocarFragmentosMiniterminosLayout.setHorizontalGroup(
            jPanelColocarFragmentosMiniterminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColocarFragmentosMiniterminosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSitio)
                .addGap(56, 56, 56)
                .addComponent(jComboBoxSitio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonEnviarFH)
                .addGap(24, 24, 24))
            .addGroup(jPanelColocarFragmentosMiniterminosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelColocarFragmentosMiniterminosLayout.setVerticalGroup(
            jPanelColocarFragmentosMiniterminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColocarFragmentosMiniterminosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelColocarFragmentosMiniterminosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSitio)
                    .addComponent(jComboBoxSitio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEnviarFH))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanelFragmentacionHorizontalLayout = new javax.swing.GroupLayout(jPanelFragmentacionHorizontal);
        jPanelFragmentacionHorizontal.setLayout(jPanelFragmentacionHorizontalLayout);
        jPanelFragmentacionHorizontalLayout.setHorizontalGroup(
            jPanelFragmentacionHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFragmentacionHorizontalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFragmentacionHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFragmentacionHorizontalLayout.createSequentialGroup()
                        .addComponent(jPanelCondicionesFrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelGenerarFragmentosMiniterminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFragmentacionHorizontalLayout.createSequentialGroup()
                        .addComponent(jPanelDefinirPredicadosSimples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelColocarFragmentosMiniterminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanelFragmentacionHorizontalLayout.setVerticalGroup(
            jPanelFragmentacionHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFragmentacionHorizontalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelFragmentacionHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelGenerarFragmentosMiniterminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCondicionesFrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFragmentacionHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDefinirPredicadosSimples, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelColocarFragmentosMiniterminos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneFragmentacion.addTab("Fragmenatción Horizontal", jPanelFragmentacionHorizontal);

        jPanelFragmentacionVertical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanelDefinirDominioFragmentos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDefinirDominioFragmentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Definir Dominio De Fragmentación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabelCargarRelación.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabelCargarRelación.setText("Cargar Relación:");

        jComboBoxRelacionSel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jComboBoxRelacionSel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxRelacionSelItemStateChanged(evt);
            }
        });
        jComboBoxRelacionSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRelacionSelActionPerformed(evt);
            }
        });

        jTableRelacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTableRelacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Field", "Type", "Null", "Key"
            }
        ));
        jTableRelacion.setEnabled(false);
        jScrollPaneTablaRel.setViewportView(jTableRelacion);

        javax.swing.GroupLayout jPanelDefinirDominioFragmentosLayout = new javax.swing.GroupLayout(jPanelDefinirDominioFragmentos);
        jPanelDefinirDominioFragmentos.setLayout(jPanelDefinirDominioFragmentosLayout);
        jPanelDefinirDominioFragmentosLayout.setHorizontalGroup(
            jPanelDefinirDominioFragmentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDefinirDominioFragmentosLayout.createSequentialGroup()
                .addGroup(jPanelDefinirDominioFragmentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDefinirDominioFragmentosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelCargarRelación, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBoxRelacionSel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDefinirDominioFragmentosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPaneTablaRel, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelDefinirDominioFragmentosLayout.setVerticalGroup(
            jPanelDefinirDominioFragmentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDefinirDominioFragmentosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelDefinirDominioFragmentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargarRelación, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRelacionSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPaneTablaRel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelSeleccionarAtributos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSeleccionarAtributos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionar Atributos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        jCheckBoxAtributo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo1.setText("Atributo 1");

        jCheckBoxAtributo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo2.setText("Atributo 2");

        jButtonGenerarF.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButtonGenerarF.setText("Generar F.");
        jButtonGenerarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarFActionPerformed(evt);
            }
        });

        jCheckBoxAtributo3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo3.setText("Atributo 1");

        jCheckBoxAtributo4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo4.setText("Atributo 2");

        jCheckBoxAtributo5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo5.setText("Atributo 1");

        jCheckBoxAtributo6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo6.setText("Atributo 2");

        jCheckBoxAtributo7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo7.setText("Atributo 7");

        jCheckBoxAtributo8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo8.setText("Atributo 10");

        jCheckBoxAtributo9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo9.setText("Atributo 8");

        jCheckBoxAtributo10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo10.setText("Atributo 11");

        jCheckBoxAtributo11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo11.setText("Atributo 9");

        jCheckBoxAtributo12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxAtributo12.setText("Atributo 2");

        javax.swing.GroupLayout jPanelSeleccionarAtributosLayout = new javax.swing.GroupLayout(jPanelSeleccionarAtributos);
        jPanelSeleccionarAtributos.setLayout(jPanelSeleccionarAtributosLayout);
        jPanelSeleccionarAtributosLayout.setHorizontalGroup(
            jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                        .addGap(0, 335, Short.MAX_VALUE)
                        .addComponent(jButtonGenerarF))
                    .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                        .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxAtributo1)
                                    .addComponent(jCheckBoxAtributo2))
                                .addGap(56, 56, 56)
                                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxAtributo3)
                                    .addComponent(jCheckBoxAtributo4))
                                .addGap(38, 38, 38)
                                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxAtributo5)
                                    .addComponent(jCheckBoxAtributo6)))
                            .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxAtributo7)
                                    .addComponent(jCheckBoxAtributo8))
                                .addGap(44, 44, 44)
                                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBoxAtributo9)
                                    .addComponent(jCheckBoxAtributo10))
                                .addGap(38, 38, 38)
                                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBoxAtributo11)
                                    .addComponent(jCheckBoxAtributo12))))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelSeleccionarAtributosLayout.setVerticalGroup(
            jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                        .addComponent(jCheckBoxAtributo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxAtributo2))
                    .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                        .addComponent(jCheckBoxAtributo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxAtributo4))
                    .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                        .addComponent(jCheckBoxAtributo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxAtributo6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                            .addComponent(jCheckBoxAtributo7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBoxAtributo8))
                        .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                            .addComponent(jCheckBoxAtributo9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelSeleccionarAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCheckBoxAtributo10)
                                .addComponent(jCheckBoxAtributo12))))
                    .addGroup(jPanelSeleccionarAtributosLayout.createSequentialGroup()
                        .addComponent(jCheckBoxAtributo11)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButtonGenerarF)
                .addContainerGap())
        );

        jPanelExpresionesAlgrebraicas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelExpresionesAlgrebraicas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expresiones Algebraicas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        jTableExpresion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Expresión", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(jTableExpresion);

        javax.swing.GroupLayout jPanelExpresionesAlgrebraicasLayout = new javax.swing.GroupLayout(jPanelExpresionesAlgrebraicas);
        jPanelExpresionesAlgrebraicas.setLayout(jPanelExpresionesAlgrebraicasLayout);
        jPanelExpresionesAlgrebraicasLayout.setHorizontalGroup(
            jPanelExpresionesAlgrebraicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExpresionesAlgrebraicasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelExpresionesAlgrebraicasLayout.setVerticalGroup(
            jPanelExpresionesAlgrebraicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExpresionesAlgrebraicasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelColocacionFragmentos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelColocacionFragmentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colocación De Fragmentos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabelSeleccionarSitio.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabelSeleccionarSitio.setText("Seleccionar Sitio:");

        jButtonEnviarFV.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButtonEnviarFV.setText("Envíar");
        jButtonEnviarFV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarFVActionPerformed(evt);
            }
        });

        jComboBoxSitio1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxSitio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "local", "Julian", "Omar" }));

        javax.swing.GroupLayout jPanelColocacionFragmentosLayout = new javax.swing.GroupLayout(jPanelColocacionFragmentos);
        jPanelColocacionFragmentos.setLayout(jPanelColocacionFragmentosLayout);
        jPanelColocacionFragmentosLayout.setHorizontalGroup(
            jPanelColocacionFragmentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColocacionFragmentosLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabelSeleccionarSitio)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxSitio1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelColocacionFragmentosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEnviarFV)
                .addContainerGap())
        );
        jPanelColocacionFragmentosLayout.setVerticalGroup(
            jPanelColocacionFragmentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColocacionFragmentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelColocacionFragmentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeleccionarSitio)
                    .addComponent(jComboBoxSitio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButtonEnviarFV)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFragmentacionVerticalLayout = new javax.swing.GroupLayout(jPanelFragmentacionVertical);
        jPanelFragmentacionVertical.setLayout(jPanelFragmentacionVerticalLayout);
        jPanelFragmentacionVerticalLayout.setHorizontalGroup(
            jPanelFragmentacionVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFragmentacionVerticalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFragmentacionVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDefinirDominioFragmentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSeleccionarAtributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFragmentacionVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelColocacionFragmentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExpresionesAlgrebraicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelFragmentacionVerticalLayout.setVerticalGroup(
            jPanelFragmentacionVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFragmentacionVerticalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelFragmentacionVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFragmentacionVerticalLayout.createSequentialGroup()
                        .addComponent(jPanelExpresionesAlgrebraicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelColocacionFragmentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFragmentacionVerticalLayout.createSequentialGroup()
                        .addComponent(jPanelDefinirDominioFragmentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelSeleccionarAtributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneFragmentacion.addTab("Fragmentación Vertical", jPanelFragmentacionVertical);

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneFragmentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneFragmentacion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEsquemaSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEsquemaSelActionPerformed
    }//GEN-LAST:event_jComboBoxEsquemaSelActionPerformed

    private void jComboBoxEsquemaSelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEsquemaSelItemStateChanged
        /* Colocar la información en la tabla de la entidad seleccionada */
        List<descEntity> descEntidad = new ArrayList<>();
        String itemSel = this.jComboBoxEsquemaSel.getSelectedItem().toString();
        DefaultTableModel modeloT = (DefaultTableModel) this.jTableContenidoRelacion.getModel();

        System.out.println("\n Entidad sel (item) : " + itemSel);

        for (int i = 0; i < this.jTableContenidoRelacion.getRowCount(); i++) {
            modeloT.removeRow(i);
            i--;
        }

        try {
            descEntidad = this.cR.descEntidad(itemSel);  //Consultar entidad
        } catch (SQLException ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        Iterator<descEntity> entSel = descEntidad.iterator();
        while (entSel.hasNext()) {
            descEntity dE = entSel.next();
            modeloT.addRow(new Object[]{dE.getField(), dE.getType(), dE.getNull(), dE.getKey(), dE.getDefault(), dE.getExtra()});
        }

        System.out.println("num rows: " + this.jTableContenidoRelacion.getRowCount());
        if (this.jComboBoxEsquemaSel.getSelectedIndex() > -1) {
            this.jComboBoxAtributo.removeAllItems();
            for (int i = 0; i < this.jTableContenidoRelacion.getRowCount(); i++) {
                String valor = (String) this.jTableContenidoRelacion.getValueAt(i, 0);
                this.jComboBoxAtributo.addItem(valor);
            }
        }
    }//GEN-LAST:event_jComboBoxEsquemaSelItemStateChanged

    private void jComboBoxOperadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOperadorItemStateChanged
    }//GEN-LAST:event_jComboBoxOperadorItemStateChanged

    private void jComboBoxAtributoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAtributoItemStateChanged
        if (this.jComboBoxAtributo.getSelectedIndex() > -1) {
            int estado;
            String titulo = "";
            int indice = this.jComboBoxAtributo.getSelectedIndex();
            String dato = (String) this.jTableContenidoRelacion.getValueAt(indice, 1);

            if (dato.contains("int")) {
                estado = 1;
                titulo = "INTEGER";
            } else if (dato.contains("doub")) {
                estado = 2;
                titulo = "DOUBLE";
            } else if (dato.contains("varc")) {
                estado = 3;
                titulo = "VARCHAR";
            } else {
                estado = -1;
            }

            this.jComboBoxOperador.removeAllItems();
            this.jTextFieldTipo.setText(titulo);

            switch (estado) {
                case 1:
                    this.jComboBoxOperador.addItem("=");
                    this.jComboBoxOperador.addItem(">");
                    this.jComboBoxOperador.addItem(">=");
                    this.jComboBoxOperador.addItem("<");
                    this.jComboBoxOperador.addItem("<=");
                    this.jComboBoxOperador.addItem("!=");
                    break;
                case 2:
                    this.jComboBoxOperador.addItem("=");
                    this.jComboBoxOperador.addItem(">");
                    this.jComboBoxOperador.addItem(">=");
                    this.jComboBoxOperador.addItem("<");
                    this.jComboBoxOperador.addItem("<=");
                    this.jComboBoxOperador.addItem("!=");
                    break;
                case 3:
                    this.jComboBoxOperador.addItem("=");
                    this.jComboBoxOperador.addItem("!=");
                    break;
            }
        }
    }//GEN-LAST:event_jComboBoxAtributoItemStateChanged

    private void jButtonGenerarPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarPSActionPerformed
        DefaultTableModel TPS = (DefaultTableModel) this.jTablePredicadosSimples.getModel();
        TableColumn sel = this.jTablePredicadosSimples.getColumnModel().getColumn(2);
        JCheckBox checkbox = new JCheckBox("", true);

        try {
            String statement = "select count(*) as cuenta from " + (String) this.jComboBoxEsquemaSel.getSelectedItem()
                    + " where " + (String) this.jComboBoxAtributo.getSelectedItem()
                    + (String) this.jComboBoxOperador.getSelectedItem() + this.jTextFieldValor.getText();

            System.out.println("\n query: " + statement);
            System.out.println("\n ? : " + this.jTextFieldTipo.getText());

            if (this.jTextFieldValor.getText().startsWith("0") || this.jTextFieldValor.getText().startsWith("1") || this.jTextFieldValor.getText().startsWith("2") || this.jTextFieldValor.getText().startsWith("3") || this.jTextFieldValor.getText().startsWith("4") || this.jTextFieldValor.getText().startsWith("5")
                    || this.jTextFieldValor.getText().startsWith("6") || this.jTextFieldValor.getText().startsWith("7") || this.jTextFieldValor.getText().startsWith("8") || this.jTextFieldValor.getText().startsWith("9")) {
                if (this.jTextFieldTipo.getText().compareTo("VARCHAR") == 0) {
                    JOptionPane.showMessageDialog(this, "No se puede utilizar este valor : " + this.jTextFieldValor.getText() + " para realizar la consular. \n Ya que es diferente el tipo de dato. \n Favor de ingresar un valor valido ");
                    this.jTextFieldValor.setText("");
                } else {
                    if (this.cR.verificarConsulta((String) this.jComboBoxEsquemaSel.getSelectedItem(), (String) this.jComboBoxAtributo.getSelectedItem(), (String) this.jComboBoxOperador.getSelectedItem(), this.jTextFieldValor.getText(), 1) > 0) {
                        this.cR.registrarPredicadoS((String) this.jComboBoxEsquemaSel.getSelectedItem(), (String) this.jComboBoxAtributo.getSelectedItem(), (String) this.jComboBoxOperador.getSelectedItem(), this.jTextFieldValor.getText());
                        TPS.addRow(new Object[]{"P(" + cps + ") : ", (String) this.jComboBoxAtributo.getSelectedItem() + " " + (String) this.jComboBoxOperador.getSelectedItem() + " " + this.jTextFieldValor.getText()});
                        sel.setCellEditor(new DefaultCellEditor(checkbox));
                        this.cps++;
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede generar el predicado simple con esté valor, ingresa otro valor :) ");
                    }
                }
            } else {
                 String cadena_string;
                        if(this.jTextFieldTipo.getText().equals("VARCHAR"))
                            cadena_string="'"+this.jTextFieldValor.getText()+"'";
                        else cadena_string=this.jTextFieldValor.getText();
                       
                if (this.jTextFieldTipo.getText().compareTo("VARCHAR") == 0) {
                    if (this.cR.verificarConsulta((String) this.jComboBoxEsquemaSel.getSelectedItem(), (String) this.jComboBoxAtributo.getSelectedItem(), (String) this.jComboBoxOperador.getSelectedItem(), cadena_string, 0) > 0) {
                        this.cR.registrarPredicadoS((String) this.jComboBoxEsquemaSel.getSelectedItem(), (String) this.jComboBoxAtributo.getSelectedItem(), (String) this.jComboBoxOperador.getSelectedItem(), cadena_string);
                        TPS.addRow(new Object[]{"P(" + cps + ") : ", (String) this.jComboBoxAtributo.getSelectedItem() + " " + (String) this.jComboBoxOperador.getSelectedItem() + " " + cadena_string});
                        sel.setCellEditor(new DefaultCellEditor(checkbox));
                        this.cps++;
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede generar el predicado simple con esté valor, ingresa otro valor :) ");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede utilizar este valor : " + this.jTextFieldValor.getText() + " para realizar la consular. \n Ya que es diferente el tipo de dato. \n Favor de ingresar un valor valido ");
                    this.jTextFieldValor.setText("");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.jTextFieldValor.setText("");
    }//GEN-LAST:event_jButtonGenerarPSActionPerformed

    private void jButtonGenerarFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarFMActionPerformed
        int contPs = 0;
        LinkedList condicion = new LinkedList();
        LinkedList tabla = new LinkedList();
        for (int j = 0; j < this.jTablePredicadosSimples.getRowCount(); j++) {
            System.out.println("Mensaje: " + this.jTablePredicadosSimples.getValueAt(j, 2));
            if (this.jTablePredicadosSimples.getValueAt(j, 2).toString().equals("true")) {
                System.out.println("Fila seleccionada: " + j + " valor columna GenerarFM : " + this.jTablePredicadosSimples.getValueAt(j, 2));

                String cadena = (this.cR.validarFragmentosM(j, (String) this.jTablePredicadosSimples.getValueAt(j, 1)));
                String[] cadenasub = cadena.split(":");
                tabla.add(cadenasub[0]);
                condicion.add(cadenasub[1]);

                if (contPs >= 1) {
                    System.out.println("Seleccionó 2 o más");
                }
                contPs++;
                /* Revisar otra forma de seleccionar los predicados siimple */
            } else {
                System.out.println("No hay predicados seleccionados");
            }
        }
        int tam = tabla.size();
        String resultado = "";
        String[] tablin = new String[tam], condicionin = new String[tam];

        for (int i = 0; i <= tabla.size(); i++) {
            tablin[i] = (String) tabla.pop();
            condicionin[i] = (String) condicion.pop();
        }

        DefaultTableModel modeloT = (DefaultTableModel) this.tablaCondicion.getModel();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                try {
                    resultado = this.cR.verificarConsulta(tablin[i], condicionin[0], i, condicionin[1], j);
                } catch (SQLException ex) {
                    Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                String[] resultados = resultado.split(":");
                if (Integer.parseInt(resultados[0]) > 0) {
                    String datito = resultados[1] + " and " + resultados[2];
                    Object[] data = {modeloT.getRowCount() + 1, datito};
                    modeloT.addRow(data);
                }
            }

        }


    }//GEN-LAST:event_jButtonGenerarFMActionPerformed

    private void jButtonEnviarFHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarFHActionPerformed
        String sitio = "";
        String base = "";
        int resp = this.jComboBoxSitio.getSelectedIndex();
        String tabla = (String) this.jComboBoxEsquemaSel.getSelectedItem();
        switch (resp) {
            case 1:
                sitio = "localhost";
                base = "proyectolocal";
                break;
            case 2:
                //ipjulian
                sitio = ipjulian;
                base = "proyecto";
                break;
            case 3:
                //ipmeji
                sitio = ipmeji;
                base = "proyecto";
                break;
        }
        if (this.tablaCondicion.getSelectedRow() > -1) {
            String quer = (String) this.tablaCondicion.getValueAt(this.tablaCondicion.getSelectedRow(), 1);
            try {

                this.cR.eliminar(sitio, base, tabla, quer);
                this.cR.cargarASitio(sitio, base, tabla, quer);
            } catch (SQLException ex) {
                Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige un fragmento a enviar");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnviarFHActionPerformed

    private void jComboBoxRelacionSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRelacionSelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRelacionSelActionPerformed

    private void jComboBoxRelacionSelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxRelacionSelItemStateChanged
        List<descEntity> descEntidad = new ArrayList<>();
        String itemSel = this.jComboBoxRelacionSel.getSelectedItem().toString();
        DefaultTableModel modeloT = (DefaultTableModel) this.jTableRelacion.getModel();

        System.out.println("\n Entidad sel (item) : " + itemSel);

        for (int i = 0; i < this.jTableRelacion.getRowCount(); i++) {
            modeloT.removeRow(i);
            i--;
        }

        try {
            descEntidad = this.cR.descEntidad(itemSel);  //Consultar entidad
        } catch (Exception ex) {
            Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        Iterator<descEntity> entSel = descEntidad.iterator();
        while (entSel.hasNext()) {
            descEntity dE = entSel.next();
            modeloT.addRow(new Object[]{dE.getField(), dE.getType(), dE.getNull(), dE.getKey()});
        }

        System.out.println("num rows: " + this.jTableRelacion.getRowCount());
        if (this.jComboBoxRelacionSel.getSelectedIndex() > -1) {
            for (int i = 0; i < this.jTableRelacion.getRowCount(); i++) {
                String valor = (String) this.jTableRelacion.getValueAt(i, 0);
                //this.jComboBoxAtributo.addItem(valor);
                switch (i) {
                    case 0:
                        this.jCheckBoxAtributo1.setText(valor);
                        this.jCheckBoxAtributo1.setVisible(true);
                        this.jCheckBoxAtributo2.setVisible(false);
                        this.jCheckBoxAtributo3.setVisible(false);
                        this.jCheckBoxAtributo4.setVisible(false);
                        this.jCheckBoxAtributo5.setVisible(false);
                        this.jCheckBoxAtributo6.setVisible(false);
                        this.jCheckBoxAtributo7.setVisible(false);
                        this.jCheckBoxAtributo8.setVisible(false);
                        this.jCheckBoxAtributo9.setVisible(false);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);
                        break;
                    case 1:
                        this.jCheckBoxAtributo2.setText(valor);
                        this.jCheckBoxAtributo2.setVisible(true);
                        this.jCheckBoxAtributo3.setVisible(false);
                        this.jCheckBoxAtributo4.setVisible(false);
                        this.jCheckBoxAtributo5.setVisible(false);
                        this.jCheckBoxAtributo6.setVisible(false);
                        this.jCheckBoxAtributo7.setVisible(false);
                        this.jCheckBoxAtributo8.setVisible(false);
                        this.jCheckBoxAtributo9.setVisible(false);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);
                        break;
                    case 2:
                        this.jCheckBoxAtributo3.setText(valor);
                        this.jCheckBoxAtributo3.setVisible(true);
                        this.jCheckBoxAtributo4.setVisible(false);
                        this.jCheckBoxAtributo5.setVisible(false);
                        this.jCheckBoxAtributo6.setVisible(false);
                        this.jCheckBoxAtributo7.setVisible(false);
                        this.jCheckBoxAtributo8.setVisible(false);
                        this.jCheckBoxAtributo9.setVisible(false);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);
                        break;
                    case 3:
                        this.jCheckBoxAtributo4.setText(valor);
                        this.jCheckBoxAtributo4.setVisible(true);
                        this.jCheckBoxAtributo5.setVisible(false);
                        this.jCheckBoxAtributo6.setVisible(false);
                        this.jCheckBoxAtributo7.setVisible(false);
                        this.jCheckBoxAtributo8.setVisible(false);
                        this.jCheckBoxAtributo9.setVisible(false);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);
                        break;
                    case 4:
                        this.jCheckBoxAtributo5.setText(valor);
                        this.jCheckBoxAtributo5.setVisible(true);
                        this.jCheckBoxAtributo6.setVisible(false);
                        this.jCheckBoxAtributo7.setVisible(false);
                        this.jCheckBoxAtributo8.setVisible(false);
                        this.jCheckBoxAtributo9.setVisible(false);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);

                        break;
                    case 5:
                        this.jCheckBoxAtributo6.setText(valor);
                        this.jCheckBoxAtributo6.setVisible(true);
                        this.jCheckBoxAtributo7.setVisible(false);
                        this.jCheckBoxAtributo8.setVisible(false);
                        this.jCheckBoxAtributo9.setVisible(false);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);

                        break;
                    case 6:
                        this.jCheckBoxAtributo7.setText(valor);
                        this.jCheckBoxAtributo7.setVisible(true);
                        this.jCheckBoxAtributo8.setVisible(false);
                        this.jCheckBoxAtributo9.setVisible(false);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);

                        break;
                    case 7:
                        this.jCheckBoxAtributo8.setText(valor);
                        this.jCheckBoxAtributo8.setVisible(true);
                        this.jCheckBoxAtributo9.setVisible(false);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);

                        break;
                    case 8:
                        this.jCheckBoxAtributo9.setText(valor);
                        this.jCheckBoxAtributo9.setVisible(true);
                        this.jCheckBoxAtributo10.setVisible(false);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);

                        break;
                    case 9:
                        this.jCheckBoxAtributo10.setText(valor);
                        this.jCheckBoxAtributo10.setVisible(true);
                        this.jCheckBoxAtributo11.setVisible(false);
                        this.jCheckBoxAtributo12.setVisible(false);

                        break;
                    case 10:
                        this.jCheckBoxAtributo11.setText(valor);
                        this.jCheckBoxAtributo11.setVisible(true);
                        this.jCheckBoxAtributo12.setVisible(false);

                        break;
                    case 11:
                        this.jCheckBoxAtributo12.setText(valor);
                        this.jCheckBoxAtributo12.setVisible(true);
                        break;
                    default:
                        System.out.println("khe como llegaste aqui");

                }
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRelacionSelItemStateChanged

    private void jButtonGenerarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarFActionPerformed

        if (!this.jCheckBoxAtributo1.isSelected()) {
            this.jCheckBoxAtributo1.setSelected(true);
        } else {
            String nombre = JOptionPane.showInputDialog(this, "Nombre del fragmento");
            String cadena = "π ";
            for (int i = 0; i < this.jTableRelacion.getRowCount(); i++) {

                //this.jComboBoxAtributo.addItem(valor);
                switch (i) {
                    case 0:
                        if (this.jCheckBoxAtributo1.isSelected()) {
                            cadena += this.jCheckBoxAtributo1.getText();
                        }
                        break;
                    case 1:
                        if (this.jCheckBoxAtributo2.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo2.getText();
                        }
                        break;
                    case 2:
                        if (this.jCheckBoxAtributo3.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo3.getText();
                        }
                        break;
                    case 3:
                        if (this.jCheckBoxAtributo4.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo4.getText();
                        }
                        break;
                    case 4:
                        if (this.jCheckBoxAtributo5.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo5.getText();
                        }
                        break;
                    case 5:
                        if (this.jCheckBoxAtributo6.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo6.getText();
                        }
                        break;
                    case 6:
                        if (this.jCheckBoxAtributo7.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo7.getText();
                        }
                        break;
                    case 7:
                        if (this.jCheckBoxAtributo8.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo8.getText();
                        }
                        break;
                    case 8:
                        if (this.jCheckBoxAtributo9.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo9.getText();
                        }
                        break;
                    case 9:
                        if (this.jCheckBoxAtributo10.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo10.getText();
                        }
                        break;
                    case 10:
                        if (this.jCheckBoxAtributo11.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo11.getText();
                        }
                        break;
                    case 11:
                        if (this.jCheckBoxAtributo12.isSelected()) {
                            cadena += "," + this.jCheckBoxAtributo12.getText();
                        }
                        break;

                    default:
                        System.out.println("khe como llegaste aqui");

                }
            }
            cadena += "(" + (String) this.jComboBoxRelacionSel.getSelectedItem() + ")";
            DefaultTableModel modeloT = (DefaultTableModel) this.jTableExpresion.getModel();
            Object[] rowData = {modeloT.getRowCount() + 1, cadena, nombre};
            modeloT.addRow(rowData);
        }

    }//GEN-LAST:event_jButtonGenerarFActionPerformed

    private void jButtonEnviarFVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarFVActionPerformed
        String elemento = (String) this.jTableExpresion.getValueAt(this.jTableExpresion.getSelectedRow(), 1);
        String elementosin = elemento.substring(2);
        String elementosinTabla = elementosin.substring(0, elementosin.indexOf("("));
        String nombreTabla = elementosin.substring(elementosin.indexOf("(") + 1, elementosin.indexOf(")"));
        String[] elementos = elementosinTabla.split(",");
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
        String tablanueva = (String) this.jTableExpresion.getValueAt(this.jTableExpresion.getSelectedRow(), 2);
        String queryTabla = "create table " + tablanueva+" " + " (";
        String query2 = "Insert into " + tablanueva + " ( ";
        String datos = ") ( select ";
        String elemen="";
        String complemento = " from proyecto." + nombreTabla + ")";
        DefaultTableModel modeloT = (DefaultTableModel) this.jTableRelacion.getModel();
        int contRes = 0;
        for (int i = 0; i < this.jTableRelacion.getRowCount(); i++) {
            String valor = (String) modeloT.getValueAt(i, 0);
            if (contRes < elementos.length) {
                System.out.println(contRes + "//" + elementos.length);
                if (elementos[contRes].equals(valor)) {
                    if (contRes != 0 && contRes != elementos.length) {
                        queryTabla += " , ";
                        query2 += " , ";
                        datos += " , ";
                        elemen+=" , ";
                    }
                    String valorsito = (String) modeloT.getValueAt(i, 1);
                    queryTabla += valor + " " + valorsito;
                    query2 += valor;
                    datos += valor;
                    elemen+=valor;
                    if (contRes == 0) {
                        queryTabla += " primary key not null";
                    }
                    contRes++;
                    System.out.println(contRes + "//" + elementos.length);
                }
            } else {
                break;
            }
        }
        queryTabla += ")";
        String sitio = "";
        String base = "";
        int resp = this.jComboBoxSitio1.getSelectedIndex();
        String tabla = (String) this.jComboBoxRelacionSel.getSelectedItem();
        switch (resp) {
            case 1:
                sitio = "localhost";
                base = "proyectolocal";
                break;
            case 2:
                //ipjulian
                sitio = ipjulian;
                base = "proyecto";
                break;
            case 3:
                //ipmeji
                sitio = ipmeji;
                base = "proyecto";
                break;
        }
        query2 += datos + complemento;
        System.out.println(elemen);
        
        System.out.println("query2:"+query2);
        System.out.println(tabla);
        this.cR.crearFragmento(sitio, base, queryTabla,elemen,tabla,tablanueva);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnviarFVActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI_fragmentacion().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(GUI_fragmentacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLeerEsquema;
    private javax.swing.JButton jButtonEnviarFH;
    private javax.swing.JButton jButtonEnviarFV;
    private javax.swing.JButton jButtonGenerarF;
    private javax.swing.JButton jButtonGenerarFM;
    private javax.swing.JButton jButtonGenerarPS;
    private javax.swing.JCheckBox jCheckBoxAtributo1;
    private javax.swing.JCheckBox jCheckBoxAtributo10;
    private javax.swing.JCheckBox jCheckBoxAtributo11;
    private javax.swing.JCheckBox jCheckBoxAtributo12;
    private javax.swing.JCheckBox jCheckBoxAtributo2;
    private javax.swing.JCheckBox jCheckBoxAtributo3;
    private javax.swing.JCheckBox jCheckBoxAtributo4;
    private javax.swing.JCheckBox jCheckBoxAtributo5;
    private javax.swing.JCheckBox jCheckBoxAtributo6;
    private javax.swing.JCheckBox jCheckBoxAtributo7;
    private javax.swing.JCheckBox jCheckBoxAtributo8;
    private javax.swing.JCheckBox jCheckBoxAtributo9;
    private javax.swing.JComboBox<String> jComboBoxAtributo;
    private javax.swing.JComboBox<String> jComboBoxEsquemaSel;
    private javax.swing.JComboBox<String> jComboBoxOperador;
    private javax.swing.JComboBox<String> jComboBoxRelacionSel;
    private javax.swing.JComboBox<String> jComboBoxSitio;
    private javax.swing.JComboBox<String> jComboBoxSitio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAtributo;
    private javax.swing.JLabel jLabelCargarRelación;
    private javax.swing.JLabel jLabelMostrarPredicadosSimples;
    private javax.swing.JLabel jLabelOperador;
    private javax.swing.JLabel jLabelSeleccionarSitio;
    private javax.swing.JLabel jLabelSitio;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanelColocacionFragmentos;
    private javax.swing.JPanel jPanelColocarFragmentosMiniterminos;
    private javax.swing.JPanel jPanelCondicionesFrag;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelDefinirDominioFragmentos;
    private javax.swing.JPanel jPanelDefinirPredicadosSimples;
    private javax.swing.JPanel jPanelExpresionesAlgrebraicas;
    private javax.swing.JPanel jPanelFragmentacionHorizontal;
    private javax.swing.JPanel jPanelFragmentacionVertical;
    private javax.swing.JPanel jPanelGenerarFragmentosMiniterminos;
    private javax.swing.JPanel jPanelSeleccionarAtributos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JScrollPane jScrollPaneTabla3;
    private javax.swing.JScrollPane jScrollPaneTablaRel;
    private javax.swing.JTabbedPane jTabbedPaneFragmentacion;
    private javax.swing.JTable jTableContenidoRelacion;
    private javax.swing.JTable jTableExpresion;
    private javax.swing.JTable jTablePredicadosSimples;
    private javax.swing.JTable jTableRelacion;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTable tablaCondicion;
    // End of variables declaration//GEN-END:variables
}
