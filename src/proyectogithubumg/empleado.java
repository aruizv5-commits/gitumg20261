/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogithubumg;

/**
 *
 * @author UMG
 */
public class empleado {
    int id;
    String nombre;
    String apellido;
    String direccion;
    float salario;

    public empleado() {
        this(0,"","","",0);
    }

    public empleado(int id, String nombre, String apellido, String direccion, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.salario = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    float total;
    public float Calcularsalario() {
    
        total = salario + 5000;
        
        if(id > 30){
        
            total += 300; 
        }else{
        
            total +=9000;
        }
        
        return total;
        
    }
    
    
}
