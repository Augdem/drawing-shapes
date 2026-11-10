public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle benson = new Turtle(50, 50);
        int totalTurns = 0;
        int inc = 0;
        for (int i = 1; i <= 5; i++) {
        benson.left(72);
        benson.forward(4);
        }
        benson.up();
        for (int i = 1; i <= 5; i++) {
        benson.left(3);
        benson.forward(25);
        }
        benson.down();

        

        // Task 2: Draw a regular shape many times
        for (int j = 1; j <=6; j++)
        {
        for (int i = 1; i <= 6; i++) {
        benson.left(60);
        benson.forward(20);
        inc++;
        }
        benson.up();
        benson.left(30 * (inc + 1));
        benson.forward(20);
        benson.down();
        }
        
        benson.up();
        benson.left(270);
        benson.forward(150);
        benson.down();
        inc = 0;
        // Task 3: How many times does Turtle turn!
        for (int j = 1; j <=6; j++)
        {
        for (int i = 1; i <= 6; i++) {
        benson.left(60);
        totalTurns++;
        benson.forward(20);
        inc++;
        }
        benson.up();
        benson.left(30 * (inc + 1));
        totalTurns++;
        benson.forward(20);
        benson.down();
        }
        System.out.println("Benson has turned " + totalTurns + " times!");

        // Extension 1:


        // Extension 2:

    }
}
