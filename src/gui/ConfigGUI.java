package gui;

import centralprocessor.CommunicationsInterface;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ConfigGUI {
	private Stage pstage;
	
	private CommunicationsInterface comint;
	
    //takes in communicationsinterface to call functions later
    public ConfigGUI(CommunicationsInterface comint){
    	this.comint = comint;
    }
//	@Override
    public void start(Stage primaryStage) {
		pstage = primaryStage;
		this.pstage.setTitle("Settings");
        VBox root = new VBox(20);
        populateRoot(root, this.pstage);

        Scene scene = new Scene(root, 600, 250);
        this.pstage.setScene(scene);
//        this.pstage.show();
    }
	
    public Stage getStage(){
    	return this.pstage;
    }
//    public static void main(String[] args) {
//        launch(args);
//    }
    
    private void populateRoot(VBox root, Stage stage){
    	
//    	root.set
    	
    	root.setAlignment(Pos.CENTER);
    	
    	Text title = new Text("PERSYST Login");
    	title.setFont(new Font(32));
    	
    	HBox userHbox = new HBox();
    	userHbox.setAlignment(Pos.CENTER);
    	
    	Text userText = new Text("username:\t\t");
    	userText.setFont(new Font(20));
    	
    	TextField userField = new TextField();
    	userHbox.getChildren().addAll(userText, userField);
    	userField.setPromptText("Your username");
    	
    	HBox passHbox = new HBox();
    	passHbox.setAlignment(Pos.CENTER);
    	
    	Text passText = new Text("password:\t\t");
    	passText.setFont(new Font(20));
    	    	
    	PasswordField passField = new PasswordField();
    	passField.setPromptText("Your password");
    	passHbox.getChildren().addAll(passText, passField);
    	
    	Text passHint = new Text("");
    	passHint.setFont(new Font(20));
    	passHint.setFill(Color.RED);

    	HBox bHbox = new HBox();
    	bHbox.setAlignment(Pos.CENTER);
    	Button save = new Button("save");
    	save.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override 
    	    public void handle(ActionEvent e) {

    	    }
    	});
    	
    	Button cancel = new Button("cancel");
    	cancel.setOnAction(new EventHandler<ActionEvent>() {
    		@Override 
    	    public void handle(ActionEvent e) {
    			getStage().close();
    		}
    	});
    	bHbox.getChildren().addAll(save, cancel);
    	root.getChildren().addAll(title, userHbox, passHbox, passHint, bHbox);
    }
    
    
    private boolean login(String username, String password){
    	//TODO 
    	// Pass the username and password to the correct method
    	return false;
    }
    
    private boolean validateUsername(String s){
    	return s.length() > 3;
    }
    
    private boolean validatePassword(String s){
    	return s.length() > 3;
    }


}
