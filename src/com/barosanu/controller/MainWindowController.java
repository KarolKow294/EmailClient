package com.barosanu.controller;

import com.barosanu.EmailManager;
import com.barosanu.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.web.WebView;

public class MainWindowController extends BaseController {

    @FXML
    private TableView<?> emailsTableView;

    @FXML
    private MenuItem emailsTreeView;

    @FXML
    private WebView emailsWebView;

    public MainWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void optionsAction() {
        viewFactory.showOptionsWindow();
    }

    @FXML
    void addAccountAction() {
        viewFactory.showLoginWindow();
    }
}
