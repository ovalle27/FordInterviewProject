# FordInterviewProject
Interview project for Ford
------------------------------------------------------------------------------
The following notes were attached to describe the modifications of code 
after the interview.
------------------------------------------------------------------------------

This version has mainly two modification: 

I. Regarding the array order: 
        I reverted the order of the arrays items due to two factors:
        1. My better understanding, after the interview, on how roman numbers are created.
          1.1 According to Wikipedia**: "A number containing two or more decimal digits is built
              by appending the Roman numeral equivalent for each, from HIGHEST TO LOWEST."
                 Example : 246 = CC + XL + VI = CCXLVI
                           789 = DCC + LXXX + IX = DCCLXXXIX
         2. Based on point (1), makes more sense for efficiency to go from HIGHEST TO LOWEST.
         
II. Regarding the order and number of items on my arrays; they were improved and matched between them, since it was needed on the while logic to be aligned on their value and cell Ex. M = 1000, CM = 900, etc. Without this the logic on line 19 and 21 would make no sense. 


REFERENCES: 
** Wikipedia reference: https://en.wikipedia.org/wiki/Roman_numerals
