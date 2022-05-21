package com.factorymethod.dominio;

import javax.swing.*;

public class AlertaWindows implements IAlerta {
    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Estamos dentro de Windows!");
    }
}
