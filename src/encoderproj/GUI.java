package encoderproj;


public class GUI extends javax.swing.JFrame {

    public String OutputText;
    
    
    public GUI() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        InputLabel = new javax.swing.JLabel();
        InputField = new javax.swing.JTextField();
        OpsButton = new javax.swing.JButton();
        OpsBox = new javax.swing.JComboBox<>();
        OutputLabel = new javax.swing.JLabel();
        OutputField = new javax.swing.JLabel();
        OffsetPanel = new javax.swing.JPanel();
        OffsetField = new javax.swing.JTextField();
        OffsetLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        TitleLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Plain Text Encoder");
        TitleLabel.setToolTipText("");
        TitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TitleLabel.setName(""); // NOI18N

        InputLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        InputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InputLabel.setText("Input");
        InputLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        InputField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        OpsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        OpsButton.setText("Action");
        OpsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpsButtonActionPerformed(evt);
            }
        });

        OpsBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        OpsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encode", "Decode" }));
        OpsBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OpsBoxItemStateChanged(evt);
            }
        });

        OutputLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OutputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OutputLabel.setText("Output");
        OutputLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        OutputField.setBackground(new java.awt.Color(255, 255, 255));
        OutputField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        OutputField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OutputField.setOpaque(true);
        OutputField.setPreferredSize(new java.awt.Dimension(64, 23));

        OffsetField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        OffsetField.setActionCommand("<Not Set>");

        OffsetLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OffsetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OffsetLabel.setText("Offset Character");
        OffsetLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout OffsetPanelLayout = new javax.swing.GroupLayout(OffsetPanel);
        OffsetPanel.setLayout(OffsetPanelLayout);
        OffsetPanelLayout.setHorizontalGroup(
            OffsetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OffsetPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OffsetLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OffsetField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        OffsetPanelLayout.setVerticalGroup(
            OffsetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OffsetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(OffsetField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(OffsetLabel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OffsetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OpsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OpsButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(InputLabel)
                                    .addComponent(OutputLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OutputField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(InputField))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLabel)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputLabel)
                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OffsetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpsButton)
                    .addComponent(OpsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OutputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutputLabel))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OpsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpsButtonActionPerformed
        String OpsType = OpsBox.getItemAt(OpsBox.getSelectedIndex());
        String plainText = OffsetField.getText()+InputField.getText();
        OutputText = new EncoderProj().controller(OpsType, plainText);
        OutputField.setText(OutputText);
    }//GEN-LAST:event_OpsButtonActionPerformed

    private void OpsBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OpsBoxItemStateChanged
        OffsetField.setText("");
        if (OpsBox.getItemAt(OpsBox.getSelectedIndex()).contentEquals("Encode")){
            OffsetPanel.setVisible(true);
        } else {
            OffsetPanel.setVisible(false);
        }
    }//GEN-LAST:event_OpsBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputField;
    private javax.swing.JLabel InputLabel;
    private javax.swing.JTextField OffsetField;
    private javax.swing.JLabel OffsetLabel;
    private javax.swing.JPanel OffsetPanel;
    private javax.swing.JComboBox<String> OpsBox;
    private javax.swing.JButton OpsButton;
    private javax.swing.JLabel OutputField;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
}
