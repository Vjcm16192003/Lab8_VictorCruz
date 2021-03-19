package lab8_victorcruz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static sun.util.calendar.CalendarUtils.mod;

/**
 *
 * @author Victor Jafet Cruz
 */
public class MAIN extends javax.swing.JFrame {
    public MAIN() {
        initComponents();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_Tipo.getModel();
        modelo.addElement("Estudiante");
        modelo.addElement("Docente");
        modelo.addElement("Administrativo");
        modelo.addElement("Ejecutivo");
        modelo.addElement("Decano");
        CB_Tipo.setModel(modelo);
        CB_TipoBusc.setModel(modelo);
        ArrayList usus = new ArrayList();
        
        
        try{
            Dba db = new Dba("./Database_Lab8.accdb");
            db.conectar();
            db.query.execute("select llave from persona"); 
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {

                usus.add(rs.getInt(7));
                DefaultComboBoxModel com = (DefaultComboBoxModel) CB_Busqueda.getModel();
                com.addElement(rs.getInt(7));
                CB_Busqueda.setModel(com);
                //System.out.println(rs.getString(1));
            }
            
            
        }
        catch(Exception e){}
        

        
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexo = new javax.swing.ButtonGroup();
        Trabajo = new javax.swing.ButtonGroup();
        JD_Modificar = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        apellido2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        nacionalidad2 = new javax.swing.JTextField();
        edad2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        residencia2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        numcuenta2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        profesion2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        facultad2 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        CB_Tipo2 = new javax.swing.JComboBox<>();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        Modificar_ = new javax.swing.JButton();
        CB_Personas1 = new javax.swing.JComboBox<>();
        TP_MetodoAdmin = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nacionalidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        residencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numcuenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        profesion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        facultad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        CB_Tipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        CrearPersona = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CB_Personas = new javax.swing.JComboBox<>();
        listar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        modifcar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA_Listar = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        CB_Busqueda = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTA_Lista = new javax.swing.JTextArea();
        CB_TipoBusc = new javax.swing.JComboBox<>();

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel23.setText("Nombre");

        jLabel24.setText("Apellido");

        jLabel25.setText("Nacionalidad");

        jLabel26.setText("Edad");

        jLabel27.setText("Residencia");

        jLabel28.setText("Num Cuenta/Talento");

        jLabel29.setText("Profesion");

        jLabel30.setText("Facultad");

        jLabel31.setText("Trabajo");

        jLabel32.setText("Tipo Persona");

        Sexo.add(jRadioButton5);
        jRadioButton5.setText("F");

        Sexo.add(jRadioButton6);
        jRadioButton6.setText("M");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel33.setText("Sexo");

        Modificar_.setText("Modificar");
        Modificar_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificar_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(residencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(34, 34, 34)
                        .addComponent(edad2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(profesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facultad2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(numcuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CB_Personas1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nacionalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(CB_Tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel33))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jRadioButton5)
                                .addGap(29, 29, 29)
                                .addComponent(jRadioButton6)))
                        .addContainerGap(162, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Modificar_)
                        .addGap(29, 29, 29))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 307, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(CB_Personas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nacionalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel32)
                            .addComponent(CB_Tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(edad2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(residencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numcuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Modificar_)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(profesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(facultad2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("", jPanel5);

        javax.swing.GroupLayout JD_ModificarLayout = new javax.swing.GroupLayout(JD_Modificar.getContentPane());
        JD_Modificar.getContentPane().setLayout(JD_ModificarLayout);
        JD_ModificarLayout.setHorizontalGroup(
            JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        JD_ModificarLayout.setVerticalGroup(
            JD_ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TP_MetodoAdmin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TP_MetodoAdminStateChanged(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nacionalidad");

        jLabel4.setText("Edad");

        jLabel5.setText("Residencia");

        jLabel6.setText("Num Cuenta/Talento");

        jLabel7.setText("Profesion");

        jLabel8.setText("Facultad");

        jLabel9.setText("Sexo");

        jLabel10.setText("Tipo Persona");

        Sexo.add(jRadioButton1);
        jRadioButton1.setText("F");

        Sexo.add(jRadioButton2);
        jRadioButton2.setText("M");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Trabajo");

        CrearPersona.setText("Crear");
        CrearPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearPersonaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(residencia, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(numcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CrearPersona)
                        .addGap(75, 75, 75))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jRadioButton1)
                                        .addGap(35, 35, 35)
                                        .addComponent(jRadioButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jRadioButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(CB_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(residencia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CrearPersona)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(51, Short.MAX_VALUE))))
        );

        TP_MetodoAdmin.addTab("Agregar", jPanel1);

        listar.setText("Listar");
        listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarMouseClicked(evt);
            }
        });
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        modifcar.setText("Modificar");
        modifcar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifcarMouseClicked(evt);
            }
        });

        JTA_Listar.setColumns(20);
        JTA_Listar.setRows(5);
        jScrollPane1.setViewportView(JTA_Listar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(CB_Personas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(listar)
                        .addGap(26, 26, 26)
                        .addComponent(modifcar)
                        .addGap(42, 42, 42)
                        .addComponent(Eliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listar)
                    .addComponent(modifcar)
                    .addComponent(Eliminar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        TP_MetodoAdmin.addTab("Metodos Administrativos", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        TP_MetodoAdmin.addTab("Filtración", jPanel4);

        jButton1.setText("LLave Primaria");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Tipo");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        JTA_Lista.setColumns(20);
        JTA_Lista.setRows(5);
        jScrollPane2.setViewportView(JTA_Lista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CB_Busqueda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(89, 89, 89)
                                .addComponent(CB_TipoBusc, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton1)
                        .addGap(297, 297, 297)
                        .addComponent(jButton2)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CB_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(CB_TipoBusc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        TP_MetodoAdmin.addTab("Busqueda", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TP_MetodoAdmin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TP_MetodoAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void CrearPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearPersonaMouseClicked
        Dba db = new Dba("./Database_Lab8.accdb");
        db.conectar();
        try {
            int ed,num_cuenta;
            String nom,ape,nac,lug_res,sexo = "",lug_trb,profes,facultad,tipo;
            ed = Integer.parseInt(edad.getText());
            num_cuenta = Integer.parseInt(numcuenta.getText());
            nom = nombre.getText();
            ape =apellido.getText();
            nac = nacionalidad.getText();
            lug_res = residencia.getText();
            if (jRadioButton1.isSelected()){
                sexo = "F";
            }else if (jRadioButton2.isSelected()){
                sexo = "M";
            }else{
               JOptionPane.showMessageDialog(this, "Seleccione un Elemento");
            }
            profes = profesion.getText();
            facultad = this.facultad.getText();
            tipo = (String) CB_Tipo.getSelectedItem();
            lug_trb = jTextField9.getText();
            PersonaGlobal.setTipo(tipo);
            
            db.query.execute("INSERT INTO persona"
                    + " (nombre,apellido,nacionalidad,edad,residencia,sexo,llave,profesion,lugartrabajo,facultad,tipo)"
                    + " VALUES('" + nom + "', '" + ape + "', '" + nac + "', '" + ed + "', '" + lug_res + "', '" + sexo + "', '" + num_cuenta + "', '" + profes + "', '" + lug_trb + "', '" + facultad + "', '" + tipo + "')");
            db.commit();
            
            JOptionPane.showMessageDialog(this, "Elemento agregado exitosamente!");
        } catch (SQLException ex) {
        }
        db.desconectar();
    }//GEN-LAST:event_CrearPersonaMouseClicked

    private void modifcarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifcarMouseClicked
       String mod = CB_Personas1.getSelectedItem().toString();
        int ed, num_cuenta;
        String nom, ape, nac, lug_res, sexo = "", lug_trb, profes, facultad, tipo;
        ed = Integer.parseInt(edad.getText());
        num_cuenta = Integer.parseInt(numcuenta.getText());
        nom = nombre2.getText();
        ape = apellido2.getText();
        nac = nacionalidad2.getText();
        lug_res = residencia2.getText();
        if (jRadioButton5.isSelected()) {
            sexo = "F";
        } else if (jRadioButton6.isSelected()) {
            sexo = "M";
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un Elemento");
        }
        profes = profesion2.getText();
        facultad = facultad2.getText();
        tipo = (String) CB_Tipo2.getSelectedItem();
        PersonaGlobal.setTipo(tipo);
        lug_trb = jTextField11.getText();


        Dba db = new Dba("./Database_Lab8.accdb");
        db.conectar();
//(nombre,apellido,nacionalidad,edad,residencia,sexo,llave,profesion,lugartrabajo,facultad,tipo)"
        try {
            db.query.execute("update persona set nombre = '" + nom + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set apellido = '" + ape + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set nacionalidad = '" + nac + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set edad = '" + ed + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set residencia= '" + lug_res + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set sexo = '" + sexo + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set llave = '" + num_cuenta + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set profesion = '" + profes + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set lugartrabajo = '" + lug_trb + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set facultad = '" + facultad + "'   where nombre = '" + mod + "'");
            db.query.execute("update persona set tipo = '" + tipo + "'   where nombre = '" + mod + "'");
            JOptionPane.showMessageDialog(this, "Modificacion Exitosa!");
            db.commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Algo salio mal,intente nuevamente\nAsegurece de llenar todos los campos");
        }
        JOptionPane.showMessageDialog(this, "Se Modifico Exitosamente");
        db.desconectar();
    }//GEN-LAST:event_modifcarMouseClicked

    private void TP_MetodoAdminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TP_MetodoAdminStateChanged
        if (TP_MetodoAdmin.getSelectedIndex() == 1) {
            Dba db = new Dba("./Database_Lab8.accdb");
            try {
                db.conectar();
                db.query.execute("select nombre from persona");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    DefaultComboBoxModel com = (DefaultComboBoxModel) CB_Personas.getModel();
                    com.addElement(rs.getString(1));
                    CB_Personas.setModel(com);
                }

            } catch (Exception e) {

            }
            db.desconectar();
        } else {
            DefaultComboBoxModel com = (DefaultComboBoxModel) CB_Personas.getModel();
            com.removeAllElements();
            CB_Personas.setModel(com);
        }
        if (TP_MetodoAdmin.getSelectedIndex() == 2) {
            Dba db = new Dba("./Database_Lab8.accdb");
            try {
                db.conectar();
                db.query.execute("select llave from persona");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    DefaultComboBoxModel com = (DefaultComboBoxModel) CB_Busqueda.getModel();
                    com.addElement(rs.getString(1));
                    CB_Busqueda.setModel(com);
                }
            } catch (Exception e) {

            }
            db.desconectar();
        } else {
            DefaultComboBoxModel com = (DefaultComboBoxModel) CB_Busqueda.getModel();
            com.removeAllElements();
            CB_Busqueda.setModel(com);
        }

        
    }//GEN-LAST:event_TP_MetodoAdminStateChanged

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        Dba db = new Dba("./Database_Lab8.accdb");
        String mod = CB_Personas.getSelectedItem().toString();
        try {
            db.conectar();
            db.query.execute("delete from persona where nombre = '" + mod + "'");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "Se ha Eliminado Exitosamente");
        db.desconectar();
    }//GEN-LAST:event_EliminarMouseClicked

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void Modificar_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificar_MouseClicked
        Mod();
    }//GEN-LAST:event_Modificar_MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if (jTabbedPane1.getSelectedIndex() == 1) {
            Dba db = new Dba("./Database_Lab8.accdb");
            try {
                db.conectar();
                db.query.execute("select nombre from persona");
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    DefaultComboBoxModel com = (DefaultComboBoxModel) CB_Personas1.getModel();
                    com.addElement(rs.getString(1));
                    CB_Personas1.setModel(com);
                }

            } catch (Exception e) {

            }
            db.desconectar();
        } else {
            DefaultComboBoxModel com = (DefaultComboBoxModel) CB_Personas1.getModel();
            com.removeAllElements();
            CB_Personas1.setModel(com);
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarMouseClicked
        Dba db = new Dba("./Database_Lab8.accdb");
        Persona per =(Persona)CB_Personas.getSelectedItem();
       
        System.out.println( per.getApellido());
        try {
            db.conectar();
            db.query.execute("select nombre,apellido from persona");
            int llave_numero = (int)CB_Busqueda.getSelectedItem();
            
            db.query.execute("Select nombre * from persona where llave='" + llave_numero + "'" );
            
            ResultSet rs = db.query.getResultSet();
            //String s=String.valueOf(i);
            
            while (rs.next()) {
                
                String l = "Nombre: "+rs.getInt(1) + ",  " +" Apellido: " + rs.getString(2)+"\n";
                JTA_Listar.append(l);
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }//GEN-LAST:event_listarMouseClicked

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    
     public void Mod() {
        JD_Modificar.pack();
        JD_Modificar.setModal(true);
        JD_Modificar.setLocationRelativeTo(this);
        JD_Modificar.setVisible(true);
    }//fin del llamado del JDialog
      
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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Busqueda;
    private javax.swing.JComboBox<String> CB_Personas;
    private javax.swing.JComboBox<String> CB_Personas1;
    private javax.swing.JComboBox<String> CB_Tipo;
    private javax.swing.JComboBox<String> CB_Tipo2;
    private javax.swing.JComboBox<String> CB_TipoBusc;
    private javax.swing.JButton CrearPersona;
    private javax.swing.JButton Eliminar;
    private javax.swing.JDialog JD_Modificar;
    private javax.swing.JTextArea JTA_Lista;
    private javax.swing.JTextArea JTA_Listar;
    private javax.swing.JButton Modificar_;
    private javax.swing.ButtonGroup Sexo;
    private javax.swing.JTabbedPane TP_MetodoAdmin;
    private javax.swing.ButtonGroup Trabajo;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField apellido2;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField edad2;
    private javax.swing.JTextField facultad;
    private javax.swing.JTextField facultad2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton listar;
    private javax.swing.JButton modifcar;
    private javax.swing.JTextField nacionalidad;
    private javax.swing.JTextField nacionalidad2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField numcuenta;
    private javax.swing.JTextField numcuenta2;
    private javax.swing.JTextField profesion;
    private javax.swing.JTextField profesion2;
    private javax.swing.JTextField residencia;
    private javax.swing.JTextField residencia2;
    // End of variables declaration//GEN-END:variables
Persona PersonaGlobal = new Persona();
}
