package lab2p2_lloydcooper;

    public class Fotografias {
    private String dimension;
    private String resolucion;
    private boolean aColor;

    public Fotografias (String dimension, String resolucion, boolean aColor) {
        this.dimension = dimension;
        this.resolucion = resolucion;
        this.aColor = aColor;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    
    public boolean aColor(){
        return aColor;
    }
}
