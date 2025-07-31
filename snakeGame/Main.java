package snakeGame;

public class Main {
    public static void main(String[] args) {
        /* Recursive approach
        Snake snake = new Snake(6,6);
        snake.snakeMove(0,0); */

        //Iterative approach
        SnakeIterative snakeIterative = new SnakeIterative(6,6);
        snakeIterative.initiateSnake();
    }
}