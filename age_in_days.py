def daysinMonth(month): #this function returns the particular number of days in a month
    lists = [31,28,31,30,31,30,31,31,30,31,30,31]
    return lists[month - 1]

def leapyear(year): #this function checks that the year is leap year or not
    if (year % 100 == 0):
        if (year % 400 == 0):
            return True
    else:
        if (year % 4 == 0):
            return True
    return False



def nextDate(day, month, year): #this function returns the next date of the given date
    if (leapyear(year) == True):
        if (month == 2):
            if (day < 29):
                return (day + 1), month, year
            else:
                if (month < 12):
                    return 1, month + 1, year
            return 1, 1, year + 1
    else:
        if (day < daysinMonth(month)):
            return (day + 1), month, year
        else:
            if (month < 12):
                return 1, month + 1, year
        return 1, 1, year + 1 
    
#print(nextDate(28,2,2019))

def checking(day1, month1, year1, day2, month2, year2): #this function checks that the current date isn't before the birth date
    if (year1 < year2):
        return True
    if (year1 == year2):
        if (month1 < month2):
            return True
        if (month1 == month2):
            if (day1 <= day2):
                return True




def daysBetweenDates(day1, month1, year1, day2, month2, year2): #this function calculates the number of days between two given dates
    if (checking(day1, month1, year1, day2, month2, year2) == True):
        days = 0
        while ((day1 <= day2) and (month1 <= month2) and (year1 <= year2)):
            days = days + 1
            (day1, month1, year1) = nextDate(day1, month1, year1)
        return days

    else:
        return ("No Time travel Please!!!")


age = daysBetweenDates(1, 1, 2011, 31, 1, 2012)
print(age - 1)

