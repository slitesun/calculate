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
 
  //Преобразование переменных в тип double
  auto first = parse!double(a);
  auto second = parse!double(b);
 
  double result;
  
  switch(nameOperation){
    case "+":
      result = first + second;
      break;
   
    case "-":
      result = first - second;
      break;
   
    case "*":
      result = first * second;
      break;
   
    case "/":
      result = first / second;
      break;
     
    default:
      writeln("Неверно выбран тип операции.");
      break;
    }
  writeln(result);
}
