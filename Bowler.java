public class Bowler {
    
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    
    public Bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    
    public void computeBowlingAverage() {
        if (wickets <= 0 || runsConceded < 0 || ballsBowled < 0 || matches < 0 ||
            (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
            return;
       