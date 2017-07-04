package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import model.Item;

import java.util.prefs.*;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

/**
 * Main Controller class
 * Created by Kang on 7/4/2017.
 */
public class MainController{
    @FXML private CheckBox itemCheckerCheckBox;
    private boolean itemCheckEnabled = false;
    /**
     * initialize() method called automatically when instantiated
     */
    public void initialize() {

    }

    /**
     * handles close button in menu
     * @param event on close action
     */
    @FXML protected void onClose(ActionEvent event) {
        Stage stage = (Stage) itemCheckerCheckBox.getScene().getWindow();
        stage.close();
    }

    @FXML protected void toggleItemChecker(ActionEvent event) {
        itemCheckEnabled = !itemCheckEnabled;
    }

    @FXML protected void toggleFilterUpdate(ActionEvent event) {

    }

    @FXML protected void toggleItemPricer(ActionEvent event) {

    }

    @FXML protected void linkGithub(ActionEvent event) {

    }

    /**
     * sends application to back of windows
     * @param event
     */
    @FXML protected void sendToBack(ActionEvent event) {
        Stage stage = (Stage) itemCheckerCheckBox.getScene().getWindow();
        stage.toBack();
    }

    /**
     * checks item in clipboard
     * @param event
     * @throws Exception
     */
    @FXML protected void itemCheck(ActionEvent event) throws Exception {
        String data = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        System.out.println(data);
        Item newItem = new Item(data);
    }

}
