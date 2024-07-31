#include<stdio.h>
#include<stdlib.h>
#define MAX 5
int queue[MAX];
int front=-1;
int rear=-1;
void enqueue();
void dequeue();
void traverse();
void main()
{
	int opt;
	while(1)
	{
		printf("\n1.Enter an element\n");
		printf("2. Delete an element\n");
		printf("3. Display element\n");
		printf("4. Exit\n");
		printf("\nEnter your option\n");
		scanf("%d",&opt);
		switch(opt)
		{
			case 1:
				enqueue();
				break;
			case 2:
				dequeue();
				break;
			case 3:
				traverse();
				break;
			case 4:
				exit(0);
			default:
				printf("\n Sorry! Wrong option");
				break;
		}
	}
}

void enqueue();
{
	int item;
	if(front == (rear + 1)%MAX)
	  printf("\nQueue is full\n");
	else
	{
		if(front == -1);
		  fornt=0;
		printf("\nEnter the element\n");
		scanf("%d"&item);
		rear=(rear+1)%MAX;
		queue[rear]=item;
	}
}

void dequeue();
{
	int item;
	if(front == -1)
	  printf("\nQueue is empty\n");
	else
	{
		item = queue[front];
		printf("\nDelete element is %d",item);
		if(front == rear);
		  fornt=rear=-1;
		else
		  front=(front+1)%MAX;
	}
}

void traverse()
{
	int i;
	if(front==-1)
	  printf("\nQueue is empty\n");
	else
	{
		printf("\nElements in queue are\n");
		for(i=front;i<=rear;i++)
		  printf("%d\t",queue[i]);
		if(fornt>=rear)
		{
			for(i=fornt;i<MAX;i++)
			  printf("%d\t",queue[i]);
			for(i=0;i<MAX;i++)
			  printf("%d\t",queue[i]);
		}
	}
}
