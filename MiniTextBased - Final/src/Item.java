public class Item {
    private int itemId;
    private int roomId;
    private String itemName;
    private String description;
    private int hpRestored;
    private int attackPoints;
    private int defense;
    private int chanceToDeflect;

    public Item(int roomId, String description, int hpRestored, int attackPoints,int itemId, String itemName, int defense, int chanceToDeflect) {
        this.roomId = roomId;
        this.description = description;
        this.hpRestored = hpRestored;
        this.attackPoints = attackPoints;
        this.itemId = itemId;
        this.itemName = itemName;
        this.defense = defense;
        this.chanceToDeflect = chanceToDeflect;
    }

    public Item() {
        this.roomId = roomId;
        this.description = description;
        this.hpRestored = hpRestored;
        this.attackPoints = attackPoints;
        this.itemId = itemId;
        this.itemName = itemName;
        this.defense = defense;
        this.chanceToDeflect = chanceToDeflect;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getChanceToDeflect() {
        return chanceToDeflect;
    }

    public void setChanceToDeflect(int chanceToDeflect) {
        this.chanceToDeflect = chanceToDeflect;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHpRestored() {
        return hpRestored;
    }

    public void setHpRestored(int hpRestored) {
        this.hpRestored = hpRestored;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }
}
