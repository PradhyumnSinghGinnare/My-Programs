#include<stdio.h>
int main()
{ 
  int n;
  printf("Enter your age:\n");
  scanf("%d",&n);
  if(n>=18)
      printf("Eligible for voting!");
  else
     printf("May be next time!");
  return 0;
}
