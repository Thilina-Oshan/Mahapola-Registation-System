/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author Oshan Demel
 */
public class CustomTextFieldBorder extends AbstractBorder {

    private Color bottomBorderColor;
    private int borderWidth;

    public CustomTextFieldBorder(Color bottomBorderColor, int borderWidth) {
        this.bottomBorderColor = bottomBorderColor;
        this.borderWidth = borderWidth;
    }

    @Override
    public void paintBorder(java.awt.Component c, Graphics g, int x, int y, int width, int height) {
        // Bottom border
        g.setColor(bottomBorderColor);
        g.drawLine(x, height - borderWidth, width, height - borderWidth);
    }

    @Override
    public Insets getBorderInsets(java.awt.Component c) {
        return new Insets(0, 0, borderWidth, 0); // Only the bottom border has insets
    }
}
