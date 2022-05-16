package single_responsibility;

import java.util.ArrayList;

public class BoardOfStringArrayList implements BoardInterface {
	
	public ArrayList<String> spots;
	int boardSize; 
	
	public BoardOfStringArrayList(int boardSize) {
		this.boardSize = boardSize; 
	}
	
	
	@Override
    public void addToBoard(int boardSize) {
        for (int j = 0; j < boardSize; j++) {
            this.spots.add(String.valueOf(j));
        }
    }


    
}
