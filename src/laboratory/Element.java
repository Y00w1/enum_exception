package laboratory;

public enum Element {
    FICHAS ("ensamble", "A1"),
    PIEZAS_METAL ("estructura", "B1"),
    ESFERAS ("movimiento", "C1"),
    RUEDAS ("movimiento", "C1"),
    ;
    private final String use;
    private final String location;
    Element(String use, String location) {
        this.use = use;
        this.location = location;
    }

    public String getUse(Element element) {
        for (Element element1 : Element.values()){
            if (element1==element){
                return use;
            }
        }
        return null;
    }
}
