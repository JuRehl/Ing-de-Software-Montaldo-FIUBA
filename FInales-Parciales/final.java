//Ejercicio 4 final 10/12/2025 

// Strategy
interface DataStrategy {
    Object parse(String content);
    boolean validate(Object data);
    void save(Object data);
}
// Interpreter
interface Expression {
    Object interpret(String content);
}
// Interpreter concreto CSV
class CSVExpression implements Expression {
    public Object interpret(String content) {
        System.out.println("Parsing CSV: " + content);
        return new Object();
    }
}
// Strategy concreta CSV
class CSVStrategy implements DataStrategy {

    private Expression interpreter = new CSVExpression();

    public Object parse(String content) {
        return interpreter.interpret(content);
    }

    public boolean validate(Object data) {
        System.out.println("Validating CSV structure");
        return true;
    }

    public void save(Object data) {
        System.out.println("Saving CSV");
    }
}
// Contexto
class DataProcessor {

    private DataStrategy strategy;

    public DataProcessor(DataStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(String content) {
        Object data = strategy.parse(content);
        if (strategy.validate(data)) {
            System.out.println("Processing content");
            strategy.save(data);
            System.out.println("Saving Metadata");
        }
    }
}

//Final 14/07/2025 ejercicio 1
interface Expresion {
    double calcular();
}
class Numero implements Expresion {

    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    public double calcular() {
        return valor;
    }
}
class Suma implements Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public Suma(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public double calcular() {
        return izquierda.calcular() + derecha.calcular();
    }
}

