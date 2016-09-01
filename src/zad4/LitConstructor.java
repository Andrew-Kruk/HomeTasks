package zad4;

import java.util.Scanner;

public class LitConstructor{
	
	private String type;
    private int createdYear;
    private String name;
    private String nameAuthor;
    
    public LitConstructor(){
    	type = "";
    	createdYear = 0;
    	name = "";
    	nameAuthor = "";
    }
    
  public  LitConstructor(String type, int createdYear, String name, String nameAuthor){
    	this.type = type;
    	this.createdYear = createdYear;
    	this.name = name;
    	this.nameAuthor = nameAuthor;
    }
    
	public static void main(String[] args) {
		
		LitConstructor obj = new LitConstructor();
		
		obj.enter();
		obj.info();
		
		LitConstructor obj1 = new LitConstructor();
		
		obj1.enter();
		obj1.info();
		
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setCreatedYear(int createdYear){
		this.createdYear = createdYear;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setNameAuthor(String nameAuthor){
		this.nameAuthor = nameAuthor;
	}
	
	public String getType(){
		return type;
	}
	
	public int getCreatedYear(){
		return createdYear;
	}
	
	public String getName(){
		return name;
	}
	
	public String getNameAuthor(){
		return nameAuthor;
	}
	
	public void info(){
		System.out.println("Тип литературы : "+type);
		System.out.println("Год создания : "+createdYear);
		System.out.println("Название произведения : "+name);
		System.out.println("Автор : "+nameAuthor);
	}
	
	public void enter(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Год создания произведения : ");
		createdYear = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Тип литературы : ");
		type = sc.nextLine();
		
		System.out.print("Автор : ");
    	nameAuthor = sc.nextLine();
		
		System.out.print("Название произведения : ");
		name = sc.nextLine();
	}
	

}