package com.aincorp.inventory.presentation.mainpage;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Алмаз on 08.09.14.
 */
public class MainPagePresenter implements Initializable {

    @FXML
    TextField code;

    @FXML
    TextField name;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void clear() {
        code.clear();
        name.clear();
    }
}
