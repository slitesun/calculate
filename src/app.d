import std.stdio;
import std.conv;
import std.string;
import calculate;
 
void main(){
  writeln("На данный момент поддерживается 4 типа операции: сложение, вычитание, умножение, деление. Введите тип операции");
  string nameOperation = readln.chomp;
  writeln("Тип выбранной операции: ", nameOperation);
 
  writeln("Введите первое число");
  string a = readln();
 
  writeln("Введите второе число");
  string b = readln();
 
  //Преобразование переменных в тип integer
  auto first = parse!double(a);
  auto second = parse!double(b);
 
 calculate();
}
