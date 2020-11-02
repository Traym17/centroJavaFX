package frontend.controllers;

import backend.Datos;
import backend.Subscriptor;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.Date;

public class ControllerLogin {
    @FXML
    private JFXTextField userName;
    @FXML private JFXTextField password;
    @FXML private Label mensaje;
    @FXML private AnchorPane panelInicio;
    @FXML private AnchorPane panelPassword;
    @FXML private AnchorPane panel_Registro;
    @FXML private JFXButton btn_registroUsuario;
    @FXML private JFXButton btn_iniciarSesion;
    @FXML private JFXTextField nombreS;
    @FXML private JFXTextField idS;
    @FXML private JFXTextField correoS;
    Datos CL= new Datos();
    public void login1(ActionEvent event) {
        if(userName.getText().equals("admin123") && password.getText().equals("tracy123")) {
            //aqui llamas al nuevo objeto y guardas los datos
            new ToScene().toScene("home.fxml", event);
        }
        else {
            mensaje.setText(String.valueOf(1));
            mensaje.setText("Lo siento tu correo o contraseña son incorrectos");
        }
    }

    public void recuperarContrasenna(MouseEvent mouseEvent) {
        panelInicio.setVisible(false);
        panelPassword.setVisible(true);
    }

    public void cerrarPassword(MouseEvent mouseEvent) {
        panelInicio.setVisible(true);
        panelPassword.setVisible(false);
    }

    public void registroUsuario(ActionEvent event) {
        panelInicio.setVisible(false);
        panel_Registro.setVisible(true);
        btn_registroUsuario.setVisible(false);
        btn_iniciarSesion.setVisible(true);
    }

    public void iniciarSesion(ActionEvent event) {
        panelInicio.setVisible(true);
        panel_Registro.setVisible(false);
        btn_registroUsuario.setVisible(true);
        btn_iniciarSesion.setVisible(false);
    }

    public void registrarCuenta(ActionEvent event) {
        Subscriptor subscriptor=new Subscriptor(nombreS.getText(),idS.getText(),correoS.getText(),0);
        CL.registrarSubscriptor(subscriptor);


    }
}
