package com.gamingroom;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{
	private final java.util.List<Player> players = new java.util.ArrayList<>();
	// Constructor with an identifier and name
	public Team(long id, String name) {
		super(id, name);
	}

	public Player addPlayer(String name) {
		// Iterator pattern to find player with same name
		for (Player player : players) {
			// if player already exists, return the existing player
			if (player.getName().equalsIgnoreCase(name)) {
				return player;
			}
		}
		// if loop finishes and no existing player found, make a new one and return it
		Player newPlayer = new Player(GameService.getInstance().getNextPlayerId(), name);
		players.add(newPlayer);
		return newPlayer;
	}

	@Override
	public String toString() {
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}
}
