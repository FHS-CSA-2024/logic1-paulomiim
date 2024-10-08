package src.main.java;


public class Logic1
{
    public static void main(String[] args){
        Logic1 logicDriver = new Logic1();
        //All test cases;
        System.out.println(logicDriver.old35(3));
        System.out.println(logicDriver.old35(10));
        System.out.println(logicDriver.old35(15));
        System.out.println(logicDriver.specialEleven(22));
        System.out.println(logicDriver.specialEleven(23));
        System.out.println(logicDriver.specialEleven(24));
        System.out.println(logicDriver.more20(20));
        System.out.println(logicDriver.more20(21));
        System.out.println(logicDriver.more20(42));
        System.out.println(logicDriver.less20(18));
        System.out.println(logicDriver.less20(59));
        System.out.println(logicDriver.less20(20));
        System.out.println(logicDriver.nearTen(12));
        System.out.println(logicDriver.nearTen(17));
        System.out.println(logicDriver.nearTen(19));
        System.out.println(logicDriver.sortaSum(3, 4));
        System.out.println(logicDriver.sortaSum(9, 4));
        System.out.println(logicDriver.sortaSum(10, 11));
        System.out.println(logicDriver.in1To10(5, false));
        System.out.println(logicDriver.in1To10(11, false));
        System.out.println(logicDriver.in1To10(11, true));
        System.out.println(logicDriver.teenSum(3, 4));
        System.out.println(logicDriver.teenSum(10, 13));
        System.out.println(logicDriver.teenSum(13, 2));
        System.out.println(logicDriver.love6(6, 4));
        System.out.println(logicDriver.love6(4, 5));
        System.out.println(logicDriver.love6(1, 5));
        System.out.println(logicDriver.lastDigit(23, 19, 13));
        System.out.println(logicDriver.lastDigit(23, 19, 12));
        System.out.println(logicDriver.lastDigit(23, 19, 3));
        System.out.println(logicDriver.answerCell(false, false, false));
        System.out.println(logicDriver.answerCell(false, false, true));
        System.out.println(logicDriver.answerCell(true, false, false));
        System.out.println(logicDriver.alarmClock(1, false));
        System.out.println(logicDriver.alarmClock(5, false));
        System.out.println(logicDriver.alarmClock(0, false));
        System.out.println(logicDriver.teaParty(6, 8));
        System.out.println(logicDriver.teaParty(3, 8));
        System.out.println(logicDriver.teaParty(20, 6));
        System.out.println(logicDriver.redTicket(2, 2, 2));
        System.out.println(logicDriver.redTicket(2, 2, 1));
        System.out.println(logicDriver.redTicket(0, 0, 0));
        System.out.println(logicDriver.greenTicket(1, 2, 3));
        System.out.println(logicDriver.greenTicket(2, 2, 2));
        System.out.println(logicDriver.greenTicket(1, 1, 2));
        System.out.println(logicDriver.squirrelPlay(70, false));
        System.out.println(logicDriver.squirrelPlay(95, false));
        System.out.println(logicDriver.squirrelPlay(95, true));
        System.out.println(logicDriver.caughtSpeeding(60, false));
        System.out.println(logicDriver.caughtSpeeding(65, false));
        System.out.println(logicDriver.caughtSpeeding(65, true));
        System.out.println(logicDriver.dateFashion(5, 10));
        System.out.println(logicDriver.dateFashion(5, 2));
        System.out.println(logicDriver.dateFashion(5, 5));
        System.out.println(logicDriver.fizzString2(1));
        System.out.println(logicDriver.fizzString2(5));
        System.out.println(logicDriver.fizzString2(3));
        System.out.println(logicDriver.fizzString2(15));
        System.out.println(logicDriver.sodaParty(30, false));
        System.out.println(logicDriver.sodaParty(50, false));
        System.out.println(logicDriver.sodaParty(70, true));
    }

    public Logic1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
    Use the % "mod" operator


    old35(3) --> true
    old35(10) --> true
    old35(15) --> false */
    public boolean old35(int n) {
        boolean num = false;
        if ( n % 3 == 0 & n % 5 == 0) {
            num = false;
        }
        
        else if (n % 3 == 0 || n % 5 == 0) {
            num = true;
        }
       
        return num;
    }



    /*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
    Return true if the given non-negative number is special. Use the % "mod" operator


    specialEleven(22) --> true
    specialEleven(23) --> true
    specialEleven(24) --> false */
    public boolean specialEleven(int n) {
       boolean num = false;
       if (n % 11 == 0 || n % 11 == 1) {
           num = true;
       }
       else {
       num = false;
       }
  
       return num;
    }


    /*Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

    more20(20) --> false
    more20(21) --> true
    more20(42) --> true */
    public boolean more20(int n) {
        boolean num = false;
        if (n % 20 == 1 || n % 20 == 2) {
        num = true;
        }
        return num;  
    }


