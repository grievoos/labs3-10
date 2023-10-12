package com.example.voting;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    List<Voting> VoteList = Arrays.asList(new Voting("1", "Выборы председателя СтудСовета",
                    "22.09.2023", "23.09.2023", "Завершено"),
            new Voting("2", "Выборы Студ.Декана ЮрФак",
                    "30.10.2023", "30.10.2023", "Запланировано"),
            new Voting("3", "Выборы председателя общежития",
                    "07.10.2023", "09.10.2023", "В процессе")
            );

    ArrayList<Voting> VoteArray = new ArrayList<>(VoteList);

    @FXML
    private TableColumn<Voting, String> datefinish;

    @FXML
    private TableColumn<Voting, String> datestart;

    @FXML
    private TableColumn<Voting, String> id;

    @FXML
    private TableColumn<Voting, String> status;

    @FXML
    private TableColumn<Voting, String> title;

    @FXML
    private TableView<Voting> votingtable;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<Voting, String>("id"));
        title.setCellValueFactory(new PropertyValueFactory<Voting,String>("title"));
        datestart.setCellValueFactory(new PropertyValueFactory<Voting,String>("datestart"));
        datefinish.setCellValueFactory(new PropertyValueFactory<Voting,String>("datefinish"));
        status.setCellValueFactory(new PropertyValueFactory<Voting,String>("status"));

        votingtable.setItems(FXCollections.observableList(VoteArray));
    }
}
