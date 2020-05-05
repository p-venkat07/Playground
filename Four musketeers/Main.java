#include<iostream>
using namespace std;
int main()
{
  float x1,y1,x2,y2,x3,y3;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  double house = (x1+x2+x3)/3;
  double house1 = (y1+y2+y3)/3;
  std::cout<<house<<"\n"<<house1;
  return 0;
}