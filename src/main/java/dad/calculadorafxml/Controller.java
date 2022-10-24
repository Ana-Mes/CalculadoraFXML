package dad.calculadorafxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable{
	
	private Calculadora calculadora = new Calculadora();
	
	//view
	
	@FXML
	private GridPane calculadoraPane;

	@FXML
	private TextField resultadoText;
	
	@FXML
	private Button sieteButton;
	
	@FXML
	private Button ochoButton;
	
	@FXML
	private Button nueveButton;
	
	@FXML
	private Button ceButton;
	
	@FXML
	private Button cButton;
	
	@FXML
	private Button cuatroButton;
	
	@FXML
	private Button cincoButton;
	
	@FXML
	private Button seisButton;
	
	@FXML
	private Button multButton;
	
	@FXML
	private Button divButton;
	
	@FXML
	private Button unoButton;
	
	@FXML
	private Button dosButton;
	
	@FXML
	private Button tresButton;
	
	@FXML
	private Button menosButton;
	
	@FXML
	private Button igualButton;
	
	@FXML
	private Button ceroButton;
	
	@FXML
	private Button puntoButton;
	
	@FXML
	private Button masButton;
	
	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { 
		
		//bindings
		resultadoText.textProperty().bind(calculadora.pantallaProperty());
		
	}
	
	public GridPane getView() {
		return calculadoraPane;
	}
	
	public Calculadora getCalculadora() {
		return calculadora;
	}
	
	@FXML
	private void onButtonAction(ActionEvent e) {
		Button boton = (Button)e.getSource();
		calculadora.insertar(boton.getText().charAt(0));
	}
	
	@FXML
	private void onBorrarTodoButton(ActionEvent e) {
		calculadora.borrarTodo();
	}
	
	@FXML
	private void onBorrar(ActionEvent e) {
		calculadora.borrar();
	}
	
	@FXML
	private void onSumar(ActionEvent e) {
		calculadora.operar(Calculadora.SUMAR);
	}
	
	@FXML
	private void onRestar(ActionEvent e) {
		calculadora.operar(Calculadora.RESTAR);
	}
	
	@FXML
	private void onMultiplicar(ActionEvent e) {
		calculadora.operar(Calculadora.MULTIPLICAR);
	}
	
	@FXML
	private void onDividir(ActionEvent e) {
		calculadora.operar(Calculadora.DIVIDIR);
	}
	
	@FXML
	private void onIgual(ActionEvent e) {
		calculadora.operar(Calculadora.IGUAL);
	}
	
}
