#include<iostream>
int main(){
  int fact=1,n;
  std::cin>>n;
  for(int i=1; i <= n; i++)
  {
    fact=fact*i;
  }
   std::cout<<fact;
}