public class Calculadora {
    // Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    protected String tipoCalculadora;
    protected String color;
    protected int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;

    // Constructor de la clase
    public Calculadora(String propietario) {
        this.tipoCalculadora = "Calculadora Erick";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "ROJO";
        this.nombrePropietario = propietario;
    }

    public Calculadora() {
        this.tipoCalculadora = "Calculadora Sofia";
        this.dimensionPantalla = 10;
        this.numeroDeSerie = "12345abc";
        this.color = "ROJO";
        this.nombrePropietario = "";
    }

    public double sumar(double primerNumero, double segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora("Erick");
        double resultadoSuma = calculadora.sumar(5, 3);
        double resultadoResta = calculadora.restar(44, 8);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);

        CalculadoraBasica calculadoraBasica = new CalculadoraBasica("Sofia");
        double resultadoMultiplicacion = calculadoraBasica.multiplicar(57, 5);
        double resultadoDivision = calculadoraBasica.dividir(3, 9);
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);
        System.out.println("Resultado de la division: " + resultadoDivision);

        CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial("Samir");
        double resultadoRaiz = calculadoraEspecial.raizCuadrada(20);
        boolean esPrimo = calculadoraEspecial.esPrimo(10);
        System.out.println("Raiz cuadrada: " + resultadoRaiz);
        System.out.println("Es primo: " + esPrimo);
        
        int numero = 23;
        System.out.println("El numero " + numero + " es par: " + calculadoraEspecial.esNumeroPar(numero));
        System.out.println("El numero " + numero + " es impar: " + calculadoraEspecial.esNumeroImpar(numero));
        System.out.println("El factorial de " + numero + " es: " + calculadoraEspecial.factorial(numero));
        double angulo = Math.PI / 13; // 45 grados en radianes
        System.out.println("Seno de " + angulo + ": " + calculadoraEspecial.seno(angulo));
        System.out.println("Coseno de " + angulo + ": " + calculadoraEspecial.coseno(angulo));
        System.out.println("Tangente de " + angulo + ": " + calculadoraEspecial.tangente(angulo));
        
        double numeroLogaritmo = 159;
        System.out.println("Logaritmo de " + numeroLogaritmo + ": " + calculadoraEspecial.logaritmo(numeroLogaritmo));
        
        double numeroRaizCubica = 44;
        System.out.println("Raiz cubica de " + numeroRaizCubica + ": " + calculadoraEspecial.raizCubica(numeroRaizCubica));
    }
}

class CalculadoraBasica extends Calculadora {
    public CalculadoraBasica(String propietario) {
        super(propietario);
    }

    public double multiplicar(double primerNumero, double segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public double dividir(double primerNumero, double segundoNumero) {
        return primerNumero / segundoNumero;
    }
}

class CalculadoraEspecial extends Calculadora {
    public CalculadoraEspecial(String propietario) {
        super(propietario);
    }

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public boolean esPrimo(int numeroBuscado) {
        boolean primo = false;
        int contador = 0;
        for (int i = numeroBuscado; i > 0; i--) {
            if (numeroBuscado % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean esNumeroImpar(int numero) {
        return numero % 2 != 0;
    }

    public int factorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public double seno(double angulo) {
        return Math.sin(angulo);
    }

    public double coseno(double angulo) {
        return Math.cos(angulo);
    }

    public double tangente(double angulo) {
        return Math.tan(angulo);
    }

    public double logaritmo(double numero) {
        return Math.log(numero);
    }

    public double raizCubica(double numero) {
        return Math.cbrt(numero);
    }
}
