/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author juan_cam.aristizabal
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;

    LinkedList<Estudiante> listaE;

    @FXML
    private void btnMostrar(ActionEvent event) {
        String mostrar = "";
        for (int i = 0; i < listaE.size(); i++) {
            mostrar += listaE.get(i) + "\n";

        }
        JOptionPane.showMessageDialog(null, mostrar);

    }

    @FXML
    private void btnAceptar(ActionEvent event) {
        String nombre = text1.getText();
        String codigo = text2.getText();

        Estudiante objE = new Estudiante(nombre, codigo);
        boolean guardar = listaE.add(objE);

        if (guardar) {
            text1.setText("");
            text2.setText("");
        }
    }
        @Override
        public void initialize (URL url, ResourceBundle rb)
    
        {
        
        
       listaE = new LinkedList<>();

        }

    
}
