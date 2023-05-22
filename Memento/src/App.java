
public class App {
	public static void main(String[] args) {
        Jogo game = new Jogo();
        Caretaker caretaker = new Caretaker();
        
        // Jogando e salvando o estado em momentos específicos
        game.play(); // Level 1
        game.play(); // Level 2
        game.play(); // Level 3
        caretaker.addMemento(game.save()); 
        game.play(); // Level 4
        game.play(); // Level 5
        game.play(); // Level 6
        
        // Restaurando o estado do jogo a partir de um Memento
        Memento memento = caretaker.getMemento(0);
        game.restore(memento);       
        System.out.println(game);
    }
}
