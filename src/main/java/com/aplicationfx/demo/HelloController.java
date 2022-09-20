package com.aplicationfx.demo;

import com.aplicationfx.demo.model.Calculator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController  {


    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private RadioButton radioButton3;
    Calculator calculator = new Calculator();


    @FXML
    protected void get_procent() {
       if (radioButton1.isSelected()) {
           calculator.setPercent(3.0);

       } else if (radioButton2.isSelected()) {
           calculator.setPercent(10.0);

       } else if (radioButton3.isSelected()) {
           calculator.setPercent(15.0);

       }

    }
    @FXML
    protected void onHelloButtonClick() {
        calculator.setNum(Double.valueOf(textField1.getText()));
        textField2.setText(String.valueOf(calculator.calc()));
    }

}