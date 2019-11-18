 /*
    First java Core Console Application
*/

package Homework12javacore9v1v3;

import java.util.Scanner;

/*
 *  author Nazar
 *  since Java 1.8
 *  version 1  15 Oct 2019
 */
public class Main {

	// displays the application menu on the console
	static void menu() {
		
		System.out.println();
		System.out.println( "¬вести 1 , перев≥рити чи Ї такий м≥с€ць" );
		System.out.println( "¬вести 2 , вивести вс≥ м≥с€ц≥ з такою ж порою року" );
		System.out.println( "¬вести 3 , вивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в" );
		System.out.println( "¬вести 4 , вивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в" );
		System.out.println( "¬вести 5 , вивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в" );
		System.out.println( "¬вести 6 , вивести на екран наступну пору року" );
		System.out.println( "¬вести 7 , вивести на екран попередню пору року" );
		System.out.println( "¬вести 8 , вивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в" );
		System.out.println( "¬вести 9 , вивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в" );
		System.out.println( "¬вести 0 , вивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в" );
		}
	
	public static void main (String[] args) throws WrongInputConsoleParametersException {
		
		Scanner scanner = new Scanner(System.in);
		Months[] arrayMonths = Months.values();
		Seasons[] arraySeasons = Seasons.values();
		
		// creates  an infinite loop that calls the menu method
		while (true) {
			menu();
			
			// takes the values from the scanner and runs the corresponding case
			switch (scanner.nextInt()) {
			
			case 1: {
				System.out.println( "=== ѕерев≥рити чи Ї такий м≥с€ць ===" );
				System.out.println( "¬вести м≥с€ць:" );
				String month1 = scanner.next();
				
				boolean flag = isMonthExists(arrayMonths, month1);	
				if ( flag== true ) {
					System.out.println( "¬ведений м≥с€ць ≥снуЇ!" );
				} else
					System.out.println( "“акого м≥с€ць немаЇ!" );
				break;
				}
			case 2: {
				System.out.println( "===  ¬ивести вс≥ м≥с€ц≥ з такою ж порою року ===" );
				System.out.println( "¬вести пору року:" );
				String season2 = scanner.next();
				
				boolean flag = false ;
				
				for (Months months : arrayMonths) {
					if (months.getSeasons().name().equalsIgnoreCase(season2)) {
						flag = true;
					}
				}
				if ( flag == true) {
					System.out.println(" ѕора року " + season2 + " з такою ж порою року " );
					for (Months months2 : arrayMonths) {
						if (months2.getSeasons().name().equalsIgnoreCase(season2)) {
							System.out.println(months2);
						}
					}
				}
				if (flag == false)
					System.out.println( " “аких м≥с€ц≥в нема! " );
				break;
			}
			case 3: {
				System.out.println( "=== ¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в  ===" );
				System.out.println( "¬вести к≥льк≥сть дн≥в:" );
				int numberOfDays3 = scanner.nextInt();
			
				boolean flag = false ;
				
				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays3) {
						flag = true;
			
			}
				}
				if (flag == true) {
					System.out.println( " ≥льк≥сть дн≥в " + numberOfDays3 + " в наступних м≥с€ц€х : " );
					
					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() == numberOfDays3) {
							System.out.println(months2);
				        }
					}
				}
				if (flag == false)
					System.out.println( " “аких м≥с€ц≥в нема! " );
				break;
			}
			case 4: {
				System.out.println( "=== ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в н≥ж введено ===" );
				System.out.println( "¬вести к≥льк≥сть дн≥в:" );
				int numberOfDays4 = scanner.nextInt();
			
				boolean flag = false ;
				
				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays4 && numberOfDays4 >= 30) {
						flag = true;
			
			}
				}
				if (flag == true) {
					System.out.println( " ≥льк≥сть дн≥в менша " + numberOfDays4 + " в наступних м≥с€ц€х : " );
					
					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() < numberOfDays4) {
							System.out.println(months2);
				        }
					}
				}
				if (flag == false)
					System.out.println( " “аких м≥с€ц≥в нема! " );
				break;
			}
			case 5: {
				System.out.println( "=== ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в н≥ж введено ===" );
				System.out.println( "¬вести к≥льк≥сть дн≥в:" );
				int numberOfDays5 = scanner.nextInt();
			
				boolean flag = false ;
				
				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays5 && numberOfDays5 <= 30) {
						flag = true;
			
			}
				}
				if (flag == true) {
					System.out.println( " ≥льк≥сть дн≥в б≥льша " + numberOfDays5 + " в наступних м≥с€ц€х : " );
					
					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() > numberOfDays5) {
							System.out.println(months2);
				        }
					}
				}
				if (flag == false)
					System.out.println( " “аких м≥с€ц≥в нема! " );
				break;
			}
			case 6: {
				System.out.println( "=== ¬ивести на екран наступну пору року ===" );
				System.out.println( "¬вести пору року:" );
				String season6 = scanner.next();
			
				boolean flag = false ;
				
				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season6)) {
						flag = true;
			
			}
				}
				if (flag == true) {
					System.out.println( "Ќаступна пора року : " );
					
					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season6.toLowerCase()));
					int i = seasons2.ordinal();
					
					if (i == (arraySeasons.length - 1)) {
						i = 0;
						System.out.println( arraySeasons[i] );
				    } else {
				    	System.out.println( arraySeasons[i + 1] );
					}
				}
				if (flag == false)
					System.out.println( " “акоњ пори року нема! " );
				break;
			}
			case 7: {
				System.out.println( "=== ¬ивести на екран попередню пору року ===" );
				System.out.println( "¬вести пору року:" );
				String season7 = scanner.next();
			
				boolean flag = false ;
				
				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season7)) {
						flag = true;
			
			}
				}
				if (flag == true) {
					System.out.println( "ѕопередн€ пора року : " );
					
					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season7.toLowerCase()));
					int i = seasons2.ordinal();
					
					if (i == 0 ) {
						i = (arraySeasons.length - 1);
						System.out.println( arraySeasons[i] );
				    } else {
				    	System.out.println( arraySeasons[i - 1] );
					}
				}
				if (flag == false)
					System.out.println( " “акоњ пори року нема! " );
				break;
			}
			case 8: {
				System.out.println( "=== ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в ===" );
				
					for (Months months : arrayMonths) {
					    if (months.getNumberOfDays() % 2 == 0 ) {
						    System.out.println(months);
		            }
				}
				break;
			}					
			case 9: {
				System.out.println( "=== ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в ===" );
				
				    for (Months months : arrayMonths) {
				         if (months.getNumberOfDays() % 2 != 0 ) {
					         System.out.println(months);
	                }
			    }
			break;
		    }			
			case 0: {
				System.out.println( "=== ¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в ===" );
				System.out.println( "¬вести м≥с€ць:" );
				String month0 = scanner.next();
			
				boolean flag = isMonthExists(arrayMonths, month0) ;
				
				if (flag == true) {
				    Months month = Months.valueOf(firstUpperCase(month0.toLowerCase()));
				    
				    if (month.getNumberOfDays() % 2 == 0 ) {
				    	System.out.println( "  ≥льк≥сть дн≥в в м≥с€ц≥ " + month0 + " - " + month.getNumberOfDays() + ". ѕарне число " );
				    } else {
				    	System.out.println( "  ≥льк≥сть дн≥в в м≥с€ц≥ " + month0 + " - " + month.getNumberOfDays() + ". Ќепарне число " );
				        }
					}
				
				if (flag == false)
					System.out.println( " “акого м≥с€ц€ нема! " );
				break;
			    }				
		   }
		}
	}
	  /*  Checks if the month exists in array and returns a boolean expression
	      param arrayMonths, month
	      return boolean expression
	  */
	  static String firstUpperCase(String string) {
		  if (string == null || string.isEmpty()) {
			  return string ;
		  } else {
			  return string.substring(0, 1).toUpperCase() + string.substring(1);
	      }
	   }
		/* Converts the first character of a string to upper case
		   param string
		   return String (with first letter in UpperCase)
		*/
	  
	static boolean isMonthExists(Months[] arrayMonths, String month) {
		boolean flag = false ;
		 
		for (Months months : arrayMonths) {
			if(months.name().equalsIgnoreCase(month)) {
				flag = true ;
			}
		}
		return flag;
	}	
}
