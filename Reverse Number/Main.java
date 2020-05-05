#include <iostream>
int main() 
{
  int n,num=0;
  std::cin>>n;
  while(n!=0)
  {
    num= (num*10)+n%10;
    n = n/10;
  }
  std::cout<<num;
}