package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txt;
	
	@FXML
	private Label old;

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
	
	private long num1;
	private long num2;
	private String op;

	public void onBt1Action() {
		String oldvalue = txt.getText();
		String set = "1";
		txt.setText(oldvalue + set);
	}

	public void onBt2Action() {
		String oldvalue = txt.getText();
		String set = "2";
		txt.setText(oldvalue + set);

	}

	public void onBt3Action() {
		String oldvalue = txt.getText();
		String set = "3";
		txt.setText(oldvalue + set);

	}

	public void onBt4Action() {
		String oldvalue = txt.getText();
		String set = "4";
		txt.setText(oldvalue + set);

	}

	public void onBt5Action() {
		String oldvalue = txt.getText();
		String set = "5";
		txt.setText(oldvalue + set);
	}

	public void onBt6Action() {
		String oldvalue = txt.getText();
		String set = "6";
		txt.setText(oldvalue + set);
	}

	public void onBt7Action() {
		String oldvalue = txt.getText();
		String set = "7";
		txt.setText(oldvalue + set);
	}

	public void onBt8Action() {
		String oldvalue = txt.getText();
		String set = "8";
		txt.setText(oldvalue + set);
	}

	public void onBt9Action() {
		String oldvalue = txt.getText();
		String set = "9";
		txt.setText(oldvalue + set);
	}

	public void onBt0ction() {
		String oldvalue = txt.getText();
		String set = "0";
		txt.setText(oldvalue + set);
	}

	public void onBtMaisAction() {
		 String oldvalue = txt.getText();
		 this.num1 = Integer.parseInt(oldvalue);
		 txt.setText("");
		 op = "+";
		 old.setText(oldvalue + op);
	}

	public void onBtMenosAction() {
		String oldvalue = txt.getText();
		this.num1 = Integer.parseInt(oldvalue);
		 txt.setText("");
		 op = "-";
		 old.setText(oldvalue + op);
	}

	public void onBtVezesAction() {
		String oldvalue = txt.getText();
		this.num1 = Integer.parseInt(oldvalue);
		 txt.setText("");
		 op = "*";
		 old.setText(oldvalue + op);
	}

	public void onBtDivisaoAction() {
		String oldvalue = txt.getText();
		 this.num1 = Integer.parseInt(oldvalue);
		 txt.setText("");
		 op = "/";
		 old.setText(oldvalue + op);
	}

	public void executeButtom() {
		switch(op) {
		case "+":
			String valor = txt.getText();
			this.num2 = Integer.parseInt(valor);
			long result = this.num1 + this.num2;
			txt.setText(String.valueOf(result));
			String oldnumbers = old.getText();
			old.setText(oldnumbers + valor);
			break;
		case "-":
			valor = txt.getText();
			this.num2 = Integer.parseInt(valor);
			result = this.num1 - this.num2;
			txt.setText(String.valueOf(result));
			oldnumbers = old.getText();
			old.setText(oldnumbers + valor);
			break;
		case "*":
			valor = txt.getText();
			this.num2 = Integer.parseInt(valor);
			result = this.num1 * this.num2;
			txt.setText(String.valueOf(result));
			oldnumbers = old.getText();
			old.setText(oldnumbers + valor);
			break;
		case "/":
			valor = txt.getText();
			this.num2 = Integer.parseInt(valor);
			result = this.num1 / this.num2;
			txt.setText(String.valueOf(result));
			 oldnumbers = old.getText();
			old.setText(oldnumbers + valor);	
			break;
		}
	}

	public void clearButton() {
		txt.setText("");
		old.setText("");
	}

}
