#include<iostream>
using namespace std;
int main()
{
  int units;
  int total;
  std::cin>>units;
  if(units<=200)
  {
    total = (0.5 * units);
    std::cout<<"Rs."<<total;
  }
  else if(units<=400)
  {
    total = (0.65 * units) + 100;
    std::cout<<"Rs."<<total;
  }
  else if(units<=600)
  {
    total = (0.80 * units) + 200;
    std::cout<<"Rs."<<total;
  }
  else if(units>600)
  {
    total = (1.25 * units) + 425;
    std::cout<<"Rs."<<total;
  }
}