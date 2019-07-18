package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNum1;
	
	@FXML
	private TextField txtNum2;

	@FXML
	private Label lbResult;
	
	@FXML
	private Label lbRes;

	@FXML
	private Button btSoma;

	@FXML
	public void onBtSomaAction() {
		// System.out.println("Clique!");
		// Chamando Alert com Botão
		// Alerts.showAlert("Titulo do alert", "Cabeçalho", "Texto do alert", AlertType.WARNING); //AlertType é um tipo enumerado e o cabeçalho aceita valor nullo

		try {

			Locale.setDefault(Locale.US);
			double num1 = Double.parseDouble(txtNum1.getText());
			double num2 = Double.parseDouble(txtNum2.getText());

			double soma = num1 + num2;
			lbResult.setText(String.format("%.2f", soma));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Titulo do alert", "Cabeçalho", e.getMessage(), AlertType.ERROR);
		}
	}

}
