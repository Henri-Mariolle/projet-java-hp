public enum Core {
    dragonventricle,
    phoenixfeather,
    unicornhair,
    veelahair,
    basiliskfang,
    ;

    public static Core getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }


}
