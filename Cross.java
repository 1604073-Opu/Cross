
import static java.lang.Math.abs;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Cross extends Application {

    Stage frame = new Stage();
    Button[] button = new Button[10];
    int[] data = new int[10];
    int lavel = 0;
    int now, count = 0;

    public Pane setGrids() {
        Pane pane = new Pane();
        ImageView back=new ImageView(new Image("background2.jpg"));
        pane.getChildren().add(back);
        Group bar1 = new Group();
        Group bar2 = new Group();
        Group bar3 = new Group();
        Group bar4 = new Group();
        Rectangle rec1 = new Rectangle(0, 0, 5, 205);
        Rectangle rec2 = new Rectangle(0, 0, 5, 205);
        Rectangle rec3 = new Rectangle(0, 0, 205, 5);
        Rectangle rec4 = new Rectangle(0, 0, 205, 5);
        bar1.getChildren().add(rec1);
        bar2.getChildren().add(rec2);
        bar3.getChildren().add(rec3);
        bar4.getChildren().add(rec4);
        bar3.setLayoutX(100);
        bar3.setLayoutY(165);
        bar1.setLayoutX(165);
        bar1.setLayoutY(100);
        bar2.setLayoutX(235);
        bar2.setLayoutY(100);
        bar4.setLayoutX(100);
        bar4.setLayoutY(235.5);
        pane.getChildren().add(bar1);
        pane.getChildren().add(bar2);
        pane.getChildren().add(bar3);
        pane.getChildren().add(bar4);
        return pane;
    }

    public GridPane setButtons() {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(1);
        pane.setHgap(1);
        int i = 1;
        int y = 0;
        for (; i <= 9;) {

            button[i] = new Button();
            button[i].setMinSize(65, 65);
            pane.add(button[i], 100, 100 + y);
            i++;
            button[i] = new Button();
            button[i].setMinSize(65, 65);
            pane.add(button[i], 105, 100 + y);
            i++;
            button[i] = new Button();
            button[i].setMinSize(65, 65);
            pane.add(button[i], 110, 100 + y);
            i++;
            y = y + 5;
        }
        return pane;
    }

    public void buttonclicks() {

        button[1].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[1] == 0) {
                button[1].setText("X");
                button[1].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[1] = 1;
                now = 1;
                nextMove();

            }
        }
        );
        button[2].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[2] == 0) {
                button[2].setText("X");
                button[2].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[2] = 1;
                now = 2;
                nextMove();
            }
        }
        );
        button[3].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[3] == 0) {
                button[3].setText("X");
                button[3].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[3] = 1;
                now = 3;
                nextMove();
            }
        }
        );
        button[4].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[4] == 0) {
                button[4].setText("X");
                button[4].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[4] = 1;
                now = 4;
                nextMove();
            }
        }
        );
        button[5].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[5] == 0) {
                button[5].setText("X");
                button[5].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[5] = 1;
                now = 5;
                nextMove();
            }
        }
        );
        button[6].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[6] == 0) {
                button[6].setText("X");
                button[6].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[6] = 1;
                now = 6;
                nextMove();
            }
        }
        );
        button[7].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[7] == 0) {
                button[7].setText("X");
                button[7].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[7] = 1;
                now = 7;
                nextMove();
            }
        }
        );
        button[8].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[8] == 0) {
                button[8].setText("X");
                button[8].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[8] = 1;
                now = 8;
                nextMove();
            }
        }
        );
        button[9].setOnAction((ActionEvent e) -> {
            if (check() == 0 && data[9] == 0) {
                button[9].setText("X");
                button[9].setStyle(String.format("-fx-font-size:  30px;", 65));
                data[9] = 1;
                now = 9;
                nextMove();
            }
        }
        );
    }

    public void setDifficulty() {
        Stage child = new Stage();
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);
        Pane pane1 = new Pane();
        Label label = new Label("Set Difficulty");
        label.setStyle("-fx-font-size: 15px");
        label.setLayoutX(100);
        label.setLayoutY(50);
        pane1.getChildren().add(label);
        Button easy = new Button("EASY");
        Button medium = new Button("MEDIUM");
        Button hard = new Button("HARD");
        pane.add(easy, 6, 10);
        pane.add(medium, 7, 10);
        pane.add(hard, 8, 10);
        pane1.getChildren().add(pane);
        Scene scene = new Scene(pane1, 300, 150);
        child.setScene(scene);
        child.show();
        easy.setOnAction((ActionEvent e) -> {
            lavel = 1;
            child.hide();
            start(frame);
        });
        medium.setOnAction((ActionEvent e) -> {
            lavel = 2;
            child.hide();
            start(frame);
        });
        hard.setOnAction((ActionEvent e) -> {
            lavel = 3;
            child.hide();
            start(frame);
        });
    }

    public int check() {

        if (lavel == 0) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR!");
            alert.setContentText("You must set Difficulty Lavel!");
            alert.showAndWait();
            setDifficulty();
            return 1;
        }
        return 0;
    }

    public void nextMove() {
        count++;
        if (count < 5) {
            if (lavel == 0) {
                check();
            } else if (lavel == 1) {
                easyMove();
            } else if (lavel == 2) {
                mediumMove();
            } else if (lavel == 3) {
                hardMove();
            }
        }
        if (checkWinner() == 1) {
            win();
            return;
        } else if (checkWinner() == 2) {
            lost();
            return;
        } else if (checkWinner() == 3) {
            draw();
            return;
        }

    }

    public void easyMove() {
        Random r = new Random();
        int x = r.nextInt(100);
        x = x % 9;
        while (x == 0 || data[x] != 0) {
            x = r.nextInt(100);
            x = x % 9;
        }
        if (data[x] == 0) {
            button[x].setText("O");
            button[x].setStyle(String.format("-fx-font-size:  30px;", 65));
            data[x] = 2;
        }
    }

    public void mediumMove() {
        for (int i = 1; i <= 9;) {

            if (data[i] == 1 && data[i + 1] == 1 && data[i + 2] == 0) {
                set(i + 2);
                return;
            } else if (data[i] == 1 && data[i + 2] == 1 && data[i + 1] == 0) {
                set(i + 1);
                return;
            } else if (data[i + 2] == 1 && data[i + 1] == 1 && data[i] == 0) {
                set(i);
                return;
            }
            i = i + 3;
        }
        for (int i = 1; i <= 3; i++) {

            if (data[i] == 1 && data[i + 3] == 1 && data[i + 6] == 0) {
                set(i + 6);
                return;
            } else if (data[i] == 1 && data[i + 6] == 1 && data[i + 3] == 0) {
                set(i + 3);
                return;
            } else if (data[i + 6] == 1 && data[i + 3] == 1 && data[i] == 0) {
                set(i);
                return;
            }
        }
        if (data[1] == 1 && data[9] == 0) {
            set(9);
        } else if (data[9] == 1 && data[1] == 0) {
            set(1);
        } else if (data[3] == 1 && data[7] == 0) {
            set(7);
        } else if (data[7] == 1 && data[3] == 0) {
            set(4);
        } else if (data[(now + 3) % 9] == 0) {
            set((now + 3) % 9);
        } else if (data[abs(now - 3) % 9] == 0) {
            set(abs(now - 3) % 9);
        } else if (data[(now + 1) % 9] == 0) {
            set((now + 1) % 9);
        } else if (data[abs(now - 1) % 9] == 0) {
            set(abs(now - 1) % 9);
        } else {
            set(0);
        }
    }

    public void set(int x) {
        if (x <= 0 || data[x] == 1 || data[x] == 2 || x > 9) {
            easyMove();
        } else {
            button[x].setText("O");
            button[x].setStyle(String.format("-fx-font-size:  30px;", 65));
            data[x] = 2;
        }
    }

    public void hardMove() {
        if (checkAI() == 1) {
            return;
        }
        if (data[5] == 0) {
            set(5);
        } else if (count == 1 && data[5] == 1) {
            set(1);
        } else if (count == 2 && ((data[1] == 1 && data[9] == 1) || (data[7] == 1 && data[9] == 1))) {
            if (data[2] == 0) {
                set(2);
            } else if (data[4] == 0) {
                set(4);
            } else if (data[6] == 0) {
                set(6);
            } else if (data[8] == 0) {
                set(8);
            }
        } else if (count >= 2) {
            if (data[1] == 1 && data[5] == 1 && data[9] == 0) {
                set(9);
            } else if (data[1] == 0 && data[5] == 1 && data[9] == 1) {
                set(1);
            } else if (data[7] == 1 && data[5] == 1 && data[3] == 0) {
                set(3);
            } else if (data[7] == 0 && data[5] == 1 && data[3] == 1) {
                set(7);
            } else {
                mediumMove();
            }
        }
    }

    public int checkAI() {
        if (data[1] == 2 && data[5] == 2 && data[9] == 0) {
            set(9);
            return 1;
        } else if (data[1] == 0 && data[5] == 2 && data[9] == 2) {
            set(1);
            return 1;
        } else if (data[7] == 2 && data[5] == 2 && data[3] == 0) {
            set(3);
            return 1;
        } else if (data[7] == 0 && data[5] == 1 && data[3] == 1) {
            set(7);
            return 1;
        } else {
            for (int i = 1; i <= 9;) {

                if (data[i] == 2 && data[i + 1] == 2 && data[i + 2] == 0) {
                    set(i + 2);
                    return 1;
                } else if (data[i] == 2 && data[i + 2] == 2 && data[i + 1] == 0) {
                    set(i + 1);
                    return 1;
                } else if (data[i + 2] == 2 && data[i + 1] == 2 && data[i] == 0) {
                    set(i);
                    return 1;
                }
                i = i + 3;
            }
            for (int i = 1; i <= 3; i++) {

                if (data[i] == 2 && data[i + 3] == 2 && data[i + 6] == 0) {
                    set(i + 6);
                    return 1;
                } else if (data[i] == 2 && data[i + 6] == 2 && data[i + 3] == 0) {
                    set(i + 3);
                    return 1;
                } else if (data[i + 6] == 2 && data[i + 3] == 2 && data[i] == 0) {
                    set(i);
                    return 1;
                }
            }
        }
        return 0;
    }

    public int checkWinner() {
        if (data[1] == 1 && data[2] == 1 && data[3] == 1) {
            return 1;
        } else if (data[4] == 1 && data[5] == 1 && data[6] == 1) {
            return 1;
        } else if (data[7] == 1 && data[8] == 1 && data[9] == 1) {
            return 1;
        } else if (data[1] == 1 && data[4] == 1 && data[7] == 1) {
            return 1;
        } else if (data[2] == 1 && data[5] == 1 && data[8] == 1) {
            return 1;
        } else if (data[3] == 1 && data[6] == 1 && data[9] == 1) {
            return 1;
        } else if (data[1] == 1 && data[5] == 1 && data[9] == 1) {
            return 1;
        } else if (data[7] == 1 && data[5] == 1 && data[3] == 1) {
            return 1;
        } else if (data[1] == 2 && data[2] == 2 && data[3] == 2) {
            return 2;
        } else if (data[4] == 2 && data[5] == 2 && data[6] == 2) {
            return 2;
        } else if (data[7] == 2 && data[8] == 2 && data[9] == 2) {
            return 2;
        } else if (data[1] == 2 && data[4] == 2 && data[7] == 2) {
            return 2;
        } else if (data[2] == 2 && data[5] == 2 && data[8] == 2) {
            return 2;
        } else if (data[3] == 2 && data[6] == 2 && data[9] == 2) {
            return 2;
        } else if (data[1] == 2 && data[5] == 2 && data[9] == 2) {
            return 2;
        } else if (data[7] == 2 && data[5] == 2 && data[3] == 2) {
            return 2;
        }
        for (int i = 1; i <= 9; i++) {
            if (data[i] == 0) {
                return 0;
            }
        }
        return 3;
    }

    public void win() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("WIN!");
        alert.setHeaderText("CONGRATS!");
        alert.setContentText("You Won!");
        alert.showAndWait();
        start(frame);
    }

    public void lost() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Lost!");
        alert.setHeaderText("Sorry!");
        alert.setContentText("You Lost!");
        alert.showAndWait();
        start(frame);
    }

    public void draw() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("DRAW!");
        alert.setHeaderText("Draw!!!");
        alert.setContentText("Better Luck next time!!");
        alert.showAndWait();
        start(frame);
    }

    public void playFrame() {
        Pane pane = setGrids();
        GridPane g_pane = setButtons();
        pane.getChildren().add(g_pane);
        Scene scene = new Scene(pane, 400, 400);
        frame.setScene(scene);
        frame.show();
        buttonclicks();
    }

    @Override
    public void start(Stage primaryStage) {
        frame = primaryStage;
        primaryStage.setTitle("Cross");
        primaryStage.getIcons().add(new Image("icon.png"));
        Pane mainpane = new Pane();
        ImageView back = new ImageView(new Image("background1.jpg"));
        back.relocate(0,0);
        for (int i = 1; i <= 9; i++) {
            data[i] = 0;
        }
        count = 0;
        GridPane pane = new GridPane();
        pane.setHgap(20);
        pane.setVgap(20);
        pane.setAlignment(Pos.CENTER);
        Button newgame = new Button("New Game");
        Button diff = new Button();
        if (lavel == 0 || lavel == 1) {
            lavel = 1;
            diff.setText("Difficulty: Easy");
        } else if (lavel == 2) {
            diff.setText("Difficulty: Medium");
        } else {
            diff.setText("Difficulty: Hard");
        }
        pane.add(newgame, 6, 5);
        pane.add(diff, 6, 6);
        mainpane.getChildren().addAll(back,pane);
        Scene scene = new Scene(mainpane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        newgame.setOnAction((ActionEvent e) -> {
            playFrame();
        });
        diff.setOnAction(e -> {
            setDifficulty();
        });

    }

    public static void main(String[] args) {
        launch(args);
    }

}
