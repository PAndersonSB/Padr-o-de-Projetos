
public class Memento {
	private final int level;
    private final String checkpoint;
    
    public Memento(int level, String checkpoint) {
        this.level = level;
        this.checkpoint = checkpoint;
    }
    
    public int getLevel() {
        return level;
    }
    
    public String getCheckpoint() {
        return checkpoint;
    }
}
