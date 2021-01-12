package testing;				//package where the source code is located
import java.util.Scanner;		//Module for Scanning User Input

//CLASS 

/**
 * A Class that would measure  a person's BMI depending on his Age, especially for Kids.
 * @author Dosado, Michael Vincent C.
 *
 */
public class Fitnesstesting 				//Main Class for Programs/Project
{
	public static Fitnesstesting person;	        //Declaration of the Instance "person" of type Fitnesstesting
	public double bmi,weight,height;		//Declaration of double variables for BMI Calculation
	public String personName;			//Declaration of String variable for Name
	public int age;					//Declaration of int variable for age
	public char sex;				//Declaration of char variable for sex
	
	//CONSTRUCTOR
	/**
	 * Constructor Method for the Fitness Program
	 */
	public Fitnesstesting() 			//Constructor for the Class
	{
		this.personName = set_Name();	        //assigning the global variable its Name throught method set_Name()
		this.sex = set_Sex();			//Assigning the global variable its sex throught method set_Sex()
		this.age = set_Age();			//Assigning the global variable its age throught method set_Age()
		check_Age(this.age);			//Method with the initialized Constructor variable as argument
							//that checks the age to find what BMI Interpreter it should use.
		exit();					//Method that closes the Program
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
		person.getInstance();			                //checks the Instance to make sure it has only 1 Instance
		person = new Fitnesstesting();		                //Assigns a New Object of Class Fitnesstesting to variable "person"
	}

	//METHOD BLOCKS
	/**
	 * Sets the "Sex" of the Person to be examined
	 * @param User_input Male or Female 
	 * @return sex
	 */
	public char set_Sex()						//Method that sets the sex of the Person (Male or Female)
	{
		while(true) 
		{
			@SuppressWarnings("resource")
			Scanner scan_Gen = new Scanner(System.in);	//For User Input of M or F
			System.out.println("Are you a Male or Female? (M or F)");
			sex = scan_Gen.next().charAt(0);		//Get only the First Letter of the User Input
			if((sex == 'M') || (sex == 'm')) 		//condition to accept either Uppercase of Lowercase letter M
			{
				System.out.println("Your Sex is " + sex +", Male");
				break;
			}
			else if((sex == 'F') || (sex == 'f'))		//condition to accept either Uppercase or Lowercase F
			{
				System.out.println("Your Sex is " + sex +", Female");
				break;
			}	
			else {
				System.out.println("Invalid Sex");	//Error Catch for Letter other than M and F
			}
		}
		return sex;						//return value of local variable sex to method caller
	}
	
	/**
	 * Method to check the age of the person that will change the program's Behavior by 
	 * changing the criteria that will determine the appropriate BMI result for
	 * the person's Age, especially for Kids below Age 20, thus following the 
	 * "Template Method" Behavior Design Pattern
	 * @param age this.age
	 */
	public void check_Age(int age) {				//Method with Parameter age to check the this.age value to assess which BMI Result Interpreter it will use				
		while(true) {						//While Loop to make sure the method accepts the expected Input
			if((this.age >= 2) && (this.age <= 20)) {	//condition to check If the Age value is between 2 and 20 to indidcate Kids
				System.out.println(" You are still young ");
				this.bmi = get_BMI();			//Assigns the variable through the method get_Bmi
				bmi_Result_kids(this.age,this.bmi);	//Bmi Interpreter for kids with the age and bmi as arguments
				break;
			}
			else if ((this.age >= 21 ) && (this.age <= 35)) {	//If age is between 21 and 35
				System.out.println("You are in the Young Adults Age group ");
				this.bmi = get_BMI();			//assigns the Bmi result for the person
				bmi_Results_adults(this.bmi);		//Bmi Interpreter for adults
				break;
			}
			else if ((this.age >= 36) && (this.age <=55)) {	//If age is between 36 and 55
				System.out.println(" You are in the Middle-Aged Adults group ");
				this.bmi = get_BMI();			//assigns the Bmi result for adults
				bmi_Results_adults(this.age);		//Interprets the Bmi result for adults
				break;
			}
			else if ((this.age >= 56) && (this.age <= 120)) { //If ages id between 56 and 120
				System.out.println(" You are in the Older Adults group ");
				this.bmi = get_BMI();			//assigns the Bmi results of adults
				break;
			}
			else {						//Error catch when age is 1 or greater than 120
				System.out.println("Cannot apply BMI Measurement with your current age");
			}												
		}
			
	}
	
	/**
	 * This Method is to determine the BMI result for kids using a switch case that changes the output behaviour of the program.
	 * @param age this.age
	 * @param bmi this.bmi
	 */
	public void bmi_Result_kids(int age, double bmi) {		//Method to Interpret the BMI Result for Kids
		System.out.println("BMI for Kids ");
		switch(age) {						//Switch Case for every age from age 2 to age 20
								        //with every age having a different Interpreted BMI Values
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
	public void bmi_Results_adults(double bmi) {		//Method that Interprets the BMI Results for Adults
		if (bmi < 18.5) 				//Conditional to Interpret the BMI Result
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
	public int set_Age()  			//Method that sets the age of the person
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
	public String set_Name(){		//Method that sets the Name of the person
		Scanner scan_Name = new Scanner(System.in);
		System.out.println("What is your Name? ");
		final String name = scan_Name.next();
		System.out.println("Hello! " + name);
		return name;
	}	
	
	/**
	 * Method containing the BMI Formula by getting the person's Weight and Height through User Input that will pass its value 
	 * to the this.bmi variable to be used when determining the result of the BMI
	 * @return result returns the BMI result
	 */
	public double get_BMI() {		         //Method containing the Formula to solve for the BMI, using the weight and height given
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
	public void exit() 				//Method that closes the Program
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
