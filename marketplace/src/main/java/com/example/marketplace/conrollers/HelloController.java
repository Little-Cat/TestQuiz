package com.example.marketplace.conrollers;

import com.example.marketplace.models.HelloModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    private HelloModel model;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public HelloController(HelloModel model) {
        this.model = model;
    }
}