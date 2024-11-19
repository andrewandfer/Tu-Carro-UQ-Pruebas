package co.edu.uniquindio.poo;

// La clase PickUpElectrico representa una camioneta eléctrica con características específicas.
public class PickUpElectrico extends VehiculoElectrico {
    private String capacidadCarga;      // Capacidad de carga en kilogramos
    private boolean aireAcondicionado;   // Indica si el vehículo tiene aire acondicionado
    private boolean abs;                 // Indica si el vehículo tiene sistema de frenos antibloqueo (ABS)
    private int numeroPasajeros;         // Número de pasajeros que puede transportar
    private int numeroPuertas;           // Número de puertas del vehículo
    private boolean camaraReversa;       // Indica si el vehículo tiene cámara de reversa
    private boolean bolsasAire;          // Indica si el vehículo está equipado con bolsas de aire
    private boolean cuatroxcuatro;       // Indica si el vehículo es de tracción en las cuatro ruedas

    // Constructor de la clase PickUpElectrico.
    // Inicializa una nueva camioneta eléctrica con las características especificadas.
    public PickUpElectrico(String marca, Estado estado, int modelo, int cambios, double velocidadmaxima,
            double cilindraje, Transmision transmision, String matricula, int autonomiacargacompleta, 
            String tiempodecarga, String capacidadCarga, boolean aireAcondicionado, boolean abs, 
            int numeroPasajeros, int numeroPuertas, boolean camaraReversa, boolean bolsasAire, 
            boolean cuatroxcuatro) {
        // Llama al constructor de la clase base (VehiculoElectrico)
        super(marca, estado, modelo, cambios, velocidadmaxima, cilindraje, transmision,
              autonomiacargacompleta, tiempodecarga, matricula);

        // Inicializa los atributos específicos de la camioneta eléctrica
        this.capacidadCarga = capacidadCarga; // Asigna la capacidad de carga
        this.aireAcondicionado = aireAcondicionado; // Asigna si tiene aire acondicionado
        this.abs = abs; // Asigna si tiene ABS
        this.numeroPasajeros = numeroPasajeros; // Asigna el número de pasajeros
        this.numeroPuertas = numeroPuertas; // Asigna el número de puertas
        this.camaraReversa = camaraReversa; // Asigna si tiene cámara de reversa
        this.bolsasAire = bolsasAire; // Asigna si tiene bolsas de aire
        this.cuatroxcuatro = cuatroxcuatro; // Asigna si es de tracción en las cuatro ruedas
    }

    // Método getter para obtener la capacidad de carga.
    public String getCapacidadCarga() {
        return capacidadCarga; // Devuelve la capacidad de carga
    }

    // Método setter para establecer la capacidad de carga.
    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga; // Establece la capacidad de carga
    }

    // Método getter para verificar si tiene aire acondicionado.
    public boolean isAireAcondicionado() {
        return aireAcondicionado; // Devuelve true si tiene aire acondicionado
    }

    // Método setter para establecer si tiene aire acondicionado.
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado; // Establece si tiene aire acondicionado
    }

    // Método getter para verificar si tiene ABS.
    public boolean isAbs() {
        return abs; // Devuelve true si tiene ABS
    }

    // Método setter para establecer si tiene ABS.
    public void setAbs(boolean abs) {
        this.abs = abs; // Establece si tiene ABS
    }

    // Método getter para obtener el número de pasajeros.
    public int getNumeroPasajeros() {
        return numeroPasajeros; // Devuelve el número de pasajeros
    }

    // Método setter para establecer el número de pasajeros.
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros; // Establece el número de pasajeros
    }

    // Método getter para obtener el número de puertas.
    public int getNumeroPuertas() {
        return numeroPuertas; // Devuelve el número de puertas
    }

    // Método setter para establecer el número de puertas.
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas; // Establece el número de puertas
    }

    // Método getter para verificar si tiene cámara de reversa.
    public boolean isCamaraReversa() {
        return camaraReversa; // Devuelve true si tiene cámara de reversa
    }

    // Método setter para establecer si tiene cámara de reversa.
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa; // Establece si tiene cámara de reversa
    }

    // Método getter para verificar si tiene bolsas de aire.
    public boolean isBolsasAire() {
        return bolsasAire; // Devuelve true si tiene bolsas de aire
    }

    // Método setter para establecer si tiene bolsas de aire.
    public void setBolsasAire(boolean bolsasAire) {
        this.bolsasAire = bolsasAire; // Establece si tiene bolsas de aire
    }

    // Método getter para verificar si es de tracción en las cuatro ruedas.
    public boolean isCuatroxcuatro() {
        return cuatroxcuatro; // Devuelve true si es de tracción en las cuatro ruedas
    }

    // Método setter para establecer si es de tracción en las cuatro ruedas.
    public void setCuatroxcuatro(boolean cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro; // Establece si es de tracción en las cuatro ruedas
    }
}