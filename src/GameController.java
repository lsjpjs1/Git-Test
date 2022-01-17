import java.sql.DriverManager;

public interface GameController {
    void goLeft();
    static GameController keyBoard(){
        return new Keyboard();
    }

    static GameController joyStick(){
        return new JoyStick();
    }

    static GameController customController(String game){
        if (game.equals("롤")) {
            return new Keyboard();
        } else if (game.equals("철권")){
            return new JoyStick();
        } else {

           return new Keyboard();
        }
    }

}
