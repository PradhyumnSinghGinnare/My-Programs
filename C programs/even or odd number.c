#include<stdio.h> 
int main()
{ 
  int n;
  printf("Enter the number:\n");
  scanf("%d",&n);
  if(n%2==0)
     printf("Given number is Even number"); 
  else
     printf("Given number is Odd number");
  return 0;
}
