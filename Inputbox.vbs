
'==========================
'getting input from user
'==========================


option explicit
Const SITE_TITLE="WELOME TO USER INPUT INPUTBOX!!!"
Dim number1,number2,sum1, sum2, name
'getting the input from the user
name=INPUTBOX("enter your name:")
number1=INPUTBOX("enter your first number:",SITE_TITLE, "enter your input here")
number2=INPUTBOX("enter your second number:",SITE_TITLE,"enter input here",5000,5000)
sum1= number1+number2              'string concatintaion input1=2, input2= 3 sum=23 instead of 5
sum2= 50+ CInt(number1)+ CInt(number2)
MsgBox "Hello " & name & "!!!",0,SITE_TITLE
MsgBox "the sum of two numbers:"& sum1,0,SITE_TITLE
MsgBox "the sum of two numbers:"& sum2,0,SITE_TITLE