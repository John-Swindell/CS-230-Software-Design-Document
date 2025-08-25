package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/* A singleton service for the game engine
 * @author coce@snhu.edu
 */
public class GameService {
	private static long nextTeamId = 1;
	private static long nextPlayerId = 1;

	// Getter methods for new team ID + Player ID
	public long getNextTeamId() {
		return nextTeamId++;
	}

	public long getNextPlayerId() {
		return nextPlayerId++;
	}
	// A list of the active games
	private static List<Game> games = new ArrayList<Game>();

	 // Holds the next game identifier
	private static long nextGameId = 1;

	// Constructor forcing singleton
	private GameService(){}

	// Static instance of the class itself
	private static final GameService INSTANCE = new GameService();

	// public static method to get that single instance
	public static GameService getInstance() {
		return INSTANCE;
	}


	public Game addGame(String name) {

		// Loops through all Game objects in 'games' arr list
        for (Game existingGame : games) {
            if (existingGame.getName().equals(name)) { // If the name matches
                return existingGame; // Game must be in 'games' already; return immediately
            }
        }

		// When this block is reached after the loop, no Game name was found in 'games'
		Game newGame = new Game(nextGameId++, name);
		games.add(newGame); // New Game is made and added to 'games'

		// Return the new game
		return newGame;
	}

	// Returns the game instance at the specified index.
	Game getGame(int index) {
		return games.get(index);
	}

	// Returns the game instance with the specified id.
	public Game getGame(long id) {

        for (Game currentGame : games) {
            if (currentGame.getId() == id) { // If the ID matches with the current iteration
                return currentGame;
            }
        }
		return null; // Returns null if the game is not found in iteration process
	}

	public Game getGame(String name) {
		for (Game currentGame : games) {
			if (currentGame.getName().equals(name)) { // checks if the current string name matches with .getName()
				return currentGame; // Returns if match
			}
		}
		return null; // Passes null if no match
	}

	// Returns the number of games currently active
	public int getGameCount() {
		return games.size();
	}
}
