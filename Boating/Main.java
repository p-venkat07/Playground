#include<iostream>
using namespace std;
int main()
{
  int wt,adult,child,wt_ad,wt_ch;
  std::cin>>wt>>adult>>child;
  wt_ad = adult * 75 ;
  wt_ch = child * 30 ;
  int total= wt_ad + wt_ch;
  if(total <= wt)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}
