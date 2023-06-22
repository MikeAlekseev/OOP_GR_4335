// Фабрика операций

public class OperationFactory {
    
    /**
     * Создает объект операции в зависимости от переданного типа.
     * @param type тип операции
     * @return объект операции
     * @throws IllegalArgumentException если передан неизвестный тип операции
     */
    public static iOperation createOperation(String type) {
       switch (type) {
          case "add":
             return new Add();
          case "multiply":
             return new Multiply();
          case "divide":
             return new Divide();
          default:
             throw new IllegalArgumentException("Неизвестный тип операции: " + type);
       }
    }
 }