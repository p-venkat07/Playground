#include<iostream>
using namespace std;
int main()
{
  float mil;
  int lp,dt;
  std::cin>>mil>>lp>>dt;
  int total = mil * lp;
  if(total >= dt )
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}