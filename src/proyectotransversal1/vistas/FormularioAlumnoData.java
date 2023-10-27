/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectotransversal1.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import proyectotransversal1.accesoDatos.AlumnoData;
import proyectotransversal1.entidades.Alumno;


public class FormularioAlumnoData extends javax.swing.JInternalFrame {

   private AlumnoData alumData = new AlumnoData();
   private Alumno alumActual=null;
   
    public FormularioAlumnoData() {
        initComponents();
        this.setTitle("Alumno");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jBExit1 = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcbEstado = new javax.swing.JCheckBox();
        jdFechaNac = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 48)); // NOI18N
        jLabel1.setText("INGRESO ALUMNOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 440, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-agregar-administrador-80.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(85, 200, 46))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 120));

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel3.setText("DNI : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel4.setText("Apellido :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel5.setText("Nombre : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, 20));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel7.setText("Estado : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 210, 40));
        jPanel1.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, 40));
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 210, 40));

        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jbAgregar.setText("AGREGAR");
        jbAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 51), null, null));
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 210, 50));

        jBExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jBExit1.setText("SALIR");
        jBExit1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 51), null, null));
        jBExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExit1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 210, 50));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-lupa-30.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 50, 40));

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cerrar-ventana-20.png"))); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 51), null, null));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 210, 50));
        jPanel1.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 30, 30));
        jPanel1.add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExit1ActionPerformed
        dispose();
    }//GEN-LAST:event_jBExit1ActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        try {
            Integer dni = Integer.parseInt(jtDni.getText());
            alumActual=alumData.buscarAlumnoDni(dni);
            if (alumActual!=null) {
                jtApellido.setText(alumActual.getApellido());
                jtNombre.setText(alumActual.getNombre());
                jcbEstado.setSelected(alumActual.isEstado());
                LocalDate lc= alumActual.getFechaNac();
                java.util.Date date =java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdFechaNac.setDate(date);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"DEBE INGRESAR UN NUMERO EN ESTE CAMPO ");
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        Integer dni = Integer.parseInt(jtDni.getText());
        String apellido = jtApellido.getText();
        String nombre = jtNombre.getText();
        if (nombre.isEmpty()|| apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this,"NO SE ACEPTAN CAMPOS VACIOS"); 
        }
        java.util.Date fech = jdFechaNac.getDate();
       LocalDate fechaNac = fech.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       Boolean estado = jcbEstado.isSelected();
        if (alumActual== null) {
            alumActual= new Alumno(dni,apellido,nombre,fechaNac,estado); 
            alumData.guardarAlumno(alumActual);
        }else{
            alumActual.setDni(dni);
            alumActual.setApellido(apellido);
            alumActual.setNombre(nombre);
            alumActual.setFechaNac(fechaNac);
            alumActual.setEstado(true);
            alumData.modificarAlumno(alumActual);
        }
        limpiarCampos();
        
        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (alumActual!= null) {
          alumData.eliminarAlumnoId(alumActual.getIdAlumno());
            alumActual=null;
            limpiarCampos();  
        }else{
            JOptionPane.showInternalMessageDialog(this, "NO SE SELECCIONO NINGUN ALUMNO");
        }
        
    }//GEN-LAST:event_jbEliminarActionPerformed
    private void limpiarCampos() {
        jtDni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jcbEstado.setSelected(true);
        jdFechaNac.setDate(new Date());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JCheckBox jcbEstado;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
