package com.example.marketplace.laucher;


import com.example.marketplace.events.StageCloseEvent;
import com.example.marketplace.events.StageReadyEvent;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;

public class JavaFxLauncher extends Application {

    private ClassPathXmlApplicationContext context;

    @Override
    public void init() {
        this.context = new ClassPathXmlApplicationContext("application.xml");
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(this.context::getBean);

        URL url = getClass().getResource("/fxml/hello-view.fxml");

        loader.setLocation(url);
        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 480);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // Запустим сервисы как загрузили мордочку
        context.publishEvent(new StageReadyEvent(this.context));

    }

    @Override
    public void stop() {
        // гасим сервисы
        this.context.publishEvent(new StageCloseEvent(this.context));

        // бдыщь - грохнули контекст
        this.context.close();
        Platform.exit();
    }
}
