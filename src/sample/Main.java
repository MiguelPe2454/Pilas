package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        //launch(args);

        Pilas pilas = new Pilas();
        pilas.Push(2);
        pilas.Push(8);
        pilas.Push(1);

        pilas.peek();
        pilas.Cima();
        pilas.Pop();
        pilas.peek();
        pilas.Pop();
        pilas.Cima();
        pilas.Pop();
        pilas.peek();


    System.out.print("tamaño de la pila es: " + pilas.getTamaño ());
    }


}

