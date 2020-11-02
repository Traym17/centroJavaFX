package frontend.controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ControllerHome {
    @FXML private AnchorPane panelCuenta;
    @FXML private ImageView abrirCuentaP;
    @FXML private ImageView cerrarCuentaP;

    public void abrirCuenta(MouseEvent mouseEvent) {
        panelCuenta.setVisible(true);
        abrirCuentaP.setVisible(false);
        cerrarCuentaP.setVisible(true);
    }

    public void cerrarCuenta(MouseEvent mouseEvent) {
        panelCuenta.setVisible(false);
        cerrarCuentaP.setVisible(false);
        abrirCuentaP.setVisible(true);
    }
}
