package testing;
import java.util.Scanner;

//CLASS 

/**
 * A Class that would measure  a person's BMI depending on his Age, especially for Kids.
 * @author Dosado, Michael Vincent C.
 *
 */
public class Fitnesstesting 
{
	public static Fitnesstesting person;
	public double bmi,weight,height;
	public String personName;
	public int age;
	public char sex;
	
	//CONSTRUCTOR
	/**
	 * Constructor Method for the Fitness Program
	 */
	public Fitnesstesting() 
	{
		this.personName = set_Name();
		this.sex = set_Sex();
		this.age = set_Age();
		check_Age(this.age);
		//exit();
	}
	
	
	//GET INSTANCE
	/**
	 * Accessor Method to make sure it has only 1 Instance as per the "Singleton" Design Pattern
	 * @return person
	 */
	public static Fitnesstesting getInstance() 
	{
		return person;
	}
	
	/**
	 * Main Method of the Program which creates the Instance/Object of the Fitness Class and 
	 * starts the Constructor that initializes the needed info and runs the methods to measure that person's BMI
	 * thus Following the "Facade" Structural Design Pattern
	 * @param String[] args
	 */
	//MAIN METHOD
	public static void main(String[] args) 
	{
		person.getInstance();
		person = new Fitnesstesting();
	}

	//METHOD BLOCKS
	/**
	 * Sets the "Sex" of the Person to be examined
	 * @param User_input Male or Female 
	 * @return sex
	 */
	public char set_Sex()
	{
		while(true) 
		{
			@SuppressWarnings("resource")
			Scanner scan_Gen = new Scanner(System.in);
			System.out.println("Enter gender (M or F)");
			sex = scan_Gen.next().charAt(0);
			if((sex == 'M') || (sex == 'm')) 
			{
				System.out.println("Your Sex is " + sex +", Male");
				break;
			}
			else if((sex == 'F') || (sex == 'f'))
			{
				System.out.println("Your Sex is " + sex +", Female");
				break;
			}	
			else {
				System.out.println("Invalid Sex");
			}
		}
		return sex;
	}
	
	/**
	 * Method to check the age of the person that will change the program's Behavior by 
	 * changing the criteria that will determine the appropriate BMI result for
	 * the person's Age, especially for Kids below Age 20, thus following the 
	 * "Template Method" Behavior Design Pattern
	 * @param age this.age
	 */
	public void check_Age(int age) {
		while(true) {
			if((this.age >= 2) && (this.age <= 20)) {
				System.out.println(" You are still young ");
				this.bmi = get_BMI();
				bmi_Result_kids(this.age,this.bmi);
				break;
			}
			else if ((this.age >= 21 ) && (this.age <= 35)) {
				System.out.println("You are in the Young Adults Age group ");
				this.bmi = get_BMI();
				bmi_Results_adults(this.bmi);
				break;
			}
			else if ((this.age >= 36) && (this.age <=55)) {
				System.out.println(" You are in the Middle-Aged Adults group ");
				this.bmi = get_BMI();
				bmi_Results_adults(this.age);
				break;
			}
			else if ((this.age >= 56) && (this.age <= 120)) {
				System.out.println(" You are in the Older Adults group ");
				this.bmi = get_BMI();
				break;
			}
			else {
				System.out.println("Cannot apply BMI Measurement with your current age");
			}
		}
			
	}
	
