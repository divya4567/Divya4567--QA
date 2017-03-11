'==================================================
'          operators
'Arithemetic operators: ^,-,*,/,\,Mod,+,-,&
'comparision          : =,<>, <, >, <=, >=, Is
'Logical              : Not, And,Or,Xor, Eqv, Imp
'=================================================== 

option explicit
Const SITE_TITLE="Operators!!!"

Dim Num1, Num2
Dim sum, product,power
num1= 2
num2=4

sum= num1+num2
product = num1*num2
power= num1^num2

MsgBox "the sum of " & num1 &"and"& num2 & "is"& sum,0,SITE_TITLE
MsgBox "the product of " & num1 &"and"& num2 & "is"& product,0,SITE_TITLE
MsgBox "the power of " & num1 &"and"& num2 & "is"& power,0,SITE_TITLE 