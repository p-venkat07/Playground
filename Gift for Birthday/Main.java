#include<iostream>
using namespace std;
int main()
{
  int born;
  std::cin>>born;
  if((born%4==0) && (born%100!=0))
  {
    std::cout<<born<<" is a leap year";
  }
  else
  {
    std::cout<<born<<" is not a leap year";
  }
}