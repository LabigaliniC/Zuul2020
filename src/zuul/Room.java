package zuul;

import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }


    public Room getExit(String direction) {
        return exits.get(direction);
    }

    /**
     * Retorna uma descrição das saídas da sala
     * por exemplo: Saidas: norte oeste
     * @return String com a descrição das saídas da sala
     */
    public String getExitString() {
        String exitString = "Saídas:";
        // para cada direção (string representando a direção)
        // no conjunto de chaves do hashmap (keySet) faça
        for(String exit : exits.keySet()) {
            exitString += " " + exit;
        }

        return exitString;
    }

    /**
     * Define uma saída para esta sala
     * @param direction Uma string representando a direção da saída
     * @param neighbor O objeto de Room (sala) que é adjacente na direção especificada
     */
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
