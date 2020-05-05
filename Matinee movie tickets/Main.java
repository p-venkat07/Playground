#include<iostream>
using namespace std;
int main()
{
    int age,price;
    double st;
    std::cin>>age>>st;
     if( st==13.30 && age>=13)
     {
       std::cout<<"$5.00";
     }
    else if( st==13.30 && age<13)
     { 
       std::cout<<"$2.00";
     }
      else if( st!=13.30 && age>=13)
     { 
       std::cout<<"$8.00";
     }
      else 
     { 
       std::cout<<"$4.00";
     }
}

