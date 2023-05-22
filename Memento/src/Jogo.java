
public class Jogo {
	private int level;
    private String checkpoint;
    
    public void play() {
        // Lógica do jogo
        level++;
        checkpoint = "Checkpoint " + level;
        System.out.println("Jogando Level: " + level);
    }
    
    public Memento save() {
        return new Memento(level, checkpoint);
    }
    
    public void restore(Memento memento) {
        level = memento.getLevel();
        checkpoint = memento.getCheckpoint();
        System.out.println("Restaurando jogo no Level: " + level);
    }
    
    public String toString() {
        return "Jogo no - Level: " + level + "e Checkpoint: " + checkpoint;
    }
}
