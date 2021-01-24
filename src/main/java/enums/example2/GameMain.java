package enums.example2;

public class GameMain {

    public static void main(String[] args) {
        Game game = new Game();
        game.setName("Mario");
        game.setGameLevel(GameLevel.EASY);
        printInfo(game);

        System.out.println("-----------------------");

        game.setGameLevel(GameLevel.HARD);
        printInfo(game);
    }

    private static void printInfo(Game game) {
        System.out.println("Game is called " + game.getName());
        System.out.println("Game level is set to " + game.getGameLevel());
        System.out.println("youwill be given" + game.getGameLevel().getHealthPoints() + " HP");
        System.out.println("Armor - " + game.getGameLevel().getArmorType());
    }
}
