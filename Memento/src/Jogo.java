
public class Jogo {
	private int level;
    private String checkpoint;
    
    public void play() {
        // Lógica do jogo
        level++;
        checkpoint = "Checkpoint " + level;
        System.out.println("Playing game. Level: " + level);
    }
    
    public Memento save() {
        return new Memento(level, checkpoint);
    }
    
    public void restore(Memento memento) {
        level = memento.getLevel();
        checkpoint = memento.getCheckpoint();
        System.out.println("Restoring game state. Level: " + level);
    }
    
    public String toString() {
        return "Game state - Level: " + level + ", Checkpoint: " + checkpoint;
    }
}
