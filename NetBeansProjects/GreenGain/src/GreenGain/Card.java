
package GreenGain;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Card extends javax.swing.JPanel {
    
    public Color getColor1(){
        return color1;
    }
    public void setColor1(Color color1){
        this.color1 = color1;
    }
    public Color getColor2(){
        return color2;
    }
    public void setColor2(Color color2){
        this.color2 = color2;
    }
    
    private Color color1;
    private Color color2;

    
    public Card() {
        initComponents();
        setOpaque(false);
       color1 = new Color(0, 120, 31);
        color2 = Color.WHITE;
    }
    
    public void setData(Model_Card data){
//        lbIcon.setIcon(data.getIcon());
          lbTitle.setText(data.getTitle());
          lbValues.setText(data.getValues());
          lbDescription.setText(data.getDescription());
    }
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        lbValues = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();

        lbIcon.setText("Icon");

        lbDescription.setForeground(new java.awt.Color(255, 255, 255));
        lbDescription.setText("Description");

        lbValues.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbValues.setForeground(new java.awt.Color(255, 255, 255));
        lbValues.setText("Values");

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Title");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle)
                    .addComponent(lbDescription)
                    .addComponent(lbValues)
                    .addComponent(lbIcon))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValues)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lbDescription)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g.create();

    // Enable anti-aliasing for smoother graphics
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    // Create gradient from top-left to bottom-right
    GradientPaint gp = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);

    g2.setPaint(gp);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // rounded rectangle

    g2.dispose();
}

        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbValues;
    // End of variables declaration//GEN-END:variables
}
