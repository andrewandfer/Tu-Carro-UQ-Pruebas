package co.edu.uniquindio.poo;

public class UrbanoElectrico extends VehiculoElectrico {

    private boolean velocidadCrucero;
    private boolean sensorColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentenPermanenciaCarril;

    // Constructor de la clase UrbanoElectrico
    public UrbanoElectrico(String marca, Estado estado, int modelo, int cambios, int velocidadmaxima, double cilindraje,
            Transmision transmision, String matricula, int autonomiacargacompleta, String tiempodecarga, boolean velocidadCrucero,
            boolean sensorColision, boolean sensorTraficoCruzado, boolean asistentenPermanenciaCarril) {
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision, autonomiacargacompleta,
                tiempodecarga, matricula);
        this.velocidadCrucero = velocidadCrucero;
        this.sensorColision = sensorColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentenPermanenciaCarril = asistentenPermanenciaCarril;
    }

    // Getter para obtener si tiene velocidad crucero
    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    // Setter para establecer si tiene velocidad crucero
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    // Getter para obtener si tiene sensor de colisión
    public boolean isSensorColision() {
        return sensorColision;
    }

    // Setter para establecer si tiene sensor de colisión
    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }

    // Getter para obtener si tiene sensor de tráfico cruzado
    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    // Setter para establecer si tiene sensor de tráfico cruzado
    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    // Getter para obtener si tiene asistente de permanencia en carril
    public boolean isAsistentenPermanenciaCarril() {
        return asistentenPermanenciaCarril;
    }

    // Setter para establecer si tiene asistente de permanencia en carril
    public void setAsistentenPermanenciaCarril(boolean asistentenPermanenciaCarril) {
        this.asistentenPermanenciaCarril = asistentenPermanenciaCarril;
    }

    // Sobrescritura del método toString para proporcionar una representación en texto del objeto
    @Override
    public String toString() {
        return "UrbanoElectrico [velocidadCrucero=" + velocidadCrucero + ", sensorColision=" + sensorColision
                + ", sensorTraficoCruzado=" + sensorTraficoCruzado + ", asistentenPermanenciaCarril="
                + asistentenPermanenciaCarril + "]";
    }
}