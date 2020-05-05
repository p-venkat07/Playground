#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
double i,a,d,f;
cin>>x>>y>>r;
i=(x*y*r)/100;
a=x+i;
d=i*2/100;
f=x+i-d;
cout<<i;
cout<<"\n"<<a;
cout<<"\n"<<d;
cout<<"\n"<<f;
return 0;
}
