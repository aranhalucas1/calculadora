package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {

	@FXML
	private Label labelNum1;

	@FXML
	private Label labelNum2;

	@FXML
	private Label labelOp;

	@FXML
	private Label labelResult;

	@FXML
	private Button buttonExecute;

	@FXML
	private Button buttonClear;

	@FXML
	private Button bt1;

	@FXML
	private Button bt2;

	@FXML
	private Button bt3;

	@FXML
	private Button bt4;

	@FXML
	private Button bt5;

	@FXML
	private Button bt6;

	@FXML
	private Button bt7;

	@FXML
	private Button bt8;

	@FXML
	private Button bt9;

	@FXML
	private Button bt0;

	@FXML
	private Button btMais;

	@FXML
	private Button btMenos;

	@FXML
	private Button btVezes;

	@FXML
	private Button btDivisao;

	public void onBt1Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "1";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "1";
			labelNum2.setText(oldvalue + set);
		}

	}

	public void onBt2Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "2";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "2";
			labelNum2.setText(oldvalue + set);
		}

	}

	public void onBt3Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "3";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "3";
			labelNum2.setText(oldvalue + set);
		}

	}

	public void onBt4Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "4";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "4";
			labelNum2.setText(oldvalue + set);
		}

	}

	public void onBt5Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "5";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "5";
			labelNum2.setText(oldvalue + set);
		}
	}

	public void onBt6Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "6";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "6";
			labelNum2.setText(oldvalue + set);
		}
	}

	public void onBt7Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "7";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "7";
			labelNum2.setText(oldvalue + set);
		}
	}

	public void onBt8Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "8";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "8";
			labelNum2.setText(oldvalue + set);
		}
	}

	public void onBt9Action() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "9";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "9";
			labelNum2.setText(oldvalue + set);
		}
	}

	public void onBt0ction() {
		if (labelNum1.isDisable() == false) {
			String oldvalue = labelNum1.getText();
			String set = "0";
			labelNum1.setText(oldvalue + set);
		} else {
			String oldvalue = labelNum2.getText();
			String set = "0";
			labelNum2.setText(oldvalue + set);
		}
	}

	public void onBtMaisAction() {
		labelNum1.setDisable(true);
		labelOp.setText("+");
	}

	public void onBtMenosAction() {
		labelNum1.setDisable(true);
		labelOp.setText("-");
	}

	public void onBtVezesAction() {
		labelNum1.setDisable(true);
		labelOp.setText("*");
	}

	public void onBtDivisaoAction() {
		labelNum1.setDisable(true);
		labelOp.setText("/");
	}

	public void executeButtom() {

		try {
			double num1 = Double.parseDouble(labelNum1.getText());
			double num2 = Double.parseDouble(labelNum2.getText());
			double soma = num1 + num2;
			double multiplicacao = num1 * num2;
			double divisao = num1 / num2;
			double reducao = num1 - num2;
			if (labelOp.getText() == "+") labelResult.setText(String.valueOf(soma));
			
			if (labelOp.getText() == "-") labelResult.setText(String.valueOf(reducao));
			
			if (labelOp.getText() == "*") labelResult.setText(String.valueOf(multiplicacao));
			
			if (labelOp.getText() == "/") labelResult.setText(String.valueOf(divisao));
			
		} catch (RuntimeException e) {
			Alerts.showAlert("Erro", null, "numero 1 vazio", AlertType.ERROR);
		}
	}

	public void clearButton() {
		labelNum1.setDisable(false);
		labelNum1.setText("");
		labelOp.setText("");
		labelNum2.setText("");
		labelResult.setText("");
	}

}