    /*Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
    So for example 38 and 39 return true, but 40 returns false.


    less20(18) --> true
    less20(59) --> true
    less20(20) --> false */
    public boolean less20(int n) {
        if ((n + 2) % 20 == 0 || (n + 1) % 20 == 0) {
        return true;
        }
        else {
        return false;
        }
    }

    /*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.


    nearTen(12) --> true
    nearTen(17) --> false
    nearTen(19) --> true */
    public boolean nearTen(int num) {
        if (num % 10 <= 2 || (num + 2) % 10 == 0) {
        return true;
        }
        if ((num + 1) % 10 == 0) {
        return true;
        }
        else {
        return false;
        }
    }


    /*Given 2 ints, a and b, return their sum. 
    However, sums in the range 10..19 inclusive, are forbidden, 
        so in that case just return 20.


    sortaSum(3, 4) --> 7
    sortaSum(9, 4) --> 20
    sortaSum(10, 11) --> 21*/
    public int sortaSum(int a, int b) {
        if ((a + b) >= 10 & (a + b) <= 19) {
        return 20;
        }
        else {
        return a + b;
        }
    }


    /*Given a number n, return true if n is in the range 1..10, inclusive. 
    Unless outsideMode is true, in which case return 
        true if the number is less or equal to 1, or greater or equal to 10.


    in1To10(5, false) --> true
    in1To10(11, false) --> false
    in1To10(11, true) --> true */
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode == true & n <= 1) {
        return true;
        }
        if (outsideMode == true & n >= 10) {
        return true;
        }
        if (n >= 1 & n <= 10 & outsideMode == false) {
        return true; 
        }
        else {
        return false;
        }
    }


    /*Given 2 ints, a and b, return their sum. However, "teen" values in the range 
    13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.


    teenSum(3, 4) --> 7
    teenSum(10, 13) --> 19
    teenSum(13, 2) --> 19 */
    public int teenSum(int a, int b) {
        if ((a >= 13 & a <= 19) || (b >= 13 & b <= 19)) {
        return 19;
        }
        else {
        return a + b;
        }
    }


    /*The number 6 is a truly great number. Given two int values, a and b, 
        return true if either one is 6. Or if their sum or difference is 6. 
    Note: the function Math.abs(num) computes the absolute value of a number.


    love6(6, 4) --> true
    love6(4, 5) --> false
    love6(1, 5) --> true */
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
        return true;
        }
        else if (a + b == 6){
        return true;
        }
        else if (a - b < 0) {
        if (b - a == 6){
        return true;
        }
        return false;
        }
        else if (a - b == 6) {
        return true;
        }
        return false;
    }


    /*Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
    The ints are non-negative. 
        Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


    lastDigit(23, 19, 13) --> true
    lastDigit(23, 19, 12) --> false
    lastDigit(23, 19, 3) --> true */
    public boolean lastDigit(int a, int b, int c) {
        boolean num = true;
        if (a%10 == b%10 || a%10 == c%10 || c%10 == b%10){
        num = true;
        }
        else {
        num = false;
    
        }
        return num;
    }


    /*Your cell phone rings. Return true if you should answer it. 
    Normally you answer, except in the morning you only answer if it is your mom calling. 
    In all cases, if you are asleep, you do not answer.


    answerCell(false, false, false) --> true
    answerCell(false, false, true) --> false
    answerCell(true, false, false) --> false */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
        return false;
        }
        if (isMorning == true) {
            if(isMom == true) {
            return true;
            }
        else{
        return false;
        }
        }
        else {
        return true;
        }
    }

    /*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, 
        and a boolean indicating if we are on vacation, 
    return a string of the form "7:00" indicating when the alarm clock should ring. 
    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". 
    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".


    alarmClock(1, false) --> "7:00"
    alarmClock(5, false) --> "7:00"
    alarmClock(0, false) --> "10:00" */
    public String alarmClock(int day, boolean vacation) {
       String alarm = "";
  if (vacation == true) {
    if (day == 0 || day == 6) {
      alarm = "off";
    }
    if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)  {
      alarm = "10:00";
    }
  }
  if (vacation == false) {
    if (day == 0 || day == 6) {
    alarm = "10:00";
  }
    if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
    alarm = "7:00";
  }
  }
  return alarm;
}



    /*We are having a party with amounts of tea and candy. 
    Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. 
    A party is good (1) if both tea and candy are at least 5. 
    However, if either tea or candy is at least double the amount of the other one, the party is great (2). 
    However, in all cases, if either tea or candy is less than 5, the party is always bad (0).


    teaParty(6, 8) --> 1
    teaParty(3, 8) --> 0
    teaParty(20, 6) --> 2 */
    public int teaParty(int tea, int candy) {
        int num = 0;
  if ( tea < 5 || candy < 5) {
    num = 0;
  }
  else if (tea >= 2 * candy || candy >= 2 * tea) {
    num = 2;
  }
  else if (tea >= 5 & candy >= 5) {
    num = 1;
  }
  return num;
  
    }


    /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. 
    If they are all the value 2, the result is 10. 
    Otherwise if they are all the same, the result is 5. 
    Otherwise so long as both b and c are different from a, the result is 1. 
    Otherwise the result is 0.


    redTicket(2, 2, 2) --> 10
    redTicket(2, 2, 1) --> 0
    redTicket(0, 0, 0) --> 5 */
    public int redTicket(int a, int b, int c) {
        if ( a == 2 & b == 2 & c == 2) {
        return 10;
    }
        else if (a == b & b == c) {
        return 5;
  }
        else if (a != b & a !=c) {
        return 1;
  }
        else {
        return 0;
  }
    }


    /*You have a green lottery ticket, with ints a, b, and c on it. 
    If the numbers are all different from each other, the result is 0. 
    If all of the numbers are the same, the result is 20. 
    If two of the numbers are the same, the result is 10.


    greenTicket(1, 2, 3) --> 0
    greenTicket(2, 2, 2) --> 20
    greenTicket(1, 1, 2) --> 10 */
    public int greenTicket(int a, int b, int c) {
       int num = 0;
  if (a != b & a != c & b != c) {
    num = 0;
  }
  else if (a == b & b == c) {
    num = 20;
  }
  else if (a == b || a == c || b == c) {
    num = 10;
  }
  return num;
    }


    /*
    The squirrels in Palo Alto spend most of the day playing. 
    In particular, they play if the temperature is between 60 and 90 (inclusive). 
    Unless it is summer, then the upper limit is 100 instead of 90. 
    Given an int temperature and a boolean isSummer, 
        return true if the squirrels play and false otherwise.


    squirrelPlay(70, false) --> true
    squirrelPlay(95, false) --> false
    squirrelPlay(95, true) --> true    */
    public boolean squirrelPlay(int temp, boolean isSummer) {
    boolean val = true;
    if (temp >= 60 & temp <= 100 & isSummer == true) {
        val = true;
    
  }
    else if (temp >= 60 & temp <= 90 & isSummer == false) {
        val = true;
  
  }
    else {
        val = false;
  }
    return val;
  
    }


    /*You are driving a little too fast, and a police officer stops you. 
    Write code to compute the result, 
        encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
    If speed is 60 or less, the result is 0. 
    If speed is between 61 and 80 inclusive, the result is 1. 
    If speed is 81 or more, the result is 2. 
    Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.


    caughtSpeeding(60, false) --> 0
    caughtSpeeding(65, false) --> 1
    caughtSpeeding(65, true) --> 0    */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int num = 0;
  if (isBirthday == true) {
    if (speed <= 65) {
      num = 0;
    }
    if (speed >= 66 & speed <= 85) {
      num = 1;
    }
    if (speed >= 86) {
      num = 2;
    }
  }
  else if (isBirthday == false) {
    if (speed <= 60) {
      num = 0;
    }
    if (speed >= 61 & speed <= 80) {
      num = 1;
    }
    if (speed >= 81) {
      num = 2;
    }
  }
  return num;
    }


    /*
    You and your date are trying to get a table at a restaurant. 
    The parameter "you" is the stylishness of your clothes, in the range 0..10, 
        and "date" is the stylishness of your date's clothes. 
    The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. 
    If either of you is very stylish, 8 or more, then the result is 2 (yes). 
    With the exception that if either of you has style of 2 or less, then the result is 0 (no). 
        Otherwise the result is 1 (maybe).

    dateFashion(5, 10) --> 2
    dateFashion(5, 2) --> 0
    dateFashion(5, 5) --> 1    */
    public int dateFashion(int you, int date) {
        int num = 0;
  if (you > 2 & date > 2) {
    if (you >= 8 || date >= 8){
      num = 2;
    }
    else {
      num = 1;
    }
  }
  else {
    num = 0;
  }
  return num;
    }
    
    
    /*Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". 
    Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", 
        and if divisible by both 3 and 5, use "FizzBuzz". 
    Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.


    fizzString2(1) --> "1!"
    fizzString2(5) --> "Buzz!"
    fizzString2(3) --> "Fizz!"
    fizzString2(15) --> "FizzBuzz!"*/
    public String fizzString2(int n) {
    String result = "";
  if (n % 3 == 0 & n % 5 == 0) {
    result = "FizzBuzz!";
  }
  else if (n % 3 == 0) {
    result = "Fizz!";
  }
  else if (n % 5 == 0) {
    result = "Buzz!";
  }
  else {
    result = n + "!";
  }
  return result;
    }

    /*When squirrels get together for a party, they like to have sodas. 
    A squirrel party is successful when the number of sodas is between 40 and 60, inclusive. 
    Unless it is the weekend, in which case there is no upper bound on the number of sodas. 
    Return true if the party with the given values is successful, or false otherwise.


    sodaParty(30, false) --> false
    sodaParty(50, false) --> true
    sodaParty(70, true) --> true */
    public boolean sodaParty(int sodas, boolean isWeekend) {
    boolean result = false;
  if (isWeekend == true & sodas >= 40) {
    result = true;
  }
  else if (isWeekend == false & sodas >= 40 & sodas <= 60) {
    result = true;
  }
  else {
    result = false;
  }
  return result;
    }

}
