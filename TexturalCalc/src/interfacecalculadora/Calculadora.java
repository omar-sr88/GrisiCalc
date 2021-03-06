/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecalculadora;

import calculadoragrisi.CalculadoraGrisi;
import calculadoragrisi.TuplaMassaDistribuicao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.border.Border;

/**
 *
 * @author omar
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        textDensidade.requestFocus();
        myInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabMassaToDens = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelDensidade = new javax.swing.JLabel();
        textDensidade = new javax.swing.JTextField();
        labelComplexidade = new javax.swing.JLabel();
        textComplexidade = new javax.swing.JTextField();
        labelAprox = new javax.swing.JLabel();
        textAprox = new javax.swing.JTextField();
        botaoCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        labelDistrib = new javax.swing.JLabel();
        textDistrib = new javax.swing.JTextField();
        botoaoCalcularMassa = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        massaResultText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDensidade.setLabelFor(labelDensidade);
        labelDensidade.setText("Densidade Absoluta");

        textDensidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDensidadeActionPerformed(evt);
            }
        });
        textDensidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                testeEntradaDensidade(evt);
            }
        });

        labelComplexidade.setText("Complexidade da Massa");

        textComplexidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textComplexidadeActionPerformed(evt);
            }
        });
        textComplexidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                testeEntradaCompl(evt);
            }
        });

        labelAprox.setText("Margem de Aproximação");

        botaoCalcular.setLabel("Calcular");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        jList2.setName("listMassas"); // NOI18N
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAprox)
                    .addComponent(textAprox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCalcular)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(labelDensidade)
                    .addComponent(labelComplexidade)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textComplexidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(textDensidade, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel4))
                .addGap(86, 86, 86)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelDensidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDensidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(labelComplexidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(labelAprox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAprox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(botaoCalcular)
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );

        labelDensidade.getAccessibleContext().setAccessibleDescription("");

        tabMassaToDens.addTab("Densidade para Massa", jPanel1);

        labelDistrib.setText("Distribuição - Separar por espaços");

        textDistrib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textDistribKeyPressed(evt);
            }
        });

        botoaoCalcularMassa.setText("Calcular");
        botoaoCalcularMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoaoCalcularMassaActionPerformed(evt);
            }
        });

        jRadioButton1.setText("\" \" : Espaço");

        jRadioButton2.setText("\"-\" : Traço");

        jRadioButton3.setText("\",\" : Vírgula ");

        jLabel1.setText("Resultado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botoaoCalcularMassa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textDistrib, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDistrib))
                            .addGap(100, 100, 100)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(massaResultText, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDistrib)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDistrib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(massaResultText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jRadioButton1)
                .addGap(15, 15, 15)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botoaoCalcularMassa)
                .addGap(131, 131, 131))
        );

        tabMassaToDens.addTab("Massa para Densidade", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMassaToDens, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMassaToDens, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textComplexidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textComplexidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textComplexidadeActionPerformed

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
    
        textComplexidade.requestFocus();
        this.requestFocus();
        
        
        float erro = 0f;
        jLabel6.setText("");
        textDensidade.requestFocus();
        
        String SnumIntrumentos = textDensidade.getText();
        String SmassaDesejada = textComplexidade.getText();
        String Serro = textAprox.getText();
        
        
        if(!SnumIntrumentos.isEmpty() || !SmassaDesejada.isEmpty())
        {
        
        SmassaDesejada = SmassaDesejada.replace(",", ".");
        float massaDeseja = Float.parseFloat(SmassaDesejada);
        
        if(!Serro.equals("")){
            Serro.replace(",", ".");
            try{
                erro = Float.parseFloat(Serro);
            }
            catch (Exception e){
                System.out.println(e.toString());
                jLabel6.setText("Verifique a entrada do campo");
            }
        }
        
        
        
        int numInstrumentos = Integer.parseInt(SnumIntrumentos);
        
       ArrayList<TuplaMassaDistribuicao> tmd =  CalculadoraGrisi.complexidadeParaMassa(numInstrumentos, massaDeseja, erro);
        
       if(tmd.size()>0){
            String[] resps = new String[tmd.size()];
            int i =0;
            for(TuplaMassaDistribuicao t : tmd)
                resps[i++] = t.toString();
                
         
            jList2.setListData(resps);
            
       
        }
        }
    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void botoaoCalcularMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoaoCalcularMassaActionPerformed
        
        String entradaDist = textDistrib.getText().trim();
        String separador = " ";
        ArrayList<Integer> inteiros = new ArrayList<Integer>();
        
        if (entradaDist.equals(""))
            System.out.println("erro");
            //add msg de erro
        
      for (Enumeration<AbstractButton> botoes = buttonGroup1.getElements() ; botoes.hasMoreElements();){
          AbstractButton botao = botoes.nextElement();
          
          if( botao.isSelected()){
              separador = botao.getText().substring(1, 2);
              break;
          }
      }
      
      
      
      String s[] = entradaDist.split(separador);  
      System.out.println(separador);
      for(int i=0;i<s.length;i++){
          inteiros.add(Integer.parseInt(s[i]));
      }
      
      float result = CalculadoraGrisi.massaParaComplexidade(inteiros);
      
      massaResultText.setText(result+"");
        
    }//GEN-LAST:event_botoaoCalcularMassaActionPerformed

    private void textDensidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDensidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDensidadeActionPerformed

    private void testeEntradaDensidade(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_testeEntradaDensidade
        // TODO add your handling code here:
        
        if(textDensidade.getText().isEmpty())
            textDensidade.setBackground(Color.red);
        else textDensidade.setBackground(Color.white);
        
        
    }//GEN-LAST:event_testeEntradaDensidade

    private void testeEntradaCompl(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_testeEntradaCompl
        if(textComplexidade.getText().isEmpty())
            textComplexidade.setBackground(Color.red);
        else textComplexidade.setBackground(Color.white);
    }//GEN-LAST:event_testeEntradaCompl

    private void textDistribKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDistribKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
            botoaoCalcularMassa.doClick();
    }//GEN-LAST:event_textDistribKeyPressed

    public void myInit(){
    
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        
        
        
        java.awt.Component[] array = jPanel1.getComponents();
        //add(jList1,BorderLayout.CENTER);
        
        jRadioButton1.doClick();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JButton botoaoCalcularMassa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAprox;
    private javax.swing.JLabel labelComplexidade;
    private javax.swing.JLabel labelDensidade;
    private javax.swing.JLabel labelDistrib;
    private javax.swing.JTextField massaResultText;
    private javax.swing.JTabbedPane tabMassaToDens;
    private javax.swing.JTextField textAprox;
    private javax.swing.JTextField textComplexidade;
    private javax.swing.JTextField textDensidade;
    private javax.swing.JTextField textDistrib;
    // End of variables declaration//GEN-END:variables
}
