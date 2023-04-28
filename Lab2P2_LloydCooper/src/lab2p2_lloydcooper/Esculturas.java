package lab2p2_lloydcooper;

public class Esculturas {
    private String escultor;
    private String material;
    private int anioComienzo;
    private String departamento;
    
    public Esculturas (String escultor, String material, int comienzoAnio, String departamento){
        this.escultor = escultor;
        this.material = material;
        this.anioComienzo = anioComienzo;
        this.departamento = departamento;
    }
    
    public String getEscultor(){
        return escultor;
    }
    
    public void setEscultor(){
        this.escultor = escultor;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public void setMaterial(){
        this.material = material;
    }
    
    public int getAnioComienzo() {
        return anioComienzo;
    }

    public void setAnioComienzo(int anioComienzo) {
        this.anioComienzo = anioComienzo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
