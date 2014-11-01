package com.aincorp.inventory.presentation.mainpage;

import com.aincorp.inventory.business.flightcontrol.boundary.MainPageModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javax.inject.Inject;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

/**
 * Created by Алмаз on 08.09.14.
 */
public class MainPagePresenter implements Initializable {
    @FXML
    Label message;
    @Inject
    MainPageModel tower;

    @Inject
    private String prefix;

    @Inject
    private String happyEnding;

    @Inject
    private LocalDate date;

    private String theVeryEnd;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.theVeryEnd = rb.getString("theEnd");
    }

    public void launch() {
        message.setText("Date: " + date + " -> " + prefix + tower.readyToTakeoff() + happyEnding + theVeryEnd
        );
    }

    public void close() {

    }
}
