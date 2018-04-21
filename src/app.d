import std.stdio;
import std.conv;
 
void main(){
  writeln("На данный момент поддерживается 4 типа операции: сложение, вычитание, умножение, деление. Введите тип операции");
  string nameOperation = readln();
  writeln("Тип выбранной операции: ", nameOperation);
 
  writeln("Введите первую переменную");
  string a = readln();
 
  writeln("Введите вторую переменную");
  string b = readln();
 
  //Преобразование переменных в тип integer
  auto first = parse!int(a);
  auto second = parse!int(b);
 
  switch(nameOperation){
    case "+\n":
      int result = first + second;
      writeln(result);
      break;
   
    case "-\n":
      int result = first - second;
      writeln(result);
      break;
   
    case "*\n":
      int result = first * second;
      writeln(result);
      break;
   
    case "/\n":
      int result = first / second;
      writeln(result);
      break;
     
    default:
      writeln("Ошибка сравнения!");
      break;
  }
}
