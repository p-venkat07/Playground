#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x,z,w,a;
  float y;
  cin>>x;
  cin>>y;
  if(x<=2)
   {
      float(z)=y+(y/2);
      cout<<fixed<<setprecision(2)<<float(z);
   }
  else if(x==3)
   {
      float(w)=float(y)*2;
      cout<<fixed<<setprecision(2)<<float(w);
   }
  else
   {
      cout<<"Number of items is more";
   }  
}