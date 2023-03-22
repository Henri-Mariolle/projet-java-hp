public enum House {
    Gryffindor,
    Ravenclaw,
    Hufflepuff,
    Slytherin,
    ;

    public static House getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}


