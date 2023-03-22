public class Wand {
    Core core;
    Float size;

    public void Wand( Float size) {
        this.size = size;
        Core core = Core.getRandom();
        this.core = core;
    }
}
