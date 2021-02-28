
class InvalidInputException extends Exception {
  @Override
  public String toString() {
    return "Cannnot add 8 and 9 inputs";
  }

  @Override
  public String getMessage() {
    return "I am getMessage()";
  }
}


class CannotDivideByZero extends Exception {
  @Override
  public String toString() {
    return "Cannnot divide by Zero Exception";
  }

  @Override
  public String getMessage() {
    return "I am getMessage()";
  }
}


class MaxInputException extends Exception {
  @Override
  public String toString() {
    return "Max Input Cannot be greater than 100000";
  }

  @Override
  public String getMessage() {
    return "I am getMessage()";
  }
}

class MaxMultiplyInputException extends Exception {
  @Override
  public String toString() {
    return "Max Input Cannot be greater than 7000";
  }

  @Override
  public String getMessage() {
    return "I am getMessage()";
  }
}



class Calculator {
  double add(double a , double b) throws InvalidInputException , MaxInputException{
    if(a>100000 || b> 100000) {
      throw new MaxInputException();
    }  
    if(a==8 || b==9) {
      throw new InvalidInputException();
    }
    return a + b;
  }

  double subtract(double a , double b) throws MaxInputException {
    if(a>1000000 || b> 1000000) {
      throw new MaxInputException();
    }  
    return a - b;
  }

  double multiply(double a , double b) throws MaxInputException , MaxMultiplyInputException{
    if(a>1000000 || b>1000000) {
      throw new MaxInputException();
    } else if(a>7000 || b>7000) {
      throw new MaxMultiplyInputException();
    }  
    return a * b;
  }

  double divide(double a , double b) throws CannotDivideByZero , MaxInputException{
    
    if(a>1000000 || b> 1000000) {
      throw new MaxInputException();
    } 
    if(a==0 || b==0) {
      throw new CannotDivideByZero();
    }
    return a / b;
  }
}


public class Main {
  public static void main(String[] args) throws InvalidInputException , CannotDivideByZero, MaxInputException , MaxMultiplyInputException{
    Calculator c = new Calculator();
    // c.add(8,9);
    // c.divide(6,0);
    // c.multiply(4000000, 45);
    c.multiply(5, 9888);
  }
}