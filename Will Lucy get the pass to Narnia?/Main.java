#include<iostream>
int main()
{
  int a,b,c;
  std::cout<<"Enter first number : ";
  std::cin>>a;
  std::cout<<"Enter second number :";
  std::cin>>b;
  std::cout<<" Menu\n";
  std::cout<<"1.Addition\n";
  std::cout<<"2.Subtraction\n";
  std::cout<<"3.Multiplication\n";
  std::cout<<"4.Division\n";
  std::cout<<"5.Remainder\n";
  std::cin>>c;
  switch(c)
  {
    default : std::cout<<"Invalid operation";
    break;
    case 1 : c = a + b;
             std::cout<<c;
             break;
    case 2 : c = a - b;
             std::cout<<c;
             break;   
    case 3 : c = a * b;
             std::cout<<c;
             break;
    case 4 : c = a / b;
             std::cout<<c;
             break;   
    case 5 : c = a % b;
             std::cout<<c;
             break;
   }
}
