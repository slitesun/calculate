module calculate;

int calculate(string nameOperation, double first, double second){
  switch(nameOperation){
    case "+":
      double result = first + second;
      writeln(result);
      break;
   
    case "-":
      double result = first - second;
      writeln(result);
      break;
   
    case "*":
      double result = first * second;
      writeln(result);
      break;
   
    case "/":
      double result = first / second;
      writeln(result);
      break;
     
    default:
      writeln("Ошибка сравнения!");
      break;
  }
}
