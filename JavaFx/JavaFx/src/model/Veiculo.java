package model;

public class Veiculo {
    private Integer _id;
    private Integer hp;
    private String marca;
    private String modelo;
    




    public Veiculo(int hp, String marca, String modelo) {
        
        this.hp = hp;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo(Integer _id, int hp, String marca, String modelo) {
        this._id = _id;
        this.hp = hp;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Integer get_id() {
        return this._id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString() {
       
        return "Veiculos("+marca+"\t"+modelo+"\t"+hp+")";
    }

    
}
