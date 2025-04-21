package actividad3;

/**
 *
 * @author bryan
 */
public class Empleado {
    private String codEmpleado, nombres, apellidos, cargo, area;
    private Double salario;
    
    public Empleado () {
        this.codEmpleado = "E0205";
        this.nombres = "Lionel Andres";
        this.apellidos = "Mendoza Paredes";
        this.salario = 1220.90;
        this.cargo = "Supervisor";
        this.area = "Ventas";
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String CodEmpleado) {
        this.codEmpleado = CodEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void calcularSalarioTotal (Double bono) {
        salario += salario + bono;
        System.out.println("El salario del Empleado es: " + salario);
    }
    
    public void calcularSalarioTotal (Double bono, Double descuentoPenalizacion) {
        salario = (salario - descuentoPenalizacion) + bono;
        System.out.println("El salario del Empleado es: " + salario);
    }
     
    public void calcularSalarioTotal (Double bono, Double descuentoPenalizacion, String cargo) {
        Double utilidades;
        switch (cargo) {
            case "Supervisor":
                utilidades = 0.10;
                break;
            case "Vendedor":
                utilidades = 0.04;
                break;
            case "Gerente de Ventas":
                utilidades = 0.18;
                break;
            default:
                utilidades = 0.0;
                break;
        }
        salario = (((salario * utilidades) + salario ) - descuentoPenalizacion) + bono;
        System.out.println("El salario del Empleado es: " + salario);
    }
    
    public void mostrarInfo () {
        System.out.println("Codigo de Empleado: " + codEmpleado);
        System.out.println("Nombres de Empleado: " + nombres);
        System.out.println("Apellidos de Empleado: " + apellidos);
        System.out.println("Cargo de Empleado: " + cargo);
        System.out.println("Salario de Empleado: " + salario);
    }
}
