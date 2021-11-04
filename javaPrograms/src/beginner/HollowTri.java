package beginner;
//*
//**
//* *
//*  *
//*****

public class HollowTri	{

public static void main(String args[])	{
	
	for(int i=0;i<6;i++)	{
		
		for(int j=0;j<=i;j++)	{
			if(i>0 && i<5)	{
				if(j==0 || j==i)	{
					System.out.print("*");
			}	else	{
				System.out.print(" ");
				}
			} else	{
				System.out.print("*");
			}
		}
		System.out.println();
		}
	}
}