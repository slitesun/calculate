import std.stdio:writeln, readln;
import std.conv:parse;
import std.string:chomp;
import std.regex:match;
 
void main(){
  writeln("На данный момент поддерживается 4 типа операции: сложение, вычитание, умножение, деление. Введите тип операции");
  string nameOperation = readln.chomp;
  
  if(!nameOperation.match("^[-+*/]&")){
    writeln("Неизвестный тип операции: ", nameOperation);
      }
  else{
       writeln("Тип выбранной операции: ", nameOperation);
 
    writeln("Введите первое число");
    string a = readln();
    auto first = parse!double(a);
   
    writeln("Введите второе число");
    string b = readln();
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
        break;
  }
   writeln(result);
}
