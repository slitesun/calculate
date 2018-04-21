import std.stdio;
import std.conv;
import std.string;
 
void main(){
  writeln("На данный момент поддерживается 4 типа операции: сложение, вычитание, умножение, деление. Введите тип операции");
  string nameOperation = readln.chomp;
  writeln("Тип выбранной операции: ", nameOperation);
 
  writeln("Введите первое число");
  string a = readln();
 
  writeln("Введите второе число");
  string b = readln();
 
  //Преобразование переменных в тип integer
  auto first = parse!int(a);
  auto second = parse!int(b);
 
  switch(nameOperation){
    case "+":
      int result = first + second;
      writeln(result);
      break;
   
    case "-":
      int result = first - second;
      writeln(result);
      break;
   
    case "*":
      int result = first * second;
      writeln(result);
      break;
   
    case "/":
      int result = first / second;
      writeln(result);
      break;
     
    default:
      writeln("Ошибка сравнения!");
      break;
  }
}
