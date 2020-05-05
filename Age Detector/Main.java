#include<iostream>
using namespace std;
int main()
{
  int current, birth, a;
  std::cin>>birth;
  std::cin>>current;  
  if(current<birth)
  {
    birth=100-birth;
    a=birth+current;
    std::cout<<a;
  }
  else
  {
  std::cout<<current-birth;
  }
  return 0;
}
  