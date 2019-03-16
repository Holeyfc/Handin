/**
 * 
 */
package controllers;
import dblibrary.project.csci230.*;
/**
 * @author nhoberg001
 *
 */



public class DatabaseController {

	/**
	 * 
	 */
	
	private UniversityDBLibrary dbLibary;
	
	public DatabaseController() {
		this.dbLibary = new UniversityDBLibrary(database, username, password);
	}

	/**
	 * 
	 */
<<<<<<< HEAD
	public int addUser(User user) 
	{
		return dbLibary.users_addUser(user);
=======
	public int addUser(java.lang.String firstName, java.lang.String lastName,
			java.lang.String username, java.lang.String password, char type) 
	{
		return dbLibary.users_addUser(firstName, lastName, username, password, type);
>>>>>>> 279b2460967aa8a3f7afada76c9163d896eb0c62
	}
	
	/**
	 * 
	 */
<<<<<<< HEAD
	public int addUniversity(University uni)
	{
		return dbLibary.university_addUniversity(uni);
=======
	public int addUniversity(java.lang.String school, java.lang.String state, java.lang.String location,
			java.lang.String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath,
			double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
			double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale)
	{
		return dbLibary.university_addUniversity(school, state, location, control, numberOfStudents, percentFemales,
				SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted,
				percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
>>>>>>> 279b2460967aa8a3f7afada76c9163d896eb0c62
	}
	
	/**
	 * 
	 * @param username
	 */
	public void getUserInfo(String username)
	{}
	
	/**
	 * 
	 */
	public java.lang.String[][] getUsers()
	{
		return dbLibary.university_getUsers();
	}
	
	/**
	 * 
	 */
	public void getUniversity()
<<<<<<< HEAD
	{
		this.dblibrary.universities_getUniveristies();
		//for loop for finding the uni by the search criteria given i.e. params
	}
=======
	{}
>>>>>>> 279b2460967aa8a3f7afada76c9163d896eb0c62
	
	/**
	 * 
	 */
	public java.lang.String[][] getListOfUniversities()
	{
		return dbLibrary.university_getUniversities();
	}
	
	/**
	 * 
	 * @param uniName
	 */
<<<<<<< HEAD
	public int editUniversity(University uni) 
	{
		return dbLibary.univeristy_editUniversity(uni);
=======
	public int editUniversity(java.lang.String school, java.lang.String state, java.lang.String location,
			java.lang.String control, int numberOfStudents, double percentFemales, double SATVerbal,
			double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants,
			double percentAdmitted,double percentEnrolled, int academicsScale, 
			int socialScale, int qualityOfLifeScale) 
	{
		return dbLibary.univeristy_editUniversity(school, state, location, control, numberOfStudents, percentFemales,
				SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled,
				academicsScale, socialScale, qualityOfLifeScale);
>>>>>>> 279b2460967aa8a3f7afada76c9163d896eb0c62
	}
	
	/**
	 * 
	 * @param username
	 */
<<<<<<< HEAD
	public int editUser(User user)
	{
		return dbLibary.user.editUser(user);
	}
	
=======
	public int editUser(java.lang.String username, java.lang.String firstName, java.lang.String lastName,
			java.lang.String password, char type, char status)
	{
		return dbLibary.user.editUser(username, firstName, lastName, password, type, status);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
>>>>>>> 279b2460967aa8a3f7afada76c9163d896eb0c62

}
