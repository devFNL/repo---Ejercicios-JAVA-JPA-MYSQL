/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enum;

/**
 *
 * @author Jib
 */
public enum RazaPerro {
    
    PITBULL(4234, "Pitbull"), COLLIE(4123, "Collie"), GALGO(2354, "Galgo");
    
    private Integer codigo;
    private String estilo;
    
    
    private RazaPerro(Integer codigo, String estilo){
        
        this.codigo = codigo;
        this.estilo = estilo;
        
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    
    
    
}
