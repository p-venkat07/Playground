#include<iostream>
int main()
{
  int max,wof;
  std::cin>>max>>wof;
  if(wof<max)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(wof==max)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    std::cout<<"Sorry, you can't enter";
  }
}