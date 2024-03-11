interface LegacyShape{
    void drawLegacyShape();
}
class LegacyCircle implements LegacyShape{
    @Override
    public void drawLegacyShape(){
        System.out.println("Drawing a Circle");
    }
}
interface ModerShape{
    void drawModernShape();
}

class LegacyAdapter implements ModerShape{
    private final LegacyShape legacyShape;
    public LegacyAdapter(LegacyShape legacyShape){
        this.legacyShape = legacyShape;
    }
    @Override
    public void drawModernShape(){
        legacyShape.drawLegacyShape();
        System.out.println( "Drawing a Modern Shape" );
    }
}

class prac4{
    public static void main(String[] args) {
        LegacyShape l = new LegacyCircle();
        ModerShape m = new LegacyAdapter(l);
        m.drawModernShape();
    }
}