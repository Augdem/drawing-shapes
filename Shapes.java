public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle benson = new Turtle(50, 50);
        int totalTurns = 0;
        for (int i = 1; i <= 5; i++) {
        benson.left(72);
        benson.forward(4);
        }
        benson.up();
        for (int i = 1; i <= 5; i++) {
        benson.left(3);
        benson.forward(15);
        }
        benson.down();

        

        // Task 2: Draw a regular shape many times
        for (int j = 1; j <=10; j++)
        {
        for (int i = 1; i <= 5; i++) {
        benson.left(72);
        benson.forward(30);
        }
        benson.left(36);
        benson.forward(30);
        }
        benson.up();
        benson.left(180);
        benson.forward(200);
        benson.down();

        // Task 3: How many times does Turtle turn!
        for (int j = 1; j <=10; j++)
        {
        for (int i = 1; i <= 5; i++) {
        benson.left(72);
        totalTurns++;
        benson.forward(30);
        
        }
        benson.left(36);
        totalTurns++;
        benson.forward(30);
        }
        System.out.println("Benson has turned " + totalTurns + " times!");

        // Extension 1:


        // Extension 2:

    }
}
