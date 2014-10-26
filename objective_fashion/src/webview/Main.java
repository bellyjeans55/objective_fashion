//package webview;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Hyperlink;
//import javafx.scene.layout.VBox;
//import javafx.scene.web.WebEngine;
//import javafx.scene.web.WebView;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) {
//        stage.setTitle("Objective Fashion");
//        stage.setWidth(800);
//        stage.setHeight(500);
//        Scene scene = new Scene(new Group());
//        VBox root = new VBox();    
//        final WebView browser = new WebView();
//        final WebEngine webEngine = browser.getEngine();
//        
//        // path in current directory for WebEngine.load()
//        final String html = "html/index.html";
//        final java.net.URI uri = java.nio.file.Paths.get(html).toAbsolutePath().toUri();
//        webEngine.load(uri.toString());
//        root.getChildren().addAll(browser);
//        scene.setRoot(root);
//        //webEngine.executeScript("alert($('#preferences_selector').val())");
//        stage.setScene(scene);
//        stage.show();
//    }
// 
//    public static void main(String[] args) {
//        launch(args);
//    }
//}