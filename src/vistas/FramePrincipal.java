package vistas;

import recursos.Alumno;


public class FramePrincipal extends javax.swing.JFrame {
    public FramePrincipal() {
        iniciar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrarTexto = new javax.swing.JTextPane();
        menu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMGuardar = new javax.swing.JMenuItem();
        jMCargar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMGenerar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMAltaAlumnos = new javax.swing.JMenuItem();
        jMFormularioMaterias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMAltaMaterias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        txtMostrarTexto.setEditable(false);
        jScrollPane1.setViewportView(txtMostrarTexto);

        jMenu3.setText("Sistema");

        jMGuardar.setText("Guardar");
        jMGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGuardarActionPerformed(evt);
            }
        });
        jMenu3.add(jMGuardar);

        jMCargar.setText("Cargar");
        jMCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCargarActionPerformed(evt);
            }
        });
        jMenu3.add(jMCargar);
        jMenu3.add(jSeparator1);

        jMGenerar.setText("Generar");
        jMGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMGenerarActionPerformed(evt);
            }
        });
        jMenu3.add(jMGenerar);
        jMenu3.add(jSeparator2);

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenu3.add(jMSalir);

        menu.add(jMenu3);

        jMenu1.setText("Alumnos");

        jMAltaAlumnos.setText("Alta de Alumnos");
        jMAltaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAltaAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(jMAltaAlumnos);

        jMFormularioMaterias.setText("Formulario de Materias");
        jMFormularioMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioMateriasActionPerformed(evt);
            }
        });
        jMenu1.add(jMFormularioMaterias);

        menu.add(jMenu1);

        jMenu2.setText("Materias");

        jMAltaMaterias.setText("Alta de Materias");
        jMAltaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAltaMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(jMAltaMaterias);

        menu.add(jMenu2);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        salir();
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGenerarActionPerformed
        generar();
    }//GEN-LAST:event_jMGenerarActionPerformed

    private void jMCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCargarActionPerformed
        try {
            cargar();
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMCargarActionPerformed

    private void jMGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMGuardarActionPerformed
        try {
            guardar();
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMGuardarActionPerformed

    private void jMFormularioMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioMateriasActionPerformed
        abrirIf(new FormularioInscripcion(nombreMaterias(),nombreAlumnos()));
    }//GEN-LAST:event_jMFormularioMateriasActionPerformed

    private void jMAltaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAltaAlumnosActionPerformed
        abrirIf(new AltaAlumnos());
    }//GEN-LAST:event_jMAltaAlumnosActionPerformed

    private void jMAltaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAltaMateriasActionPerformed
        abrirIf(new AltaMaterias());
    }//GEN-LAST:event_jMAltaMateriasActionPerformed
    public static void abrirFramePrincipal() {
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FramePrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem jMAltaAlumnos;
    private javax.swing.JMenuItem jMAltaMaterias;
    private javax.swing.JMenuItem jMCargar;
    private javax.swing.JMenuItem jMFormularioMaterias;
    private javax.swing.JMenuItem jMGenerar;
    private javax.swing.JMenuItem jMGuardar;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar menu;
    public static javax.swing.JTextPane txtMostrarTexto;
    // End of variables declaration//GEN-END:variables
    private java.util.List<javax.swing.JInternalFrame> ventanas = new java.util.ArrayList<>();
    public static java.util.Set<recursos.Alumno> alumnos = new java.util.HashSet<>();
    public static java.util.Set<recursos.Materia> materias = new java.util.HashSet<>();
    private void iniciar() {
        initComponents();
        setSize(800,600);
    }
    private void guardar() throws java.io.IOException {
        java.io.File archivo = new java.io.File("archivo.txt");
        java.io.FileWriter escritor = new java.io.FileWriter(archivo);
        java.io.BufferedWriter bescritor = new java.io.BufferedWriter(escritor);
        String guardar = "";
        for (recursos.Materia materia : materias) {
            guardar += "materia;"+ materia.toString() +"\n";
        }
        for (recursos.Alumno alumno : alumnos) {
            guardar += "alumno;"+ alumno.toString() +"\n";
        }
        bescritor.write(guardar);
        bescritor.close();
        escritor.close();
    }
    private void cargar() throws java.io.FileNotFoundException, java.io.IOException {
        /*
           0   ;   1  ;   2    ;   3   ;     4     length
        alumno ;legajo;apellido;nombre;[id,id,...][5]
        materia;id    ;nombre  ;anio              [4]
        */
        java.io.File archivo = new java.io.File("archivo.txt");
        java.io.FileReader lector = new java.io.FileReader(archivo);
        java.io.BufferedReader blector = new java.io.BufferedReader(lector);
        String linea;
        java.util.ArrayList<String> 
            todosAlumnos = new java.util.ArrayList<>(),
            todasMaterias = new java.util.ArrayList<>();
        while((linea = blector.readLine()) != null){
            String tipo = linea.split(";")[0];
            switch(tipo){
                case "alumno":
                    todosAlumnos.add(linea);
                    break;
                case "materia":
                    todasMaterias.add(linea);
                    break;
            }
        }
        todasMaterias.forEach(materia -> {
            String[] sMateria = materia.split(";");
            if(sMateria.length > 0){
                recursos.Materia m = new recursos.Materia(Integer.parseInt(sMateria[1]), sMateria[2], Integer.parseInt(sMateria[3]));
                materias.add(m);
            }
        });
        todosAlumnos.forEach(alumno -> {
            String[] sAlumno = alumno.split(";");
            String[] materiass = sAlumno[4].replace("[","").replace("]","").split(",");
            recursos.Alumno a = new recursos.Alumno(Integer.parseInt(sAlumno[1]), sAlumno[2], sAlumno[3]);
            if(materiass.length > 0){
                for (String materia : materiass) {
                    recursos.Materia m = null;
                    int numeroMateria = -1;
                    if(!materia.isEmpty())numeroMateria = Integer.parseInt(materia);
                    if(numeroMateria != -1)m = buscarMateria(numeroMateria); 
                    if(m != null)a.agregarMateria(m);
                }
            }
            alumnos.add(a);
        });
        actualizartxt();
        blector.close();
        lector.close();
    }
    private void generar() {
        //a) i, ii, y iii.
        recursos.Materia 
            ingles1 = new recursos.Materia(10000,"Ingles 1",1),
            matematicas1 = new recursos.Materia(10001,"Matemáticas 1",1),
            laboratorio1 = new recursos.Materia(10002,"Laboratorio 1",1);
        //b) a y b
        recursos.Alumno 
            lopezMartin = new recursos.Alumno(1001, "López", "Martín"),
            martinezBrenda = new recursos.Alumno(1002, "Martínez", "Brenda");
        materias.add(ingles1);
        materias.add(matematicas1);
        materias.add(laboratorio1);
        alumnos.add(lopezMartin);
        alumnos.add(martinezBrenda);
        actualizartxt();
    }
    private void salir() {
//        ventanas.forEach(ventana -> ventana.dispose());//error de ConcurrentModificationException
        this.dispose();
        System.exit(0);
    }
    private void abrirIf(javax.swing.JInternalFrame iF) {
        iF.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter(){
            @Override
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                ventanas.remove(iF);
                Escritorio.remove(iF);
            }
        });
        ventanas.add(iF);
        Escritorio.add(iF);
        iF.setVisible(true);
        iF.toFront();
    }

    public static void actualizartxt() {
        String string = "";
        for (recursos.Materia materia : materias) {
            string += "Materia: "+ materia.toString() +"\n";
        }
        for (recursos.Alumno alumno : alumnos) {
            string += "Alumno: "+ alumno.toString() +"\n";
        }
        txtMostrarTexto.setText(string);
    }

    private recursos.Materia buscarMateria(int parseInt) {
        java.util.List<recursos.Materia> n = materias.stream().filter(materia -> materia.getIdMateria() == parseInt).collect(java.util.stream.Collectors.toList());
        if(n.size() > 0){ 
            return n.get(0);
        }else return null;
    }
    private String[] nombreMaterias(){
        return materias.stream().map(materia -> materia.getNombre()).toArray(String[]::new);
    }
    private String[] nombreAlumnos(){
        return alumnos.stream().map(alumno -> alumno.getApellido()+" "+alumno.getNombre()).toArray(String[]::new);
    }
    //metodos publicos de acceso para insertar alumnos y materias
    static void inscribir(String materiaSeleccionada, String alumnoSeleccionado) {
        for (recursos.Materia materia : materias) {
            if(materia.getNombre().equals(materiaSeleccionada)){
                for (recursos.Alumno alumno : alumnos) {
                    if((alumno.getApellido()+" "+alumno.getNombre()).equals(alumnoSeleccionado)){
                        alumno.agregarMateria(materia);
                    }
                }
            }
        }
        actualizartxt();
    }
}