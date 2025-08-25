package com.gamingroom;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	// List to hold "Team" objects
	private java.util.List<Team> teams = new java.util.ArrayList<>();

	// Constructor with an identifier and name
	public Game(long id, String name) {
		super(id, name);
	}

	@Override
	public String toString() {
		return "Game [id=" + getId() + ", name=" + getName() + "]";
	}

	public Team addTeam(String name) {
		// Iterator pattern to find team with same name
        for (Team team : teams) {
			// if team already exists, return the existing team
			if (team.getName().equalsIgnoreCase(name)) {
				return team;
			}
        }
		// if not found, create new team, add to list, then return
		Team newTeam = new Team(GameService.getInstance().getNextTeamId(), name);
		teams.add(newTeam);

		return newTeam;
	}

}