	/**
	 * This Method is to determine the BMI result for kids using a switch case that changes the output behaviour of the program.
	 * @param age this.age
	 * @param bmi this.bmi
	 */
	public void bmi_Result_kids(int age, double bmi) {
		System.out.println("BMI for Kids ");
		switch(age) {
		case 2:
			if(bmi <= 14.7) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 14.71) && (bmi <= 18.1)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 18.2) && (bmi <= 19.4)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 3:
			if(bmi <= 14.3) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 14.31) && (bmi <= 17.4)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 17.5) && (bmi <= 18.3)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 4:
			if(bmi <= 14.00) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 14.01) && (bmi <= 16.9)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 17.00) && (bmi <= 17.9)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 5:
			if(bmi <= 13.8) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 13.81) && (bmi <= 16.9)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 17.00) && (bmi <= 18.00)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 6:
			if(bmi <= 13.6) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 13.61) && (bmi <= 17.00)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 17.1) && (bmi <= 18.5)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 7:
			if(bmi <= 13.4) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 13.41) && (bmi <= 17.5)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 17.6) && (bmi <= 19.3)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 8:
			if(bmi <= 13.8) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 13.81) && (bmi <= 18.00)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 18.1) && (bmi <= 20.00)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 9:
			if(bmi <= 14.00) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 14.01) && (bmi <= 18.6)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 18.7) && (bmi <= 21.00)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 10:
			if(bmi <= 14.3) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 14.31) && (bmi <= 18.8)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 18.9) && (bmi <= 22.1)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 11:
			if(bmi <= 14.5) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 14.51) && (bmi <= 20.1)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 20.2) && (bmi <= 23.1)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 12:
			if(bmi <= 13.00) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 13.01) && (bmi <= 21.0)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 21.1) && (bmi <= 24.2)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 13:
			if(bmi <= 15.4) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 15.41) && (bmi <= 21.9)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 22.00) && (bmi <= 25.1)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 14:
			if(bmi <= 15.9) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 15.91) && (bmi <= 22.6)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 22.7) && (bmi <= 26.00)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 15:
			if(bmi <= 16.5) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 16.51) && (bmi <= 23.4)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 23.5) && (bmi <= 26.8)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 16:
			if(bmi <= 17.00) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 17.01) && (bmi <= 24.3)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 24.4) && (bmi <= 27.5)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 17:
			if(bmi <= 17.6) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 17.61) && (bmi <= 24.9)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 25.00) && (bmi <= 28.2)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 18:
			if(bmi <= 18.3) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 18.31) && (bmi <= 25.6)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 25.7) && (bmi <= 29.00)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;	
		case 19:
			if(bmi <= 18.6) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 18.61) && (bmi <= 26.9)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 27.00) && (bmi <= 29.7)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;
		case 20:
			if(bmi <= 19.2) {
				System.out.println("Result is : Underweight");
			}
			else if((bmi >= 19.21) && (bmi <= 27.1)) {
				System.out.println("Result is : Healthy");
			}
			else if((bmi >= 27.2) && (bmi <= 31.00)) {
				System.out.println("Result is : Overweight");
			}
			else {
				System.out.println("Result is : Obese");
			}
			break;	
		
			
				
			
		}
	}
	/**
	 * Method
	 * @param bmi BMI value from the this.bmi variable
	 */
	public void bmi_Results_adults(double bmi) {
		if (bmi < 18.5) 
		{
			System.out.println("BMI For Adults  Result is : Underweight");
		}
		else if ((bmi >= 18.5) && (bmi <= 24.9)) 
		{
			System.out.println("BMI For Adults  Result is : Normal");
		}
		else if ((bmi >= 25) && (bmi <= 29.9))
		{
			System.out.println("BMI For Adults  Result is : Overweight");
		}
		else {
			System.out.println("BMI For Adults  Result is : Obese");
		}
	}
	
	/**
	 * Method that sets the age of the Person that will determine the behaviour of the program
	 * @return age returns the value of age to the this.age variable
	 */
	public int set_Age()
	{
		Scanner scan_Age = new Scanner(System.in);
		System.out.println("Enter Age :  ");
		final int age = scan_Age.nextInt();
		System.out.println("Your Age is " + age);
		return age;
	}
	
	/**
	 * Method that sets the Name of the Person
	 * @return name returns the String name to the this.name variable
	 */
	public String set_Name(){
		Scanner scan_Name = new Scanner(System.in);
		System.out.println("Enter Name : ");
		final String name = scan_Name.next();
		return name;
	}	
	
	/**
	 * Method containing the BMI Formula by getting the person's Weight and Height through User Input that will pass its value 
	 * to the this.bmi variable to be used when determining the result of the BMI
	 * @return result returns the BMI result
	 */
	public double get_BMI() {
		Scanner scan_weight = new Scanner(System.in);
		System.out.println("Enter Weight (Kg) ");
		double weight = scan_weight.nextDouble();
		Scanner scan_height = new Scanner(System.in);
		System.out.println("Enter Height (meters) ");
		double height = scan_height.nextDouble();
		double result = (weight/(height*height));
		System.out.println("Your BMI Result is : " +result);
		return (result);
	}
	/**
	 * Method that closes the Program in the Command Terminal / Prompt
	 */
	public void exit() 
	{
		Scanner scan_exit = new Scanner(System.in);
		System.out.println("To EXIT, press Y ");
		char exitna = scan_exit.next().charAt(0);
		if((sex == 'Y') || (sex == 'y')) 
		{
			System.exit(0);
		}
	}

}